package com.upco.kloset.view.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.squareup.picasso.Picasso
import com.upco.kloset.R
import com.upco.kloset.extension.bind
import com.upco.kloset.model.entity.Item

/**
 * Created by felps on 28/10/17.
 */
class LookItemRecyclerAdapter(val items: ArrayList<Item>, val context: Context): RecyclerView.Adapter<LookItemRecyclerAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val view = LayoutInflater
                .from(parent?.context)
                .inflate(R.layout.layout_look_item, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder?.setupUI(items[position])
    }

    override fun getItemCount(): Int = items.size

    // ViewHolder
    inner class ViewHolder(view: View): RecyclerView.ViewHolder(view) {

        private val iv_item: ImageView by view.bind(R.id.iv_item)

        fun setupUI(item: Item) {
            // Carrega a imagem no ImageView
            Picasso.with(iv_item.context)
                    .load(item.images) // TODO: Implementar um slide com todas as imagens, por enquanto usa apenas a 1 imagem
                    .into(iv_item)
        }
    }
}