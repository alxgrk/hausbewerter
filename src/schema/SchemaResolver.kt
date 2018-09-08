package schema

import kotlinext.js.Object
import types.axios.RefResolver
import types.axios.axios
import util.anyToJson
import kotlin.js.Json
import kotlin.js.json

const val REF_KEY = "\$ref"

fun defaultReplacer(data: Any, callback: () -> Unit) = replaceRef(data) { foundRef ->
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
                    foundRef[REF_KEY] = undefined

                    // FIXME resolve does not consider multiple refs
                    callback()
                }
    } else {
        // FIXME resolve does not consider multiple refs
        callback()
    }
}

fun replaceRef(any: Any, replacer: (Json) -> Unit): Json {
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

fun schemaObjectPath(url: String): List<String> {
    return url.substringAfterLast('#')
            .splitToSequence('/')
            .filter { it.isNotEmpty() }
            .toList()
}