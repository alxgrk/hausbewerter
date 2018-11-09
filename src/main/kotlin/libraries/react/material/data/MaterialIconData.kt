package libraries.react.material.data

import react.dom.WithClassName

// INTERFACES

interface IconDataProps : WithClassName {
    var left: Boolean
    var center: Boolean
    var right: Boolean
    var tiny: Boolean
    var small: Boolean
    var medium: Boolean
    var large: Boolean
}

interface IconProps : IconDataProps {
    var children: String
}

// IMPLEMENTATIONS

data class IconData(
        override var className: String? = "",
        override var left: Boolean = false,
        override var center: Boolean = false,
        override var right: Boolean = false,
        override var tiny: Boolean = false,
        override var small: Boolean = false,
        override var medium: Boolean = false,
        override var large: Boolean = false
) : IconDataProps
