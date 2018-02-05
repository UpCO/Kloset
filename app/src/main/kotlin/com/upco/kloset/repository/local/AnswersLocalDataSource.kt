package com.upco.kloset.repository.local

import com.upco.kloset.model.entity.Comment
import com.upco.kloset.repository.AnswersDataSource
import com.upco.kloset.repository.local.entity.RealmComment
import io.realm.Realm

/**
 * Created by felps on 23/10/17.
 */
object AnswersLocalDataSource: AnswersDataSource {

    override fun getAnswers(commentUid: String, callback: AnswersDataSource.LoadAnswersCallback) {
        val realm = Realm.getDefaultInstance()

        val realmAnswers = realm.where(RealmComment::class.java)
                .equalTo("commentUid", commentUid).findAll()

        if (realmAnswers.isEmpty()) {
            // Será chamado se a tabela for nova ou estiver fazia
            callback.onDataNotAvailable()
        } else {
            val answers = arrayListOf<Comment>()
            realmAnswers.mapTo(answers) { it.toComment() }

            callback.onAnswersLoaded(answers)
        }

        realm.close()
    }

    override fun getAnswer(answerUid: String, callback: AnswersDataSource.GetAnswerCallback) {
        val realm = Realm.getDefaultInstance()

        val realmAnswer = realm.where(RealmComment::class.java)
                .equalTo("uid", answerUid).findAll()

        val answer = realmAnswer[0]?.toComment()
        if (answer != null) callback.onAnswerLoaded(answer) else callback.onDataNotAvailable()

        realm.close()
    }

    override fun saveAnswer(answer: Comment) {
        val realm = Realm.getDefaultInstance()

        realm.beginTransaction()
        realm.copyToRealmOrUpdate(answer.toRealmComment())
        realm.commitTransaction()

        realm.close()
    }

    override fun refreshAnswers() {
        // Não é necessário, pois o Repository já atualiza
        // as answers de todos os data source disponíveis
    }

    override fun deleteAnswer(answerUid: String) {
        val realm = Realm.getDefaultInstance()

        val realmAnswer = realm.where(RealmComment::class.java)
                .equalTo("uid", answerUid).findAll()

        realm.beginTransaction()
        realmAnswer.deleteAllFromRealm()
        realm.commitTransaction()

        realm.close()
    }

    override fun deleteAllAnswers() {
        val realm = Realm.getDefaultInstance()

        realm.beginTransaction()
        realm.delete(RealmComment::class.java)
        realm.commitTransaction()

        realm.close()
    }
}