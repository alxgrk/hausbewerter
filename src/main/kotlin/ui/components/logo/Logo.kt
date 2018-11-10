package ui.components.logo

import react.RBuilder
import react.dom.div
import react.dom.img

fun RBuilder.logo() {
    div("Logo") {
        img(alt = "h-logo", src = "/src/main/resources/images/letter_H_curvy.svg", classes = "Logo-h") {}
    }
}

