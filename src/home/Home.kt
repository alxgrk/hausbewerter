package home

import body.body
import cards.cardRow
import logo.logo
import react.*
import react.dom.*
import react.material.data.*
import react.material.footer
import react.material.parallax
import resources.*

const val imgHouse = "/images/house-landscape-1.jpg"
const val imgMountain = "/images/mountain-1.jpg"

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
                cardRow(listOf(
                        CardData(title = "",
                                reveal = React.createElement("p", object: RProps {} , bodyWelcome()),
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
                                reveal = React.createElement("p", object: RProps {} , bodyWelcome()),
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
                                reveal = React.createElement("p", object: RProps {} , bodyWelcome()),
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
                                reveal = React.createElement("p", object: RProps {} , bodyWelcome()),
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
                                reveal = React.createElement("p", object: RProps {} , bodyWelcome()),
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
                                reveal = React.createElement("p", object: RProps {} , bodyWelcome()),
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
                moreLinks = React.createElement("a", object : RProps {
                    var href = "#"
                }, "Impressum")
        ) {
            h5 { +footerHeader() }
            p { +footerContent() }
        })
    }
}

fun RBuilder.home() = child(Home::class) {}
