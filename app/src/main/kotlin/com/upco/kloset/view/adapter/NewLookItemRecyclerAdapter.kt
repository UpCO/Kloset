package com.upco.kloset.view.adapter

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import com.peekandpop.shalskar.peekandpop.DimensionUtil
import com.squareup.picasso.Picasso
import com.upco.kloset.R
import com.upco.kloset.extension.bind
import com.upco.kloset.model.entity.Look
import com.upco.kloset.model.entity.Item
import com.upco.kloset.view.activity.NewLookItemActivity

/**
 * Created by felps on 28/10/17.
 */
class NewLookItemRecyclerAdapter(val items: ArrayList<Item>, val context: Context): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val ADD_ITEM = 0
    private val LOOK_ITEM = 1
    private var viewCount = 0

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): RecyclerView.ViewHolder {

        var viewHolder: RecyclerView.ViewHolder? = null

        when (viewType) {
            ADD_ITEM  -> viewHolder = setupAddItemViewHolder(parent)
            LOOK_ITEM -> viewHolder = setupLookItemViewHolder(parent)
        }

        viewCount++

        return viewHolder!!
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder?, position: Int) {
        when (holder?.itemViewType) {
            ADD_ITEM  -> {
                val viewHolder = holder as AddItemViewHolder
                viewHolder.setupUI()
            }
            LOOK_ITEM -> {
                val viewHolder = holder as LookItemViewHolder

                // Subtrai 1 da posição, pois para o adapter há a quantidade de itens + 1, por causa do botão
                viewHolder.setupUI(items[position - 1])
            }
        }
    }

    override fun getItemCount(): Int = items.size + 1 // Retorna 1 a mais, por causa do botão

    override fun getItemViewType(position: Int): Int {
        // Se a posição for 0, retorna o botão, se não retorna o item normal
        return if (position == 0) ADD_ITEM else LOOK_ITEM
    }

    private fun setupAddItemViewHolder(parent: ViewGroup?): AddItemViewHolder {
        val view = LayoutInflater
                .from(parent?.context)
                .inflate(R.layout.layout_look_item_add_item, parent, false)

        // Adiciona 16dp de margin left, para corresponder ao layout
        val params = ViewGroup.MarginLayoutParams(DimensionUtil.convertDpToPx(context, 60), DimensionUtil.convertDpToPx(context, 60)) // TODO: Substituir o DimensionUtil por uma extensão
        params.leftMargin = DimensionUtil.convertDpToPx(context, 16) // TODO: Substituir o DimensionUtil por uma extensão
        view.layoutParams = params

        return AddItemViewHolder(view)
    }

    private fun setupLookItemViewHolder(parent: ViewGroup?): LookItemViewHolder {
        val view = LayoutInflater
                .from(parent?.context)
                .inflate(R.layout.layout_look_item, parent, false)

        // Se a view for a última, adiciona 16dp de margin right, para corresponder ao layout
        if (viewCount == (itemCount - 1)) {
            val params = ViewGroup.MarginLayoutParams(DimensionUtil.convertDpToPx(context, 60), DimensionUtil.convertDpToPx(context, 60)) // TODO: Substituir o DimensionUtil por uma extensão
            params.rightMargin = DimensionUtil.convertDpToPx(context, 16) // TODO: Substituir o DimensionUtil por uma extensão
            view.layoutParams = params
        }

        return LookItemViewHolder(view)
    }

    // ViewHolder do botão, que tem como função adicionar novas peças ao look
    inner class AddItemViewHolder(view: View): RecyclerView.ViewHolder(view) {

        private val ibtn_add_look_item: ImageButton by view.bind(R.id.ibtn_add_look_item)

        private fun gotoNewLookItem() {
            val intent = Intent(context, NewLookItemActivity::class.java)
            context.startActivity(intent)
        }

        fun setupUI() {
            ibtn_add_look_item.setOnClickListener { gotoNewLookItem() }
        }
    }

    // ViewHolder referente as peças do look, todos oa itens no adapter utilizam
    // este ViewHolder, exceto o primeiro item, que é o botão
    inner class LookItemViewHolder(view: View): RecyclerView.ViewHolder(view) {

        private val iv_item: ImageView by view.bind(R.id.iv_item)

        fun setupUI(item: Item) {
            // Carrega a imagem da peça
            Picasso.with(iv_item?.context)
                    .load(item.images[0]) // TODO: Transformar em slider
                    .into(iv_item)
        }
    }
}