package nav

import react.*
import react.dom.*

interface NavProps : RProps {
}

interface NavState : RState {
}

class Nav(props: NavProps) : RComponent<NavProps, NavState>(props) {

    override fun RBuilder.render() {
        nav("App-nav") {
            ul {
                li {
                    strong {
                        a("#") {
                            +"Home"
                        }
                    }
                }
                li {
                    strong {
                        a("/kontakt") {
                            +"Kontakt"
                        }
                    }
                }
            }
        }
    }
}

fun RBuilder.nav() = child(Nav::class) {
    // no attrs yet
}