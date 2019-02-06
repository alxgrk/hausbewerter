package network.schema

enum class Relation(private val _rel: String) {
    SELF("self"), CREATE("create"), BY_ID("get-by-id"), NEXT("next"), PREV("prev");

    override fun toString() = _rel
}