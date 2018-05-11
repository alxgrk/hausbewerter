package login

import org.w3c.dom.events.Event
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.data.InputData
import react.input
import resources.placeholderUsername

interface UsernameProps : RProps {
    var onUsernameChanged: (Event) -> Unit
}

class UsernameInput(props: UsernameProps) : RComponent<UsernameProps, RState>(props) {

    override fun RBuilder.render() {
        input(
                InputData(label = placeholderUsername(),
                        onChangeFunction = props.onUsernameChanged)
        )
    }
}

fun RBuilder.usernameInput(onUsernameChanged: (Event) -> Unit) = child(UsernameInput::class) {
    attrs.onUsernameChanged = onUsernameChanged
}