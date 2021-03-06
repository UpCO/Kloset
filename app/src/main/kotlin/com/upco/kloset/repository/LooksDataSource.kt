package com.upco.kloset.repository

import com.upco.kloset.model.entity.Look

/**
 * Created by felps on 21/10/17.
 */
interface LooksDataSource {

    interface LoadLooksCallback {
        fun onLooksLoaded(looks: ArrayList<Look>)
        fun onDataNotAvailable()
    }

    interface GetLookCallback {
        fun onLookLoaded(look: Look)
        fun onDataNotAvailable()
    }

    interface SaveLookCallback {
        fun onLookSaved(lookUid: String)
        fun onError()
    }

    fun getLooks(auth: String, callback: LoadLooksCallback)
    fun getLook(auth: String, lookUid: String, callback: GetLookCallback)
    fun saveLook(auth: String, look: Look, callback: SaveLookCallback)
    fun updateLook(auth: String, lookUid: String, look: Look)
    fun refreshLooks()
    fun deleteLook(auth: String, lookUid: String)
    fun deleteAllLooks()
}