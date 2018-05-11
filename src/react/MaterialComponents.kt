@file:JsModule("react-materialize")

package react

import react.data.*

@JsName("Navbar")
external class NavBar : React.Component<NavBarProps, RState> {
    override fun render(): ReactElement?
}

external class NavItem : React.Component<NavItemProps, RState> {
    override fun render(): ReactElement?
}

external class Button : React.Component<ButtonProps, RState> {
    override fun render(): ReactElement?
}

external class Parallax : React.Component<ParallaxProps, RState> {
    override fun render(): ReactElement?
}

external class Input : React.Component<InputProps, RState> {
    override fun render(): ReactElement?
}

external class Card : React.Component<CardProps, RState> {
    override fun render(): ReactElement?
}

external class CardTitle : React.Component<CardTitleProps, RState> {
    override fun render(): ReactElement?
}

external class Row : React.Component<RowProps, RState> {
    override fun render(): ReactElement?
}

external class Col : React.Component<ColProps, RState> {
    override fun render(): ReactElement?
}