@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")

package pact.dsl

import kotlinext.js.Object
import pact.common.HTTPMethod

external class Interaction {
    fun given(providerState: String): Interaction
    fun uponReceiving(description: String): Interaction
    fun withRequest(requestOpts: RequestOptions): Interaction
    fun willRespondWith(responseOpts: ResponseOptions): Interaction
    fun json(): Object
}

external interface RequestOptions {
    var method: HTTPMethod
    var path: dynamic /* String | MatcherResult */
    var query: Any? get() = definedExternally; set(value) = definedExternally
    var headers: dynamic get() = definedExternally; set(value) = definedExternally
    var body: Any? get() = definedExternally; set(value) = definedExternally
}
external interface ResponseOptions {
    var status: dynamic /* Number | MatcherResult */
    var headers: dynamic get() = definedExternally; set(value) = definedExternally
    var body: Any? get() = definedExternally; set(value) = definedExternally
}
external interface InteractionObject {
    var state: String
    var uponReceiving: String
    var withRequest: RequestOptions
    var willRespondWith: ResponseOptions
}
