package ui.components.questionnaire

import di.lastQidRepo
import di.questionRepo
import libraries.react.router.redirect
import react.*
import react.dom.div
import react.dom.h1
import various.creatingNewQuestionnaire
import various.toJson

interface QuestionnairesState : RState {
    var redirectTo: String
}

class Questionnaires : RComponent<RProps, QuestionnairesState>() {

    override fun componentWillMount() {
        val qid = lastQidRepo.getLastQid()
        if (qid != null) {
            console.log("requesting questionnaire with id $qid")
            setState {
                redirectTo = "/questionnaire/$qid"
            }
        } else
            questionRepo.create { response ->
                val newId = response.data.toJson()["id"].toString()
                console.log("created new questionnaire with id $newId")
                lastQidRepo.saveLastQid(newId)
                setState {
                    redirectTo = "/questionnaire/$newId"
                }
                return@create response
            }
    }

    override fun RBuilder.render() {
        div(classes = "questionnaire valign-wrapper") {
            h1("questionnaire-creating-new center") {
                +creatingNewQuestionnaire()
            }
        }
        if (state.redirectTo !== undefined) {
            console.log("redirecting to ${state.redirectTo}")
            redirect(state.redirectTo)
        }
    }
}