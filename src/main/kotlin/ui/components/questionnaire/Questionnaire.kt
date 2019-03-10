package ui.components.questionnaire

import libraries.AxiosResponse
import di.questionRepo
import kotlinext.js.JsObject
import kotlinext.js.jsObject
import libraries.react.router.RouteResultProps
import network.schema.Link
import network.schema.Schema
import network.schema.getSchema
import react.*
import various.IndicatingList
import various.formDataToJsObject
import various.toJson
import various.toJsonString
import kotlin.js.Json
import kotlin.js.json

interface QuestionnaireState : RState {
    var body: Json
    var schema: Schema
    var onSubmit: (dynamic) -> Unit
    var formData: JsObject
    var prevStates: IndicatingList<QuestionnaireState>
}

interface QuestionnaireProps : RProps {
    var id: String
}

class Questionnaire : RComponent<RouteResultProps<QuestionnaireProps>, QuestionnaireState>() {

    init {
        state.prevStates = IndicatingList()
    }

    override fun componentWillMount() {
        val qid = props.match.params.id
        console.log("Querying questionnaire with id '$qid'")
        questionRepo.getById(qid, ::onResponse)
    }

    override fun componentWillUnmount() {
        // clean up state from any other questionnaire
        setState {
            body = json()
            schema = Schema(mutableListOf())
            onSubmit = {}
            formData = jsObject { }
            state.prevStates = IndicatingList()
        }
    }

    private fun onResponse(response: AxiosResponse<String>) =
            setState {
                prevStates.push(this)
                console.log("stack size: ${prevStates.count()}, " +
                        "position: ${prevStates.position()}")

                formData = jsObject { }
                body = response.data.toJson()
                schema = body.getSchema()
                onSubmit = prepareSubmission(schema)
            }

    private fun prepareSubmission(curSchema: Schema): (dynamic) -> Unit = { submit ->
        val curFormData = formDataToJsObject(submit)

        rememberCurrentFormData(curFormData) {

            if (!state.prevStates.forth()) {
                setState {
                    body = json()
                }

                console.log("Querying next step of questionnaire.")
                questionRepo.getNext(curSchema, curFormData, ::onResponse)
            } else {
                console.log("Not making a new request, already entered data.")
                val upcomingState = state.prevStates.current()
                setState {
                    body = upcomingState.body
                    schema = upcomingState.schema
                    onSubmit = upcomingState.onSubmit
                    formData = upcomingState.formData
                }
            }

        }
    }

    private fun onBack(curFormData: JsObject) {
        if (!state.prevStates.isEmpty()) {
            // remembering current state
            rememberCurrentFormData(curFormData) {

                setState {
                    // jumping back to previous state
                    val prevState = prevStates.back()

                    console.log("stack size: ${prevStates.count()}, " +
                            "position: ${prevStates.position()}")
                    console.log("Prev response: ${prevState?.body.toJsonString()}")
                    console.log("Prev formData: ${prevState?.formData.toJsonString()}")

                    body = prevState?.body ?: json()
                    schema = prevState?.schema ?: Schema(mutableListOf())
                    onSubmit = prevState?.onSubmit ?: {}
                    formData = prevState?.formData ?: jsObject { }
                }
            }
        }
    }

    // using callback to ensure, state change has happened
    private fun rememberCurrentFormData(curFormData: JsObject, andThen: () -> Unit) = setState({
        state.prevStates.current().formData = jsObject { }
        state.prevStates.current().formData = curFormData
        console.log("current form data remembered: ${state.prevStates.current().formData.toJsonString()}")
        it
    }, andThen)

    override fun RBuilder.render() {
        questionCard(state.body, state.schema, state.formData, state.onSubmit, ::onBack) { }
    }
}
