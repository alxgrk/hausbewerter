@file:JsModule("react-materialize")

package libraries.react.material

import libraries.react.material.data.*
import react.Component
import react.RState
import react.ReactElement

@JsName("Navbar")
external class NavBar : Component<NavBarProps, RState> {
    override fun render(): ReactElement?
}

external class NavItem : Component<NavItemProps, RState> {
    override fun render(): ReactElement?
}

external class Button : Component<ButtonProps, RState> {
    override fun render(): ReactElement?
}

external class Parallax : Component<ParallaxProps, RState> {
    override fun render(): ReactElement?
}

external class Input : Component<InputProps, RState> {
    override fun render(): ReactElement?
}

external class Card : Component<CardProps, RState> {
    override fun render(): ReactElement?
}

external class CardTitle : Component<CardTitleProps, RState> {
    override fun render(): ReactElement?
}

external class Row : Component<RowProps, RState> {
    override fun render(): ReactElement?
}

external class Col : Component<ColProps, RState> {
    override fun render(): ReactElement?
}

external class Footer : Component<FooterProps, RState> {
    override fun render(): ReactElement?
}