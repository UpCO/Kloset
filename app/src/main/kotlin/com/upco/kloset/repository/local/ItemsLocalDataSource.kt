package com.upco.kloset.repository.local

import com.upco.kloset.model.entity.Item
import com.upco.kloset.repository.ItemsDataSource
import com.upco.kloset.repository.local.entity.RealmItem
import io.realm.Realm

object ItemsLocalDataSource: ItemsDataSource {

    override fun getItems(auth: String, lookUid: String, callback: ItemsDataSource.LoadItemsCallback) {
        val realm = Realm.getDefaultInstance()

        val realmItems = realm.where(RealmItem::class.java).findAll()

        if (realmItems.isEmpty()) {
            // Será chamado se a tabela for nova ou estiver fazia
            callback.onDataNotAvailable()
        } else {
            val items = arrayListOf<Item>()
            realmItems.forEach { item -> items.add(item.toItem()) }
            callback.onItemsLoaded(items)
        }

        realm.close()
    }

    override fun getItem(auth: String, lookUid: String, itemUid: String, callback: ItemsDataSource.GetItemCallback) {
        val realm = Realm.getDefaultInstance()

        val realmItem = realm.where(RealmItem::class.java)
                .equalTo("uid", itemUid).findAll()

        if (realmItem.size > 0) {
            val item = realmItem[0]?.toItem()
            if (item != null) callback.onItemLoaded(item) else callback.onDataNotAvailable()
        } else {
            callback.onDataNotAvailable()
        }

        realm.close()
    }

    override fun saveItem(auth: String, lookUid: String, item: Item, callback: ItemsDataSource.SaveItemCallback) {
        val realm = Realm.getDefaultInstance()

        realm.beginTransaction()
        realm.copyToRealmOrUpdate(item.toRealmItem())
        realm.commitTransaction()

        realm.close()
    }

    override fun updateItem(auth: String, lookUid: String, itemUid: String, item: Item) {
        // TODO: Implementar função
        //val realm = Realm.getDefaultInstance()

        //realm.beginTransaction()
        ///realm.copyToRealmOrUpdate(item.toRealmItem())
        //realm.commitTransaction()

        //realm.close()
    }

    override fun refreshItems() {
        // Não é necessário, pois o Repository já atualiza
        // os looks de todos os data source disponíveis
    }

    override fun deleteItem(auth: String, lookUid: String, itemUid: String) {
        val realm = Realm.getDefaultInstance()

        val realmItem = realm.where(RealmItem::class.java)
                .equalTo("uid", itemUid).findAll()

        realm.beginTransaction()
        realmItem.deleteAllFromRealm()
        realm.commitTransaction()

        realm.close()
    }

    override fun deleteAllItems() {
        val realm = Realm.getDefaultInstance()

        realm.beginTransaction()
        realm.delete(RealmItem::class.java)
        realm.commitTransaction()

        realm.close()
    }
}