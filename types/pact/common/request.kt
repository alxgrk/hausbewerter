package pact.common

import kotlin.js.Promise

enum class HTTPMethod {
    GET, POST, PUT, PATCH, DELETE, HEAD, OPTIONS
}

external class Request {
    fun send (method: HTTPMethod, url: String, body: String): Promise<String>
}
