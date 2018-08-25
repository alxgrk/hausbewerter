@file:JsModule("@pact-foundation/pact-node")

package test.util

import react.RState
import react.React
import react.ReactElement
import react.material.data.*

@JsName("Navbar")
external class NavBar : React.Component<NavBarProps, RState> {
    override fun render(): ReactElement?
}
