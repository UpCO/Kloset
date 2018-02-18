package com.upco.kloset.model.entity;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 &2\u00020\u0001:\u0001&B\u000f\b\u0014\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B=\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\rJ\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0006\u0010 \u001a\u00020!J\u001a\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u00032\u0006\u0010%\u001a\u00020\u001fH\u0016R\u001e\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011\u00a8\u0006\'"}, d2 = {"Lcom/upco/kloset/model/entity/Item;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "uid", "", "title", "images", "Ljava/util/ArrayList;", "updatedAt", "Ljava/util/Date;", "createdAt", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/Date;Ljava/util/Date;)V", "getCreatedAt", "()Ljava/util/Date;", "setCreatedAt", "(Ljava/util/Date;)V", "getImages", "()Ljava/util/ArrayList;", "setImages", "(Ljava/util/ArrayList;)V", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "getUid", "setUid", "getUpdatedAt", "setUpdatedAt", "describeContents", "", "toRealmItem", "Lcom/upco/kloset/repository/local/entity/RealmItem;", "writeToParcel", "", "dest", "flags", "Companion", "app_debug"})
public final class Item implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String uid;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String title;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<java.lang.String> images;
    @org.jetbrains.annotations.NotNull()
    @com.google.firebase.firestore.PropertyName(value = "updated_at")
    private java.util.Date updatedAt;
    @org.jetbrains.annotations.NotNull()
    @com.google.firebase.firestore.PropertyName(value = "created_at")
    private java.util.Date createdAt;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String UID_KEY = "uid";
    @org.jetbrains.annotations.NotNull()
    public static final android.os.Parcelable.Creator<com.upco.kloset.model.entity.Item> CREATOR = null;
    public static final com.upco.kloset.model.entity.Item.Companion Companion = null;
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.Nullable()
    android.os.Parcel dest, int flags) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.upco.kloset.repository.local.entity.RealmItem toRealmItem() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUid() {
        return null;
    }
    
    public final void setUid(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> getImages() {
        return null;
    }
    
    public final void setImages(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getUpdatedAt() {
        return null;
    }
    
    public final void setUpdatedAt(@org.jetbrains.annotations.NotNull()
    java.util.Date p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getCreatedAt() {
        return null;
    }
    
    public final void setCreatedAt(@org.jetbrains.annotations.NotNull()
    java.util.Date p0) {
    }
    
    public Item(@org.jetbrains.annotations.NotNull()
    java.lang.String uid, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> images, @org.jetbrains.annotations.NotNull()
    java.util.Date updatedAt, @org.jetbrains.annotations.NotNull()
    java.util.Date createdAt) {
        super();
    }
    
    public Item() {
        super();
    }
    
    protected Item(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/upco/kloset/model/entity/Item$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/upco/kloset/model/entity/Item;", "UID_KEY", "", "getUID_KEY", "()Ljava/lang/String;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUID_KEY() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}