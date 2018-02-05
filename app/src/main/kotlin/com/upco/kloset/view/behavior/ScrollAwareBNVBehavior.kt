package com.upco.kloset.view.behavior

import android.content.Context
import android.support.design.widget.BottomNavigationView
import android.support.design.widget.CoordinatorLayout
import android.support.v4.view.ViewCompat
import android.support.v4.view.ViewPropertyAnimatorCompat
import android.support.v4.view.animation.LinearOutSlowInInterpolator
import android.util.AttributeSet
import android.view.View

/**
 * Created by felps on 16/10/17.
 */
class ScrollAwareBNVBehavior(): CoordinatorLayout.Behavior<BottomNavigationView>() {

    private val INTERPOLATOR = LinearOutSlowInInterpolator()
    private var mOffsetValueAnimator: ViewPropertyAnimatorCompat? = null
    private var hidden: Boolean = false

    constructor(context: Context, attrs: AttributeSet): this() {

    }

    override fun onStartNestedScroll(coordinatorLayout: CoordinatorLayout, child: BottomNavigationView, directTargetChild: View, target: View, axes: Int, type: Int): Boolean {
        return axes == ViewCompat.SCROLL_AXIS_VERTICAL || super.onStartNestedScroll(coordinatorLayout, child, directTargetChild, target, axes, type)
    }

    override fun onNestedScroll(coordinatorLayout: CoordinatorLayout, child: BottomNavigationView, target: View, dxConsumed: Int, dyConsumed: Int, dxUnconsumed: Int, dyUnconsumed: Int, type: Int) {
        super.onNestedScroll(coordinatorLayout, child, target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, type)

        if (dyConsumed > 0 && !hidden) {
            hidden = true
            animateOffset(child, child.height)
        } else if (dyConsumed < 0 && hidden) {
            hidden = false
            animateOffset(child, 0)
        }
    }

    private fun animateOffset(child: BottomNavigationView, offset: Int) {
        ensureOrCancelAnimator(child)
        mOffsetValueAnimator?.translationY(offset.toFloat())?.start()
    }

    private fun ensureOrCancelAnimator(child: BottomNavigationView) {
        if (mOffsetValueAnimator == null) {
            mOffsetValueAnimator = ViewCompat.animate(child)
            mOffsetValueAnimator?.duration = 100
            mOffsetValueAnimator?.interpolator = INTERPOLATOR
        } else {
            mOffsetValueAnimator?.cancel()
        }
    }
}