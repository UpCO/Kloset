package com.upco.kloset.repository

import android.util.Log
import com.upco.kloset.repository.local.LooksLocalDataSource
import com.upco.kloset.repository.remote.LooksRemoteDataSource
import com.upco.kloset.model.entity.Look

/**
 * Created by felps on 21/10/17.
 */
object LooksRepository: LooksDataSource {

    var selectedLook: Look? = null

    private var cachedLooks = mutableMapOf<String, Look>()
    private var cacheIsDirty = true

    private val looksRemoteDataSource   = LooksRemoteDataSource
    private val looksLocalDataSource    = LooksLocalDataSource

    override fun getLooks(auth: String, callback: LooksDataSource.LoadLooksCallback) {

        // Responde imediatamente com o cache, se estiver disponível
        if (!cacheIsDirty) {
            callback.onLooksLoaded(ArrayList(cachedLooks.values))
            return
        }

        // O cache está inutilizável, precisamos pegar novos dados
        if (cacheIsDirty) {
            // Procura no armazenamento local, se disponível. Se não, procura na rede
            looksLocalDataSource.getLooks(auth, object: LooksDataSource.LoadLooksCallback {
                override fun onLooksLoaded(looks: ArrayList<Look>) {
                    // Atualiza o cache com os dados obtidos da persistencia local
                    refreshCache(looks)

                    // Retorna o callback
                    callback.onLooksLoaded(ArrayList(cachedLooks.values))

                    // Tenta pegar novos dados da rede, se houver internet
                    getLooksFromRemoteDataSource(auth)
                }

                override fun onDataNotAvailable() {
                    // Se não houver dados locais, tenta pegar dados da rede
                    getLooksFromRemoteDataSource(auth, callback)
                }
            })
        }
    }

    override fun getLook(auth: String, lookUid: String, callback: LooksDataSource.GetLookCallback) {

        val cachedLook: Look? = getLookWithUid(lookUid)

        // Responde imediatamente com o cache, se estiver disponível
        if (cachedLook != null) {
            callback.onLookLoaded(cachedLook)
            return
        }

        // Procura no armazenamento local, se disponível. Se não, procura na rede
        looksLocalDataSource.getLook(auth, lookUid, object: LooksDataSource.GetLookCallback {
            override fun onLookLoaded(look: Look) {
                callback.onLookLoaded(look)
            }

            override fun onDataNotAvailable() {
                looksRemoteDataSource.getLook(auth, lookUid, object: LooksDataSource.GetLookCallback {
                    override fun onLookLoaded(look: Look) {
                        callback.onLookLoaded(look)
                    }

                    override fun onDataNotAvailable() {
                        callback.onDataNotAvailable()
                    }
                })
            }
        })
    }

    override fun saveLook(auth: String, look: Look) {
        looksRemoteDataSource.saveLook(auth, look)
        looksLocalDataSource.saveLook(auth, look)

        // Salva no cache
        cachedLooks[look.uid] = look
    }

    override fun refreshLooks() {
        cacheIsDirty = true
    }

    override fun deleteLook(auth: String, lookUid: String) {
        looksRemoteDataSource.deleteLook(auth, lookUid)
        looksLocalDataSource.deleteLook(auth, lookUid)

        // Remove do cache
        cachedLooks.remove(lookUid)
    }

    override fun deleteAllLooks() {
        looksRemoteDataSource.deleteAllLooks()
        looksLocalDataSource.deleteAllLooks()

        // Limpa o cache
        cachedLooks.clear()
    }

    private fun getLooksFromRemoteDataSource(auth: String) {
        looksRemoteDataSource.getLooks(auth, object: LooksDataSource.LoadLooksCallback {
            override fun onLooksLoaded(looks: ArrayList<Look>) {
                refreshCache(looks)
                refreshLocalDataSource(auth, looks)
            }

            override fun onDataNotAvailable() {

            }
        })
    }

    private fun getLooksFromRemoteDataSource(auth: String, callback: LooksDataSource.LoadLooksCallback) {
        looksRemoteDataSource.getLooks(auth, object: LooksDataSource.LoadLooksCallback {
            override fun onLooksLoaded(looks: ArrayList<Look>) {
                refreshCache(looks)
                refreshLocalDataSource(auth, looks)
                callback.onLooksLoaded(ArrayList(cachedLooks.values))
            }

            override fun onDataNotAvailable() {
                callback.onDataNotAvailable()
            }
        })
    }

    private fun refreshCache(looks: ArrayList<Look>) {
        cachedLooks.clear()
        looks.forEach { look -> cachedLooks[look.uid] = look }
        cacheIsDirty = false
    }

    private fun refreshLocalDataSource(auth: String, looks: ArrayList<Look>) {
        looksLocalDataSource.deleteAllLooks()
        looks.forEach { look -> looksLocalDataSource.saveLook(auth, look) }
    }

    private fun getLookWithUid(lookUid: String) = if (cachedLooks.isEmpty()) null else cachedLooks[lookUid]
}