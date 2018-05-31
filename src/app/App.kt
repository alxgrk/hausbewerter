package app

import home.home
import home.Home
import nav.nav
import react.*
import react.data.FooterData
import react.data.createLinks
import react.dom.h5
import react.dom.div
import react.dom.p
import resources.footerContent
import resources.footerHeader

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        browserRouter {
            div {
                nav()
                switch {
                  route("/", Home::class, exact = true)
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
