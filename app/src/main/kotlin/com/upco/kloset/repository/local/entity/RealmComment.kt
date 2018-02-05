package com.upco.kloset.repository.local.entity

import com.upco.kloset.model.entity.Comment
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

/**
 * Created by felps on 22/10/17.
 */
open class RealmComment(@PrimaryKey
                        var id: Long = 0,
                        var uid: String = "",
                        var type: Int = 0,
                        var content: String = "",
                        var numLikes: Int = 0): RealmObject() {

    fun toComment() = Comment(id, uid, type, content, numLikes)
}