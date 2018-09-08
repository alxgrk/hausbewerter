package schema

import kotlinext.js.JsObject
import kotlin.js.Json

data class Schema(val links: MutableList<Link>)

data class Link(
        val rel: String,
        val href: String,
        val method: Method,
        val targetSchema: JsObject
)

enum class Method {
    GET, POST, PUT, DELETE, PATCH, OPTIONS, HEAD
}

fun Schema.getTargetSchemaByRel(rel: String): JsObject = links
        .filter { it.rel == rel }
        .map { it.targetSchema }
        .first()


fun Json.getSchema(): Schema = this["_schema"].asDynamic()
        .links.iterator()
        .asSequence()
        .map { Link(it.rel, it.href, it.method, it.targetSchema) }
        .fold(Schema(mutableListOf())) { s, link ->
            s.links.add(link)
            s
        }