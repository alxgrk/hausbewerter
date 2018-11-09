package ui.components.login

import libraries.react.material.button
import libraries.react.material.data.ButtonData
import org.w3c.dom.events.Event
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.p
import various.buttonLogin

interface LoginButtonProps : RProps {
    var onClick: (Event) -> Unit
}

class LoginButton(props: LoginButtonProps) : RComponent<LoginButtonProps, RState>(props) {

    override fun RBuilder.render() {

        p {
            button(text = buttonLogin(), onClick = props.onClick)
        }
    }
}

fun RBuilder.loginButton(onClick: (Event) -> Unit) = child(LoginButton::class) {
    attrs.onClick = onClick
}
