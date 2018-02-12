package com.upco.kloset.repository.local

import com.upco.kloset.repository.LooksDataSource
import com.upco.kloset.model.entity.Look
import com.upco.kloset.repository.local.entity.RealmLook
import io.realm.Realm

/**
 * Created by felps on 21/10/17.
 */
object LooksLocalDataSource: LooksDataSource {

    override fun getLooks(auth: String, callback: LooksDataSource.LoadLooksCallback) {
        val realm = Realm.getDefaultInstance()

        val realmLooks = realm.where(RealmLook::class.java).findAll()

        if (realmLooks.isEmpty()) {
            // Será chamado se a tabela for nova ou estiver fazia
            callback.onDataNotAvailable()
        } else {
            val looks = arrayListOf<Look>()
            realmLooks.mapTo(looks) { it.toLook() }

            callback.onLooksLoaded(looks)
        }

        realm.close()
    }

    override fun getLook(auth: String, lookUid: String, callback: LooksDataSource.GetLookCallback) {
        val realm = Realm.getDefaultInstance()

        val realmLook = realm.where(RealmLook::class.java)
                .equalTo("uid", lookUid).findAll()

        if (realmLook.size > 0) {
            val look = realmLook[0]?.toLook()
            if (look != null) callback.onLookLoaded(look) else callback.onDataNotAvailable()
        } else {
            callback.onDataNotAvailable()
        }

        realm.close()
    }

    override fun saveLook(auth: String, look: Look) {
        val realm = Realm.getDefaultInstance()

        realm.beginTransaction()
        realm.copyToRealmOrUpdate(look.toRealmLook())
        realm.commitTransaction()

        realm.close()
    }

    override fun updateLook(auth: String, lookUid: String, look: Look) {
        val realm = Realm.getDefaultInstance()

        realm.beginTransaction()
        realm.copyToRealmOrUpdate(look.toRealmLook())
        realm.commitTransaction()

        realm.close()
    }

    override fun refreshLooks() {
        // Não é necessário, pois o Repository já atualiza
        // os looks de todos os data source disponíveis
    }

    override fun deleteLook(auth: String, lookUid: String) {
        val realm = Realm.getDefaultInstance()

        val realmLook = realm.where(RealmLook::class.java)
                .equalTo("uid", lookUid).findAll()

        realm.beginTransaction()
        realmLook.deleteAllFromRealm()
        realm.commitTransaction()

        realm.close()
    }

    override fun deleteAllLooks() {
        val realm = Realm.getDefaultInstance()

        realm.beginTransaction()
        realm.delete(RealmLook::class.java)
        realm.commitTransaction()

        realm.close()
    }
}