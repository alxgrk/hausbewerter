package logo

import react.RBuilder
import react.dom.div
import react.dom.img
import react.dom.jsStyle

@JsModule("src/logo/letter_H.svg")
external val hLogo: dynamic

fun RBuilder.logo(height: Int = 100) {
    div("Logo") {
        attrs.jsStyle.height = height
        img(alt = "h-logo", src = hLogo, classes = "Logo-h") {}
    }
}
