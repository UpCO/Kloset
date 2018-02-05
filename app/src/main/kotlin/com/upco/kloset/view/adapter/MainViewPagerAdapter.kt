package com.upco.kloset.view.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

/**
 * Created by felps on 27/10/17.
 */
class MainViewPagerAdapter(manager: FragmentManager): FragmentPagerAdapter(manager) {

    private var fragmentList = arrayListOf<Fragment>()
    private var fragmentTitleList = arrayListOf<String>()

    override fun getItem(position: Int): Fragment = fragmentList[position]

    override fun getCount(): Int = fragmentList.size

    override fun getPageTitle(position: Int): CharSequence = fragmentTitleList[position]

    fun addFragment(fragment: Fragment, title: String) {
        fragmentList.add(fragment)
        fragmentTitleList.add(title)
    }

    fun getItemPositionWithTitle(title: String): Int {
        return fragmentTitleList.indexOf(title)
    }
}