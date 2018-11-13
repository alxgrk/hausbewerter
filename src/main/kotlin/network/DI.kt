package network

import data.QuestionRepository
import libraries.AxiosResponse
import network.data.RemoteQuestionRepository

val questionRepo: QuestionRepository<AxiosResponse<String>> = RemoteQuestionRepository()