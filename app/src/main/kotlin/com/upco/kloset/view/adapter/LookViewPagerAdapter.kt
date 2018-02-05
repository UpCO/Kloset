package com.upco.kloset.view.adapter

import android.support.v4.view.PagerAdapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.squareup.picasso.Picasso
import com.upco.kloset.R
import kotlinx.android.synthetic.main.layout_look_grid_sliding_images.view.*

/**
 * Created by felps on 27/10/17.
 */
class LookViewPagerAdapter(val images: ArrayList<String>): PagerAdapter() {

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val layout = LayoutInflater
                .from(container?.context)
                .inflate(R.layout.layout_look_grid_sliding_images, container, false)

        // Carrega a imagem no ImageView
        Picasso.with(layout.iv_item.context)
                .load(images[position])
                .into(layout.iv_item)

        // Adiciona o layout no container
        container?.addView(layout, 0)

        return layout
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container?.removeView(`object` as View)
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean = (view == `object`)

    override fun getCount(): Int = images.size
}