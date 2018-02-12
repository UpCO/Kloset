package com.upco.kloset.model.entity

import android.os.Parcel
import android.os.Parcelable
import com.upco.kloset.repository.local.entity.RealmComment

/**
 * Created by felps on 19/10/17.
 */
data class Comment(var id: Long = 0,
              var uid: String = "",
              var type: Int = 0,
              var content: String = "",
              var numLikes: Int = 0): Parcelable {

    companion object {
        @JvmField val CREATOR: Parcelable.Creator<Comment> = object: Parcelable.Creator<Comment> {
            override fun createFromParcel(source: Parcel): Comment = Comment(source)
            override fun newArray(size: Int): Array<Comment?> = arrayOfNulls(size)
        }
    }

    protected constructor(parcel: Parcel): this(
            parcel.readLong(),
            parcel.readString(),
            parcel.readInt(),
            parcel.readString(),
            parcel.readInt()
    )

    override fun describeContents() = 0

    override fun writeToParcel(dest: Parcel?, flags: Int) {
        dest?.writeLong(this.id)
        dest?.writeString(this.uid)
        dest?.writeInt(this.type)
        dest?.writeString(this.content)
        dest?.writeInt(this.numLikes)
    }

    fun toRealmComment() = RealmComment(id, uid, type, content, numLikes)
}