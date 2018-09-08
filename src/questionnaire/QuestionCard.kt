package questionnaire

import forms.FormData
import forms.form
import kotlinext.js.Object
import org.w3c.dom.events.Event
import react.*
import react.dom.*
import react.material.card
import react.material.data.CardData
import react.material.data.ColData
import react.material.data.RowData
import react.material.row
import resources.currentResultHeader
import resources.nextRequestHeader
import schema.getSchema
import schema.getTargetSchemaByRel
import kotlin.js.Json

interface QuestionCardProps : RProps {
    var body: String
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
                            if (props.body === undefined) {
                                showLoadingDots()
                            } else {
                                val jsonBody = JSON.parse<Json>(props.body)

                                val schema = jsonBody.getSchema()
                                val targetSchema = schema.getTargetSchemaByRel("next")

                                div("question-card-current-response") {
                                    h3 { +currentResultHeader() }
                                    Object.getOwnPropertyNames(jsonBody)
                                            .filter { it != "_schema" }
                                            .map { prop ->
                                                p {
                                                    h5 { +"$prop: " }
                                                    i { +jsonBody[prop].toString() }
                                                }
                                            }
                                }
                                div("question-card-next-request") {
                                    h3 { +nextRequestHeader() }
                                    form(FormData(targetSchema))
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

fun RBuilder.questionCard(body: String, block: RHandler<RProps>) = child(QuestionCard::class) {
    this.attrs.body = body
    block(this)
}

