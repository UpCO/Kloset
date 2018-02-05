package com.upco.kloset.view.activity

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.MenuItem
import android.widget.Toast
import com.upco.kloset.contract.AnswerContract
import com.upco.kloset.R
import com.upco.kloset.model.entity.Comment
import com.upco.kloset.presenter.AnswerPresenter
import com.upco.kloset.view.adapter.AnswerRecyclerAdapter
import kotlinx.android.synthetic.main.layout_answer.*

/**
 * Created by felps on 23/10/17.
 */
class AnswerActivity: AppCompatActivity(), AnswerContract.ViewImpl {

    private var answersAdapter: AnswerRecyclerAdapter? = null
    private val presenter = AnswerPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_answer)

        presenter.attachView(this)
        presenter.retrieveAnswers(savedInstanceState)
    }

    override fun onStart() {
        super.onStart()

        // Configura a Toolbar
        setupToolbar()

        // Configura a UI
        setupUI(presenter.getAnswers())
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.detachView()
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        outState?.putParcelableArrayList(AnswerContract.ViewImpl.ANSWERS_KEY, presenter.getAnswers())
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
        Toast.makeText(this, msg, Toast.LENGTH_SHORT)
    }

    override fun updateAnswersRecycler() {
        answersAdapter?.notifyDataSetChanged()
    }

    override fun updateAnswersRecyclerItem(position: Int) {
        answersAdapter?.notifyItemChanged(position)
    }

    private fun setupToolbar() {
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    private fun setupUI(answers: ArrayList<Comment>) {
        answersAdapter = AnswerRecyclerAdapter(answers, this)
        recycler_answers.adapter = answersAdapter
        recycler_answers.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    }
}