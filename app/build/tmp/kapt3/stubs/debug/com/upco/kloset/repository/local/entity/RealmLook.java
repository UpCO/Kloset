package com.upco.kloset.repository.local.entity;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\"\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u000fJ\u0006\u0010*\u001a\u00020+R\u001a\u0010\u000e\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u000b\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\t\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001bR\u001a\u0010\n\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bR\u001a\u0010\f\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0019\"\u0004\b#\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0011\"\u0004\b%\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0011\"\u0004\b\'\u0010\u0013R\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0011\"\u0004\b)\u0010\u0013\u00a8\u0006,"}, d2 = {"Lcom/upco/kloset/repository/local/entity/RealmLook;", "Lio/realm/RealmObject;", "id", "", "uid", "", "title", "privacy", "", "numItems", "numLikes", "numComments", "numShares", "updatedAt", "createdAt", "(JLjava/lang/String;Ljava/lang/String;IIIIILjava/lang/String;Ljava/lang/String;)V", "getCreatedAt", "()Ljava/lang/String;", "setCreatedAt", "(Ljava/lang/String;)V", "getId", "()J", "setId", "(J)V", "getNumComments", "()I", "setNumComments", "(I)V", "getNumItems", "setNumItems", "getNumLikes", "setNumLikes", "getNumShares", "setNumShares", "getPrivacy", "setPrivacy", "getTitle", "setTitle", "getUid", "setUid", "getUpdatedAt", "setUpdatedAt", "toLook", "Lcom/upco/kloset/model/entity/Look;", "app_debug"})
public class RealmLook extends io.realm.RealmObject {
    @io.realm.annotations.PrimaryKey()
    private long id;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String uid;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String title;
    private int privacy;
    private int numItems;
    private int numLikes;
    private int numComments;
    private int numShares;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String updatedAt;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String createdAt;
    
    @org.jetbrains.annotations.NotNull()
    public final com.upco.kloset.model.entity.Look toLook() {
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
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getPrivacy() {
        return 0;
    }
    
    public final void setPrivacy(int p0) {
    }
    
    public final int getNumItems() {
        return 0;
    }
    
    public final void setNumItems(int p0) {
    }
    
    public final int getNumLikes() {
        return 0;
    }
    
    public final void setNumLikes(int p0) {
    }
    
    public final int getNumComments() {
        return 0;
    }
    
    public final void setNumComments(int p0) {
    }
    
    public final int getNumShares() {
        return 0;
    }
    
    public final void setNumShares(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUpdatedAt() {
        return null;
    }
    
    public final void setUpdatedAt(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCreatedAt() {
        return null;
    }
    
    public final void setCreatedAt(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public RealmLook(long id, @org.jetbrains.annotations.NotNull()
    java.lang.String uid, @org.jetbrains.annotations.NotNull()
    java.lang.String title, int privacy, int numItems, int numLikes, int numComments, int numShares, @org.jetbrains.annotations.NotNull()
    java.lang.String updatedAt, @org.jetbrains.annotations.NotNull()
    java.lang.String createdAt) {
        super();
    }
    
    public RealmLook() {
        super();
    }
}