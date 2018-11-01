import react.dom.render
import ui.structural.app
import kotlin.browser.document
import kotlin.browser.window

fun main(args: Array<String>) {
    window.onload = {
        render(document.getElementById("root")) {
            app()
        }
    }
}
