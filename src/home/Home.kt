package home

import body.body
import cards.cardRow
import logo.logo
import react.*
import react.dom.*
import react.material.data.CardData
import react.material.data.CardTitleData
import react.material.data.ParallaxData
import react.material.parallax
import resources.appIntroHeader
import resources.appIntroSubHeader
import resources.bodyHeader
import resources.bodyWelcome

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
    }
}

fun RBuilder.home() = child(Home::class) {}
