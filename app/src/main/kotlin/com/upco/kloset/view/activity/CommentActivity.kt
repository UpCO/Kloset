package com.upco.kloset.view.activity

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.MenuItem
import android.widget.Toast
import com.upco.kloset.contract.CommentContract
import com.upco.kloset.R
import com.upco.kloset.listener.OnCommentSelectedListener
import com.upco.kloset.model.entity.Comment
import com.upco.kloset.presenter.CommentPresenter
import com.upco.kloset.view.adapter.CommentRecyclerAdapter
import kotlinx.android.synthetic.main.layout_look.*

/**
 * Created by felps on 22/10/17.
 */
class CommentActivity: AppCompatActivity(), CommentContract.ViewImpl, OnCommentSelectedListener {

    private var commentsAdapter: CommentRecyclerAdapter? = null
    private val presenter = CommentPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_comment)

        presenter.attachView(this)
        presenter.retrieveComments(savedInstanceState)
    }

    override fun onStart() {
        super.onStart()

        // Configura a Toolbar
        setupToolbar()

        // Configura a UI
        setupUI(presenter.getComments())
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.detachView()
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        outState?.putParcelableArrayList(CommentContract.ViewImpl.COMMENTS_KEY, presenter.getComments())
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

    override fun onCommentSelected(comment: Comment) {
        presenter.setSelectedComment(comment)
    }

    override fun getCtx(): Context = this

    override fun showToast(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }

    override fun updateCommentsRecycler() {
        commentsAdapter?.notifyDataSetChanged()
    }

    override fun updateCommentsRecyclerItem(position: Int) {
        commentsAdapter?.notifyItemChanged(position)
    }

    private fun setupToolbar() {
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    private fun setupUI(comments: ArrayList<Comment>) {
        commentsAdapter = CommentRecyclerAdapter(comments, this, this)
        recycler_comments.adapter = commentsAdapter
        recycler_comments.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    }
}