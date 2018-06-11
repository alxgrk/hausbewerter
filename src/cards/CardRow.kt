package cards

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.material.card
import react.material.data.CardData
import react.material.data.ColData
import react.material.data.RowData
import react.material.row

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
