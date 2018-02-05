package com.upco.kloset.repository.local

import com.upco.kloset.model.entity.Comment
import com.upco.kloset.repository.CommentsDataSource
import com.upco.kloset.repository.local.entity.RealmComment
import io.realm.Realm

/**
 * Created by felps on 22/10/17.
 */
object CommentsLocalDataSource: CommentsDataSource {

    override fun getComments(lookUid: String, callback: CommentsDataSource.LoadCommentsCallback) {
        val realm = Realm.getDefaultInstance()

        val realmComments = realm.where(RealmComment::class.java)
                .equalTo("lookUid", lookUid).findAll()

        if (realmComments.isEmpty()) {
            // Será chamado se a tabela for nova ou estiver fazia
            callback.onDataNotAvailable()
        } else {
            val comments = arrayListOf<Comment>()
            realmComments.mapTo(comments) { it.toComment() }

            callback.onCommentsLoaded(comments)
        }

        realm.close()
    }

    override fun getComment(commentUid: String, callback: CommentsDataSource.GetCommentCallback) {
        val realm = Realm.getDefaultInstance()

        val realmComment = realm.where(RealmComment::class.java)
                .equalTo("uid", commentUid).findAll()

        val comment = realmComment[0]?.toComment()
        if (comment != null) callback.onCommentLoaded(comment) else callback.onDataNotAvailable()

        realm.close()
    }

    override fun saveComment(comment: Comment) {
        val realm = Realm.getDefaultInstance()

        realm.beginTransaction()
        realm.copyToRealmOrUpdate(comment.toRealmComment())
        realm.commitTransaction()

        realm.close()
    }

    override fun refreshComments() {
        // Não é necessário, pois o Repository já atualiza
        // os comments de todos os data source disponíveis
    }

    override fun deleteComment(commentUid: String) {
        val realm = Realm.getDefaultInstance()

        val realmComment = realm.where(RealmComment::class.java)
                .equalTo("uid", commentUid).findAll()

        realm.beginTransaction()
        realmComment.deleteAllFromRealm()
        realm.commitTransaction()

        realm.close()
    }

    override fun deleteAllComments() {
        val realm = Realm.getDefaultInstance()

        realm.beginTransaction()
        realm.delete(RealmComment::class.java)
        realm.commitTransaction()

        realm.close()
    }
}