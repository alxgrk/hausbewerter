package nav

import org.w3c.dom.Element
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.findDOMNode

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
