package com.upco.kloset.model

import android.util.Log
import com.upco.kloset.contract.LookContract
import com.upco.kloset.model.entity.Comment
import com.upco.kloset.repository.LooksRepository
import com.upco.kloset.presenter.LookPresenter
import com.upco.kloset.repository.CommentsDataSource
import com.upco.kloset.repository.CommentsRepository

/**
 * Created by felps on 19/10/17.
 */
class LookModel(val presenter: LookPresenter): LookContract.ModelImpl {

    override fun retrieveLook() {
        val look = LooksRepository.selectedLook
        if (look != null) presenter.updateLook(look)
    }

    override fun retrieveComments(lookUid: String) {
        CommentsRepository.getComments(lookUid, object: CommentsDataSource.LoadCommentsCallback {
            override fun onCommentsLoaded(comments: ArrayList<Comment>) {
                presenter.updateComments(comments)
            }

            override fun onDataNotAvailable() {
                Log.e("Tagão", "Dados não disponíveis")
            }
        })
    }

    override fun getSelectedComment() = CommentsRepository.selectedComment

    override fun setSelectedComment(comment: Comment) {
        CommentsRepository.selectedComment = comment
    }
}