package io.digitalmomentum.soskit_android

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import io.digitalmomentum.soskit_android.domain.QuestionInfo
import io.digitalmomentum.soskit_android.services.QuestionTreeService
import kotlinx.android.synthetic.main.activity_question.*

class QuestionActivity : AppCompatActivity() {

    private var currentQuestion: QuestionInfo? = null
        set(value) {
            field = value
            questionTextView.text = value?.content?.text
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)
        currentQuestion = QuestionTreeService.getQuestionAtIndex("a")
        yesButton.setOnClickListener { v ->
            this.onPressYes()
        }
        noButton.setOnClickListener { v ->
            this.onPressNo()
        }
    }

    fun onPressYes() {
        val nextQuestionInfo = QuestionTreeService.getQuestionAtIndex(this.currentQuestion!!.option1)
        this.currentQuestion = nextQuestionInfo
    }

    fun onPressNo() {
        val nextQuestionInfo = QuestionTreeService.getQuestionAtIndex(this.currentQuestion!!.option2)
        this.currentQuestion = nextQuestionInfo
    }
}
