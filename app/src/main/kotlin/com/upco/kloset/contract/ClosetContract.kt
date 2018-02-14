package com.upco.kloset.contract

import com.upco.kloset.model.entity.Item
import com.upco.kloset.model.entity.Look

/**
 * Created by felps on 20/10/17.
 */
interface ClosetContract: BaseContract {

    interface ModelImpl {
        fun retrieveLooks()
        fun retrieveItems(lookUid: String)
        fun getSelectedLook(): Look?
        fun setSelectedLook(look: Look)
        fun getSelectedItem(): Item?
        fun setSelectedItem(item: Item)
    }

    interface ViewImpl: BaseContract.ViewImpl {
        companion object {
            val LOOKS_KEY = "looks"
            val ITEMS_KEY = "items"
        }

        fun updateLooksRecycler()
        fun updateLooksRecyclerItem(position: Int)
    }
}