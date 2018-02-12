package com.upco.kloset.repository.remote

import com.upco.kloset.model.entity.*
import retrofit2.Call
import retrofit2.http.*

/**
 * Created by felps on 20/10/17.
 */
interface Service {

    /* posts route methods */
    @POST("posts")
    fun createPost(@Header("Authorization") auth: String, @Body post: Post): Call<RedirectionInfo>

    @GET("posts")
    fun getPosts(@Header("Authorization") auth: String): Call<RedirectionInfo>

    @GET("posts/{uid}")
    fun getPost(@Header("Authorization") auth: String, @Path("uid") uid: String): Call<RedirectionInfo>

    @PUT("posts/{uid}")
    fun updatePost(@Header("Authorization") auth: String, @Path("uid") uid: String, @Body post: Post): Call<RedirectionInfo>

    @DELETE("posts/{uid}")
    fun deletePost(@Header("Authorization") auth: String, @Path("uid") uid: String): Call<RedirectionInfo>

    /* looks route methods */
    @POST("looks")
    fun createLook(@Header("Authorization") auth: String, @Body look: Look): Call<RedirectionInfo>

    @GET("looks")
    fun getLooks(@Header("Authorization") auth: String): Call<RedirectionInfo>

    @GET("looks/{uid}")
    fun getLook(@Header("Authorization") auth: String, @Path("uid") uid: String): Call<RedirectionInfo>

    @PUT("looks/{uid}")
    fun updateLook(@Header("Authorization") auth: String, @Path("uid") uid: String, @Body look: Look): Call<RedirectionInfo>

    @DELETE("looks/{uid}")
    fun deleteLook(@Header("Authorization") auth: String, @Path("uid") uid: String): Call<RedirectionInfo>

    /* items route methods */
    @POST("items")
    fun createItem(@Header("Authorization") auth: String, @Body item: Item): Call<RedirectionInfo>

    @GET("items")
    fun getItems(@Header("Authorization") auth: String): Call<RedirectionInfo>

    @GET("items/{uid}")
    fun getItem(@Header("Authorization") auth: String, @Path("uid") uid: String): Call<RedirectionInfo>

    @PUT("items/{uid}")
    fun updateItem(@Header("Authorization") auth: String, @Path("uid") uid: String, @Body item: Item): Call<RedirectionInfo>

    @DELETE("items/{uid}")
    fun deleteItem(@Header("Authorization") auth: String, @Path("uid") uid: String): Call<RedirectionInfo>

    /* comments route methods */
    @POST("comments")
    fun createComment(@Header("Authorization") auth: String, @Body comment: Comment): Call<RedirectionInfo>

    @GET("comments")
    fun getComments(@Header("Authorization") auth: String): Call<RedirectionInfo>

    @GET("comments/{uid}")
    fun getComment(@Header("Authorization") auth: String, @Path("uid") uid: String): Call<RedirectionInfo>

    @PUT("comments/{uid}")
    fun updateComment(@Header("Authorization") auth: String, @Path("uid") uid: String, @Body comment: Comment): Call<RedirectionInfo>

    @DELETE("comments/{uid}")
    fun deleteComment(@Header("Authorization") auth: String, @Path("uid") uid: String): Call<RedirectionInfo>
}