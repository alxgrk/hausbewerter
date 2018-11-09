package ui.components.login

import react.*
import react.dom.a
import react.dom.div
import various.forgotPassword
import various.registration

interface LoginProps : RProps {
}

interface LoginState : RState {
    var username: String
    var password: String
}

class Login(props: LoginProps) : RComponent<LoginProps, LoginState>(props) {

    override fun RBuilder.render() {
        div("login") {
            usernameInput {
                setState {
                    username = it.target.toString()
                }
            }
            passwordInput {
                setState {
                    password = it.target.toString()
                }
            }
            a(href = "/", classes = "login-links") { +registration() }
            a(href = "/", classes = "login-links") { +forgotPassword() }
            loginButton {
                // TODO
                console.log("User ${state.username} logged in.")
            }
        }
    }
}

fun RBuilder.login() = child(Login::class) {
    // no attrs yet
}
