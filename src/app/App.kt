package app

import about.About
import home.Home
import nav.nav
import questionnaire.Questionnaire
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.div
import react.router.browserRouter
import react.router.route
import react.router.switch

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
