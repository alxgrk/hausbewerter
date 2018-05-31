package react.data

import org.w3c.dom.events.Event
import react.*
import react.dom.WithClassName

// INTERFACES

interface RowProps : RProps {
}

interface ColProps : WithClassName {
    var s: Int
    var m: Int
    var l: Int
}

// IMPLEMENTATIONS

data class RowData(
        var children: List<ColData> = listOf()
) : RowProps

data class ColData(
        override var s: Int = 0,
        override var m: Int = 0,
        override var l: Int = 0,
        override var className: String? = null,
        var handler: RHandler<RProps>
) : ColProps