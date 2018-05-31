package react.data

import org.w3c.dom.Node
import react.*
import react.dom.*

// INTERFACES

interface FooterProps : RProps {
    var copyrights: String
    var links: ReactElement
    var moreLinks: ReactElement
}

// IMPLEMENTATIONS

data class FooterData(
        override var copyrights: String,
        override var links: ReactElement,
        override var moreLinks: ReactElement,
        var children: RHandler<RProps>
) : FooterProps

fun createLinks(links: List<Pair<String, String>>): ReactElement {
    val listEntries = links.map {
        React.createElement("li", object : RProps {},
                React.createElement("a",
                        object : RProps {
                            var href = it.first
                        },
                        it.second)
        )
    }.toTypedArray()
    return React.createElement("ul", object : RProps {}, listEntries)
}