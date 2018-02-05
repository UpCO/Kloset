package com.upco.kloset.repository.remote

import android.util.Log
import com.upco.kloset.model.entity.Comment
import com.upco.kloset.repository.CommentsDataSource
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * Created by felps on 22/10/17.
 */
object CommentsRemoteDataSource: CommentsDataSource {

    override fun getComments(lookUid: String, callback: CommentsDataSource.LoadCommentsCallback) {
        RetrofitInitializer.service.getComments("get-comments", lookUid)
                .enqueue(object: Callback<ArrayList<Comment>?> {

                    override fun onResponse(call: Call<ArrayList<Comment>?>?, response: Response<ArrayList<Comment>?>?) {
                        response?.body()?.let {
                            //val comments: ArrayList<Comment> = it
                            val comments = arrayListOf<Comment>()

                            // TODO: Remover isto e colocar direto, serve apenas para debugar, enquanto o rest não verifica o UID do look
                            if (lookUid == "uisndsahhdn45adsda5") comments.addAll(it)

                            callback.onCommentsLoaded(comments)
                        }
                    }

                    override fun onFailure(call: Call<ArrayList<Comment>?>?, t: Throwable?) {
                        Log.e("onFailure error", t?.message)
                        callback.onDataNotAvailable()
                    }
                })
    }

    override fun getComment(commentUid: String, callback: CommentsDataSource.GetCommentCallback) {

    }

    override fun saveComment(comment: Comment) {

    }

    override fun refreshComments() {
        // Não é necessário, pois o Repository já atualiza
        // os comments de todos os data source disponíveis
    }

    override fun deleteComment(commentUid: String) {

    }

    override fun deleteAllComments() {

    }


}