package com.upco.kloset.presenter

import android.content.Context
import com.upco.kloset.contract.BaseContract
import com.upco.kloset.contract.NewLookItemContract
import com.upco.kloset.model.NewLookItemModel

/**
 * Created by felps on 25/10/17.
 */
class NewLookItemPresenter: BaseContract.PresenterImpl<NewLookItemContract.ViewImpl> {

    private val model: NewLookItemContract.ModelImpl = NewLookItemModel(this)
    private var view: NewLookItemContract.ViewImpl? = null

    override fun attachView(view: NewLookItemContract.ViewImpl) { this.view = view }

    override fun detachView() { view = null }

    override fun getContext(): Context = view!!.getCtx()

    override fun showToast(msg: String) { view?.showToast(msg) }
}