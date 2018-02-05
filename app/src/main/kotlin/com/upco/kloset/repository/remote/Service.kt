package com.upco.kloset.repository.remote

import com.upco.kloset.model.entity.Comment
import com.upco.kloset.model.entity.Entity
import com.upco.kloset.model.entity.Look
import com.upco.kloset.model.entity.RedirectionInfo
import retrofit2.Call
import retrofit2.http.*

/**
 * Created by felps on 20/10/17.
 */
interface Service {

    @POST("looks")
    fun createLook(@Header("Authorization") auth: String, @Body look: Look): Call<RedirectionInfo>

    @GET("looks")
    fun getLooks(@Header("Authorization") auth: String): Call<RedirectionInfo>

    @GET("looks/{uid}")
    fun getLook(@Header("Authorization") auth: String, @Path("uid") uid: String): Call<RedirectionInfo>

    @PUT("looks/{uid}")
    fun updateLook(@Header("Authorization") auth: String, @Path("uid") uid: String, @Body look: Look): Call<RedirectionInfo>

    @DELETE("looks/{uid}")
    fun deleteLook(@Header("Authorization") auth: String, @Path("uid") uid: String, @Body look: Look): Call<RedirectionInfo>

    @FormUrlEncoded
    @POST("ctrl/CtrlComment.php")
    fun getComments(@Field("method") method: String, @Field("lookUid") lookUid: String): Call<ArrayList<Comment>>

    @FormUrlEncoded
    @POST("ctrl/CtrlAnswer.php")
    fun getAnswers(@Field("method") method: String, @Field("commentUid") commentUid: String): Call<ArrayList<Comment>>
}