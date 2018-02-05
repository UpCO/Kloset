package com.upco.kloset.extension

import android.annotation.SuppressLint
import android.support.design.internal.BottomNavigationItemView
import android.support.design.internal.BottomNavigationMenuView
import android.support.design.widget.BottomNavigationView
import android.util.Log
import android.util.TypedValue
import android.view.View

/**
 * Created by Felipe Maciel on 15/09/2017.
 */

/**
 * Disables the Bottom Navigation View shifting mode
 */
@SuppressLint("RestrictedApi")
fun BottomNavigationView.disableShiftMode() {
    val menuView = getChildAt(0) as BottomNavigationMenuView
    try {
        val shiftingMode = menuView::class.java.getDeclaredField("mShiftingMode")
        shiftingMode.isAccessible = true
        shiftingMode.setBoolean(menuView, false)
        shiftingMode.isAccessible = false
        var i = 0
        while (i < menuView.childCount) {
            val item = menuView.getChildAt(i) as BottomNavigationItemView
            item.setShiftingMode(false)
            // set once again checked value, so view will be updated
            item.setChecked(item.itemData.isChecked)
            i++
        }
    } catch (e: NoSuchFieldException) {
        Log.e("BottomNavigationExt", "Unable to get shift mode field", e)
    } catch (e: IllegalAccessException) {
        Log.e("BottomNavigationExt", "Unable to change value of shift mode", e)
    }
}

/**
 * Changes the Bottom Navigation View item's icon size
 */
fun BottomNavigationView.changeIconsSize(size: Int) {
    val menuView = getChildAt(0) as BottomNavigationMenuView
    var i = 0
    while (i < menuView.childCount) {
        val iconView = menuView.getChildAt(i).findViewById<View>(android.support.design.R.id.icon)
        val layoutParams = iconView.layoutParams
        val displayMetrics = resources.displayMetrics
        layoutParams.height = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, size.toFloat(), displayMetrics).toInt()
        layoutParams.width = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, size.toFloat(), displayMetrics).toInt()
        iconView.layoutParams = layoutParams
        i++
    }
}