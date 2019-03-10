package ui.structural

import libraries.react.material.button
import libraries.react.material.data.*
import libraries.react.material.footer
import libraries.react.material.parallax
import libraries.react.router.link
import react.*
import react.dom.*
import ui.components.cards.cardRow
import ui.components.logo.logo
import various.*

const val imgHouse = "/hausbewerter-js/src/main/resources/images/house-landscape-1.jpg"
const val imgMountain = "/hausbewerter-js/src/main/resources/images/mountain-1.jpg"

class Home : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
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
                cardRow(l = 2, m = 3, s = 12, cards = listOf(
                        CardData(title = "",
                                reveal = createElement("p", object: RProps {} , bodyWelcome()),
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
                                reveal = createElement("p", object: RProps {} , bodyWelcome()),
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
                                reveal = createElement("p", object: RProps {} , bodyWelcome()),
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
                cardRow(l = 2, m = 3, s = 12, cards = listOf(
                        CardData(title = "",
                                reveal = createElement("p", object: RProps {} , bodyWelcome()),
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
                                reveal = createElement("p", object: RProps {} , bodyWelcome()),
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
                                reveal = createElement("p", object: RProps {} , bodyWelcome()),
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
            }
        }
        footer(FooterData(
                copyrights = "© 2018 Copyright Text",
                links = createLinks(listOf(
                        Pair("#", "About"),
                        Pair("#", "Login"),
                        Pair("#", "Help")
                )),
                moreLinks = createElement("a", object : RProps {
                    var href = "#"
                }, "Impressum")
        ) {
            h5 { +footerHeader() }
            p { +footerContent() }
        })
    }
}

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
                    button(text = buttonTry()) {}
                }
            }
        }
    }
}

fun RBuilder.home() = child(Home::class) {}
fun RBuilder.body() = child(Body::class) {}
