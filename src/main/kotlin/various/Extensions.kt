package various

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

fun formDataToJsObject(source: dynamic) = (source.formData as Any).asJsObject()