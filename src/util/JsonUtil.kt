package util

import kotlin.js.Json

fun anyToJson(any: Any): Json = JSON.parse(JSON.stringify(any))
