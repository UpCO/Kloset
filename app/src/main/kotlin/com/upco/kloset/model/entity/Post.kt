package com.upco.kloset.model.entity

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * Created by felps on 11/02/18.
 */
data class Post(@Expose(serialize = false)
                @SerializedName("id")
                var id: Long = 0,
                @Expose(serialize = false)
                @SerializedName("uid")
                var uid: String = "",
                @Expose
                @SerializedName("content")
                var content: String = "",
                @Expose
                @SerializedName("privacy")
                var privacy: Int = 0,
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
        @JvmField val CREATOR: Parcelable.Creator<Post> = object: Parcelable.Creator<Post> {
            override fun createFromParcel(source: Parcel): Post = Post(source)
            override fun newArray(size: Int): Array<Post?> = arrayOfNulls(size)
        }
    }

    protected constructor(parcel: Parcel) : this() {
        this.id = parcel.readLong()
        this.uid = parcel.readString()
        this.content = parcel.readString()
        this.privacy = parcel.readInt()
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
        dest?.writeString(this.content)
        dest?.writeInt(this.privacy)
        dest?.writeInt(this.numLikes)
        dest?.writeInt(this.numComments)
        dest?.writeInt(this.numShares)
        dest?.writeString(this.updatedAt)
        dest?.writeString(this.createdAt)
    }
}