package com.upco.kloset.repository.remote

import android.util.Log
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
                                        look.id          = param["id"].toString().toLong()
                                        look.uid         = param["uid"].toString()
                                        look.title       = param["title"].toString()
                                        look.privacy     = param["privacy"].toString().toInt()
                                        look.numItems    = param["num_items"].toString().toInt()
                                        look.numLikes    = param["num_likes"].toString().toInt()
                                        look.numComments = param["num_comments"].toString().toInt()
                                        look.numShares   = param["num_shares"].toString().toInt()
                                        look.updatedAt   = param["updated_at"].toString()
                                        look.createdAt   = param["created_at"].toString()

                                        for (item in param["items"] as ArrayList<Map<String, String>>) {
                                            val i = Item()
                                            i.id         = item["id"]!!.toLong()
                                            i.uid        = item["uid"].toString()
                                            i.title      = item["title"].toString()
                                            i.images     = item["images"].toString()
                                            i.updatedAt  = item["updated_at"].toString()
                                            i.createdAt  = item["created_at"].toString()
                                            look.items.add(i)
                                        }

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
                                        look.id          = param["id"].toString().toLong()
                                        look.uid         = param["uid"].toString()
                                        look.title       = param["title"].toString()
                                        look.privacy     = param["privacy"].toString().toInt()
                                        look.numItems    = param["num_items"].toString().toInt()
                                        look.numLikes    = param["num_likes"].toString().toInt()
                                        look.numComments = param["num_comments"].toString().toInt()
                                        look.numShares   = param["num_shares"].toString().toInt()
                                        look.updatedAt   = param["updated_at"].toString()
                                        look.createdAt   = param["created_at"].toString()
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

    override fun saveLook(auth: String, look: Look, callback: LooksDataSource.SaveLookCallback) {
        RetrofitInitializer.service.createLook(auth, look)
                .enqueue(object: Callback<RedirectionInfo> {
                    override fun onResponse(call: Call<RedirectionInfo>?, response: Response<RedirectionInfo>?) {
                        if (response!!.isSuccessful) {
                            response.body()?.let {
                                if (!it.error) {
                                    Log.d("onSuccess", it.message)

                                    val lookUid = it.parameters[0]["uid"].toString()
                                    callback.onLookSaved(lookUid)
                                } else {
                                    Log.e("onFailure", it.message)
                                    callback.onError()
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
                        callback.onError()
                    }
                })
    }

    override fun updateLook(auth: String, lookUid: String, look: Look) {
        RetrofitInitializer.service.updateLook(auth, lookUid, look)
                .enqueue(object: Callback<RedirectionInfo> {
                    override fun onResponse(call: Call<RedirectionInfo>?, response: Response<RedirectionInfo>?) {
                        if (response!!.isSuccessful) {
                            response.body()?.let {
                                if (!it.error) {
                                    Log.d("onSuccess", it.message)
                                    //callback.onLookLoaded(look)
                                } else {
                                    Log.e("onFailure", it.message)
                                    //callback.onDataNotAvailable()
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
                        //callback.onDataNotAvailable()
                    }
                })
    }

    override fun refreshLooks() {
        // Não é necessário, pois o Repository já atualiza
        // os looks de todos os data source disponíveis
    }

    override fun deleteLook(auth: String, lookUid: String) {
        RetrofitInitializer.service.deleteLook(auth, lookUid)
                .enqueue(object: Callback<RedirectionInfo> {
                    override fun onResponse(call: Call<RedirectionInfo>?, response: Response<RedirectionInfo>?) {
                        if (response!!.isSuccessful) {
                            response.body()?.let {
                                if (!it.error) {
                                    Log.d("onSuccess", it.message)
                                    //callback.onLookLoaded(look)
                                } else {
                                    Log.e("onFailure", it.message)
                                    //callback.onDataNotAvailable()
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
                        //callback.onDataNotAvailable()
                    }
                })
    }

    override fun deleteAllLooks() {

    }
}