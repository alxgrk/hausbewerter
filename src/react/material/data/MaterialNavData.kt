package react.material.data

import react.RProps

// INTERFACES

interface NavProps : RProps {
}

interface NavBarProps : RProps {
    var brand: String
    var right: Boolean
    var left: Boolean
    var fixed: Boolean
}

interface NavItemProps : RProps {
    var href: String
    var onClick: () -> Unit
    var divider: Boolean
}

// IMPLEMENTATIONS

data class NavBarData(
        override var brand: String,
        override var right: Boolean = true,
        override var left: Boolean = false,
        override var fixed: Boolean = true
) : NavBarProps

data class NavItemData(
        override var href: String = "/",
        override var onClick: () -> Unit = {},
        override var divider: Boolean = false
) : NavItemProps