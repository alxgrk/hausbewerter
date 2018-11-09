package ui.components.cards

import libraries.react.material.card
import libraries.react.material.data.CardData
import libraries.react.material.data.ColData
import libraries.react.material.data.RowData
import libraries.react.material.row
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState

interface CardRowProps : RProps {
    var cards: List<CardData>
}

class CardRow(props: CardRowProps) : RComponent<CardRowProps, RState>(props) {

    override fun RBuilder.render() {
        val columns = props.cards.map {
            ColData(l = 2, m = 3, s=12, className = "info-cards hoverable " + it.offset) {
                card(it)
            }
        }
        row(RowData(columns))
    }
}

fun RBuilder.cardRow(cards: List<CardData>) = child(CardRow::class) {
    attrs.cards = cards
}
