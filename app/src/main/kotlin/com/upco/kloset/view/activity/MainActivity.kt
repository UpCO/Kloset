package com.upco.kloset.view.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.design.widget.BottomNavigationView.OnNavigationItemSelectedListener
import android.support.v4.view.ViewPager
import android.support.v4.view.ViewPager.OnPageChangeListener
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import android.view.View
import android.view.View.OnClickListener
import android.widget.Toast
import com.upco.kloset.contract.MainContract
import com.upco.kloset.R
import com.upco.kloset.extension.disableShiftMode
import com.upco.kloset.presenter.MainPresenter
import com.upco.kloset.view.adapter.MainViewPagerAdapter
import com.upco.kloset.view.fragment.AgendaFragment
import com.upco.kloset.view.fragment.ClosetFragment
import com.upco.kloset.view.fragment.FeedFragment
import com.upco.kloset.view.fragment.MenuFragment
import kotlinx.android.synthetic.main.layout_main.*

/**
 * Created by felps on 27/10/17.
 */
class MainActivity: AppCompatActivity(), MainContract.ViewImpl, OnNavigationItemSelectedListener, OnPageChangeListener, OnClickListener {

    private var selectedPage = 0
    private var prevMenuItem: MenuItem? = null
    private val presenter = MainPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_main)

        presenter.attachView(this)
    }

    override fun onStart() {
        super.onStart()

        // Configura os listeners
        setListeners()

        // Configura a UI
        setupUI()
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.detachView()
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_feed   -> viewpager.currentItem = 0
            R.id.action_closet -> viewpager.currentItem = 1
            R.id.action_agenda -> viewpager.currentItem = 2
            R.id.action_menu   -> viewpager.currentItem = 3
        }

        return false
    }

    override fun onPageSelected(position: Int) {
        if (prevMenuItem != null) prevMenuItem?.isChecked = true
        else bottom_navigation.menu.getItem(0).isChecked = false

        bottom_navigation.menu.getItem(position).isChecked = true
        prevMenuItem = bottom_navigation.menu.getItem(position)
        selectedPage = position
    }

    override fun onPageScrollStateChanged(state: Int) {
        when (state) {
            ViewPager.SCROLL_STATE_IDLE     -> fab.show()
            ViewPager.SCROLL_STATE_DRAGGING -> fab.hide()
            ViewPager.SCROLL_STATE_SETTLING -> fab.hide()
        }
    }

    override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {  }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.fab -> gotoNewLook()
        }
    }

    override fun getCtx(): Context = this

    override fun showToast(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }

    private fun setListeners() {
        bottom_navigation.setOnNavigationItemSelectedListener(this)
        viewpager.addOnPageChangeListener(this)
        fab.setOnClickListener(this)
    }

    private fun setupUI() {
        // ViewPager
        val adapter = MainViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(FeedFragment(), "Feed")
        adapter.addFragment(ClosetFragment(), "Closet")
        adapter.addFragment(AgendaFragment(), "agenda")
        adapter.addFragment(MenuFragment(), "Menu")
        viewpager.adapter = adapter
        viewpager.offscreenPageLimit = adapter.count - 1
        viewpager.currentItem = selectedPage

        // Bottom Navigation
        bottom_navigation.disableShiftMode()
    }

    private fun gotoNewLook() {
        val intent = Intent(this, NewLookActivity::class.java)
        startActivity(intent)
    }
}