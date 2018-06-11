@file:JsModule("react-router-dom")
package react.router

import react.RClass
import react.RProps
import react.RState
import react.ReactElement

external class BrowserRouter : React.Component<RProps, RState> {
    override fun render(): ReactElement?
}

external class Switch : React.Component<RProps, RState> {
    override fun render(): ReactElement?
}

external class Route : React.Component<RouteProps, RState> {
    override fun render(): ReactElement?
}

external class Link : React.Component<LinkProps, RState> {
    override fun render(): ReactElement?
}

external interface RouteProps : RProps {
    var path: String
    var exact: Boolean
    var component: RClass<RProps>
}

external interface LinkProps : RProps {
    var to: String
}

external interface RouteResultProps<T : RProps> : RProps {
    var match: RouteResultMatch<T>
}

external interface RouteResultMatch<T : RProps> {
    var url: String
    var path: String
    var params: T
}