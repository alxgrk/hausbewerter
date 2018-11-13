package data

import network.schema.Schema
import kotlin.js.json

interface QuestionRepository<T> {

    fun root()

    fun create(onResponse: (T) -> Any)

    fun getById(id: String, onResponse: (T) -> Any)

    fun getNext(schema: Schema, body: dynamic = json(), onResponse: (T) -> Any)

}