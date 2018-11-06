package network.data

import libraries.AxiosResponse
import network.schema.*
import network.schema.RefResolver.axiosRefResolver
import various.toJson
import various.toJsonString
import kotlin.js.Json
import kotlin.js.json


interface QuestionRepository<T> {

    fun root()

    fun create(onResponse: (T) -> Any)

    fun getById(id: String, onResponse: (T) -> Any)

    fun getNext(schema: Schema, body: dynamic = json(), onResponse: (T) -> Any)

}

class RemoteQuestionRepository : QuestionRepository<AxiosResponse<String>> {

    private val _base = "https://virtserver.swaggerhub.com/hausbewerter/hausbewerter/1.0.0"

    private lateinit var _root: Schema

    override fun root() {
        rootAndThen {}
    }

    private fun rootAndThen(then: (Unit) -> Unit) {
        console.log("starting root request for $_base/")
        axiosRefResolver.get<String>("$_base/")
                .then { response ->
                    val schema = response.data.toJson().getSchema()
                    _root = schema
                }
                .then(then)
    }

    override fun create(onResponse: (AxiosResponse<String>) -> Any) = safetyRootCall {
        _root.getLinkByRel(Relation.CREATE)
                .axios<String>(_base)
                .then(onResponse)
    }

    override fun getById(id: String, onResponse: (AxiosResponse<String>) -> Any) = safetyRootCall {
        _root.getLinkByRel(Relation.BY_ID)
                .axios<String>(_base)
                .then(onResponse)
    }

    override fun getNext(schema: Schema, body: Json, onResponse: (AxiosResponse<String>) -> Any) {
        schema.getLinkByRel(Relation.NEXT)
                .axios<String>(_base, body)
                .then(onResponse)
    }

    private fun safetyRootCall(interactWithRoot: () -> Unit) {
        val rootQueried = ::_root.isInitialized
        console.log("root was ${if (!rootQueried) "not " else ""}queried before")
        if (!rootQueried)
            rootAndThen {
                interactWithRoot()
            }
        else
            interactWithRoot()
    }
}
