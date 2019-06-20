package libraries.react.material.data

import libraries.react.material.CardTitle
import react.RHandler
import react.RProps
import react.ReactElement
import react.dom.WithClassName
import kotlin.js.Json

// INTERFACES

interface CardProps : WithClassName {
    var title: String
    var reveal: ReactElement?
    var offset: String
    var actions: Array<ReactElement>?
    var header: CardTitle?
}

enum class CardSize {
    SMALL, MEDIUM, LARGE, INDIFFERENT;
}

interface CardTitleProps : RProps {
    var waves: String
    var reveal: Boolean
    var image: String
}

// IMPLEMENTATIONS

data class CardData(
        override var title: String,
        override var className: String? = "",
        override var reveal: ReactElement? = null,
        override var actions: Array<ReactElement>? = null,
        override var offset: String = "",
        override var header: CardTitle? = null,
        var headerData: CardTitleData? = null,
        var size: CardSize = CardSize.INDIFFERENT,
        var child: RHandler<RProps>
) : CardProps

data class CardTitleData(
        override var waves: String = "light",
        override var reveal: Boolean = true,
        override var image: String,
        var text: String
) : CardTitleProps