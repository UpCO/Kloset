package com.upco.kloset.repository

import com.upco.kloset.model.entity.Comment

/**
 * Created by felps on 22/10/17.
 */
interface CommentsDataSource {

    interface LoadCommentsCallback {
        fun onCommentsLoaded(comments: ArrayList<Comment>)
        fun onDataNotAvailable()
    }

    interface GetCommentCallback {
        fun onCommentLoaded(comment: Comment)
        fun onDataNotAvailable()
    }

    fun getComments(lookUid: String, callback: LoadCommentsCallback)
    fun getComment(commentUid: String, callback: GetCommentCallback)
    fun saveComment(comment: Comment)
    fun refreshComments()
    fun deleteComment(commentUid: String)
    fun deleteAllComments()
}