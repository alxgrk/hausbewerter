@file:JsModule("react-router-dom")
package libraries.react.router

import react.*

external class BrowserRouter : Component<BrowserProps, RState> {
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

external class Redirect : Component<RedirectProps, RState> {
    override fun render(): react.ReactElement?
}

external interface BrowserProps : RProps {
    var basename: String
}

external interface RedirectProps : RProps {
    var exact: Boolean
    var from: String
    var push: Boolean
    var strict: Boolean
    var to: String
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
