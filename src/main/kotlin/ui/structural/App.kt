package ui.structural

import libraries.react.router.browserRouter
import libraries.react.router.route
import libraries.react.router.switch
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.div
import ui.components.questionnaire.Questionnaire

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        browserRouter {
            div(classes =  "content") {
                nav()
                switch {
                    route("/", Home::class, exact = true)
                    route("/about", About::class)
                    route("/questionnaire", Questionnaire::class)
                }
            }
        }
    }
}

fun RBuilder.app() = child(App::class) {}
