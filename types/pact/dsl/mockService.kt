package pact.dsl

import kotlin.js.Promise

enum class PactfileWriteMode {
    overwrite, update, none
}

external class MockService {
    constructor(
            consumer: String?,
            provider: String?,
            port: Number?,
            host: String?,
            ssl: Boolean?,
            pactfileWriteMode: PactfileWriteMode?)

    fun addInteraction(interaction: Interaction): Promise<String>
    fun removeInteractions(): Promise<String>
    fun verify(): Promise<String>
    fun writePact(): Promise<String>
}
