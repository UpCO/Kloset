package com.upco.kloset.repository.remote

import android.util.Log
import com.google.firebase.firestore.DocumentReference
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.FirebaseFirestoreSettings
import com.upco.kloset.model.entity.Item
import com.upco.kloset.repository.LooksDataSource
import com.upco.kloset.model.entity.Look
import com.upco.kloset.model.entity.RedirectionInfo
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Converter
import retrofit2.Response
import java.io.IOException

/**
 * Created by felps on 21/10/17.
 */
object LooksRemoteDataSource: LooksDataSource {

    override fun getLooks(auth: String, callback: LooksDataSource.LoadLooksCallback) {
        val settings = FirebaseFirestoreSettings.Builder()
                .setPersistenceEnabled(true)
                .build()
        val db = FirebaseFirestore.getInstance()
        db.setFirestoreSettings(settings)

        db.collection("users").document(auth)
                .get()
                .addOnCompleteListener {
                    userTask -> run {
                        if (userTask.isSuccessful) {
                            val userResult = userTask.result
                            val looks = arrayListOf<Look>()

                            // Getting looks
                            for (lookRef in userResult["looks"] as java.util.ArrayList<DocumentReference>) {
                                lookRef.get()
                                        .addOnCompleteListener {
                                            lookTask -> run {
                                                if (lookTask.isSuccessful) {
                                                    val lookResult = lookTask.result
                                                    val look = lookResult.toObject(Look::class.java)

                                                    // Getting look items
                                                    for (itemRef in lookResult["items"] as java.util.ArrayList<DocumentReference>) {
                                                        itemRef.get()
                                                                .addOnCompleteListener {
                                                                    itemTask -> run {
                                                                        if (itemTask.isSuccessful) {
                                                                            val itemResult = itemTask.result
                                                                            val item = itemResult.toObject(Item::class.java)

                                                                            look.items_.add(item)
                                                                        } else {
                                                                            Log.e("onFailure", "Error getting data: " + itemTask.exception)
                                                                        }
                                                                    }
                                                                }
                                                    }

                                                    looks.add(look)
                                                } else {
                                                    Log.e("onFailure", "Error getting data: " + lookTask.exception)
                                                }
                                            }
                                        }
                            }
                            Log.d("LoggedLook", "Qt: " + looks.size)
                            callback.onLooksLoaded(looks)
                        } else {
                            Log.e("onFailure", "Error getting data: " + userTask.exception)
                        }
                    }
                }
    }

    override fun getLook(auth: String, lookUid: String, callback: LooksDataSource.GetLookCallback) {
        val db = FirebaseFirestore.getInstance()
        db.collection("looks").document(lookUid)
                .get()
                .addOnCompleteListener { task ->
                    run {
                        if (task.isSuccessful) {
                            Log.d("onSuccess", "Look loaded successfully")

                            val document = task.result
                            val look = document.toObject(Look::class.java)

                            // Getting look items
                            for (item in document.data.get("items") as ArrayList<DocumentReference>) {
                                item.get()
                                        .addOnCompleteListener { t ->
                                            run {
                                                if (t.isSuccessful) {
                                                    Log.d("onSuccess", "Item loaded successfully")

                                                    val i = t.result.toObject(Item::class.java)
                                                    look.items_.add(i)
                                                } else {
                                                    Log.e("onFailure", "Error getting data: " + t.exception)
                                                    callback.onDataNotAvailable()
                                                }
                                            }
                                        }
                            }

                            callback.onLookLoaded(look)
                        } else {
                            Log.e("onFailure", "Error getting data: " + task.exception)
                            callback.onDataNotAvailable()
                        }
                    }
                }
    }

    override fun saveLook(auth: String, look: Look) {

    }

    override fun refreshLooks() {
        // Não é necessário, pois o Repository já atualiza
        // os looks de todos os data source disponíveis
    }

    override fun deleteLook(auth: String, lookUid: String) {

    }

    override fun deleteAllLooks() {

    }
}