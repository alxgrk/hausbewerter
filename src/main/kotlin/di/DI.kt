package di

import data.LastQidRepository
import libraries.AxiosResponse
import data.QuestionRepository
import data.local.LocalLastQidRepository
import network.data.RemoteQuestionRepository

val lastQidRepo: LastQidRepository = LocalLastQidRepository
val questionRepo: QuestionRepository<AxiosResponse<String>> = RemoteQuestionRepository()