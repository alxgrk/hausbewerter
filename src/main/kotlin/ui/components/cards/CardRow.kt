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
    var l: Int
    var m: Int
    var s: Int
    var cards: List<CardData>
}

class CardRow(props: CardRowProps) : RComponent<CardRowProps, RState>(props) {

    override fun RBuilder.render() {
        val columns = props.cards.map {
            ColData(l = props.l, m = props.m, s = props.s, className = "info-cards hoverable " + it.offset) {
                card(it)
            }
        }
        row(RowData(columns))
    }
}

fun RBuilder.cardRow(l: Int, m: Int, s: Int, cards: List<CardData>) = child(CardRow::class) {
    attrs.l = l
    attrs.m = m
    attrs.s = s
    attrs.cards = cards
}
