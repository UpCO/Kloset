package com.upco.kloset.repository

import com.upco.kloset.model.entity.Comment
import com.upco.kloset.repository.local.CommentsLocalDataSource
import com.upco.kloset.repository.remote.CommentsRemoteDataSource

/**
 * Created by felps on 22/10/17.
 */
object CommentsRepository: CommentsDataSource {

    var selectedComment: Comment? = null

    private var cachedComments = mutableMapOf<String, Comment>()
    private var cacheIsDirty = true
    private var cachedLookUid = ""

    private val commentsRemoteDataSource    = CommentsRemoteDataSource
    private val commentsLocalDataSource     = CommentsLocalDataSource

    override fun getComments(lookUid: String, callback: CommentsDataSource.LoadCommentsCallback) {

        // Responde imediatamente com cache, se disponível
        if (!cacheIsDirty && cachedLookUid == lookUid) {
            callback.onCommentsLoaded(ArrayList(cachedComments.values))
            return
        }

        // O cache está inutilizável, precisamos pegar novos dados
        if (cacheIsDirty) {
            // Procura no armazenamento local, se disponível. Se não, procura na rede
            commentsLocalDataSource.getComments(lookUid, object: CommentsDataSource.LoadCommentsCallback {
                override fun onCommentsLoaded(comments: ArrayList<Comment>) {
                    // Atualiza o cache com os dados obtidos da persistencia local
                    refreshCache(comments)

                    // Indica para o repository que os comments armazenados no cache,
                    // pertencem ao look com uid igual a lookUid
                    cachedLookUid = lookUid

                    // Retorna o callback
                    callback.onCommentsLoaded(ArrayList(cachedComments.values))

                    // Tenta pegar novos dados da rede, se houver internet
                    getCommentsFromRemoteDataSource(lookUid)
                }

                override fun onDataNotAvailable() {
                    // Se não houver dados locais, tenta pegar dados da rede
                    getCommentsFromRemoteDataSource(lookUid, callback)
                }
            })
        }
    }

    override fun getComment(commentUid: String, callback: CommentsDataSource.GetCommentCallback) {

        val cachedComment: Comment? = getCommentWithUid(commentUid)

        // Responde imediatamente com o cache, se disponível
        if (cachedComment != null) {
            callback.onCommentLoaded(cachedComment)
            return
        }

        // Procura no armazenamento local, se disponível. Se não, procura na rede
        commentsLocalDataSource.getComment(commentUid, object: CommentsDataSource.GetCommentCallback {
            override fun onCommentLoaded(comment: Comment) {
                callback.onCommentLoaded(comment)
            }

            override fun onDataNotAvailable() {
                commentsRemoteDataSource.getComment(commentUid, object: CommentsDataSource.GetCommentCallback {
                    override fun onCommentLoaded(comment: Comment) {
                        callback.onCommentLoaded(comment)
                    }

                    override fun onDataNotAvailable() {
                        callback.onDataNotAvailable()
                    }
                })
            }
        })
    }

    override fun saveComment(comment: Comment) {
        commentsRemoteDataSource.saveComment(comment)
        commentsLocalDataSource.saveComment(comment)

        // Salva no cache
        cachedComments[comment.uid] = comment
    }

    override fun refreshComments() {
        cacheIsDirty = true
    }

    override fun deleteComment(commentUid: String) {
        commentsRemoteDataSource.deleteComment(commentUid)
        commentsLocalDataSource.deleteComment(commentUid)

        // Remove do cache
        cachedComments.remove(commentUid)
    }

    override fun deleteAllComments() {
        commentsRemoteDataSource.deleteAllComments()
        commentsLocalDataSource.deleteAllComments()

        // Limpa o cache
        cachedComments.clear()
    }

    private fun getCommentsFromRemoteDataSource(lookUid: String) {
        commentsRemoteDataSource.getComments(lookUid, object: CommentsDataSource.LoadCommentsCallback {
            override fun onCommentsLoaded(comments: ArrayList<Comment>) {
                refreshCache(comments)
                refreshLocalDataSource(comments)
            }

            override fun onDataNotAvailable() {

            }
        })
    }

    private fun getCommentsFromRemoteDataSource(lookUid: String, callback: CommentsDataSource.LoadCommentsCallback) {
        commentsRemoteDataSource.getComments(lookUid, object: CommentsDataSource.LoadCommentsCallback {
            override fun onCommentsLoaded(comments: ArrayList<Comment>) {
                refreshCache(comments)
                refreshLocalDataSource(comments)
                callback.onCommentsLoaded(ArrayList(cachedComments.values))
            }

            override fun onDataNotAvailable() {
                callback.onDataNotAvailable()
            }
        })
    }

    private fun refreshCache(comments: ArrayList<Comment>) {
        cachedComments.clear()
        comments.forEach { comment -> cachedComments[comment.uid] = comment }
        cacheIsDirty = false
    }

    private fun refreshLocalDataSource(comments: ArrayList<Comment>) {
        commentsLocalDataSource.deleteAllComments()
        comments.forEach { comment -> commentsLocalDataSource.saveComment(comment) }
    }

    private fun getCommentWithUid(commentUid: String) = if (cachedComments.isEmpty()) null else cachedComments[commentUid]
}