package react.router

import react.RBuilder
import react.RClass
import react.RHandler
import react.RProps
import kotlin.reflect.KClass

fun RBuilder.browserRouter(handler: RHandler<RProps>) = child(BrowserRouter::class, handler)

fun RBuilder.switch(handler: RHandler<RProps>) = child(Switch::class, handler)

fun RBuilder.route(path: String, component: KClass<out React.Component<*, *>>, exact: Boolean = false) =
        child(Route::class) {
            attrs {
                this.path = path
                this.exact = exact
                this.component = component.js.unsafeCast<RClass<RProps>>()
            }
        }

fun RBuilder.link(to: String, handler: RHandler<RProps>) = child(Link::class) {
    attrs {
        this.to = to
    }
    handler()
}