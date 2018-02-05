package com.upco.kloset.model.entity

import android.os.Parcel
import android.os.Parcelable
import com.upco.kloset.repository.local.entity.RealmItem
import io.realm.RealmList

/**
 * Created by felps on 19/10/17.
 */
class Item(var id: Long = 0,
           var uid: String = "",
           var title: String = "",
           var images: ArrayList<String> = arrayListOf()): Parcelable {

    companion object {
        val UID_KEY = "uid"

        @JvmField val CREATOR = object: Parcelable.Creator<Item> {
            override fun createFromParcel(source: Parcel): Item = Item(source)
            override fun newArray(size: Int): Array<Item?> = arrayOfNulls(size)
        }
    }

    protected constructor(parcel: Parcel): this() {
        this.id = parcel.readLong()
        this.uid = parcel.readString()
        this.title = parcel.readString()
        this.images.addAll(parcel.createStringArrayList())
    }

    override fun describeContents() = 0

    override fun writeToParcel(dest: Parcel?, flags: Int) {
        dest?.writeLong(this.id)
        dest?.writeString(this.uid)
        dest?.writeString(this.title)
        dest?.writeStringList(this.images)
    }

    fun toRealmItem(): RealmItem {
        val realmImages = RealmList<String>()
        realmImages.addAll(images)
        return RealmItem(id, uid, title, realmImages)
    }
}