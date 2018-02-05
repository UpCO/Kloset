package com.upco.kloset.view.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.upco.kloset.R
import com.upco.kloset.view.adapter.FeedRecyclerAdapter
import kotlinx.android.synthetic.main.layout_feed.*

/**
 * Created by felps on 21/10/17.
 */
class FeedFragment: Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.layout_feed, container, false)
    }

    override fun onStart() {
        super.onStart()

        // TODO: Pegar do presenter
        val posts = arrayListOf(
                "João",
                "Maria",
                "Chapéuzinho Vermelhão"
        )

        // Configura o Recycler
        setupRecycler(posts)
    }

    private fun setupRecycler(posts: ArrayList<String>) {
        feed_recycler.adapter = FeedRecyclerAdapter(posts, context!!)
        feed_recycler.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
    }
}