package ui.components.questionnaire

import libraries.AxiosResponse
import di.questionRepo
import libraries.react.router.RouteResultProps
import network.schema.Schema
import network.schema.getSchema
import react.*
import various.toJson
import kotlin.js.Json
import kotlin.js.json

interface QuestionnaireState : RState {
    var body: Json
    var schema: Schema
    var onSubmit: (dynamic) -> Unit
}

interface QuestionnaireProps : RProps {
    var qid: String
}

class Questionnaire : RComponent<RouteResultProps<QuestionnaireProps>, QuestionnaireState>() {

    override fun componentWillMount() {
        val qid = props.match.params.qid
        questionRepo.getById(qid, ::onResponse)
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
