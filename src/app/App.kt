package app

import body.body
import login.login
import logo.logo
import nav.nav
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
        div("App-intro") {
            h2 {
                +"Herzlich Willkommen auf hausbewertung.de"
            }
            h3 {
                +"Ihre Plattform für die Verwaltung Ihrer Hausbewertungen."
            }
        }
        div("App-body") {
            nav()
            body()
            login()
        }

    }
}

fun RBuilder.app() = child(App::class) {}
