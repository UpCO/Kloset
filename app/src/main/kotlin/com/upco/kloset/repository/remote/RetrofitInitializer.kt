package com.upco.kloset.repository.remote

import com.google.gson.GsonBuilder
import com.upco.kloset.model.entity.Look
import com.upco.kloset.model.entity.RedirectionInfo
import okhttp3.ResponseBody
import retrofit2.Converter
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by felps on 20/10/17.
 */
object RetrofitInitializer {

    private val URI = "http://192.168.0.101:8888/kloset/v1/"

    private val retrofit = Retrofit.Builder()
            .baseUrl(URI)
            .addConverterFactory(createGsonConverter())
            .build()

    val service: Service
        get() = retrofit.create(Service::class.java)

    val responseBodyConverter: Converter<ResponseBody, RedirectionInfo>
        get() = retrofit.responseBodyConverter(RedirectionInfo::class.java, arrayOf())

    private fun createGsonConverter(): GsonConverterFactory {
        val gsonBuilder = GsonBuilder()
        gsonBuilder.registerTypeAdapter(RedirectionInfo::class.java, RedirectionInfoDeserializer())
        val gson = gsonBuilder.create()
        return GsonConverterFactory.create(gson)
    }
}