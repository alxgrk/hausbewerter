package nav

import login.login
import react.RBuilder
import react.RComponent
import react.RState
import react.dom.div
import react.dom.i
import react.material.data.NavBarData
import react.material.data.NavItemData
import react.material.data.NavProps
import react.material.navBar
import react.material.navItem
import resources.appName

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
