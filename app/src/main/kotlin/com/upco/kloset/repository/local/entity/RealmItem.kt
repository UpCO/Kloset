package com.upco.kloset.repository.local.entity

import com.upco.kloset.model.entity.Item
import io.realm.RealmList
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

/**
 * Created by felps on 22/10/17.
 */
open class RealmItem(@PrimaryKey
                    var id: Long = 0,
                     var uid: String = "",
                     var title: String = "",
                     var images: RealmList<String> = RealmList()): RealmObject() {

    fun toItem() = Item(id, uid, title, ArrayList(images))
}