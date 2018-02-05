package com.upco.kloset.repository.remote

import android.util.Log
import com.upco.kloset.model.entity.Comment
import com.upco.kloset.repository.AnswersDataSource
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * Created by felps on 22/10/17.
 */
object AnswersRemoteDataSource: AnswersDataSource {

    override fun getAnswers(commentUid: String, callback: AnswersDataSource.LoadAnswersCallback) {
        RetrofitInitializer.service.getAnswers("get-answers", commentUid)
                .enqueue(object: Callback<ArrayList<Comment>?> {

                    override fun onResponse(call: Call<ArrayList<Comment>?>?, response: Response<ArrayList<Comment>?>?) {
                        response?.body()?.let {
                            //val answers: ArrayList<Answer> = it
                            val answers = arrayListOf<Comment>()

                            // TODO: Remover isto e colocar direto, serve apenas para debugar, enquanto o rest não verifica o UID do comment
                            if (commentUid == "modjksjfjsnnd0") answers.addAll(it)

                            callback.onAnswersLoaded(answers)
                        }
                    }

                    override fun onFailure(call: Call<ArrayList<Comment>?>?, t: Throwable?) {
                        Log.e("onFailure error", t?.message)
                        callback.onDataNotAvailable()
                    }
                })
    }

    override fun getAnswer(answerUid: String, callback: AnswersDataSource.GetAnswerCallback) {

    }

    override fun saveAnswer(answer: Comment) {

    }

    override fun refreshAnswers() {
        // Não é necessário, pois o Repository já atualiza
        // as answers de todos os data source disponíveis
    }

    override fun deleteAnswer(answerUid: String) {

    }

    override fun deleteAllAnswers() {

    }
}