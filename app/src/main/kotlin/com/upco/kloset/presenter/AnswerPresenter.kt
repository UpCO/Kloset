package com.upco.kloset.presenter

import android.content.Context
import android.os.Bundle
import com.upco.kloset.contract.AnswerContract
import com.upco.kloset.contract.BaseContract
import com.upco.kloset.model.AnswerModel
import com.upco.kloset.model.entity.Comment

/**
 * Created by felps on 23/10/17.
 */
class AnswerPresenter: BaseContract.PresenterImpl<AnswerContract.ViewImpl> {

    private val answers = arrayListOf<Comment>()
    private val model = AnswerModel(this)
    private var view: AnswerContract.ViewImpl? = null

    override fun attachView(view: AnswerContract.ViewImpl) { this.view = view }

    override fun detachView() { view = null }

    override fun getContext(): Context = view!!.getCtx()

    override fun showToast(msg: String) { view?.showToast(msg) }

    fun retrieveAnswers(savedInstanceState: Bundle?) {
        if (savedInstanceState != null) {
            updateAnswers(savedInstanceState.getParcelableArrayList(AnswerContract.ViewImpl.ANSWERS_KEY))
            return
        }
        model.retrieveAnswers()
    }

    fun getAnswers(): ArrayList<Comment> = answers

    fun updateAnswers(answers: ArrayList<Comment>) {
        this.answers.clear()
        this.answers.addAll(answers)
        view?.updateAnswersRecycler()
    }

    fun updateAnswer(answer: Comment) {
        for ((index, answ) in answers.withIndex()) {
            if (answ.uid == answer.uid) {
                answ.id             = answer.id
                answ.uid            = answer.uid
                answ.content        = answer.content
                answ.numLikes       = answer.numLikes
                view?.updateAnswersRecyclerItem(index)
            }
        }
    }
}