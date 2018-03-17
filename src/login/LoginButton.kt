package login

import kotlinx.html.ButtonFormMethod
import kotlinx.html.ButtonType
import kotlinx.html.InputType
import kotlinx.html.js.onChangeFunction
import kotlinx.html.js.onClickFunction
import org.w3c.dom.events.Event
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.button
import react.dom.input
import react.dom.p

interface LoginButtonProps : RProps {
    var onClick: (Event) -> Unit
}

class LoginButton(props: LoginButtonProps) : RComponent<LoginButtonProps, RState>(props) {

    override fun RBuilder.render() {

        p {
            button(formMethod = ButtonFormMethod.post, type = ButtonType.submit) {
                attrs {
                    text("Login")
                    onClickFunction = props.onClick
                }
            }
        }
    }
}

fun RBuilder.loginButton(onClick: (Event) -> Unit) = child(LoginButton::class) {
    attrs.onClick = onClick
}