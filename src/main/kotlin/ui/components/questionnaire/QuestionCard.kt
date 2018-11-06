package ui.components.questionnaire

import kotlinext.js.JsObject
import kotlinext.js.Object
import kotlinext.js.jsObject
import libraries.forms.FormData
import libraries.forms.form
import libraries.react.material.card
import libraries.react.material.data.CardData
import libraries.react.material.data.ColData
import libraries.react.material.data.RowData
import libraries.react.material.row
import network.schema.Relation
import network.schema.Schema
import network.schema.getSchema
import network.schema.getTargetSchemaByRel
import org.w3c.dom.events.Event
import react.*
import react.dom.*
import various.currentResultHeader
import various.endResultHeader
import various.nextRequestHeader
import various.toJsonString
import kotlin.js.Json
import kotlin.js.json

interface QuestionCardProps : RProps {
    var body: Json
    var schema: Schema
    var onSubmit: (dynamic) -> Unit
}

class QuestionCard : RComponent<QuestionCardProps, RState>() {

    private fun RBuilder.iconButton(iconText: String, onClick: (Event) -> Unit) = run {
        this.child("i", object : RProps {
            val className = "waves-effect waves-teal material-icons"
            val onClick = onClick
        }) {
            +iconText
        }
    }

    private fun RBuilder.showLoadingDots() = run {
        span("loading-dots") { +"." }
        span("loading-dots") { +"." }
        span("loading-dots") { +"." }
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
                            if (props.body === undefined
                                    || Object.getOwnPropertyNames(props.body).isEmpty()
                                    || props.schema === undefined) {
                                showLoadingDots()
                            } else {
                                val targetSchema = props.schema.getTargetSchemaByRel(Relation.NEXT)

                                div("question-card-current-response") {
                                    if (targetSchema !== undefined)
                                        h3 { +currentResultHeader() }
                                    else
                                        h1 { +endResultHeader() }
                                    Object.getOwnPropertyNames(props.body)
                                            .filter { it != "_schema" }
                                            .map { prop ->
                                                p {
                                                    +"$prop: ${props.body[prop].toString()}"
                                                }
                                            }
                                }
                                if (targetSchema !== undefined)
                                    div("question-card-next-request") {
                                        h3 { +nextRequestHeader() }
                                        form(FormData(
                                                onSubmit = props.onSubmit,
                                                schema = targetSchema,
                                                transformErrors = {
                                                    console.log(it)
                                                    it
                                                }))
                                    }
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

