package libraries.react.material.data

import org.w3c.dom.events.Event
import react.dom.WithClassName

// INTERFACES

interface ButtonDataProps : WithClassName {
    var waves: String
    var floating: Boolean
    var node: String?
    var href: String?
}

interface ButtonProps : ButtonDataProps {
    var onClick: (Event) -> Unit
}

// IMPLEMENTATIONS

data class ButtonData(
        override var waves: String = "light",
        override var floating: Boolean = false,
        override var node: String? = null,
        override var href: String? = null,
        override var className: String? = ""
) : ButtonDataProps
