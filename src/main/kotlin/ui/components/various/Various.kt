package ui.components.various

import org.w3c.dom.events.Event
import react.RBuilder
import react.RProps
import react.dom.span

fun RBuilder.iconButton(iconText: String, className: String = "", onClick: (Event) -> Unit) = run {
    this.child("i", object : RProps {
        val className = "waves-effect waves-teal material-icons $className"
        val onClick = onClick
    }) {
        +iconText
    }
}

fun RBuilder.showLoadingDots() = run {
    span("loading-dots") { +"." }
    span("loading-dots") { +"." }
    span("loading-dots") { +"." }
}
