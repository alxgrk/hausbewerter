package network.schema

enum class Relation(private val _rel: String) {
    CREATE("create"), BY_ID("get-by-id"), NEXT("next");

    override fun toString() = _rel
}