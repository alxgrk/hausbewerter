package body

import react.*
import react.data.ButtonData
import resources.*
import react.dom.*


class Body : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        div("Body-text") {
            h2("Body-header") {
                +bodyHeader()
            }
            div("Body-welcome") {
                +bodyWelcome()
            }
            div("Body-try-button") {
                button(
                        ButtonData("light", buttonTry())
                )
            }
        }
    }
}

fun RBuilder.body() = child(Body::class) {}
