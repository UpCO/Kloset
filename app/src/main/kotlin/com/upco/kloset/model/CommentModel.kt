package com.upco.kloset.model

import android.util.Log
import com.upco.kloset.contract.CommentContract
import com.upco.kloset.model.entity.Comment
import com.upco.kloset.presenter.CommentPresenter
import com.upco.kloset.repository.CommentsDataSource
import com.upco.kloset.repository.CommentsRepository
import com.upco.kloset.repository.LooksRepository

/**
 * Created by felps on 22/10/17.
 */
class CommentModel(val presenter: CommentPresenter): CommentContract.ModelImpl {

    override fun retrieveComments() {
        CommentsRepository.getComments(LooksRepository.selectedLook!!.uid,
                object: CommentsDataSource.LoadCommentsCallback {
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