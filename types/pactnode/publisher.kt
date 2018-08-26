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

external open class Publisher(options: PublisherOptions) {
    open var options: PublisherOptions = definedExternally
    open var __argMapping: Any = definedExternally
    open fun publish(): Promise<Array<String>> = definedExternally
    companion object {
        var create: (options: PublisherOptions) -> Publisher = definedExternally
    }
}
@JsName("_default")
external var publisherOptionsDefault: (options: PublisherOptions) -> Publisher = definedExternally
external interface PublisherOptions : SpawnArguments {
    var pactFilesOrDirs: Array<String>
    var pactBroker: String
    var consumerVersion: String
    var pactBrokerUsername: String? get() = definedExternally; set(value) = definedExternally
    var pactBrokerPassword: String? get() = definedExternally; set(value) = definedExternally
    var tags: Array<String>? get() = definedExternally; set(value) = definedExternally
    var verbose: Boolean? get() = definedExternally; set(value) = definedExternally
    var timeout: Number? get() = definedExternally; set(value) = definedExternally
}
