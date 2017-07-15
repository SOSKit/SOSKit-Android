package io.digitalmomentum.soskit_android.services

import com.github.kittinunf.fuel.android.extension.responseJson
import com.github.kittinunf.fuel.httpGet
import io.digitalmomentum.soskit_android.domain.QuestionInfo
import io.digitalmomentum.soskit_android.domain.QuestionInfoContent

object QuestionTreeService {
    val API_URL = "http://digitalmomentum.io:8083"

    val data = arrayListOf(
            QuestionInfo(
                    id = "a",
                    type = "question",
                    option1 = "b",
                    option2 = "c",
                    content = QuestionInfoContent(
                            text = "Is the person conscious?"
                    )
            ),
            QuestionInfo(
                    id = "b",
                    type = "question",
                    option1 = "d",
                    option2 = "e",
                    content = QuestionInfoContent(
                            text = "Is the person breathing?"
                    )
            ),
            QuestionInfo(
                    id = "c",
                    type = "question",
                    option1 = "a",
                    option2 = "b",
                    content = QuestionInfoContent(
                            text = "Is the person retarded?"
                    )
            ),
            QuestionInfo(
                    id = "d",
                    type = "question",
                    option1 = "a",
                    option2 = "b",
                    content = QuestionInfoContent(
                            text = "Is the person's heart still beating?"
                    )
            ),
            QuestionInfo(
                    id = "e",
                    type = "question",
                    option1 = "c",
                    option2 = "d",
                    content = QuestionInfoContent(
                            text = "Is the person Richer Archambault?"
                    )
            )
    )

    fun getQuestionInfoTree(): List<QuestionInfo> {
//        "${API_URL}/questions".httpGet().responseJson { request, response, result ->
//
//        }
        return data
    }

    fun getQuestionAtIndex(id: String): QuestionInfo {
        return data.find { card -> card.id == id }!!
    }
}