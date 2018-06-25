package questionnaire

import home.imgMountain
import react.*
import react.dom.h3
import react.dom.i
import react.dom.p
import react.material.card
import react.material.data.CardData
import react.material.data.CardTitleData
import resources.bodyHeader
import resources.bodyWelcome


class Questionnaire : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        card(CardData(title = "",
                reveal = React.createElement("p", object: RProps {} , bodyWelcome()),
                offset = "offset-m2 offset-l3",
                headerData = CardTitleData(image = imgMountain, text = "Test")) {
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