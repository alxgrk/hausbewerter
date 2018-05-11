package react.data

import org.w3c.dom.events.Event
import react.RProps

// INTERFACES

interface ButtonProps : RProps {
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
        override var href: String? = null
) : ButtonProps
