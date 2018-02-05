package com.upco.kloset.view.widget

import android.content.Context
import android.support.v4.view.ViewPager
import android.util.AttributeSet
import android.view.KeyEvent
import android.view.MotionEvent
import com.upco.kloset.R

/**
 * Created by felps on 01/10/2017.
 */
open class ViewPager(context: Context, attrs: AttributeSet): ViewPager(context, attrs) {

    var isSwipeable = true

    init {
        val styledAttrs = context.obtainStyledAttributes(attrs, R.styleable.ViewPager)
        try {
            isSwipeable = styledAttrs.getBoolean(R.styleable.ViewPager_swipeable, true)
        } finally {
            styledAttrs.recycle()
        }
    }

    override fun onTouchEvent(ev: MotionEvent?): Boolean {
        return if(isSwipeable) super.onTouchEvent(ev) else false
    }

    override fun onInterceptTouchEvent(ev: MotionEvent?): Boolean {
        return if(isSwipeable) super.onInterceptTouchEvent(ev) else false
    }

    override fun canScrollHorizontally(direction: Int): Boolean {
        return if(isSwipeable) super.canScrollHorizontally(direction) else false
    }

    override fun executeKeyEvent(event: KeyEvent): Boolean {
        return if(isSwipeable) super.executeKeyEvent(event) else false
    }
}