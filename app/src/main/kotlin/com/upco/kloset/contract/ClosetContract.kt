package com.upco.kloset.contract

import com.upco.kloset.model.entity.Look

/**
 * Created by felps on 20/10/17.
 */
interface ClosetContract: BaseContract {

    interface ModelImpl {
        fun retrieveLooks()
        fun getSelectedLook(): Look?
        fun setSelectedLook(look: Look)
    }

    interface ViewImpl: BaseContract.ViewImpl {
        companion object {
            val LOOKS_KEY = "looks"
        }

        fun updateLooksRecycler()
        fun updateLooksRecyclerItem(position: Int)
    }
}