@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsQualifier("pact")
package pact

import pact.dsl.InteractionObject
import pact.dsl.PactfileWriteMode
import kotlin.js.Promise

external interface PactOptions {
    var consumer: String
    var provider: String
    var port: Number? get() = definedExternally; set(value) = definedExternally
    var host: String? get() = definedExternally; set(value) = definedExternally
    var ssl: Boolean? get() = definedExternally; set(value) = definedExternally
    var sslcert: String? get() = definedExternally; set(value) = definedExternally
    var sslkey: String? get() = definedExternally; set(value) = definedExternally
    var dir: String? get() = definedExternally; set(value) = definedExternally
    var log: String? get() = definedExternally; set(value) = definedExternally
    var logLevel: String? get() = definedExternally; set(value) = definedExternally
    var spec: Number? get() = definedExternally; set(value) = definedExternally
    var cors: Boolean? get() = definedExternally; set(value) = definedExternally
    var pactfileWriteMode: PactfileWriteMode? get() = definedExternally; set(value) = definedExternally
}
external interface PactProvider {
    fun setup(): Promise<Unit>
    fun addInteraction(interactionObj: InteractionObject): Promise<String>
    fun verify(): Promise<Unit>
    fun finalize(): Promise<Unit>
    fun writePact(): Promise<String>
    fun removeInteractions(): Promise<String>
}
external var Matchers: dynamic /* "TypeQuery" kind unsupported yet here! (../../node_modules/pact/dist/pact.d.ts:34:25 to 34:42) */ = definedExternally
external var Verifier: dynamic /* "TypeQuery" kind unsupported yet here! (../../node_modules/pact/dist/pact.d.ts:35:25 to 35:42) */ = definedExternally
