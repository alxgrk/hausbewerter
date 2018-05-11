package nav

import react.*
import react.data.NavBarData
import react.data.NavItemData
import react.data.NavProps
import resources.*

class Nav(props: NavProps) : RComponent<NavProps, RState>(props) {

    override fun RBuilder.render() {
        navBar(
                NavBarData(appName()),
                listOf(
                        NavItemData(href = "/",
                                onClick = {
                                    console.log("click Root")
                                },
                                text = "Root"),
                        NavItemData(
                                divider = true,
                                text = ""),
                        NavItemData(href = "/login",
                                onClick = {
                                    console.log("click Login")
                                },
                                text = "Login"),
                        NavItemData(
                                divider = true,
                                text = ""),
                        NavItemData(href = "/contact",
                                onClick = {
                                    console.log("click Contact")
                                },
                                text = "Contact")
                )
        )
    }
}

fun RBuilder.nav() = child(Nav::class) {
    // no attrs yet
}