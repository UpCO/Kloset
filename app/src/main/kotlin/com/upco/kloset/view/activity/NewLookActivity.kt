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
                Item(0, "saoudjas", "Title 1", "http://laylamonteiro.com/wp-content/uploads/2016/03/lolla-001.jpg"),
                Item(1, "ajsiodoaks", "Title 2", "http://laylamonteiro.com/wp-content/uploads/2016/03/lolla-001.jpg"),
                Item(2, "adsijodasik", "Title 3", "http://laylamonteiro.com/wp-content/uploads/2016/03/lolla-001.jpg"),
                Item(3, "adsdasd", "Title 4", "http://laylamonteiro.com/wp-content/uploads/2016/03/lolla-001.jpg"),
                Item(4, "dfggdfgf", "Title 5", "http://laylamonteiro.com/wp-content/uploads/2016/03/lolla-001.jpg"),
                Item(5, "hgjghjgtr", "Title 6", "http://laylamonteiro.com/wp-content/uploads/2016/03/lolla-001.jpg"),
                Item(6, "klikuy", "Title 7", "http://laylamonteiro.com/wp-content/uploads/2016/03/lolla-001.jpg"),
                Item(7, "ilopluk", "Title 8", "http://laylamonteiro.com/wp-content/uploads/2016/03/lolla-001.jpg"),
                Item(8, "jhkço", "Title 9", "http://laylamonteiro.com/wp-content/uploads/2016/03/lolla-001.jpg"),
                Item(9, "trhgbn", "Title 10", "http://laylamonteiro.com/wp-content/uploads/2016/03/lolla-001.jpg")
        )

        newLookItemsAdapter = NewLookItemRecyclerAdapter(lookItems, this)
        recycler_look_items.adapter = newLookItemsAdapter
        recycler_look_items.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
    }
}