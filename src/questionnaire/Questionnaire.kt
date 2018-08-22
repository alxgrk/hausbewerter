package questionnaire

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.div
import react.dom.i
import react.dom.p
import react.material.card
import react.material.data.CardData
import resources.bodyHeader


class Questionnaire : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        div(classes = "questionnaire") {
            card(CardData(title = "",
                    offset = "offset-m2 offset-l3") {
                p("card-body") {
                    i("material-icons center medium") {
                        +"store"
                    }
                }
                p {
                    +bodyHeader()
                }
            })
        }
    }
}