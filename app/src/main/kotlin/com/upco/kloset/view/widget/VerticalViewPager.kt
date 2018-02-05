package com.upco.kloset.view.widget

import android.content.Context
import android.support.v4.view.ViewPager
import android.util.AttributeSet
import android.view.MotionEvent

/**
 * Created by felps on 22/01/2018.
 */
class VerticalViewPager @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null): ViewPager(context, attrs) {

    init {
        //setPageTransformer()
    }

    override fun onInterceptTouchEvent(ev: MotionEvent?): Boolean {
        val intercept = super.onInterceptTouchEvent(swapTouchEvent(ev!!))
        // If not intercept, touch event should not be swapped.
        swapTouchEvent(ev)
        return intercept
    }

    override fun onTouchEvent(ev: MotionEvent?): Boolean {
        return super.onTouchEvent(swapTouchEvent(ev!!))
    }

    private fun swapTouchEvent(event: MotionEvent): MotionEvent {
        val swappedX = (event.y / height) * width
        val swappedY = (event.x / width) * height
        event.setLocation(swappedX, swappedY)
        return event
    }
}