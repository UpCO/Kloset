package com.upco.kloset.contract

import com.upco.kloset.model.entity.Comment

/**
 * Created by felps on 19/10/17.
 */
interface LookContract: BaseContract {

    interface ModelImpl {
        fun retrieveLook()
        fun retrieveComments(lookUid: String)
        fun getSelectedComment(): Comment?
        fun setSelectedComment(comment: Comment)
    }

    interface ViewImpl: BaseContract.ViewImpl {
        companion object {
            val LOOK_KEY = "look"
            val COMMENTS_KEY = "comments"
        }

        fun updateCommentsRecycler()
        fun updateCommentsRecyclerItem(position: Int)
    }
}