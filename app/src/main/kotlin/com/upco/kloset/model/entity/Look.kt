package com.upco.kloset.model.entity

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.upco.kloset.repository.local.entity.RealmLook

/**
 * Created by felps on 19/10/17.
 */
data class Look(@Expose(serialize = false)
                @SerializedName("id")
                var id: Long = 0,
                @Expose(serialize = false)
                @SerializedName("uid")
                var uid: String = "",
                @Expose
                @SerializedName("title")
                var title: String = "",
                @Expose
                @SerializedName("privacy")
                var privacy: Int = 0,
                @Expose
                var items: ArrayList<Item> = arrayListOf(),
                @Expose
                @SerializedName("num_items")
                var numItems: Int = 0,
                @Expose
                @SerializedName("num_likes")
                var numLikes: Int = 0,
                @Expose
                @SerializedName("num_comments")
                var numComments: Int = 0,
                @Expose
                @SerializedName("num_shares")
                var numShares: Int = 0,
                @Expose(serialize = false)
                @SerializedName("updated_at")
                var updatedAt: String = "",
                @Expose(serialize = false)
                @SerializedName("created_at")
                var createdAt: String = ""): Parcelable {

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
        this.id = parcel.readLong()
        this.uid = parcel.readString()
        this.title = parcel.readString()
        this.privacy = parcel.readInt()
        this.numItems = parcel.readInt()
        this.numLikes = parcel.readInt()
        this.numComments = parcel.readInt()
        this.numShares = parcel.readInt()
        this.updatedAt = parcel.readString()
        this.createdAt = parcel.readString()
    }

    override fun describeContents() = 0

    override fun writeToParcel(dest: Parcel?, flags: Int) {
        dest?.writeLong(this.id)
        dest?.writeString(this.uid)
        dest?.writeString(this.title)
        dest?.writeInt(this.privacy)
        dest?.writeInt(this.numItems)
        dest?.writeInt(this.numLikes)
        dest?.writeInt(this.numComments)
        dest?.writeInt(this.numShares)
        dest?.writeString(this.updatedAt)
        dest?.writeString(this.createdAt)
    }

    fun toRealmLook(): RealmLook {
        return RealmLook(id, uid, title, privacy, numItems, numLikes, numComments, numShares, updatedAt, createdAt)
    }
}