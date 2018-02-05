package com.upco.kloset.repository

import com.upco.kloset.model.entity.Comment
import com.upco.kloset.repository.local.AnswersLocalDataSource
import com.upco.kloset.repository.remote.AnswersRemoteDataSource

/**
 * Created by felps on 22/10/17.
 */
object AnswersRepository: AnswersDataSource {

    private val answersRemoteDataSource     = AnswersRemoteDataSource
    private val answersLocalDataSource      = AnswersLocalDataSource

    private var cachedAnswers = mutableMapOf<String, Comment>()
    private var cacheIsDirty = true
    private var cachedCommentUid = ""

    override fun getAnswers(commentUid: String, callback: AnswersDataSource.LoadAnswersCallback) {

        // Responde imediatamente com cache, se disponível
        if (!cacheIsDirty && cachedCommentUid == commentUid) {
            callback.onAnswersLoaded(ArrayList(cachedAnswers.values))
            return
        }

        // O cache está inutilizável, precisamos pegar novos dados
        if (cacheIsDirty) {
            // Procura no armazenamento local, se disponível. Se não, procura na rede
            answersLocalDataSource.getAnswers(commentUid, object: AnswersDataSource.LoadAnswersCallback {
                override fun onAnswersLoaded(answers: ArrayList<Comment>) {

                    // Atualiza o cache com os dados obtidos da persistencia local
                    refreshCache(answers)

                    // Indica para o repository que as answers armazenados no cache,
                    // pertencem ao comment com uid igual a commentUid
                    cachedCommentUid = commentUid

                    // Retorna o callback
                    callback.onAnswersLoaded(ArrayList(cachedAnswers.values))

                    // Tenta pegar novos dados da rede, se houver internet
                    getAnswersFromRemoteDataSource(commentUid)
                }

                override fun onDataNotAvailable() {
                    // Se não houver dados locais, tenta pegar dados da rede
                    getAnswersFromRemoteDataSource(commentUid, callback)
                }
            })
        }
    }

    override fun getAnswer(answerUid: String, callback: AnswersDataSource.GetAnswerCallback) {

        val cachedAnswer: Comment? = getAnswerWithUid(answerUid)

        // Responde imediatamente com o cache, se disponível
        if (cachedAnswer != null) {
            callback.onAnswerLoaded(cachedAnswer)
            return
        }

        // Procura no armazenamento local, se disponível. Se não, procura na rede
        answersLocalDataSource.getAnswer(answerUid, object: AnswersDataSource.GetAnswerCallback {
            override fun onAnswerLoaded(answer: Comment) {
                callback.onAnswerLoaded(answer)
            }

            override fun onDataNotAvailable() {
                answersRemoteDataSource.getAnswer(answerUid, object: AnswersDataSource.GetAnswerCallback {
                    override fun onAnswerLoaded(answer: Comment) {
                        callback.onAnswerLoaded(answer)
                    }

                    override fun onDataNotAvailable() {
                        callback.onDataNotAvailable()
                    }
                })
            }
        })
    }

    override fun saveAnswer(answer: Comment) {
        answersRemoteDataSource.saveAnswer(answer)
        answersLocalDataSource.saveAnswer(answer)

        // Salva no cache
        cachedAnswers[answer.uid] = answer
    }

    override fun refreshAnswers() {
        cacheIsDirty = true
    }

    override fun deleteAnswer(answerUid: String) {
        answersRemoteDataSource.deleteAnswer(answerUid)
        answersLocalDataSource.deleteAnswer(answerUid)

        // Remove do cache
        cachedAnswers.remove(answerUid)
    }

    override fun deleteAllAnswers() {
        answersRemoteDataSource.deleteAllAnswers()
        answersLocalDataSource.deleteAllAnswers()

        // Limpa o cache
        cachedAnswers.clear()
    }

    private fun getAnswersFromRemoteDataSource(commentUid: String) {
        answersRemoteDataSource.getAnswers(commentUid, object: AnswersDataSource.LoadAnswersCallback {
            override fun onAnswersLoaded(answers: ArrayList<Comment>) {
                refreshCache(answers)
                refreshLocalDataSource(answers)
            }

            override fun onDataNotAvailable() {

            }
        })
    }

    private fun getAnswersFromRemoteDataSource(commentUid: String, callback: AnswersDataSource.LoadAnswersCallback) {
        answersRemoteDataSource.getAnswers(commentUid, object: AnswersDataSource.LoadAnswersCallback {
            override fun onAnswersLoaded(answers: ArrayList<Comment>) {
                refreshCache(answers)
                refreshLocalDataSource(answers)
                callback.onAnswersLoaded(ArrayList(cachedAnswers.values))
            }

            override fun onDataNotAvailable() {
                callback.onDataNotAvailable()
            }
        })
    }

    private fun refreshCache(answers: ArrayList<Comment>) {
        cachedAnswers.clear()
        answers.forEach { answer -> cachedAnswers[answer.uid] = answer }
        cacheIsDirty = false
    }

    private fun refreshLocalDataSource(answers: ArrayList<Comment>) {
        answersLocalDataSource.deleteAllAnswers()
        answers.forEach { answer -> answersLocalDataSource.saveAnswer(answer) }
    }

    private fun getAnswerWithUid(answerUid: String) = if (cachedAnswers.isEmpty()) null else cachedAnswers[answerUid]
}