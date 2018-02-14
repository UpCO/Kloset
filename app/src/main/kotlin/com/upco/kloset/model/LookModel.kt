package com.upco.kloset.model

import android.util.Log
import com.upco.kloset.contract.LookContract
import com.upco.kloset.model.entity.Comment
import com.upco.kloset.model.entity.Item
import com.upco.kloset.presenter.LookPresenter
import com.upco.kloset.repository.*

/**
 * Created by felps on 19/10/17.
 */
class LookModel(val presenter: LookPresenter): LookContract.ModelImpl {

    override fun retrieveLook() {
        val look = LooksRepository.selectedLook
        if (look != null) presenter.updateLook(look)
    }

    override fun retrieveItems(lookUid: String) {
        ItemsRepository.getItems("fa83107f-e67f-4097-bdec-4daabe26965b", lookUid, object: ItemsDataSource.LoadItemsCallback {
            override fun onItemsLoaded(items: ArrayList<Item>) {
                presenter.updateItems(items)
            }

            override fun onDataNotAvailable() {
                Log.e("Tagão", "Dados não disponíveis")
            }
        })
    }

    override fun retrieveComments(lookUid: String) {
        CommentsRepository.getComments(lookUid, object: CommentsDataSource.LoadCommentsCallback {
            override fun onCommentsLoaded(comments: ArrayList<Comment>) {
                presenter.updateComments(comments)
            }

            override fun onDataNotAvailable() {
                Log.e("Tagão", "Dados não disponíveis")
            }
        })
    }

    override fun getSelectedItem() = ItemsRepository.selectedItem

    override fun setSelectedItem(item: Item) {
        ItemsRepository.selectedItem = item
    }

    override fun getSelectedComment() = CommentsRepository.selectedComment

    override fun setSelectedComment(comment: Comment) { CommentsRepository.selectedComment = comment }
}