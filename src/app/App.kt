package app

import body.body
import cards.cardRow
import logo.logo
import nav.nav
import react.*
import react.data.*
import react.dom.*
import resources.*

const val imgHouse = "/images/house-landscape-1.jpg"
const val imgMountain = "/images/mountain-1.jpg"

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        nav()
        div {
            parallax(
                    ParallaxData(imgHouse)
            )
            div("App-intro") {
                logo()
                h3 {
                    +appIntroHeader()
                }
                h5 {
                    +appIntroSubHeader()
                }
            }
            div("App-body") {
                body()
                parallax(
                        ParallaxData(imgHouse)
                )
                cardRow(listOf(
                        CardData(title = "",
                                reveal = bodyWelcome(),
                                offset = "offset-m2 offset-l3",
                                headerData = CardTitleData(image = imgMountain, text = "Test")) {
                            p("card-body") {
                                i("material-icons center medium") {
                                    +"store"
                                }
                            }
                            p {
                                +bodyHeader()
                            }
                        },
                        CardData(title = "",
                                reveal = bodyWelcome(),
                                headerData = CardTitleData(image = imgMountain, text = "Test")) {
                            p("card-body") {
                                i("material-icons center medium") {
                                    +"room"
                                }
                            }
                            p {
                                +bodyHeader()
                            }
                        },
                        CardData(title = "",
                                reveal = bodyWelcome(),
                                headerData = CardTitleData(image = imgMountain, text = "Test")) {
                            p("card-body") {
                                i("material-icons center medium") {
                                    +"schedule"
                                }
                            }
                            p {
                                +bodyHeader()
                            }
                        }
                ))
                cardRow(listOf(
                        CardData(title = "",
                                reveal = bodyWelcome(),
                                offset = "offset-m2 offset-l3",
                                headerData = CardTitleData(image = imgMountain, text = "Test")) {
                            p("card-body") {
                                i("material-icons center medium") {
                                    +"euro_symbol"
                                }
                            }
                            p {
                                +bodyHeader()
                            }
                        },
                        CardData(title = "",
                                reveal = bodyWelcome(),
                                headerData = CardTitleData(image = imgMountain, text = "Test")) {
                            p("card-body") {
                                i("material-icons center medium") {
                                    +"lock"
                                }
                            }
                            p {
                                +bodyHeader()
                            }
                        },
                        CardData(title = "",
                                reveal = bodyWelcome(),
                                headerData = CardTitleData(image = imgMountain, text = "Test")) {
                            p("card-body") {
                                i("material-icons center medium") {
                                    +"grade"
                                }
                            }
                            p {
                                +bodyHeader()
                            }
                        }
                ))
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
