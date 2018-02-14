package com.upco.kloset.repository.remote

import android.util.Log
import com.upco.kloset.model.entity.Item
import com.upco.kloset.model.entity.RedirectionInfo
import com.upco.kloset.repository.ItemsDataSource
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.io.IOException

object ItemsRemoteDataSource: ItemsDataSource {

    override fun getItems(auth: String, lookUid: String, callback: ItemsDataSource.LoadItemsCallback) {
        RetrofitInitializer.service.getItems(auth, lookUid)
                .enqueue(object: Callback<RedirectionInfo> {
                    override fun onResponse(call: Call<RedirectionInfo>?, response: Response<RedirectionInfo>?) {
                        if (response!!.isSuccessful) {
                            response.body()?.let {
                                if (!it.error) {
                                    Log.d("onSuccess", it.message)

                                    val items = arrayListOf<Item>()
                                    for (param in it.parameters) {
                                        val item = Item()
                                        item.id          = param["id"]!!.toLong()
                                        item.uid         = param["uid"]!!
                                        item.title       = param["title"]!!
                                        item.images.add(param["images"]!!)
                                        item.updatedAt   = param["updated_at"]!!
                                        item.createdAt   = param["created_at"]!!
                                        items.add(item)
                                    }
                                    callback.onItemsLoaded(items)
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

    override fun getItem(auth: String, lookUid: String, itemUid: String, callback: ItemsDataSource.GetItemCallback) {
        RetrofitInitializer.service.getItem(auth, lookUid, itemUid)
                .enqueue(object: Callback<RedirectionInfo> {
                    override fun onResponse(call: Call<RedirectionInfo>?, response: Response<RedirectionInfo>?) {
                        if (response!!.isSuccessful) {
                            response.body()?.let {
                                if (!it.error) {
                                    Log.d("onSuccess", it.message)

                                    val item = Item()
                                    for (param in it.parameters) {
                                        item.id          = param["id"]!!.toLong()
                                        item.uid         = param["uid"]!!
                                        item.title       = param["title"]!!
                                        item.images.add(param["images"]!!)
                                        item.updatedAt   = param["updated_at"]!!
                                        item.createdAt   = param["created_at"]!!
                                    }
                                    callback.onItemLoaded(item)
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

    override fun saveItem(auth: String, lookUid: String, item: Item) {
        RetrofitInitializer.service.createItem(auth, lookUid, item)
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

    override fun updateItem(auth: String, lookUid: String, itemUid: String, item: Item) {
        RetrofitInitializer.service.updateItem(auth, lookUid, itemUid, item)
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

    override fun refreshItems() {
        // Não é necessário, pois o Repository já atualiza
        // os comments de todos os data source disponíveis
    }

    override fun deleteItem(auth: String, lookUid: String, itemUid: String) {
        RetrofitInitializer.service.deleteItem(auth, lookUid, itemUid)
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

    override fun deleteAllItems() {

    }
}