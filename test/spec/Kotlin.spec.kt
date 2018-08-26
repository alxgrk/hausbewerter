package spec

import chai.chai
import pactnode.ServerOptions
import pactnode.pactDefault
import various.cwd
import various.resolve
import kotlin.test.AfterTest
import kotlin.test.BeforeTest
import kotlin.test.Test

class Test {

//    val provider: PactProvider by lazy {
//        pact(object : PactOptions {
//            override var consumer: String = "My Consumer"
//            override var provider: String = "Posts Provider"
//            override var port: Number? = 1234
//        })
//    }

    val nodeWrapper = pactDefault

    // Configure mock server
    val mockServer = nodeWrapper.createServer(object : ServerOptions {
        override var port: Number? = 1234
        override var log: String? = resolve(cwd(), "pact", "logs", "mockserver-integration.log")
        override var dir: String? = resolve(cwd(), "pact")
        override var spec: Number? = 2
    })

    @BeforeTest
    fun setup() {
        mockServer.start().then {
            console.log("started")
//            // Add interactions
//            provider.addInteraction(object : InteractionObject {
//                override var state = "Has two posts"
//                override var uponReceiving = "a request for all posts"
//                override var withRequest: RequestOptions = object : RequestOptions {
//                    override var method = HTTPMethod.GET
//                    override var path = "/post/list"
//                    override var headers: dynamic = js {
//                        Accept = "application/json"
//                    }
//                }
//                override var willRespondWith: ResponseOptions = object : ResponseOptions {
//                    override var status = 200
//                    override var headers: dynamic = js {
//                        ContentType = "application/json"
//                    }
//                    override var body: Any? = Any()
//                }
//            })
        }
    }

    @Test
    fun test() {
        val expect = chai.expect

        expect("Test").to.eql("Test")
    }

    @AfterTest
    fun tearDown() {
//        // Write pact files
//        provider.finalize().then {
//            nodeWrapper.removeAllServers()
//        }
    }

}