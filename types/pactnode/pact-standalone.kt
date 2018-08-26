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

external interface PactStandalone {
    var cwd: String
    var brokerPath: String
    var brokerFullPath: String
    var mockServicePath: String
    var mockServiceFullPath: String
    var stubPath: String
    var stubFullPath: String
    var verifierPath: String
    var verifierFullPath: String
    var messagePath: String
    var messageFullPath: String
}
external var standalone: (platform: String? /*= null*/, arch: String? /*= null*/) -> PactStandalone = definedExternally
@JsName("_default")
external var pactStandaloneDefault: PactStandalone = definedExternally
