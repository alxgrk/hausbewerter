package network

import libraries.AxiosResponse
import network.data.QuestionRepository
import network.data.RemoteQuestionRepository

val questionRepo: QuestionRepository<AxiosResponse<String>> = RemoteQuestionRepository()