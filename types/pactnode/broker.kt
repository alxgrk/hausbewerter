@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")

package pactnode

import kotlin.js.Promise

external open class Broker(options: BrokerOptions) {
    open var options: BrokerOptions = definedExternally
    open fun findPacts(tag: String? = definedExternally /* null */): Promise<Any> = definedExternally
    open fun findConsumers(): Promise<Array<String>> = definedExternally
    companion object {
        var create: (options: BrokerOptions) -> Broker = definedExternally
    }
}
@JsName("_default")
external var brokerDefault: (options: BrokerOptions) -> Broker = definedExternally
external interface BrokerOptions {
    var brokerUrl: String
    var provider: String
    var username: String? get() = definedExternally; set(value) = definedExternally
    var password: String? get() = definedExternally; set(value) = definedExternally
    var tags: Array<String>? get() = definedExternally; set(value) = definedExternally
}
