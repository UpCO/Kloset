package com.upco.kloset.view.adapter

import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.VibrationEffect
import android.os.Vibrator
import android.support.v4.content.ContextCompat
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.peekandpop.shalskar.peekandpop.PeekAndPop
import com.upco.kloset.R
import com.upco.kloset.extension.bind
import com.upco.kloset.listener.OnLookSelectedListener
import com.upco.kloset.model.entity.Look
import com.upco.kloset.view.activity.CommentActivity
import com.upco.kloset.view.activity.LookActivity
import com.upco.kloset.view.widget.AutoScrollViewPager
import kotlinx.android.synthetic.main.layout_look_grid_peek_view.view.*
import kotlin.collections.ArrayList

/**
 * Created by felps on 28/10/17.
 */
class LookGridRecyclerAdapter(val looks: ArrayList<Look>,
                              val context: Context,
                              val peekAndPop: PeekAndPop,
                              val listener: OnLookSelectedListener): RecyclerView.Adapter<LookGridRecyclerAdapter.ViewHolder>() {

    private val images = arrayListOf<String>()
    private val peekAndPopAdapter = LookSlidingImagesAdapter(images)
    private val peekView = peekAndPop.peekView

    // Ao inicializar a classe, configura o PeekAndPop
    init { setupPeekAndPop() }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val view = LayoutInflater
                .from(parent?.context)
                .inflate(R.layout.layout_look_grid_item, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        peekAndPop.addLongClickView(holder!!.view, position)
        holder.setupUI(looks[position])
    }

    override fun getItemCount(): Int = looks.size

    private fun setupPeekAndPop() {

        // Configura o ViewPager
        peekView.vvp_look.adapter = peekAndPopAdapter
        peekView.vvp_look.offscreenPageLimit = 2
        //peekView.vvp_look.startAutoScroll()
        //peekView.vvp_look.isSwipeable = false

        // Indica as views que serão atendidas pelo OnHoldAndReleaseListener
        peekAndPop.addHoldAndReleaseView(R.id.iv_like)
        peekAndPop.addHoldAndReleaseView(R.id.iv_comment)
        peekAndPop.addHoldAndReleaseView(R.id.iv_share)

        // Ao abrir o PeekAndPop (onPeek) atualizará os dados da UI com os do look selecionado
        peekAndPop.setOnGeneralActionListener(object: PeekAndPop.OnGeneralActionListener {
            override fun onPeek(view: View?, position: Int) {
                loadPeekAndPop(position)
            }

            override fun onPop(p0: View?, p1: Int) {

            }
        })

        // Ao passar o cursor sobre os botões (Curtir, Comentar ou Compartilhar), exibe um tooltip
        // indicando a função do botão e vibra, ao retirar ou liberar o cursor, o tooltip é ocultado
        peekAndPop.setOnHoldAndReleaseListener(object: PeekAndPop.OnHoldAndReleaseListener {
            override fun onHold(view: View?, position: Int) {
                when (view?.id) {
                    R.id.iv_like    -> vibrate()
                    R.id.iv_comment -> vibrate()
                    R.id.iv_share   -> vibrate()
                }
            }

            override fun onLeave(view: View?, position: Int) {

            }

            override fun onRelease(view: View?, position: Int) {

            }
        })

        // Se o PeekAndPop for deslizado (Fling) para cima, abre a LookActivity
        // Se for deslizado para baixo, abre a CommentActivity
        peekAndPop.setOnFlingToActionListener { _, position, direction ->
            when (direction) {
                PeekAndPop.FLING_UPWARDS -> {
                    listener.onLookSelected(looks[position])
                    gotoLook()
                }
                PeekAndPop.FLING_DOWNWARDS -> {
                    gotoComment()
                }
            }
        }
    }

    private fun loadPeekAndPop(position: Int) {
        // Adiciona as imagens de cada peça do look
        images.clear()
        for (item in looks[position].items_) {
            images += item.images
        }

        // Notifica o adapter que todos os itens do ArrayList foram alterados
        peekAndPopAdapter.notifyDataSetChanged()

        // Define o título do look e a quantidade de peças
        peekView.tv_title.text = looks[position].title
    }

    private fun vibrate() {
        if (Build.VERSION.SDK_INT > 26) {
            val vibrator = context.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
            vibrator.vibrate(VibrationEffect.createOneShot(50, 1))
        } else {
            val vibrator = context.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
            vibrator.vibrate(50)
        }
    }

    private fun gotoLook() {
        val intent = Intent(context, LookActivity::class.java)
        context.startActivity(intent)
    }

    private fun gotoComment() {
        val intent = Intent(context, CommentActivity::class.java)
        context.startActivity(intent)
    }

    // ViewHolder
    inner class ViewHolder(val view: View): RecyclerView.ViewHolder(view) {

        private val vp_look: AutoScrollViewPager by view.bind(R.id.vp_look)

        private fun gotoLook() {
            val intent = Intent(context, LookActivity::class.java)
            context.startActivity(intent)
        }

        fun setupUI(look: Look) {
            // Adiciona as imagens de cada peça do look
            val images = arrayListOf<String>()
            for (item in look.items_) {
                images += item.images
            }

            vp_look.adapter = LookSlidingImagesAdapter(images)
            vp_look.offscreenPageLimit = 2
            vp_look.startAutoScroll()
            vp_look.isSwipeable = false

            view.setOnClickListener {
                listener.onLookSelected(look)
                gotoLook()
            }
        }
    }
}