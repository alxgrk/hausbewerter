package questionnaire

import react.*
import react.dom.div
import react.dom.p
import react.material.card
import react.material.data.CardData
import types.axios.RefResolver.axiosRefResolver
import types.axios.axios
import kotlin.js.Promise

interface QuestionnaireState : RState {
    var body: String
}

class Questionnaire : RComponent<RProps, QuestionnaireState>() {

    override fun componentWillMount() {
        axiosRefResolver.get<String>("https://virtserver.swaggerhub.com/hausbewerter/hausbewerter/1.0.0/fragebogen/123")
                .then { response ->
                    console.log("received response ${JSON.stringify(response)}")
                    setState {
                        body = JSON.stringify(response.data)
                    }
                }
    }

    override fun RBuilder.render() {
        questionCard(state.body) {  }
    }
}