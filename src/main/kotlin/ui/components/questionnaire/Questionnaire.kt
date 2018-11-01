package ui.components.questionnaire

import libraries.AxiosResponse
import network.RefResolver.axiosRefResolver
import network.axios
import network.data.questionRepo
import network.getSchema
import react.*
import various.toJson
import various.toJsonString
import kotlin.js.Json

interface QuestionnaireState : RState {
    var body: String
    var onSubmit: (dynamic) -> Unit
}

class Questionnaire : RComponent<RProps, QuestionnaireState>() {

    private fun onResponse(): (AxiosResponse<String>) -> Any = { response ->
        console.log("received response ${response.toJsonString()}")
        setState {
            body = response.data.toJsonString()
            onSubmit = prepareSubmission(response.data.toJson())
        }
    }

    override fun componentWillMount() {
        questionRepo.getById("123", onResponse())
    }

    private fun prepareSubmission(responseJson: Json): (dynamic) -> Unit = { submit ->
        val schema = responseJson.getSchema()
        questionRepo.getNext(schema, submit.formData, onResponse())
    }

    override fun RBuilder.render() {
        questionCard(state.body, state.onSubmit) {  }
    }
}