package libraries.forms

import kotlinext.js.JsObject
import kotlinext.js.jsObject
import react.RBuilder
import react.RProps
import react.createElement
import various.toJson
import various.toJsonString
import kotlin.js.Json
import kotlin.js.json

interface FormProps : RProps {
    var schema: JsObject
    var formData: JsObject
    var onChange: (dynamic) -> Unit
    var onSubmit: (dynamic) -> Unit
    var onError: (dynamic) -> Unit
    var validate: (dynamic, dynamic) -> dynamic
    var transformErrors: (dynamic) -> dynamic
}

data class FormData(
        override var schema: JsObject,
        override var formData: JsObject = jsObject { },
        override var onChange: (dynamic) -> Unit = {},
        override var onSubmit: (dynamic) -> Unit = {},
        override var onError: (dynamic) -> Unit = {},
        override var validate: (dynamic, dynamic) -> dynamic = { _, e -> e },
        override var transformErrors: (dynamic) -> dynamic = { error ->
            (error as Any).also {
                if (it.toJsonString() != "[]")
                    console.log("Encaptured error: $it")
            }
        }) : FormProps

fun RBuilder.form(props: FormProps) = run {
    val form = createElement(Form, object : RProps {
        val schema = props.schema
        val formData = props.formData
        val onChange = props.onChange
        val onError = props.onError
        val onSubmit = props.onSubmit
        val validate = props.validate
        val transformErrors = props.transformErrors
    })
    child(form)
}
