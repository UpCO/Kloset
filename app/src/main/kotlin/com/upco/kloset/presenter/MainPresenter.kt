package com.upco.kloset.presenter

import android.content.Context
import com.upco.kloset.contract.BaseContract
import com.upco.kloset.contract.MainContract
import com.upco.kloset.model.MainModel

/**
 * Created by felps on 27/10/17.
 */
class MainPresenter: BaseContract.PresenterImpl<MainContract.ViewImpl> {

    private val model: MainContract.ModelImpl = MainModel(this)
    private var view: MainContract.ViewImpl? = null

    override fun attachView(view: MainContract.ViewImpl) { this.view = view }

    override fun detachView() { view = null }

    override fun getContext(): Context = view!!.getCtx()

    override fun showToast(msg: String) { view?.showToast(msg) }
}