package network.schema

import kotlinext.js.clone
import libraries.axios
import various.toJsonString
import kotlin.js.Promise

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
