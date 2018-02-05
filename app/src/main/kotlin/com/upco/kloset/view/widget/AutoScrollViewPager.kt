package com.upco.kloset.view.widget

import android.content.Context
import android.os.Message
import android.util.AttributeSet
import java.lang.ref.WeakReference

/**
 * Created by felps on 28/10/17.
 */
class AutoScrollViewPager(context: Context, attrs: AttributeSet): ViewPager(context, attrs) {

    companion object {
        val DEFAULT_INTERVAL: Long = 1500
        val LEFT = 0
        val RIGHT = 1
        val SCROLL_WHAT = 0
    }

    var interval = DEFAULT_INTERVAL
    var direction = RIGHT
    var isCycle = true
    var isBorderAnimation = true
    var autoScrollFactor = 1.0
    var swipeScrollFactor = 1.0

    val handler = Handler(this)
    val scroller = CustomDurationScroller(context)

    private var isAutoScroll = false

    init { setViewPagerScroller() }

    fun startAutoScroll() {
        isAutoScroll = true
        sendScrollMessage(((interval + scroller?.duration!!) / (autoScrollFactor * swipeScrollFactor)).toLong())
    }

    fun startAutoScroll(delayTimeInMills: Long) {
        isAutoScroll = true
        sendScrollMessage(delayTimeInMills)
    }

    fun stopAutoScroll() {
        isAutoScroll = false
        handler.removeMessages(SCROLL_WHAT)
    }

    fun sendScrollMessage(delayTimeInMills: Long) {
        handler.removeMessages(SCROLL_WHAT)
        handler.sendEmptyMessageDelayed(SCROLL_WHAT, delayTimeInMills)
    }

    fun setViewPagerScroller() {
        try {
            val scrollerField = ViewPager::class.java.getDeclaredField("mScroller")
            scrollerField.isAccessible = true
            scrollerField.set(this, scroller)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    fun scrollOnce() {
        val adapter = adapter
        var currentItem = currentItem
        val totalCount = adapter!!.count

        if (adapter == null || totalCount <= 1) return

        val nextItem = if (direction == LEFT) --currentItem else ++currentItem
        if (nextItem < 0) {
            if (isCycle) {
                setCurrentItem(totalCount - 1, isBorderAnimation)
            }
        } else if (nextItem == totalCount) {
            if (isCycle) {
                setCurrentItem(0, isBorderAnimation)
            }
        } else {
            setCurrentItem(nextItem, true)
        }

    }

    class Handler(autoScrollViewPager: AutoScrollViewPager): android.os.Handler() {

        private val autoScrollViewPager = WeakReference<AutoScrollViewPager>(autoScrollViewPager)

        override fun handleMessage(msg: Message?) {
            super.handleMessage(msg)

            when (msg?.what) {
                SCROLL_WHAT -> {
                    val pager = autoScrollViewPager.get()
                    if (pager != null) {
                        pager.scroller.setScrollDurationFactor(pager.autoScrollFactor)
                        pager.scrollOnce()
                        pager.scroller.setScrollDurationFactor(pager.swipeScrollFactor)
                        pager.sendScrollMessage((pager.interval + pager.scroller.duration))
                    }
                }
            }
        }
    }
}