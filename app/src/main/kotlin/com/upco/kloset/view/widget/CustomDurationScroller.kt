package com.upco.kloset.view.widget

import android.content.Context
import android.widget.Scroller

/**
 * Created by felps on 28/10/17.
 */
class CustomDurationScroller(context: Context): Scroller(context) {

    private var scrollFactor: Double = 1.0

    override fun startScroll(startX: Int, startY: Int, dx: Int, dy: Int, duration: Int) {
        super.startScroll(startX, startY, dx, dy, (duration * scrollFactor).toInt())
    }

    fun setScrollDurationFactor(scrollFactor: Double) { this.scrollFactor = scrollFactor }
}