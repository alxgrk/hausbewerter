package react.material.data

import org.w3c.dom.events.Event
import react.RProps

// INTERFACES

interface InputProps : RProps {
    var label: String
    var placeholder: String?
    var type: String
    var onChangeFunction: (Event) -> Unit
    var icon: String
}

// IMPLEMENTATIONS

data class InputData(
        override var label: String,
        override var placeholder: String? = null,
        override var type: String = "",
        override var onChangeFunction: (Event) -> Unit = {},
        override var icon: String = ""
) : InputProps
