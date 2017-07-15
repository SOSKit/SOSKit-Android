package io.digitalmomentum.soskit_android.domain

data class QuestionInfo(
        var id: String,
        var type: String,
        var option1: String,
        var option2: String,
        var content: QuestionInfoContent
)