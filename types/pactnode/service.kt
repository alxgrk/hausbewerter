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

external interface `T$0` {
    var START_EVENT: String
    var STOP_EVENT: String
    var DELETE_EVENT: String
}
external open class AbstractService(command: String, options: ServiceOptions, argMapping: Any) {
    open var options: ServiceOptions = definedExternally
    open var __argMapping: Any = definedExternally
    open var __running: Boolean = definedExternally
    open var __instance: Any = definedExternally
    open var __serviceCommand: String = definedExternally
    open fun start(): Promise<AbstractService> = definedExternally
    open fun stop(): Promise<AbstractService> = definedExternally
    open fun delete(): Promise<AbstractService> = definedExternally
    open fun spawnBinary(): Any = definedExternally
    open fun __waitForServiceUp(): Promise<Any> = definedExternally
    open fun __waitForServiceDown(): Promise<Any> = definedExternally
    open fun __call(options: Any): Unit = definedExternally
    companion object {
        var Events: `T$0` = definedExternally
    }
}
external interface ServiceOptions : SpawnArguments {
    var port: Number? get() = definedExternally; set(value) = definedExternally
    var ssl: Boolean? get() = definedExternally; set(value) = definedExternally
    var cors: Boolean? get() = definedExternally; set(value) = definedExternally
    var host: String? get() = definedExternally; set(value) = definedExternally
    var sslcert: String? get() = definedExternally; set(value) = definedExternally
    var sslkey: String? get() = definedExternally; set(value) = definedExternally
    var log: String? get() = definedExternally; set(value) = definedExternally
}
