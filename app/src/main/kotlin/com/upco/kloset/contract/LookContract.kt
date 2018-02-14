package com.upco.kloset.contract

import com.upco.kloset.model.entity.Comment
import com.upco.kloset.model.entity.Item

/**
 * Created by felps on 19/10/17.
 */
interface LookContract: BaseContract {

    interface ModelImpl {
        fun retrieveLook()
        fun retrieveItems(lookUid: String)
        fun retrieveComments(lookUid: String)
        fun getSelectedItem(): Item?
        fun setSelectedItem(item: Item)
        fun getSelectedComment(): Comment?
        fun setSelectedComment(comment: Comment)
    }

    interface ViewImpl: BaseContract.ViewImpl {
        companion object {
            val LOOK_KEY = "look"
            val ITEMS_KEY = "items"
            val COMMENTS_KEY = "comments"
        }

        fun updateCommentsRecycler()
        fun updateCommentsRecyclerItem(position: Int)
    }
}