@file:JsModule("@pact-foundation/pact-node")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")

package pactnode

import kotlin.js.Promise

external open class Pact {
    open var __servers: Any = definedExternally
    open var __stubs: Any = definedExternally
    open fun logLevel(level: LogLevels? = definedExternally /* null */): dynamic /* Number | Unit */ = definedExternally
    open fun createServer(options: ServerOptions? = definedExternally /* null */): Server = definedExternally
    open fun listServers(): Array<Server> = definedExternally
    open fun removeAllServers(): Promise<Array<Server>> = definedExternally
    open fun createStub(options: StubOptions? = definedExternally /* null */): Stub = definedExternally
    open fun listStubs(): Array<Stub> = definedExternally
    open fun removeAllStubs(): Promise<Array<Stub>> = definedExternally
    open fun removeAll(): Promise<Array<AbstractService>> = definedExternally
    open fun verifyPacts(options: VerifierOptions): Promise<String> = definedExternally
    open fun createMessage(options: MessageOptions): Promise<String> = definedExternally
    open fun publishPacts(options: PublisherOptions): Promise<Array<Any>> = definedExternally
    open fun __stringifyOptions(obj: Any): Unit = definedExternally
}

@JsName("default")
external var pactDefault: Pact = definedExternally
