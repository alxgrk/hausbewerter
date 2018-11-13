package ui.components.questionnaire

import di.lastQidRepo
import kotlinext.js.JsObject
import kotlinext.js.Object
import kotlinx.html.DIV
import libraries.forms.FormData
import libraries.forms.form
import libraries.react.material.button
import libraries.react.material.card
import libraries.react.material.data.*
import libraries.react.material.icon
import libraries.react.material.row
import libraries.react.router.link
import network.schema.Relation
import network.schema.Schema
import network.schema.getTargetSchemaByRel
import org.w3c.dom.events.Event
import react.*
import react.dom.*
import ui.components.various.iconButton
import ui.components.various.showLoadingDots
import various.*
import kotlin.js.Json

interface QuestionCardProps : RProps {
    var body: Json
    var schema: Schema
    var onSubmit: (dynamic) -> Unit
}

private interface CurrentResponseProps : RProps {
    var body: Json
    var finalResponse: Boolean
}

private interface NextRequestProps : RProps {
    var body: Json
    var targetSchema: JsObject
    var onSubmit: (dynamic) -> Unit
}

class QuestionCard : RComponent<QuestionCardProps, RState>() {

    private fun RBuilder.whenContentReady(andThen: () -> Unit) {
        if (props.body === undefined
                || Object.getOwnPropertyNames(props.body).isEmpty()
                || props.schema === undefined)
            showLoadingDots()
        else
            andThen()
    }

    override fun RBuilder.render() {

        div(classes = "questionnaire valign-wrapper") {

            card(CardData(title = "",
                    offset = "offset-m2 offset-l3") {

                row(RowData(className = "valign-wrapper", children = listOf(

                        ColData(s = 1, className = "question-card-to-left") {
                            iconButton("chevron_left") {
                                console.log("clicked left")
                            }
                        },

                        ColData(s = 10, className = "question-card-body") {
                            whenContentReady {
                                val targetSchema = props.schema.getTargetSchemaByRel(Relation.NEXT)

                                currentResponse(props.body, targetSchema == null)
                                if (targetSchema != null)
                                    nextRequest(props.body, targetSchema, props.onSubmit)
                            }

                        },

                        ColData(s = 1, className = "question-card-to-right") {
                            iconButton("chevron_right") {
                                console.log("clicked right")
                            }
                        }
                )))
            })
        }
    }

}

private class CurrentResponse : RComponent<CurrentResponseProps, RState>() {

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
            link("/questionnaire") {
                button(newQuestionnaire()) {}
            }
            link("/") {
                button(backToHome()) {}
            }
        }
    }

    override fun RBuilder.render() {
        div("question-card-current-response") {
            if (!props.finalResponse) {
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

private class NextRequest : RComponent<NextRequestProps, RState>() {

    override fun RBuilder.render() {

        div("question-card-next-request") {
            h3 { +nextRequestHeader() }
            form(FormData(
                    onSubmit = props.onSubmit,
                    schema = props.targetSchema,
                    transformErrors = {
                        console.log(it)
                        it
                    }))
        }
    }
}

fun RBuilder.questionCard(body: Json,
                          schema: Schema,
                          onSubmit: (dynamic) -> Unit,
                          block: RHandler<RProps>) = child(QuestionCard::class) {
    attrs {
        this.body = body
        this.schema = schema
        this.onSubmit = onSubmit
    }
    block(this)
}

private fun RBuilder.currentResponse(body: Json,
                                     finalResponse: Boolean) = child(CurrentResponse::class) {
    attrs {
        this.body = body
        this.finalResponse = finalResponse
    }
}

private fun RBuilder.nextRequest(body: Json,
                                 targetSchema: JsObject,
                                 onSubmit: (dynamic) -> Unit) = child(NextRequest::class) {
    attrs {
        this.body = body
        this.targetSchema = targetSchema
        this.onSubmit = onSubmit
    }
}
