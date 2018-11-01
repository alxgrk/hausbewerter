package libraries.react.material.data

import react.RHandler
import react.RProps
import react.ReactElement
import react.createElement

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
        createElement("li", object : RProps {
            var key = it.second
        },
                createElement("a",
                        object : RProps {
                            var href = it.first
                        },
                        it.second)
        )
    }.toTypedArray()
    return createElement("ul", object : RProps {}, listEntries)
}