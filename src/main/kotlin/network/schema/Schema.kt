package network.schema

import kotlinext.js.JsObject
import kotlinext.js.js
import kotlinext.js.jsObject
import libraries.AxiosPromise
import libraries.AxiosRequestConfig
import network.schema.RefResolver.axiosRefResolver
import kotlin.js.*

data class Schema(val links: MutableList<Link>)

data class Link(
        val rel: String,
        var href: String,
        val method: Method,
        val targetSchema: JsObject,
        val formerData: JsObject
)

enum class Method {
    GET, POST, PUT, DELETE, PATCH, OPTIONS, HEAD
}

fun <T> Link.axios(baseUrl: String = "", data: Json = json()): AxiosPromise<T> {
    val url = "$baseUrl$href"
    return when (method.toString()) {
        Method.GET.name -> axiosRefResolver.get(url)
        Method.POST.name -> axiosRefResolver.post(url, data)
        Method.PUT.name -> axiosRefResolver.put(url, data)
        Method.PATCH.name -> axiosRefResolver.patch(url, data)
        Method.DELETE.name -> axiosRefResolver.delete(url).unsafeCast<AxiosPromise<T>>()
        Method.HEAD.name -> axiosRefResolver.head(url).unsafeCast<AxiosPromise<T>>()
        Method.OPTIONS.name -> axiosRefResolver.options(url).unsafeCast<AxiosPromise<T>>()
        else -> throw UnsupportedOperationException("$method")
    }
}

fun Schema.getLinkByRel(rel: Relation): Link? = links
        .firstOrNull { it.rel == rel.toString() }

fun Schema.getTargetSchemaByRel(rel: Relation): JsObject? = links
        .filter { it.rel == rel.toString() }
        .map { it.targetSchema }
        .firstOrNull()

fun Schema.getFormerDataByRel(rel: Relation): JsObject? = links
        .filter { it.rel == rel.toString() }
        .map { it.formerData }
        .firstOrNull()


fun Json.getSchema(): Schema = this["_schema"].asDynamic()
        .links.iterator()
        .asSequence()
        .map { Link(it.rel, it.href, it.method, it.targetSchema, it.formerData) }
        .fold(Schema(mutableListOf())) { s, link ->
            s.links.add(link)
            s
        }