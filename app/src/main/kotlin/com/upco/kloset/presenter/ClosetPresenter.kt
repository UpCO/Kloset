package com.upco.kloset.presenter

import android.content.Context
import android.os.Bundle
import com.upco.kloset.contract.BaseContract
import com.upco.kloset.contract.ClosetContract
import com.upco.kloset.model.ClosetModel
import com.upco.kloset.model.entity.Look

/**
 * Created by felps on 20/10/17.
 */
class ClosetPresenter: BaseContract.PresenterImpl<ClosetContract.ViewImpl> {

    private val looks = arrayListOf<Look>()
    private val model: ClosetContract.ModelImpl = ClosetModel(this)
    private var view: ClosetContract.ViewImpl? = null

    override fun attachView(view: ClosetContract.ViewImpl) { this.view = view }

    override fun detachView() { view = null }

    override fun getContext(): Context = view!!.getCtx()

    override fun showToast(msg: String) { view?.showToast(msg) }

    fun retrieveLooks(savedInstanceState: Bundle?) {
        if (savedInstanceState != null) {
            updateLooks(savedInstanceState.getParcelableArrayList(ClosetContract.ViewImpl.LOOKS_KEY))
            return
        }
        model.retrieveLooks()
    }

    fun getLooks() = looks

    fun updateLooks(looks: ArrayList<Look>) {
        this.looks.clear()
        this.looks.addAll(looks)
        view?.updateLooksRecycler()
    }

    fun updateLook(look: Look) {
        for ((index, l) in looks.withIndex()) {
            if (l.uid == look.uid) {
                l.uid           = look.uid
                l.title         = look.title
                l.privacy       = look.privacy
                l.numItems      = look.numItems
                l.numLikes      = look.numLikes
                l.numComments   = look.numComments
                l.numShares     = look.numShares
                view?.updateLooksRecyclerItem(index)
            }
        }
    }

    fun addLook(look: Look) {
        looks += look
        view?.updateLooksRecycler()
    }

    fun getSelectedLook(): Look? = model.getSelectedLook()

    fun setSelectedLook(look: Look) { model.setSelectedLook(look) }
}