package spec

import chai.chai
import kotlinx.coroutines.experimental.*
import pact.PactOptions
import pact.PactProvider
import pact.pact
import pactnode.ServerOptions
import pactnode.pactDefault
import various.cwd
import various.resolve
import kotlin.coroutines.experimental.coroutineContext
import kotlin.test.AfterTest
import kotlin.test.BeforeTest
import kotlin.test.Test

class Test {

    private var provider: PactProvider? = null

    private val nodeWrapper = pactDefault

    // Configure mock server
    private val mockServer = nodeWrapper.createServer(object : ServerOptions {
        override var port: Number? = 1234
        override var log: String? = resolve(cwd(), "pact", "logs", "mockserver-integration.log")
        override var dir: String? = resolve(cwd(), "pact")
        override var spec: Number? = 2
    })

    @BeforeTest
    fun setup() {
        mockServer.stagit strt()
                .then {
                    console.log("Mock server started")

                    provider = pact(object : PactOptions {
                        override var consumer: String = "My Consumer"
                        override var provider: String = "Posts Provider"
                        override var port: Number? = 1234
                    })

                    // Add interactions
//                        provider.addInteraction(object : InteractionObject {
//                            override var state = "Has two posts"
//                            override var uponReceiving = "a request for all posts"
//                            override var withRequest: RequestOptions = object : RequestOptions {
//                                override var method = HTTPMethod.GET
//                                override var path = "/post/list"
//                                override var headers = json(Pair("Accept", "application/json"))
//                            }
//                            override var willRespondWith: ResponseOptions = object : ResponseOptions {
//                                override var status = 200
//                                override var headers = json(Pair("Content-Type", "application/json"))
//                                override var body: Any? = Any()
//                            }
//                        })
                }
        console.log("finished")
    }

    @Test
    fun test() {
        val expect = chai.expect

        expect("Test").to.eql("Test")
    }

    @AfterTest
    fun tearDown() {
        // Write pact files
        provider?.writePact()

        console.log("Mock server stopped")
//        nodeWrapper.removeAllServers()
    }

}