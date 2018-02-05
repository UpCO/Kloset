package com.upco.kloset.contract

import android.content.Context

/**
 * Created by felps on 19/10/17.
 */
interface BaseContract {

    // TODO: Remover se não for usado
    interface ModelImpl {

    }

    interface PresenterImpl<in T: ViewImpl> {
        fun getContext(): Context
        fun showToast(msg: String)
        fun attachView(view: T)
        fun detachView()
    }

    interface ViewImpl {
        fun getCtx(): Context
        fun showToast(msg: String)
    }
}