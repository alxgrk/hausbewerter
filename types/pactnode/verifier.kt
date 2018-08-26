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

external open class Verifier(options: VerifierOptions) {
    open var options: VerifierOptions = definedExternally
    open var __argMapping: Any = definedExternally
    open fun verify(): Promise<String> = definedExternally
    companion object {
        var create: (options: VerifierOptions) -> Verifier = definedExternally
    }
}
@JsName("default")
external var _default: (options: VerifierOptions) -> Verifier = definedExternally
external interface VerifierOptions : SpawnArguments {
    var providerBaseUrl: String
    var provider: String? get() = definedExternally; set(value) = definedExternally
    var pactUrls: Array<String>? get() = definedExternally; set(value) = definedExternally
    var providerStatesSetupUrl: String? get() = definedExternally; set(value) = definedExternally
    var pactBrokerUsername: String? get() = definedExternally; set(value) = definedExternally
    var pactBrokerPassword: String? get() = definedExternally; set(value) = definedExternally
    var customProviderHeaders: Array<String>? get() = definedExternally; set(value) = definedExternally
    var publishVerificationResult: Boolean? get() = definedExternally; set(value) = definedExternally
    var providerVersion: String? get() = definedExternally; set(value) = definedExternally
    var pactBrokerUrl: String? get() = definedExternally; set(value) = definedExternally
    var tags: Array<String>? get() = definedExternally; set(value) = definedExternally
    var timeout: Number? get() = definedExternally; set(value) = definedExternally
    var monkeypatch: String? get() = definedExternally; set(value) = definedExternally
    var format: dynamic /* String /* "json" */ | String /* "RspecJunitFormatter" */ */ get() = definedExternally; set(value) = definedExternally
    var out: String? get() = definedExternally; set(value) = definedExternally
}
