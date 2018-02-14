package com.upco.kloset.presenter

import android.content.Context
import android.os.Bundle
import com.upco.kloset.contract.BaseContract
import com.upco.kloset.contract.LookContract
import com.upco.kloset.model.LookModel
import com.upco.kloset.model.entity.Comment
import com.upco.kloset.model.entity.Item
import com.upco.kloset.model.entity.Look

/**
 * Created by felps on 19/10/17.
 */
class LookPresenter: BaseContract.PresenterImpl<LookContract.ViewImpl> {

    private var look: Look? = null
    private val items = arrayListOf<Item>()
    private val comments = arrayListOf<Comment>()
    private val model: LookContract.ModelImpl = LookModel(this)
    private var view: LookContract.ViewImpl? = null

    override fun attachView(view: LookContract.ViewImpl) { this.view = view }

    override fun detachView() { view = null }

    override fun getContext(): Context = view!!.getCtx()

    override fun showToast(msg: String) { view?.showToast(msg) }

    fun retrieveLook(savedInstanceState: Bundle?) {
        if (savedInstanceState != null) {
            look = savedInstanceState.getParcelable<Look>(LookContract.ViewImpl.LOOK_KEY)
            return
        }
        model.retrieveLook()
    }

    fun retrieveItems(savedInstanceState: Bundle?) {
        if (savedInstanceState != null) {
            updateItems(savedInstanceState.getParcelableArrayList<Item>(LookContract.ViewImpl.ITEMS_KEY))
            return
        }
        if (look != null) model.retrieveItems(look!!.uid)
    }

    fun retrieveComments(savedInstanceState: Bundle?) {
        if (savedInstanceState != null) {
            updateComments(savedInstanceState.getParcelableArrayList<Comment>(LookContract.ViewImpl.COMMENTS_KEY))
            return
        }
        if (look != null) model.retrieveComments(look!!.uid)
    }

    fun updateLook(look: Look) {
        this.look = look
    }

    fun updateItems(items: ArrayList<Item>) {
        this.items.clear()
        this.items.addAll(items)
        //view?.updateCommentsRecycler()
    }

    fun updateComments(comments: ArrayList<Comment>) {
        this.comments.clear()
        this.comments.addAll(comments)
        view?.updateCommentsRecycler()
    }

    fun updateComment(comment: Comment) {
        for ((index, c) in comments.withIndex()) {
            if (c.uid == comment.uid) {
                c.id            = comment.id
                c.uid           = comment.uid
                c.content       = comment.content
                c.numLikes      = comment.numLikes
                view?.updateCommentsRecyclerItem(index)
            }
        }
    }

    fun getLook() = look!!

    fun getItems() = items

    fun getComments() = comments

    fun getSelectedItem() = model.getSelectedItem()

    fun setSelectedItem(item: Item) { model.setSelectedItem(item) }

    fun getSelectedComment() = model.getSelectedComment()

    fun setSelectedComment(comment: Comment) { model.setSelectedComment(comment) }
}