package questionnaire

import org.w3c.dom.events.Event
import react.*
import react.dom.*
import react.material.card
import react.material.data.CardData
import react.material.data.ColData
import react.material.data.RowData
import react.material.row

interface QuestionCardProps : RProps {
    var body: String
}

class QuestionCard : RComponent<QuestionCardProps, RState>() {

    private fun RBuilder.iconButton(iconText: String, onClick: (Event) -> Unit) = run {
        this.child("i", object : RProps {
            val `class` = "waves-effect waves-teal material-icons"
            val onClick = onClick
        }) {
            +iconText
        }
    }

    private fun RBuilder.showLoadingDots() = run {
        if (props.body == undefined) {
            span("loading-dots") { +"." }
            span("loading-dots") { +"." }
            span("loading-dots") { +"." }
        }
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
                            showLoadingDots()
                            p {
                                +props.body
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