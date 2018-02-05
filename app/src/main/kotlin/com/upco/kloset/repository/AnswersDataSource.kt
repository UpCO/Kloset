package com.upco.kloset.repository

import com.upco.kloset.model.entity.Comment

/**
 * Created by felps on 23/10/17.
 */
interface AnswersDataSource {

    interface LoadAnswersCallback {
        fun onAnswersLoaded(answers: ArrayList<Comment>)
        fun onDataNotAvailable()
    }

    interface GetAnswerCallback {
        fun onAnswerLoaded(answer: Comment)
        fun onDataNotAvailable()
    }

    fun getAnswers(commentUid: String, callback: LoadAnswersCallback)
    fun getAnswer(answerUid: String, callback: GetAnswerCallback)
    fun saveAnswer(answer: Comment)
    fun refreshAnswers()
    fun deleteAnswer(answerUid: String)
    fun deleteAllAnswers()
}