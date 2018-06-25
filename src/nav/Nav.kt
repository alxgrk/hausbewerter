package nav

import login.login
import react.*
import react.dom.div
import react.dom.hr
import react.dom.i
import react.material.data.NavBarData
import react.material.data.NavItemData
import react.material.data.NavProps
import react.material.navBar
import react.material.navItem
import react.router.link
import resources.appName

class Nav(props: NavProps) : RComponent<NavProps, RState>(props) {

    override fun RBuilder.render() {
        navBar(NavBarData(href = "/", text = appName())) {
            navItem(NavItemData(onClick = {
                console.log("click About")
            })) {
                link(to = "/about") {
                    +"About"
                }
            }
            navItem(NavItemData(divider = true)) {}
            navItem(NavItemData(
                    onClick = {
                        console.log("click Login")
                    })) {
                +"Login"
                i(classes = "material-icons right") {
                    +"arrow_drop_down"
                }
                div(classes = "dropdown") {
                    login()
                }
            }
        }
    }

}

fun RBuilder.nav() = child(Nav::class) {
    // no attrs yet
}
