package cards

import react.*
import react.data.CardData
import react.data.ColData
import react.data.RowData

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