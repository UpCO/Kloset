package com.upco.kloset.repository.remote

import android.util.Log
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
        RetrofitInitializer.service.getLooks(auth)
                .enqueue(object: Callback<RedirectionInfo> {
                    override fun onResponse(call: Call<RedirectionInfo>?, response: Response<RedirectionInfo>?) {
                        if (response!!.isSuccessful) {
                            response.body()?.let {
                                if (!it.error) {
                                    Log.d("onSuccess", it.message)

                                    val looks = arrayListOf<Look>()
                                    for (param in it.parameters) {
                                        val look = Look()
                                        look.id          = param["id"]!!.toLong()
                                        look.uid         = param["uid"]!!
                                        look.title       = param["title"]!!
                                        look.privacy     = param["privacy"]!!.toInt()
                                        look.numItems    = param["num_items"]!!.toInt()
                                        look.numLikes    = param["num_likes"]!!.toInt()
                                        look.numComments = param["num_comments"]!!.toInt()
                                        look.numShares   = param["num_shares"]!!.toInt()
                                        look.updatedAt   = param["updated_at"]!!
                                        look.createdAt   = param["created_at"]!!
                                        looks.add(look)
                                    }
                                    callback.onLooksLoaded(looks)
                                } else {
                                    Log.e("onFailure", it.message)
                                    callback.onDataNotAvailable()
                                }
                            }
                        } else {
                            try {
                                val errorConverter = RetrofitInitializer.responseBodyConverter
                                val error = errorConverter.convert(response.errorBody())
                                Log.e("onFailure", error.message)
                            } catch (e: IOException) {
                                Log.e("onFailure", e.message)
                            }
                        }
                    }

                    override fun onFailure(call: Call<RedirectionInfo>?, t: Throwable?) {
                        Log.e("onFailure", t?.message)
                        callback.onDataNotAvailable()
                    }
                })
    }

    override fun getLook(auth: String, lookUid: String, callback: LooksDataSource.GetLookCallback) {
        RetrofitInitializer.service.getLook(auth, lookUid)
                .enqueue(object: Callback<RedirectionInfo> {
                    override fun onResponse(call: Call<RedirectionInfo>?, response: Response<RedirectionInfo>?) {
                        if (response!!.isSuccessful) {
                            response.body()?.let {
                                if (!it.error) {
                                    Log.d("onSuccess", it.message)

                                    val look = Look()
                                    for (param in it.parameters) {
                                        look.id          = param["id"]!!.toLong()
                                        look.uid         = param["uid"]!!
                                        look.title       = param["title"]!!
                                        look.privacy     = param["privacy"]!!.toInt()
                                        look.numItems    = param["num_items"]!!.toInt()
                                        look.numLikes    = param["num_likes"]!!.toInt()
                                        look.numComments = param["num_comments"]!!.toInt()
                                        look.numShares   = param["num_shares"]!!.toInt()
                                        look.updatedAt   = param["updated_at"]!!
                                        look.createdAt   = param["created_at"]!!
                                    }
                                    callback.onLookLoaded(look)
                                } else {
                                    Log.e("onFailure", it.message)
                                    callback.onDataNotAvailable()
                                }
                            }
                        } else {
                            try {
                                val errorConverter = RetrofitInitializer.responseBodyConverter
                                val error = errorConverter.convert(response.errorBody())
                                Log.e("onFailure", error.message)
                            } catch (e: IOException) {
                                Log.e("onFailure", e.message)
                            }
                        }
                    }

                    override fun onFailure(call: Call<RedirectionInfo>?, t: Throwable?) {
                        Log.e("onFailure", t?.message)
                        callback.onDataNotAvailable()
                    }
                })
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