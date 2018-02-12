package com.upco.kloset.model.entity;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u0000 12\u00020\u0001:\u00011B\u000f\b\u0014\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B7\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u00a2\u0006\u0002\u0010\rJ\t\u0010\u001e\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\bH\u00c6\u0003J\t\u0010 \u001a\u00020\nH\u00c6\u0003J\t\u0010!\u001a\u00020\bH\u00c6\u0003J\t\u0010\"\u001a\u00020\nH\u00c6\u0003J;\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\nH\u00c6\u0001J\b\u0010$\u001a\u00020\nH\u0016J\u0013\u0010%\u001a\u00020&2\b\u0010\'\u001a\u0004\u0018\u00010(H\u00d6\u0003J\t\u0010)\u001a\u00020\nH\u00d6\u0001J\u0006\u0010*\u001a\u00020+J\t\u0010,\u001a\u00020\bH\u00d6\u0001J\u001a\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u00032\u0006\u00100\u001a\u00020\nH\u0016R\u001a\u0010\u000b\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\f\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011\u00a8\u00062"}, d2 = {"Lcom/upco/kloset/model/entity/Comment;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "id", "", "uid", "", "type", "", "content", "numLikes", "(JLjava/lang/String;ILjava/lang/String;I)V", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "getId", "()J", "setId", "(J)V", "getNumLikes", "()I", "setNumLikes", "(I)V", "getType", "setType", "getUid", "setUid", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toRealmComment", "Lcom/upco/kloset/repository/local/entity/RealmComment;", "toString", "writeToParcel", "", "dest", "flags", "Companion", "app_debug"})
public final class Comment implements android.os.Parcelable {
    private long id;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String uid;
    private int type;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String content;
    private int numLikes;
    @org.jetbrains.annotations.NotNull()
    public static final android.os.Parcelable.Creator<com.upco.kloset.model.entity.Comment> CREATOR = null;
    public static final com.upco.kloset.model.entity.Comment.Companion Companion = null;
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.Nullable()
    android.os.Parcel dest, int flags) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.upco.kloset.repository.local.entity.RealmComment toRealmComment() {
        return null;
    }
    
    public final long getId() {
        return 0L;
    }
    
    public final void setId(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUid() {
        return null;
    }
    
    public final void setUid(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getType() {
        return 0;
    }
    
    public final void setType(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getContent() {
        return null;
    }
    
    public final void setContent(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getNumLikes() {
        return 0;
    }
    
    public final void setNumLikes(int p0) {
    }
    
    public Comment(long id, @org.jetbrains.annotations.NotNull()
    java.lang.String uid, int type, @org.jetbrains.annotations.NotNull()
    java.lang.String content, int numLikes) {
        super();
    }
    
    public Comment() {
        super();
    }
    
    protected Comment(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    public final int component3() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    public final int component5() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.upco.kloset.model.entity.Comment copy(long id, @org.jetbrains.annotations.NotNull()
    java.lang.String uid, int type, @org.jetbrains.annotations.NotNull()
    java.lang.String content, int numLikes) {
        return null;
    }
    
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(java.lang.Object p0) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/upco/kloset/model/entity/Comment$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/upco/kloset/model/entity/Comment;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}