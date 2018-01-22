package app

import login.login
import logo.logo
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.*

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        div("App-header") {
            logo()
            h1 {
                +"DIE HAUSBEWERTER"
            }
        }
        p("App-intro") {
            h2 {
                +"Willkommen bei den Hausbewertern - Ihre Plattform für die Verwaltung Ihrer Hausbewertungen."
            }
        }
        div("App-login") {
            login()
        }

    }
}

fun RBuilder.app() = child(App::class) {}
