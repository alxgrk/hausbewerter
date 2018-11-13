package data.local

import data.LastQidRepository
import org.w3c.dom.get
import org.w3c.dom.set
import kotlin.browser.localStorage

object LocalLastQidRepository : LastQidRepository {

    private val qidKey = "qid"

    override fun saveLastQid(qid: String) {
        localStorage[qidKey] = qid
    }

    override fun getLastQid() = localStorage[qidKey]

    override fun clear() = localStorage.removeItem(qidKey)

}