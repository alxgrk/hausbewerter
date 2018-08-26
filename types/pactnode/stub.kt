@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")

package pactnode

import kotlin.js.*
import kotlin.js.Json
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.dom.parsing.*
import org.w3c.dom.svg.*
import org.w3c.dom.url.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.notifications.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*

external open class Stub(options: StubOptions? = definedExternally /* null */) : AbstractService {
    override var options: ServiceOptions = definedExternally
    companion object {
        var create: (options: StubOptions? /*= null*/) -> Stub = definedExternally
    }
}
@JsName("_default")
external var stubDefault: (options: StubOptions? /*= null*/) -> Stub = definedExternally
external interface StubOptions : SpawnArguments {
    var pactUrls: Array<String>? get() = definedExternally; set(value) = definedExternally
    var port: Number? get() = definedExternally; set(value) = definedExternally
    var ssl: Boolean? get() = definedExternally; set(value) = definedExternally
    var cors: Boolean? get() = definedExternally; set(value) = definedExternally
    var host: String? get() = definedExternally; set(value) = definedExternally
    var sslcert: String? get() = definedExternally; set(value) = definedExternally
    var sslkey: String? get() = definedExternally; set(value) = definedExternally
    var log: String? get() = definedExternally; set(value) = definedExternally
}
