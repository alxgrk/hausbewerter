package login

import react.*

interface LoginProps : RProps {
}

interface LoginState : RState {
    var username: String
    var password: String
}

class Login(props: LoginProps) : RComponent<LoginProps, LoginState>(props) {

    override fun RBuilder.render() {
        usernameInput {
            setState {
                username = it.target.toString();
            }
        }
        passwordInput {
            setState {
                password = it.target.toString();
            }
        }
        loginButton {
            // TODO
            console.log("User ${state.username} logged in.")
        }
    }
}

fun RBuilder.login() = child(Login::class) {
    // no attrs yet
}