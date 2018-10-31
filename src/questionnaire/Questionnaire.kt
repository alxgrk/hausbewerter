package questionnaire

import react.*
import schema.Schema
import schema.axios
import schema.getSchema
import types.axios.AxiosPromise
import types.axios.AxiosResponse
import types.axios.RefResolver.axiosRefResolver
import types.axios.axios
import util.anyToJson
import kotlin.js.Json

const val BASE = "https://virtserver.swaggerhub.com/hausbewerter/hausbewerter/1.0.0"

interface QuestionnaireState : RState {
    var body: String
    var onSubmit: (dynamic) -> Unit
}

class Questionnaire : RComponent<RProps, QuestionnaireState>() {

    private fun onResponse(): (AxiosResponse<String>) -> Any = { response ->
        console.log("received response ${JSON.stringify(response)}")
        setState {
            body = JSON.stringify(response.data)
            onSubmit = prepareSubmission(anyToJson(response.data))
        }
    }

    override fun componentWillMount() {
        axiosRefResolver.get<String>("$BASE/fragebogen/123")
                .then(onResponse())
    }

    private fun prepareSubmission(responseJson: Json): (dynamic) -> Unit = { submit ->
        val schema = responseJson.getSchema()
        schema.links.first { it.rel == "next" }
                .apply {
                    axios<String>("$BASE$href", submit.formData)
                            .then(onResponse())
                }
    }

    override fun RBuilder.render() {
        questionCard(state.body, state.onSubmit) {  }
    }
}