package react.material.data

import react.RHandler
import react.RProps
import react.ReactElement
import react.material.CardTitle

// INTERFACES

interface CardProps : RProps {
    var title: String
    var reveal: ReactElement
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
        override var reveal: ReactElement,
        override var offset: String = "",
        override var header: CardTitle? = null,
        var headerData: CardTitleData,
        var child: RHandler<RProps>
) : CardProps

data class CardTitleData(
        override var waves: String = "light",
        override var reveal: Boolean = true,
        override var image: String,
        var text: String
) : CardTitleProps