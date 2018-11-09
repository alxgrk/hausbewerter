package libraries.react.material.data

import libraries.react.material.CardTitle
import react.RHandler
import react.RProps
import react.ReactElement

// INTERFACES

interface CardProps : RProps {
    var title: String
    var reveal: ReactElement?
    var offset: String
    var header: CardTitle?
}

interface CardTitleProps : RProps {
    var waves: String
    var reveal: Boolean
    var image: String
}

// IMPLEMENTATIONS

data class CardData(
        override var title: String,
        override var reveal: ReactElement? = null,
        override var offset: String = "",
        override var header: CardTitle? = null,
        var headerData: CardTitleData? = null,
        var child: RHandler<RProps>
) : CardProps

data class CardTitleData(
        override var waves: String = "light",
        override var reveal: Boolean = true,
        override var image: String,
        var text: String
) : CardTitleProps