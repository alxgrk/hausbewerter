@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsModule("@pact-foundation/pact-node")

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

external var DEFAULT_ARG: Any = definedExternally
external interface ArgMapping {
    @nativeGetter
    operator fun get(id: String): String?
    @nativeSetter
    operator fun set(id: String, value: String)
}
external open class PactUtil {
    open var cwd: String = definedExternally
    open fun createArguments(args: SpawnArguments, mappings: `T$0`): Array<String> = definedExternally
    open fun spawnBinary(command: String, args: SpawnArguments? = definedExternally /* null */, argMapping: `T$0`? = definedExternally /* null */): Any = definedExternally
    open fun killBinary(binary: Any): Boolean = definedExternally
    open fun isWindows(platform: String? = definedExternally /* null */): Boolean = definedExternally
}
external interface SpawnArguments {
    @nativeGetter
    operator fun get(id: String): dynamic /* String | Number | Boolean | Array<String> | Nothing? */
    @nativeSetter
    operator fun set(id: String, value: String)
    @nativeSetter
    operator fun set(id: String, value: Number)
    @nativeSetter
    operator fun set(id: String, value: Boolean)
    @nativeSetter
    operator fun set(id: String, value: Array<String>)
    @nativeSetter
    operator fun set(id: String, value: Nothing?)
}
@JsName("default")
external var pactUtilDefault: PactUtil = definedExternally
