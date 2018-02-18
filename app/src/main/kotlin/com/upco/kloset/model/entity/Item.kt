package com.upco.kloset.model.entity

import android.os.Parcel
import android.os.Parcelable
import com.google.firebase.firestore.PropertyName
import com.upco.kloset.repository.local.entity.RealmItem
import io.realm.RealmList
import java.util.*

/**
 * Created by felps on 19/10/17.
 */
class Item(var uid: String = "",
           var title: String = "",
           var images: ArrayList<String> = arrayListOf(),
           @PropertyName("updated_at")
           var updatedAt: Date = Date(),
           @PropertyName("created_at")
           var createdAt: Date = Date()): Parcelable {

    companion object {
        val UID_KEY = "uid"

        @JvmField val CREATOR = object: Parcelable.Creator<Item> {
            override fun createFromParcel(source: Parcel): Item = Item(source)
            override fun newArray(size: Int): Array<Item?> = arrayOfNulls(size)
        }
    }

    protected constructor(parcel: Parcel): this() {
        this.uid = parcel.readString()
        this.title = parcel.readString()
        this.images.addAll(parcel.createStringArrayList())
        this.updatedAt = Date(parcel.readLong())
        this.createdAt = Date(parcel.readLong())
    }

    override fun describeContents() = 0

    override fun writeToParcel(dest: Parcel?, flags: Int) {
        dest?.writeString(this.uid)
        dest?.writeString(this.title)
        dest?.writeStringList(this.images)
        dest?.writeLong(this.updatedAt.time)
        dest?.writeLong(this.createdAt.time)
    }

    fun toRealmItem(): RealmItem {
        val realmImages = RealmList<String>()
        realmImages.addAll(images)
        return RealmItem(0, uid, title, realmImages)
    }
}