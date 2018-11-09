package libraries.react.material.data

import react.RProps
import react.ReactElement

// INTERFACES

interface NavProps : RProps {
}

interface NavBarProps : RProps {
    var href: String
    var right: Boolean
    var left: Boolean
    var fixed: Boolean
    var text: String
    var brand: ReactElement?
}

interface NavItemProps : RProps {
    var onClick: () -> Unit
    var divider: Boolean
}

// IMPLEMENTATIONS

data class NavBarData(
        override var href: String = "/",
        override var right: Boolean = true,
        override var left: Boolean = false,
        override var fixed: Boolean = true,
        override var text: String,
        override var brand: ReactElement? = null
) : NavBarProps

data class NavItemData(
        override var onClick: () -> Unit = {},
        override var divider: Boolean = false
) : NavItemProps