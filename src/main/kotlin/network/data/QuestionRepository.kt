package network.data

import libraries.AxiosResponse
import network.RefResolver.axiosRefResolver
import network.Schema
import network.axios
import kotlin.js.json

val questionRepo = RemoteQuestionRepository

interface QuestionRepository<T> {

    fun getById(id: String, onResponse: (T) -> Any)

    fun getNext(schema: Schema, body: dynamic = json(), onResponse: (T) -> Any)

}

object RemoteQuestionRepository: QuestionRepository<AxiosResponse<String>> {

    override fun getById(id: String, onResponse: (AxiosResponse<String>) -> Any) {
        axiosRefResolver.get<String>("$BASE/fragebogen/$id")
                .then(onResponse)
    }

    const val BASE = "https://virtserver.swaggerhub.com/hausbewerter/hausbewerter/1.0.0"

    override fun getNext(schema: Schema, body: dynamic, onResponse: (AxiosResponse<String>) -> Any) {
        schema.links.first { it.rel == "next" }
                .apply {
                    axios<String>("$BASE$href", body)
                            .then(onResponse)
                }
    }

}