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

interface UsernameProps : RProps {
    var onUsernameChanged: (Event) -> Unit
}

class UsernameInput(props: UsernameProps) : RComponent<UsernameProps, RState>(props) {

    override fun RBuilder.render() {

        p {
            input(type = InputType.text, classes = "username") {
                attrs {
                    placeholder = "Benutzername"
                    onChangeFunction = props.onUsernameChanged
                }
            }
        }
    }
}

fun RBuilder.usernameInput(onUsernameChanged: (Event) -> Unit) = child(UsernameInput::class) {
    attrs.onUsernameChanged = onUsernameChanged
}