package react.material.data

import org.w3c.dom.events.Event
import react.RProps
import react.dom.WithClassName

// INTERFACES

interface ButtonProps : WithClassName {
    var waves: String
    var text: String
    var onClick: (Event) -> Unit
    var floating: Boolean
    var node: String?
    var href: String?
}

// IMPLEMENTATIONS

data class ButtonData(
        override var waves: String,
        override var text: String,
        override var onClick: (Event) -> Unit = {},
        override var floating: Boolean = false,
        override var node: String? = null,
        override var href: String? = null,
        override var className: String? = ""
) : ButtonProps
