package libraries.react.router

import react.*
import kotlin.reflect.KClass

fun RBuilder.browserRouter(basename: String = "/", handler: RHandler<RProps>) = child(BrowserRouter::class) {
    attrs {
        this.basename = basename
    }
    handler()
}

fun RBuilder.switch(handler: RHandler<RProps>) = child(Switch::class, handler)

fun RBuilder.route(path: String, component: KClass<out Component<*, *>>, exact: Boolean = false) =
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

fun RBuilder.redirect(to: String) = child(Redirect::class) {
    attrs {
        this.to = to
    }
}
