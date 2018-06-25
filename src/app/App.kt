package app

import about.About
import home.Home
import nav.nav
import questionnaire.Questionnaire
import react.*
import react.dom.div
import react.dom.h5
import react.dom.p
import react.material.data.FooterData
import react.material.data.createLinks
import react.material.footer
import react.router.browserRouter
import react.router.route
import react.router.switch
import resources.footerContent
import resources.footerHeader

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        browserRouter {
            div {
                nav()
                switch {
                    route("/", Home::class, exact = true)
                    route("/about", About::class)
                    route("/questionnaire", Questionnaire::class)
                }
                footer(FooterData(
                        copyrights = "© 2018 Copyright Text",
                        links = createLinks(listOf(
                                Pair("#", "About"),
                                Pair("#", "Login"),
                                Pair("#", "Help")
                        )),
                        moreLinks = React.createElement("a", object : RProps {
                            var href = "#"
                        }, "Impressum")
                ) {
                    h5 { +footerHeader() }
                    p { +footerContent() }
                })
            }
        }
    }
}

fun RBuilder.app() = child(App::class) {}
