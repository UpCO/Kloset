package com.upco.kloset.model.entity

import android.os.Parcel
import android.os.Parcelable
import com.google.firebase.firestore.Exclude
import com.google.firebase.firestore.IgnoreExtraProperties
import com.google.firebase.firestore.PropertyName
import com.upco.kloset.repository.local.entity.RealmLook
import java.util.*
import kotlin.collections.ArrayList

/**
 * Created by felps on 19/10/17.
 */
@IgnoreExtraProperties
class Look(var uid: String = "",
           var title: String = "",
           var privacy: Int = 0,
           @Exclude
           var items_: ArrayList<Item> = arrayListOf(),
           @PropertyName("num_items")
           var numItems: Int = 0,
           @PropertyName("num_likes")
           var numLikes: Int = 0,
           @PropertyName("num_comments")
           var numComments: Int = 0,
           @PropertyName("num_shares")
           var numShares: Int = 0,
           @PropertyName("updated_at")
           var updatedAt: Date = Date(),
           @PropertyName("created_at")
           var createdAt: Date = Date()): Parcelable {

    enum class Privacy(val privacy: Int) {
        VISIBLE_FOR_ALL(1),
        ONLY_ME(2)
    }

    companion object {
        @JvmField val CREATOR: Parcelable.Creator<Look> = object: Parcelable.Creator<Look> {
            override fun createFromParcel(source: Parcel): Look = Look(source)
            override fun newArray(size: Int): Array<Look?> = arrayOfNulls(size)
        }
    }

    protected constructor(parcel: Parcel) : this() {
        this.uid = parcel.readString()
        this.title = parcel.readString()
        this.privacy = parcel.readInt()
        this.items_.addAll(parcel.createTypedArrayList(Item.CREATOR))
        this.numItems = parcel.readInt()
        this.numLikes = parcel.readInt()
        this.numComments = parcel.readInt()
        this.numShares = parcel.readInt()
        this.updatedAt = Date(parcel.readLong())
        this.createdAt = Date(parcel.readLong())
    }

    override fun describeContents() = 0

    override fun writeToParcel(dest: Parcel?, flags: Int) {
        dest?.writeString(this.uid)
        dest?.writeString(this.title)
        dest?.writeInt(this.privacy)
        dest?.writeTypedList(this.items_)
        dest?.writeInt(this.numItems)
        dest?.writeInt(this.numLikes)
        dest?.writeInt(this.numComments)
        dest?.writeInt(this.numShares)
        dest?.writeLong(this.updatedAt.time)
        dest?.writeLong(this.createdAt.time)
    }

    fun toRealmLook(): RealmLook {
        return RealmLook(0, uid, title, privacy, numItems, numLikes, numComments, numShares, "", "")
    }
}