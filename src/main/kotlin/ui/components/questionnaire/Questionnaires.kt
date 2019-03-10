package ui.components.questionnaire

import di.questionRepo
import kotlinext.js.js
import kotlinext.js.jsObject
import libraries.react.material.data.CardData
import libraries.react.material.data.CardSize
import libraries.react.router.Link
import libraries.react.router.LinkProps
import libraries.react.router.link
import libraries.react.router.redirect
import org.w3c.dom.events.Event
import react.*
import react.dom.*
import ui.components.cards.cardRow
import ui.components.various.iconButton
import various.*
import kotlin.js.Json

interface QuestionnairesState : RState {
    var redirectTo: String
    var questionnaires: List<Json>
}

class Questionnaires : RComponent<RProps, QuestionnairesState>() {

    init {
        state.questionnaires = emptyList()
    }

    override fun componentWillMount() {
        questionRepo.getAll { response ->
            setState {
                val members = response.data.toJson().asList("members")
                questionnaires = members
            }
        }

//        if (qid != null) {
//            console.log("requesting questionnaire with id $qid")
//            setState {
//                redirectTo = "/questionnaire/$qid"
//            }
//        } else
//            questionRepo.create { response ->
//                val newId = response.data.toJson()["id"].toString()
//                console.log("created new questionnaire with id $newId")
//                lastQidRepo.saveLastQid(newId)
//                setState {
//                    redirectTo = "/questionnaire/$newId"
//                }
//                return@create response
//            }
    }

    override fun RBuilder.render() {
        div(classes = "questionnaire") {
            h1("questionnaires-all") {
                +allQuestionnaires()
            }

            // last card for adding a questionnaire
            val addingCard = CardData(title = addNewQuestionnaire(),
                    size = CardSize.SMALL) {
                iconButton("add", "center medium") {
                    questionRepo.create { response ->
                        val newId = response.data.toJson()["id"].toString()
                        console.log("created new questionnaire with id $newId")
                        // TODO link directly
                        setState {
                            redirectTo = "/questionnaire/$newId"
                        }
                        return@create response
                    }
                }
            }

            state.questionnaires.forEachIndexed { index, member ->

                // every second time and only if there is a next card
                if (index % 2 == 0) {

                    val secondCard = if ((index + 1) < state.questionnaires.size)
                        memberToCard(state.questionnaires[index + 1])
                    else
                        addingCard

                    val members = listOf(memberToCard(member), secondCard)
                    cardRow(l = 6, m = 6, s = 12, cards = members)

                } else if ((index + 1) == state.questionnaires.size)
                    cardRow(l = 6, m = 6, s = 12, cards = listOf(addingCard))
            }

        }
    }

    private fun memberToCard(member: Json): CardData {
        val action = member["id"].toString().let { id ->
            console.log("showing details of questionnaire with id $id")
            createElement(
                    Link::class.js,
                    js { to = "/questionnaire/$id" }.unsafeCast<RProps>(),
                    showQuestionnaireDetails()
            )
        }

        return CardData(
                title = member["name"].toString(),
                size = CardSize.SMALL,
                actions = arrayOf(action)) {
            p { +member.toJsonString() }
        }
    }

}
