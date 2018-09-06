package react.material.data

import react.RHandler
import react.RProps
import react.dom.WithClassName

// INTERFACES

interface RowProps : WithClassName {
}

interface ColProps : WithClassName {
    var s: Int
    var m: Int
    var l: Int
}

// IMPLEMENTATIONS

data class RowData(
        var children: List<ColData> = listOf(),
        override var className: String? = ""
) : RowProps

data class ColData(
        override var s: Int = 0,
        override var m: Int = 0,
        override var l: Int = 0,
        override var className: String? = null,
        var handler: RHandler<RProps>
) : ColProps