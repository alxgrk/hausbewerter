package login

import org.w3c.dom.events.Event
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.data.InputData
import react.input
import resources.placeholderPassword

interface PasswordProps : RProps {
    var onPasswordChanged: (Event) -> Unit
}

class PasswordInput(props: PasswordProps) : RComponent<PasswordProps, RState>(props) {

    override fun RBuilder.render() {
        input(
                InputData(label = placeholderPassword(),
                        type = "password",
                        icon = "lock_outline",
                        onChangeFunction = props.onPasswordChanged)
        )
    }
}

fun RBuilder.passwordInput(onPasswordChanged: (Event) -> Unit) = child(PasswordInput::class) {
    attrs.onPasswordChanged = onPasswordChanged
}