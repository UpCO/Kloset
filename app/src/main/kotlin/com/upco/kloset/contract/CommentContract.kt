package com.upco.kloset.contract

import com.upco.kloset.model.entity.Comment

/**
 * Created by felps on 22/10/17.
 */
interface CommentContract: BaseContract {

    interface ModelImpl {
        fun retrieveComments()
        fun getSelectedComment(): Comment?
        fun setSelectedComment(comment: Comment)
    }

    interface ViewImpl: BaseContract.ViewImpl {
        companion object {
            val COMMENTS_KEY = "comments"
        }

        fun updateCommentsRecycler()
        fun updateCommentsRecyclerItem(position: Int)
    }
}