package types.axios

import kotlinext.js.Object
import kotlinext.js.clone
import kotlin.js.Json
import types.axios.RefResolver.REF_KEY
import kotlin.js.Promise
import kotlin.js.json

object RefResolver {

    const val REF_KEY = "\$ref"

    val axiosRefResolver = clone(axios)

    init {
        axiosRefResolver.interceptors.response.use(onFulfilled = { response ->

            val promise = Promise<Any> { resolve, _ ->

                response.data = replaceRef(response.data) { foundRef ->
                    val url = foundRef[REF_KEY].unsafeCast<String>()

                    if (url.startsWith("http")) {

                        console.log("found unresolved ref: $url")

                        axios.get<String>(url)
                                .then { schema ->

                                    val pathToSchemaObject = schemaObjectPath(url)

                                    console.log("trying to extract schema by path $pathToSchemaObject")

                                    val json = pathToSchemaObject.fold(anyToJson(schema.data)) { i, p ->
                                        anyToJson(i[p] ?: json())
                                    }
                                    foundRef.add(json)

                                    // FIXME resolve does not consider multiple refs
                                    resolve(response)
                                }
                    } else {
                        // FIXME resolve does not consider multiple refs
                        resolve(response)
                    }
                }
            }

            promise
        })
    }

    private fun schemaObjectPath(url: String): List<String> {
        return url.substringAfterLast('#')
                .splitToSequence('/')
                .filter { it.isNotEmpty() }
                .toList()
    }


    private fun replaceRef(any: Any, replacer: (Json) -> Unit): Json {
        val jsonString = JSON.stringify(any)
        val json: Json = JSON.parse(jsonString)

        return if (jsonString.contains(REF_KEY)) replaceRef(json, replacer) else json
    }

    private fun replaceRef(body: Json, replacer: (Json) -> Unit): Json {
        for (key in Object.getOwnPropertyNames(body)) {

            val child = body[key] ?: json()

            if (jsTypeOf(child) == "object") {
                body[key] = replaceRef(child, replacer)
            }

            if (key == REF_KEY) {
                replacer(body)
            }

        }

        return body
    }
}

private fun anyToJson(any: Any): Json = JSON.parse(JSON.stringify(any))