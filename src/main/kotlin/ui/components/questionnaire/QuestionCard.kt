package ui.components.questionnaire

import di.lastQidRepo
import di.questionRepo
import kotlinext.js.JsObject
import kotlinext.js.Object
import kotlinx.html.DIV
import libraries.forms.FormData
import libraries.forms.form
import libraries.react.material.button
import libraries.react.material.card
import libraries.react.material.data.CardData
import libraries.react.material.data.ColData
import libraries.react.material.data.IconData
import libraries.react.material.data.RowData
import libraries.react.material.icon
import libraries.react.material.row
import libraries.react.router.link
import libraries.react.router.redirect
import network.schema.*
import react.*
import react.dom.*
import ui.components.various.iconButton
import ui.components.various.showLoadingDots
import various.*
import kotlin.browser.document
import kotlin.js.Json

interface QuestionCardProps : RProps {
    var body: Json
    var schema: Schema
    var formData: JsObject
    var onSubmit: (dynamic) -> Unit
    var onBack: (JsObject) -> Unit
    var onNew: (String) -> Unit
}

interface QuestionCardState : RState {
    var formData: JsObject
}

class QuestionCard : RComponent<QuestionCardProps, QuestionCardState>() {

    private fun RBuilder.whenContentReady(andThen: () -> Unit) {
        if (props.body === undefined
                || Object.getOwnPropertyNames(props.body).isEmpty()
                || props.schema === undefined)
            showLoadingDots()
        else
            andThen()
    }

    override fun componentWillReceiveProps(nextProps: QuestionCardProps) {
        console.log("initializing form data with: ${props.formData.toJsonString()}")

        // You don't have to do this check first, but it can help prevent an unneeded render
        if (nextProps.formData !== this.state.formData)
            setState {
                formData = nextProps.formData
            }
    }

    override fun RBuilder.render() {

        div(classes = "questionnaire valign-wrapper") {

            card(CardData(title = "",
                    offset = "offset-m2 offset-l3") {

                whenContentReady {
                    row(RowData(className = "valign-wrapper", children = listOf(

                            ColData(s = 1, className = "question-card-to-left") {
                                val isHidden = if (props.schema.getLinkByRel(Relation.PREV) == null) "hidden" else ""

                                iconButton("chevron_left", className = isHidden) {
                                    props.onBack(state.formData)
                                }
                            },

                            ColData(s = 10, className = "question-card-body") {
                                val targetSchema = props.schema.getTargetSchemaByRel(Relation.NEXT)
                                val formerData = props.schema.getFormerDataByRel(Relation.NEXT)

                                currentResponse(targetSchema == null)
                                if (targetSchema != null)
                                    nextRequest(targetSchema, formerData)

                            },

                            ColData(s = 1, className = "question-card-to-right") {
                                val isHidden = if (props.schema.getLinkByRel(Relation.NEXT) == null) "hidden" else ""

                                iconButton("chevron_right", className = isHidden) {
                                    document.querySelector("form button[type=submit]")?.asDynamic().click()
                                }
                            }
                    )))
                }
            })
        }

    }

    private fun onFormDataChanged(data: dynamic) = setState {
        formData = formDataToJsObject(data)
    }

    private fun RBuilder.nextRequest(targetSchema: JsObject, formerData: JsObject?) {

        val formData =
                if (Object.getOwnPropertyNames(state.formData).isEmpty() && formerData != null) {
                    console.log("using former data acquired from response: ${formerData.toJsonString()}")
                    formerData
                } else {
                    console.log("using local data entered before: ${state.formData.toJsonString()}")
                    state.formData
                }

        div("question-card-next-request") {
            h3 { +nextRequestHeader() }
            form(FormData(
                    onSubmit = props.onSubmit,
                    onChange = ::onFormDataChanged,
                    schema = targetSchema,
                    formData = formData))
        }

    }

    private fun RDOMBuilder<DIV>.displayBody() {
        Object.getOwnPropertyNames(props.body)
                .filter { it != "_schema" }
                .map { prop ->
                    p {
                        +"$prop: ${props.body[prop].toString()}"
                    }
                }
    }

    private fun RDOMBuilder<DIV>.displayFinalValue() {
        div("question-card-final-result-value") {
            icon(IconData(large = true), "home")
            Object.getOwnPropertyNames(props.body)
                    .filter { it == "gesamtwert" }
                    .map { prop ->
                        p {
                            +"${props.body[prop]} €"
                        }
                    }
        }
    }

    private fun RDOMBuilder<DIV>.displayFinalFooter() {
        div("question-card-final-result-footer") {
            button(newQuestionnaire()) {
                questionRepo.create { response ->
                    val newId = response.data.toJson()["id"].toString()
                    console.log("created new questionnaire with id $newId")
                    props.onNew(newId)
                }
            }
            link("/questionnaire") {
                button(backToOverview()) {}
            }
        }
    }

    private fun RBuilder.currentResponse(finalResponse: Boolean) {
        div("question-card-current-response") {
            if (!finalResponse) {
                h3 { +currentResultHeader() }
                displayBody()
            } else {
                lastQidRepo.clear()
                h1 { +endResultHeader() }
                displayFinalValue()
                displayFinalFooter()
            }
        }
    }

}

fun RBuilder.questionCard(body: Json,
                          schema: Schema,
                          formData: JsObject,
                          onSubmit: (dynamic) -> Unit,
                          onBack: (JsObject) -> Unit,
                          onNew: (String) -> Unit,
                          block: RHandler<RProps>) = child(QuestionCard::class) {
    attrs {
        this.body = body
        this.schema = schema
        this.formData = formData
        this.onSubmit = onSubmit
        this.onBack = onBack
        this.onNew = onNew
    }
    block(this)
}
