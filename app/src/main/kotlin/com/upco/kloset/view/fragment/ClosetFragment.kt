package com.upco.kloset.view.fragment

import android.content.Context
import android.content.res.Configuration
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.peekandpop.shalskar.peekandpop.PeekAndPop
import com.upco.kloset.contract.ClosetContract
import com.upco.kloset.R
import com.upco.kloset.listener.OnLookSelectedListener
import com.upco.kloset.model.entity.Look
import com.upco.kloset.presenter.ClosetPresenter
import com.upco.kloset.view.adapter.LookGridRecyclerAdapter
import kotlinx.android.synthetic.main.layout_closet.*

/**
 * Created by felps on 20/10/17.
 */
class ClosetFragment: Fragment(), ClosetContract.ViewImpl, OnLookSelectedListener {

    private var lookGridAdapter: LookGridRecyclerAdapter? = null
    private var peekAndPop: PeekAndPop? = null
    private val presenter = ClosetPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        presenter.attachView(this)
        presenter.retrieveLooks(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.layout_closet, container, false)
    }

    override fun onStart() {
        super.onStart()

        // Configura o PeekAndPop
        setupPeekAndPop()

        // Configura o Grid Recycler
        setupGridRecycler()
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.detachView()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putParcelableArrayList(ClosetContract.ViewImpl.LOOKS_KEY, presenter.getLooks())
        super.onSaveInstanceState(outState)
    }

    override fun onLookSelected(look: Look) {
        presenter.setSelectedLook(look)
    }

    override fun getCtx(): Context = context!!

    override fun showToast(msg: String) {
        Toast.makeText(activity, msg, Toast.LENGTH_SHORT).show()
    }

    override fun updateLooksRecycler() {
        lookGridAdapter?.notifyDataSetChanged()
    }

    override fun updateLooksRecyclerItem(position: Int) {
        lookGridAdapter?.notifyItemChanged(position)
    }

    private fun setupGridRecycler() {
        lookGridAdapter = LookGridRecyclerAdapter(presenter.getLooks(), context!!, peekAndPop!!, this)
        closet_grid_recycler.adapter = lookGridAdapter
        if (resources.configuration.orientation == Configuration.ORIENTATION_PORTRAIT) {
            closet_grid_recycler.layoutManager = GridLayoutManager(context, 3)
        } else {
            closet_grid_recycler.layoutManager = GridLayoutManager(context, 5)
        }
    }

    private fun setupPeekAndPop() {
        peekAndPop = PeekAndPop.Builder(activity!!)
                .peekLayout(R.layout.layout_look_grid_peek_view)
                .parentViewGroupToDisallowTouchEvents(closet_grid_recycler)
                .build()
    }
}