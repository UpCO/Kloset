package com.upco.kloset.view.adapter

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso
import com.upco.kloset.R
import com.upco.kloset.extension.bind
import com.upco.kloset.listener.OnCommentSelectedListener
import com.upco.kloset.model.entity.Comment
import com.upco.kloset.view.activity.AnswerActivity

/**
 * Created by felps on 28/10/17.
 */
class CommentRecyclerAdapter(val comments: ArrayList<Comment>, val context: Context, val listener: OnCommentSelectedListener): RecyclerView.Adapter<CommentRecyclerAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val view = LayoutInflater
                .from(parent?.context)
                .inflate(R.layout.layout_comment_item, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder?.setupUI(comments[position])
    }

    override fun getItemCount(): Int = comments.size

    // ViewHolder
    inner class ViewHolder(view: View): RecyclerView.ViewHolder(view) {

        private val iv_userphoto: ImageView by view.bind(R.id.iv_userphoto)
        private val tv_username: TextView by view.bind(R.id.tv_username)
        private val tv_content: TextView by view.bind(R.id.tv_content)
        private val tv_timestamp: TextView by view.bind(R.id.tv_timestamp)
        private val btn_answer: Button by view.bind(R.id.btn_answer)

        private fun gotoAnswer() {
            val intent = Intent(context, AnswerActivity::class.java)
            context.startActivity(intent)
        }

        fun setupUI(comment: Comment) {
            tv_username.text = "Usuário"
            tv_content.text = comment.content
            tv_timestamp.text = "há 2 horas" // TODO: Substituir pelo timestamp vindo da resposta

            // Carrega a foto do autor
            // TODO: Substituir pela foto do autor do comentário/resposta
            Picasso.with(iv_userphoto.context)
                    .load("https://ak.picdn.net/assets/cms/97e1dd3f8a3ecb81356fe754a1a113f31b6dbfd4-stock-photo-photo-of-a-common-kingfisher-alcedo-atthis-adult-male-perched-on-a-lichen-covered-branch-107647640.jpg")
                    .into(iv_userphoto)

            btn_answer.setOnClickListener {
                listener.onCommentSelected(comment)
                gotoAnswer()
            }
        }
    }
}