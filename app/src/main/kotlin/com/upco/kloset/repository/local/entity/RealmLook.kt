package com.upco.kloset.repository.local.entity

import com.upco.kloset.model.entity.Look
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

/**
 * Created by felps on 22/10/17.
 */
open class RealmLook(@PrimaryKey
                     var id: Long = 0,
                     var uid: String = "",
                     var title: String = "",
                     var privacy: Int = 0,
                     var numItems: Int = 0,
                     var numLikes: Int = 0,
                     var numComments: Int = 0,
                     var numShares: Int = 0,
                     var updatedAt: String = "",
                     var createdAt: String = ""): RealmObject() {

    fun toLook(): Look {
        return Look(id, uid, title, privacy, numItems, numLikes, numComments, numShares, updatedAt, createdAt)
    }
}