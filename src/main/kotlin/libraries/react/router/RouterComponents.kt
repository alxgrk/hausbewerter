@file:JsModule("react-router-dom")
package libraries.react.router

import react.*

external class BrowserRouter : Component<RProps, RState> {
    override fun render(): ReactElement?
}

external class Switch : Component<RProps, RState> {
    override fun render(): ReactElement?
}

external class Route : Component<RouteProps, RState> {
    override fun render(): ReactElement?
}

external class Link : Component<LinkProps, RState> {
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