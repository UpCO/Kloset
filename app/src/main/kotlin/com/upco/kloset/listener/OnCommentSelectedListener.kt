package com.upco.kloset.listener

import com.upco.kloset.model.entity.Comment

/**
 * Created by felps on 24/10/17.
 */
interface OnCommentSelectedListener {

    fun onCommentSelected(comment: Comment)
}