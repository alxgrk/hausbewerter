package login

import kotlinx.html.InputType
import kotlinx.html.js.onChangeFunction
import org.w3c.dom.events.Event
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.input
import react.dom.p

interface PasswordProps : RProps {
    var onPasswordChanged: (Event) -> Unit
}

class PasswordInput(props: PasswordProps) : RComponent<PasswordProps, RState>(props) {

    override fun RBuilder.render() {

        p {
            input(type = InputType.password, classes = "password") {
                attrs {
                    placeholder = "Passwort"
                    onChangeFunction = props.onPasswordChanged
                }
            }
        }
    }
}

fun RBuilder.passwordInput(onPasswordChanged: (Event) -> Unit) = child(PasswordInput::class) {
    attrs.onPasswordChanged = onPasswordChanged
}