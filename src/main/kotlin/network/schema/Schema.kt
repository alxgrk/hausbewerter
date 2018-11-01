package network

import kotlinext.js.JsObject
import libraries.AxiosPromise
import network.RefResolver.axiosRefResolver
import kotlin.js.*

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

fun <T> Link.axios(url: String, data: Any? = null): AxiosPromise<T> {
    console.log(method)
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