package logo

import react.RBuilder
import react.dom.div
import react.dom.img
import react.dom.jsStyle

@JsModule("src/logo/letter_H_curvy.svg")
external val hLogo: dynamic

fun RBuilder.logo() {
    div("Logo") {
        img(alt = "h-logo", src = hLogo, classes = "Logo-h") {}
    }
}

