package com.upco.kloset.repository

import android.util.Log
import com.upco.kloset.model.entity.Item
import com.upco.kloset.repository.local.ItemsLocalDataSource
import com.upco.kloset.repository.remote.ItemsRemoteDataSource

/**
 * Created by felps on 12/02/18.
 */
object ItemsRepository: ItemsDataSource {

    var selectedItem: Item? = null

    private var cachedItems = mutableMapOf<String, Item>()
    private var cacheIsDirty = true
    private var cachedLookUid = ""

    private val itemsRemoteDataSource    = ItemsRemoteDataSource
    private val itemsLocalDataSource     = ItemsLocalDataSource

    override fun getItems(auth: String, lookUid: String, callback: ItemsDataSource.LoadItemsCallback) {

        // Responde imediatamente com cache, se disponível
        if (!cacheIsDirty && cachedLookUid == lookUid) {
            callback.onItemsLoaded(ArrayList(cachedItems.values))
            return
        }

        // O cache está inutilizável, precisamos pegar novos dados
        if (cacheIsDirty) {
            // Procura no armazenamento local, se disponível. Se não, procura na rede
            itemsLocalDataSource.getItems(auth, lookUid, object: ItemsDataSource.LoadItemsCallback {
                override fun onItemsLoaded(items: ArrayList<Item>) {
                    // Atualiza o cache com os dados obtidos da persistencia local
                    refreshCache(items)

                    // Indica para o repository que os items armazenados no cache,
                    // pertencem ao look com uid igual a lookUid
                    cachedLookUid = lookUid

                    // Retorna o callback
                    callback.onItemsLoaded(ArrayList(cachedItems.values))

                    // Tenta pegar novos dados da rede, se houver internet
                    getItemsFromRemoteDataSource(auth, lookUid)
                }

                override fun onDataNotAvailable() {
                    // Se não houver dados locais, tenta pegar dados da rede
                    getItemsFromRemoteDataSource(auth, lookUid, callback)
                }
            })
        }
    }

    override fun getItem(auth: String, lookUid: String, itemUid: String, callback: ItemsDataSource.GetItemCallback) {

        val cachedItem: Item? = getItemWithUid(itemUid)

        // Responde imediatamente com o cache, se disponível
        if (cachedItem != null) {
            callback.onItemLoaded(cachedItem)
            return
        }

        // Procura no armazenamento local, se disponível. Se não, procura na rede
        itemsLocalDataSource.getItem(auth, lookUid, itemUid, object: ItemsDataSource.GetItemCallback {
            override fun onItemLoaded(item: Item) {
                callback.onItemLoaded(item)
            }

            override fun onDataNotAvailable() {
                itemsRemoteDataSource.getItem(auth, lookUid, itemUid, object: ItemsDataSource.GetItemCallback {
                    override fun onItemLoaded(item: Item) {
                        callback.onItemLoaded(item)
                    }

                    override fun onDataNotAvailable() {
                        callback.onDataNotAvailable()
                    }
                })
            }
        })
    }

    override fun saveItem(auth: String, lookUid: String, item: Item, callback: ItemsDataSource.SaveItemCallback) {
        itemsRemoteDataSource.saveItem(auth, lookUid, item, callback)
        itemsLocalDataSource.saveItem(auth, lookUid, item, callback)

        // Salva no cache
        cachedItems[item.uid] = item
    }

    override fun updateItem(auth: String, lookUid: String, itemUid: String, item: Item) {
        itemsRemoteDataSource.updateItem(auth, lookUid, itemUid, item)
        itemsLocalDataSource.updateItem(auth, lookUid, itemUid, item)

        // Atualiza no cache
        cachedItems[itemUid] = item
    }

    override fun refreshItems() {
        cacheIsDirty = true
    }

    override fun deleteItem(auth: String, lookUid: String, itemUid: String) {
        itemsRemoteDataSource.deleteItem(auth, lookUid, itemUid)
        itemsLocalDataSource.deleteItem(auth, lookUid, itemUid)

        // Remove do cache
        cachedItems.remove(itemUid)
    }

    override fun deleteAllItems() {
        itemsRemoteDataSource.deleteAllItems()
        itemsLocalDataSource.deleteAllItems()

        // Limpa o cache
        cachedItems.clear()
    }

    private fun getItemsFromRemoteDataSource(auth: String, lookUid: String) {
        itemsRemoteDataSource.getItems(auth, lookUid, object: ItemsDataSource.LoadItemsCallback {
            override fun onItemsLoaded(items: ArrayList<Item>) {
                refreshCache(items)
                refreshLocalDataSource(auth, lookUid, items)
            }

            override fun onDataNotAvailable() {

            }
        })
    }

    private fun getItemsFromRemoteDataSource(auth: String, lookUid: String, callback: ItemsDataSource.LoadItemsCallback) {
        itemsRemoteDataSource.getItems(auth, lookUid, object: ItemsDataSource.LoadItemsCallback {
            override fun onItemsLoaded(items: ArrayList<Item>) {
                refreshCache(items)
                refreshLocalDataSource(auth, lookUid, items)
                callback.onItemsLoaded(ArrayList(cachedItems.values))
            }

            override fun onDataNotAvailable() {
                callback.onDataNotAvailable()
            }
        })
    }

    private fun refreshCache(items: ArrayList<Item>) {
        cachedItems.clear()
        items.forEach { item -> cachedItems[item.uid] = item }
        cacheIsDirty = false
    }

    private fun refreshLocalDataSource(auth: String, lookUid: String, items: ArrayList<Item>) {
        itemsLocalDataSource.deleteAllItems()
        items.forEach {
            item -> run {
                itemsLocalDataSource.saveItem(auth, lookUid, item, object: ItemsDataSource.SaveItemCallback {
                    override fun onItemSaved(itemUid: String) {
                        Log.d("ItemsRepository", "Item saved successfully on local data source: " + itemUid)
                    }

                    override fun onError() {
                        Log.e("ItemsRepository", "Error saving item on local data source: " + item.uid)
                    }
                })
            }
        }
    }

    private fun getItemWithUid(itemUid: String) = if (cachedItems.isEmpty()) null else cachedItems[itemUid]
}