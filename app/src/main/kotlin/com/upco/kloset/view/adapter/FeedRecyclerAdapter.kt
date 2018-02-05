package com.upco.kloset.view.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso
import com.upco.kloset.R
import com.upco.kloset.extension.bind

/**
 * Created by felps on 28/10/17.
 */
class FeedRecyclerAdapter(val posts: ArrayList<String>, val context: Context): RecyclerView.Adapter<FeedRecyclerAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val view = LayoutInflater
                .from(parent?.context)
                .inflate(R.layout.layout_feed_item, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder?.setupUI(posts[position])
    }

    override fun getItemCount(): Int = posts.size

    // ViewHolder
    inner class ViewHolder(view: View): RecyclerView.ViewHolder(view) {

        private val iv_userphoto: ImageView by view.bind(R.id.iv_userphoto)
        private val tv_username: TextView by view.bind(R.id.tv_username)

        fun setupUI(post: String) {
            tv_username.text = post

            // Carrega a foto do usuário
            Picasso.with(iv_userphoto.context)
                    .load("https://ak.picdn.net/assets/cms/97e1dd3f8a3ecb81356fe754a1a113f31b6dbfd4-stock-photo-photo-of-a-common-kingfisher-alcedo-atthis-adult-male-perched-on-a-lichen-covered-branch-107647640.jpg")
                    .into(iv_userphoto)
        }
    }
}