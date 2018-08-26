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

external open class Message(options: MessageOptions) {
    open var options: MessageOptions = definedExternally
    open var __argMapping: Any = definedExternally
    open fun createMessage(): Promise<Any> = definedExternally
}
@JsName("_default")
external var messageDefault: (options: MessageOptions) -> Message = definedExternally
external interface MessageOptions : SpawnArguments {
    var content: String? get() = definedExternally; set(value) = definedExternally
    var dir: String? get() = definedExternally; set(value) = definedExternally
    var consumer: String? get() = definedExternally; set(value) = definedExternally
    var provider: String? get() = definedExternally; set(value) = definedExternally
    var pactFileWriteMode: dynamic /* String /* "overwrite" */ | String /* "update" */ | String /* "merge" */ */ get() = definedExternally; set(value) = definedExternally
    var spec: Number? get() = definedExternally; set(value) = definedExternally
}
