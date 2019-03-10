package various

import kotlinext.js.Object
import kotlinext.js.asJsObject
import kotlin.js.Json
import kotlin.js.json

fun Any?.toJsonString(): String {
    if (this == null) return "{}"

    return JSON.stringify(this)
}

fun Any?.toJson(): Json {
    if (this == null) return json()

    return JSON.parse(this.toJsonString())
}

fun Json.asList(key: String): List<Json> = mutableListOf<Json>().also {
    val jsonArray = this[key].unsafeCast<Json>()
    for (index in Object.keys(jsonArray)) {
        it.add(jsonArray[index].unsafeCast<Json>())
    }
}

fun formDataToJsObject(source: dynamic) = (source.formData as Any).asJsObject()