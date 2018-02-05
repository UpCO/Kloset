package com.upco.kloset.contract

/**
 * Created by felps on 23/10/17.
 */
interface AnswerContract: BaseContract {

    interface ModelImpl {
        fun retrieveAnswers()
    }

    interface ViewImpl: BaseContract.ViewImpl {
        companion object {
            val ANSWERS_KEY = "answers"
        }

        fun updateAnswersRecycler()
        fun updateAnswersRecyclerItem(position: Int)
    }
}