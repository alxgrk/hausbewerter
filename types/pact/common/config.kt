@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")

package pact.common

external interface MockServiceType {
    var host: String
    var port: Number
}

external interface Config {
    var mockService: MockServiceType
    var logging: Boolean
}
