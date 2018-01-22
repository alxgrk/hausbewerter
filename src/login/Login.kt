package login

import kotlinx.html.ButtonFormMethod
import kotlinx.html.ButtonType
import kotlinx.html.InputType
import kotlinx.html.js.onChangeFunction
import kotlinx.html.js.onClickFunction
import react.*
import react.dom.*

interface LoginProps : RProps {
}

interface LoginState : RState {
    var username: String
    var password: String
}

class Login(props: LoginProps) : RComponent<LoginProps, LoginState>(props) {
    override fun LoginState.init(props: LoginProps) {
        // nothing props yet
    }

    override fun RBuilder.render() {
        p {
            input(type = InputType.text, classes = "username") {
                attrs {
                    placeholder = "Benutzername"
                    onChangeFunction = {
                        setState {
                            username = it.target.toString();
                        }
                    }
                }
            }
        }
        p {
            input(type = InputType.password, classes = "password") {
                attrs {
                    placeholder = "Passwort"
                    onChangeFunction = {
                        setState {
                            password = it.target.toString();
                        }
                    }
                }
            }
        }
        p {
            button(formMethod = ButtonFormMethod.post, type = ButtonType.submit) {
                attrs {
                    text("Login")
                    onClickFunction = {
                        // TODO
                        console.log("User ${state.username} logged in.")
                    }
                }
            }
        }
    }
}

fun RBuilder.login() = child(Login::class) {
    // no attrs yet
}