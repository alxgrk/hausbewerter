package ui.components.login

import libraries.react.material.data.InputData
import libraries.react.material.input
import org.w3c.dom.events.Event
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import various.placeholderPassword

interface PasswordProps : RProps {
    var onPasswordChanged: (Event) -> Unit
}

class PasswordInput(props: PasswordProps) : RComponent<PasswordProps, RState>(props) {

    override fun RBuilder.render() {
        input(
                InputData(label = placeholderPassword(),
                        type = "password",
                        icon = "lock_outline",
                        onChange = props.onPasswordChanged)
        )
    }
}

fun RBuilder.passwordInput(onPasswordChanged: (Event) -> Unit) = child(PasswordInput::class) {
    attrs.onPasswordChanged = onPasswordChanged
}
