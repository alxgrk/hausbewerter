package types.axios

import kotlinext.js.clone
import schema.REF_KEY
import schema.defaultReplacer
import schema.replaceRef
import schema.schemaObjectPath
import util.anyToJson
import kotlin.js.*

object RefResolver {

    val axiosRefResolver = clone(axios)

    init {
        axiosRefResolver.interceptors.response.use(onFulfilled = { response ->

            val promise = Promise<Any> { resolve, _ ->

                response.data = defaultReplacer(response.data) {
                    resolve(response)
                }
            }

            promise
        })
    }
}
