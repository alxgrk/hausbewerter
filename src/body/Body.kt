package body

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.div
import react.dom.h2
import react.dom.link
import react.material.button
import react.material.data.ButtonData
import react.router.link
import resources.bodyHeader
import resources.bodyWelcome
import resources.buttonTry


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
                link(to = "/questionnaire") {
                    button(
                            ButtonData("light", buttonTry())
                    ) {}
                }
            }
        }
    }
}

fun RBuilder.body() = child(Body::class) {}
