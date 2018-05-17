package nav

import login.login
import react.*
import react.data.NavBarData
import react.data.NavItemData
import react.data.NavProps
import react.dom.*
import resources.*

class Nav(props: NavProps) : RComponent<NavProps, RState>(props) {

    override fun RBuilder.render() {
        navBar(NavBarData(appName())) {
            navItem(NavItemData(href = "/",
                    onClick = {
                        console.log("click Root")
                    })) {
                +"Root"
            }
            navItem(NavItemData(divider = true)) {}
            navItem(NavItemData(href = "/contact",
                    onClick = {
                        console.log("click Contact")
                    })) {
                +"Contact"
            }
            navItem(NavItemData(divider = true)) {}
            navItem(NavItemData(href = "/login",
                    onClick = {
                        console.log("click Login")
                    })) {
                +"Login"
                i (classes= "material-icons right") {
                    +"arrow_drop_down"
                }
                div (classes= "dropdown") {
                    login()
                }
            }
        }
    }

}

fun RBuilder.nav() = child(Nav::class) {
    // no attrs yet
}