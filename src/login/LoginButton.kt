package login

import org.w3c.dom.events.Event
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.p
import react.data.ButtonData
import react.button
import resources.buttonLogin

interface LoginButtonProps : RProps {
    var onClick: (Event) -> Unit
}

class LoginButton(props: LoginButtonProps) : RComponent<LoginButtonProps, RState>(props) {

    override fun RBuilder.render() {

        p {
            button(
                    ButtonData("light", buttonLogin(), props.onClick)
            )
        }
    }
}

fun RBuilder.loginButton(onClick: (Event) -> Unit) = child(LoginButton::class) {
    attrs.onClick = onClick
}