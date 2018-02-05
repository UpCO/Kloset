package com.upco.kloset.presenter

import android.content.Context
import com.upco.kloset.contract.BaseContract
import com.upco.kloset.contract.NewLookContract

/**
 * Created by felps on 25/10/17.
 */
class NewLookPresenter: BaseContract.PresenterImpl<NewLookContract.ViewImpl> {

    private var view: NewLookContract.ViewImpl? = null

    override fun attachView(view: NewLookContract.ViewImpl) { this.view = view }

    override fun detachView() { view = null }

    override fun getContext(): Context = view!!.getCtx()

    override fun showToast(msg: String) {
        view?.showToast(msg)
    }

}