package network

import kotlinext.js.Object
import libraries.axios
import org.w3c.dom.get
import org.w3c.dom.set
import various.toJson
import various.toJsonString
import kotlin.browser.localStorage
import kotlin.js.*

const val REF_KEY = "\$ref"

fun defaultReplacer(data: Any, callback: () -> Unit) = replaceRef(data) { foundRef ->
    val url = foundRef[REF_KEY].unsafeCast<String>()

    if (url.startsWith("http")) {

        val baseUrl = url.splitToSequence("#").first()
        console.log("found unresolved ref: $baseUrl")

        val pathToSchemaObject = schemaObjectPath(url)

        if (localStorage[baseUrl] == null) {
            axios.get<String>(url)
                    .then { schema ->

                        localStorage[baseUrl] = schema.data.toJsonString()

                        resolveSchema(pathToSchemaObject, schema.data.toJson(), foundRef, callback)
                    }
        } else {
            console.log("response taken from cache")
            resolveSchema(pathToSchemaObject, JSON.parse(localStorage[baseUrl]!!), foundRef, callback)
        }

    } else {
        // FIXME resolve does not consider multiple refs
        callback()
    }
}

fun replaceRef(any: Any, replacer: (Json) -> Unit): Json =
        if (any.toJsonString().contains(REF_KEY))
            replaceRef(any.toJson(), replacer)
        else
            any.toJson()

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

fun resolveSchema(pathToSchemaObject: List<String>, schema: Json, foundRef: Json, callback: () -> Unit) {

    console.log("trying to extract schema by path $pathToSchemaObject")

    val json = pathToSchemaObject.fold(schema) { i, p ->
        i[p].toJson()
    }
    foundRef.add(json)
    foundRef[REF_KEY] = undefined

    // FIXME resolve does not consider multiple refs
    callback()
}

fun schemaObjectPath(url: String): List<String> {
    return url.substringAfterLast('#')
            .splitToSequence('/')
            .filter { it.isNotEmpty() }
            .toList()
}