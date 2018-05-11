package react.data

import org.w3c.dom.events.Event
import react.RProps

// INTERFACES

interface InputProps : RProps {
    var label: String
    var placeholder: String?
    var type: String
    var onChangeFunction: (Event) -> Unit
}

// IMPLEMENTATIONS

data class InputData(
        override var label: String,
        override var placeholder: String? = null,
        override var type: String = "",
        override var onChangeFunction: (Event) -> Unit = {}
) : InputProps
