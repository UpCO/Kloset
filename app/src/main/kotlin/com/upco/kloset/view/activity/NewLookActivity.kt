package com.upco.kloset.view.activity

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.MenuItem
import android.widget.Toast
import com.upco.kloset.contract.NewLookContract
import com.upco.kloset.R
import com.upco.kloset.model.entity.Item
import com.upco.kloset.presenter.NewLookPresenter
import com.upco.kloset.view.adapter.NewLookItemRecyclerAdapter
import kotlinx.android.synthetic.main.layout_new_look.*

/**
 * Created by felps on 25/10/17.
 */
class NewLookActivity: AppCompatActivity(), NewLookContract.ViewImpl {

    private var newLookItemsAdapter: NewLookItemRecyclerAdapter? = null
    private val presenter = NewLookPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_new_look)

        presenter.attachView(this)
    }

    override fun onStart() {
        super.onStart()

        // Configura a toolbar
        setupToolbar()

        // Configura a UI
        setupUI()
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.detachView()
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        //
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

    fun setupUI() {
        val images = arrayListOf(
                "http://laylamonteiro.com/wp-content/uploads/2016/03/lolla-001.jpg",
                "http://laylamonteiro.com/wp-content/uploads/2016/03/lolla-001.jpg",
                "http://laylamonteiro.com/wp-content/uploads/2016/03/lolla-001.jpg",
                "http://laylamonteiro.com/wp-content/uploads/2016/03/lolla-001.jpg",
                "http://laylamonteiro.com/wp-content/uploads/2016/03/lolla-001.jpg"
        )

        val lookItems = arrayListOf(
                Item("saoudjas", "Title 1", images),
                Item("ajsiodoaks", "Title 2", images),
                Item("adsijodasik", "Title 3", images),
                Item("adsdasd", "Title 4", images),
                Item("dfggdfgf", "Title 5", images),
                Item("hgjghjgtr", "Title 6", images),
                Item("klikuy", "Title 7", images),
                Item("ilopluk", "Title 8", images),
                Item("jhkço", "Title 9", images),
                Item("trhgbn", "Title 10", images)
        )

        newLookItemsAdapter = NewLookItemRecyclerAdapter(lookItems, this)
        recycler_look_items.adapter = newLookItemsAdapter
        recycler_look_items.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
    }
}