package com.upco.kloset.view.activity

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import android.widget.Toast
import com.upco.kloset.contract.LookContract
import com.upco.kloset.R
import com.upco.kloset.listener.OnCommentSelectedListener
import com.upco.kloset.presenter.LookPresenter
import com.upco.kloset.model.entity.Comment
import com.upco.kloset.model.entity.Item
import com.upco.kloset.model.entity.Look
import com.upco.kloset.view.adapter.CommentRecyclerAdapter
import com.upco.kloset.view.adapter.LookItemRecyclerAdapter
import com.upco.kloset.view.adapter.LookViewPagerAdapter
import kotlinx.android.synthetic.main.layout_look.*

/**
 * Created by felps on 19/10/17.
 */
class LookActivity: AppCompatActivity(), LookContract.ViewImpl, View.OnClickListener, OnCommentSelectedListener {

    private var commentsAdapter: CommentRecyclerAdapter? = null
    private val presenter = LookPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_look)

        presenter.attachView(this)
        presenter.retrieveLook(savedInstanceState)
        presenter.retrieveComments(savedInstanceState)
    }

    override fun onStart() {
        super.onStart()

        // Configura os listeners
        setListeners()

        // Configura a toolbar
        setupToolbar()

        // Configura a UI
        setupUI(presenter.getLook(), presenter.getComments())
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.detachView()
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        outState?.putParcelable(LookContract.ViewImpl.LOOK_KEY, presenter.getLook())
        outState?.putParcelableArrayList(LookContract.ViewImpl.COMMENTS_KEY, presenter.getComments())
        super.onSaveInstanceState(outState)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        // TextView da quantidade de peças
        val tv = TextView(this)
        tv.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_hanger_white_24dp, 0, 0, 0)
        tv.compoundDrawablePadding = 15 // TODO: Substituir, utilizando uam função para converter de dp para px
        tv.setPadding(20, 0, 20, 0)
        tv.setTextColor(Color.WHITE)
        tv.textSize = 20f
        tv.text = presenter.getLook().numItems.toString()

        // Coloca o tv no menu
        val MENU_ITEM_ID = 1010
        menu?.add(0, MENU_ITEM_ID, 1, "")?.setActionView(tv)?.setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when(item?.itemId) {
            android.R.id.home -> finish()
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_comment -> goToComments()
            R.id.btn_viewAll -> goToComments()
        }
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

    private fun setListeners() {
        btn_comment.setOnClickListener(this)
        btn_viewAll.setOnClickListener(this)
    }

    private fun setupToolbar() {
        toolbar.title = presenter.getLook().title
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    private fun setupUI(look: Look, comments: ArrayList<Comment>) {
        val images = arrayListOf(
                "http://www.fireskull.com.br/image/cache/catalog/Produtos/Bolsas/657657%20_1_-800x800.jpg",
                "https://http2.mlstatic.com/S_183015-MLB25097628614_102016-O.jpg"
        )
        val items = arrayListOf(
                Item(0, "kaskpodkas", "Teste 1", images),
                Item(1, "mkpdfkgdfgdf", "Teste 2", images)
        )


        // TODO: Isto deve ser retirado daqui e colocado dentro do listener de clique de cada peça, para que assim, possa ser pego o título da peça
        toolbar.subtitle = items[0].title

        // Botões
        // Define a quantidade de curtidas, comentários e compartilhamentos
        btn_like.text = if (look.numLikes < 999) look.numLikes.toString() else "999+"
        btn_comment.text = if (look.numComments < 999) look.numComments.toString() else "999+"
        btn_share.text = if (look.numShares < 999) look.numShares.toString() else "999+"

        // Botão ver todos os comentários
        // Verifica se há mais de 1 comentário, se sim define o texto do botão, se não oculta ele
        if (look.numComments > 0) {
            btn_viewAll.text = "Ver todos os " + look.numComments + " comentários"
        } else {
            btn_viewAll.visibility = View.GONE
        }

        // Viewpager
        //val images = items[0].images // TODO: Deve ser setado a peça de look selecionada, por enquanto usa-se a primeira peça
        vp_item.adapter = LookViewPagerAdapter(images)

        // Items Recycler
        recycler_look_items.adapter = LookItemRecyclerAdapter(items, this)
        recycler_look_items.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        // Comments Recycler
        commentsAdapter = CommentRecyclerAdapter(comments, this, this)
        recycler_comments.adapter = commentsAdapter
        recycler_comments.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    }

    private fun goToComments() {
        val intent = Intent(this, CommentActivity::class.java)
        startActivity(intent)
    }
}