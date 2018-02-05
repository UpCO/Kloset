package com.upco.kloset.view.activity

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import android.widget.Toast
import com.upco.kloset.contract.NewLookItemContract
import com.upco.kloset.R
import com.upco.kloset.presenter.NewLookItemPresenter
import kotlinx.android.synthetic.main.layout_new_look_item.*

/**
 * Created by felps on 25/10/17.
 */
class NewLookItemActivity: AppCompatActivity(), NewLookItemContract.ViewImpl {

    private val presenter = NewLookItemPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_new_look_item)

        presenter.attachView(this)
    }

    override fun onStart() {
        super.onStart()

        // Configura a toolbar
        setupToolbar()
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.detachView()
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            android.R.id.home -> finish()
        }

        return super.onOptionsItemSelected(item)
    }

    override fun getCtx(): Context = this

    override fun showToast(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }

    fun setupToolbar() {
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}