package ui.components.questionnaire

import libraries.AxiosResponse
import network.questionRepo
import network.schema.Schema
import network.schema.getSchema
import react.*
import various.toJson
import various.toJsonString
import kotlin.js.Json
import kotlin.js.json

interface QuestionnaireState : RState {
    var body: Json
    var schema: Schema
    var onSubmit: (dynamic) -> Unit
    var qid: String
}

class Questionnaire : RComponent<RProps, QuestionnaireState>() {

    override fun componentWillMount() {
        val qid = state.qid
        if (qid !== undefined) {
            console.log("requesting questionnaire with id $qid")
            questionRepo.getById(qid, ::onResponse)
        } else
            questionRepo.create { response ->
                val newId = response.data.toJson()["id"].toString()
                console.log("created new questionnaire with id $newId")
                setState { this.qid = newId }
                questionRepo.getById(newId, ::onResponse)
            }
    }

    private fun onResponse(response: AxiosResponse<String>) =
            setState {
                body = response.data.toJson()
                schema = body.getSchema()
                onSubmit = prepareSubmission(schema)
            }

    private fun prepareSubmission(schema: Schema): (dynamic) -> Unit = { submit ->
        setState { body = json() }
        val formData = (submit.formData as Any).toJson()
        questionRepo.getNext(schema, formData, ::onResponse)
    }

    override fun RBuilder.render() {
        questionCard(state.body, state.schema, state.onSubmit) { }
    }
}