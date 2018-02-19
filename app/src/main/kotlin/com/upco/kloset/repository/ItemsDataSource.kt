package com.upco.kloset.repository

import com.upco.kloset.model.entity.Item

/**
 * Created by felps on 12/02/18.
 */
interface ItemsDataSource {

    interface LoadItemsCallback {
        fun onItemsLoaded(items: ArrayList<Item>)
        fun onDataNotAvailable()
    }

    interface GetItemCallback {
        fun onItemLoaded(item: Item)
        fun onDataNotAvailable()
    }

    interface SaveItemCallback {
        fun onItemSaved(itemUid: String)
        fun onError()
    }

    fun getItems(auth: String, lookUid: String, callback: LoadItemsCallback)
    fun getItem(auth: String, lookUid: String, itemUid: String, callback: GetItemCallback)
    fun saveItem(auth: String, lookUid: String, item: Item, callback: SaveItemCallback)
    fun updateItem(auth: String, lookUid: String, itemUid: String, item: Item)
    fun refreshItems()
    fun deleteItem(auth: String, lookUid: String, itemUid: String)
    fun deleteAllItems()
}