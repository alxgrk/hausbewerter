package ui.components.questionnaire

import libraries.AxiosResponse
import di.questionRepo
import libraries.react.router.RouteResultProps
import network.schema.Schema
import network.schema.getSchema
import react.*
import various.IndicatingList
import various.toJson
import various.toJsonString
import kotlin.js.Json
import kotlin.js.json

interface QuestionnaireState : RState {
    var body: Json
    var schema: Schema
    var onSubmit: (dynamic) -> Unit
    var prevStates: IndicatingList<QuestionnaireState>
}

interface QuestionnaireProps : RProps {
    var qid: String
}

class Questionnaire : RComponent<RouteResultProps<QuestionnaireProps>, QuestionnaireState>() {

    init {
        state.prevStates = IndicatingList()
    }

    override fun componentWillMount() {
        val qid = props.match.params.qid
        questionRepo.getById(qid, ::onResponse)
    }

    private fun onResponse(response: AxiosResponse<String>) =
            setState {
                prevStates.push(this)
                console.log("stack size: ${prevStates.count()}, " +
                        "position: ${prevStates.position()}")

                body = response.data.toJson()
                schema = body.getSchema()
                onSubmit = prepareSubmission(schema)
            }

    private fun prepareSubmission(schema: Schema): (dynamic) -> Unit = { submit ->
        setState { body = json() }
        val formData = (submit.formData as Any).toJson()
        questionRepo.getNext(schema, formData, ::onResponse)
    }

    private fun onBack() = setState {
        if (!prevStates.isEmpty()) {
            // jumping back to previous state
            val prevState = prevStates.back()
            console.log("stack size: ${prevStates.count()}, " +
                    "position: ${prevStates.position()}")

            console.log("Prev state: ${prevState?.body.toJsonString()}")
            body = prevState?.body ?: json()
            schema = prevState?.schema ?: Schema(mutableListOf())
            onSubmit = prevState?.onSubmit ?: {}

        }
    }

    override fun RBuilder.render() {
        questionCard(state.body, state.schema, state.onSubmit, ::onBack) { }
    }
}