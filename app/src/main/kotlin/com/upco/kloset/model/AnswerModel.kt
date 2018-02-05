package com.upco.kloset.model

import android.util.Log
import com.upco.kloset.contract.AnswerContract
import com.upco.kloset.model.entity.Comment
import com.upco.kloset.presenter.AnswerPresenter
import com.upco.kloset.repository.CommentsDataSource
import com.upco.kloset.repository.CommentsRepository
import com.upco.kloset.repository.LooksRepository

/**
 * Created by felps on 22/10/17.
 */
class AnswerModel(val presenter: AnswerPresenter): AnswerContract.ModelImpl {

        override fun retrieveAnswers() {
                CommentsRepository.getComments(LooksRepository.selectedLook!!.uid,
                        object: CommentsDataSource.LoadCommentsCallback {
                                override fun onCommentsLoaded(comments: ArrayList<Comment>) {
                                        presenter.updateAnswers(comments)
                                }

                                override fun onDataNotAvailable() {
                                        Log.e("Tagão", "Dados não disponíveis")
                                }
                        })
        }
}