package ui.structural

import libraries.react.material.data.NavBarData
import libraries.react.material.data.NavItemData
import libraries.react.material.data.NavProps
import libraries.react.material.navBar
import libraries.react.material.navItem
import libraries.react.router.link
import ui.components.login.login
import org.w3c.dom.Element
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.div
import react.dom.findDOMNode
import react.dom.i
import various.appName

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

class NavBrandCentralizer : RComponent<RProps, RState>() {

    override fun componentDidMount() {
        val domNode = findDOMNode(this@NavBrandCentralizer)
        val parent = domNode.parentNode.unsafeCast<Element>()
        val prevElement = parent.previousElementSibling
        if (prevElement != null && prevElement.matches(".brand-logo"))
            prevElement.className += " center"
    }

    override fun RBuilder.render() {
        +""
    }
}

fun RBuilder.navBrandCentralizer() = child(NavBrandCentralizer::class) {}
fun RBuilder.nav() = child(Nav::class) {}
