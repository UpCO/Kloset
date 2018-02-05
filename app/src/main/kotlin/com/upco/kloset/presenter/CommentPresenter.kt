package com.upco.kloset.presenter

import android.content.Context
import android.os.Bundle
import com.upco.kloset.contract.BaseContract
import com.upco.kloset.contract.CommentContract
import com.upco.kloset.model.CommentModel
import com.upco.kloset.model.entity.Comment

/**
 * Created by felps on 22/10/17.
 */
class CommentPresenter: BaseContract.PresenterImpl<CommentContract.ViewImpl> {

    private val comments = arrayListOf<Comment>()
    private val model: CommentContract.ModelImpl = CommentModel(this)
    private var view: CommentContract.ViewImpl? = null

    override fun attachView(view: CommentContract.ViewImpl) { this.view = view }

    override fun detachView() { view = null }

    override fun getContext(): Context = view!!.getCtx()

    override fun showToast(msg: String) { view?.showToast(msg) }

    fun retrieveComments(savedInstanceState: Bundle?) {
        if (savedInstanceState != null) {
            updateComments(savedInstanceState.getParcelableArrayList(CommentContract.ViewImpl.COMMENTS_KEY))
            return
        }
        model.retrieveComments()
    }

    fun getComments() = comments

    fun updateComments(comments: ArrayList<Comment>) {
        this.comments.clear()
        this.comments.addAll(comments)
        view?.updateCommentsRecycler()
    }

    fun updateComment(comment: Comment) {
        for ((index, c) in comments.withIndex()) {
            if (c.uid == comment.uid) {
                c.id            = comment.id
                c.uid           = comment.uid
                c.content       = comment.content
                c.numLikes      = comment.numLikes
                view?.updateCommentsRecyclerItem(index)
            }
        }
    }

    fun getSelectedComment() = model.getSelectedComment()

    fun setSelectedComment(comment: Comment) { model.setSelectedComment(comment) }
}