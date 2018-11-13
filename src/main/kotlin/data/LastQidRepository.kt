package data

interface LastQidRepository {

    fun saveLastQid(qid: String)

    fun getLastQid(): String?

    fun clear()

}