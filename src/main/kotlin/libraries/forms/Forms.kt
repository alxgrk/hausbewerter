package libraries.forms

import kotlinext.js.JsObject
import react.RBuilder
import react.RProps
import react.createElement

interface FormProps : RProps {
    var schema: JsObject
    var onChange: (dynamic) -> Unit
    var onSubmit: (dynamic) -> Unit
    var onError: (dynamic) -> Unit
}

data class FormData(
        override var schema: JsObject,
        override var onChange: (dynamic) -> Unit = {},
        override var onSubmit: (dynamic) -> Unit = {},
        override var onError: (dynamic) -> Unit = {}) : FormProps

fun RBuilder.form(props: FormProps) = run {
    val form = createElement(Form, object : RProps {
        val schema = props.schema
        val onChange = props.onChange
        val onError = props.onError
        val onSubmit = props.onSubmit
    })
    child(form)
}
