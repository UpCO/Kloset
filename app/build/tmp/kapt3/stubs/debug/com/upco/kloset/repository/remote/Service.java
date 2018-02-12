package com.upco.kloset.repository.remote;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\'J\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u000bH\'J\"\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\r\u001a\u00020\u000eH\'J\"\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0010\u001a\u00020\u0011H\'J\"\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0013\u001a\u00020\u0006H\'J\"\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0013\u001a\u00020\u0006H\'J\"\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0013\u001a\u00020\u0006H\'J\"\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0013\u001a\u00020\u0006H\'J\"\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0013\u001a\u00020\u0006H\'J\u0018\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\"\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0013\u001a\u00020\u0006H\'J\u0018\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\"\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0013\u001a\u00020\u0006H\'J\u0018\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\"\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0013\u001a\u00020\u0006H\'J\u0018\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J,\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0013\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\'J,\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0013\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u000bH\'J,\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0013\u001a\u00020\u00062\b\b\u0001\u0010\r\u001a\u00020\u000eH\'J,\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0013\u001a\u00020\u00062\b\b\u0001\u0010\u0010\u001a\u00020\u0011H\'\u00a8\u0006#"}, d2 = {"Lcom/upco/kloset/repository/remote/Service;", "", "createComment", "Lretrofit2/Call;", "Lcom/upco/kloset/model/entity/RedirectionInfo;", "auth", "", "comment", "Lcom/upco/kloset/model/entity/Comment;", "createItem", "item", "Lcom/upco/kloset/model/entity/Item;", "createLook", "look", "Lcom/upco/kloset/model/entity/Look;", "createPost", "post", "Lcom/upco/kloset/model/entity/Post;", "deleteComment", "uid", "deleteItem", "deleteLook", "deletePost", "getComment", "getComments", "getItem", "getItems", "getLook", "getLooks", "getPost", "getPosts", "updateComment", "updateItem", "updateLook", "updatePost", "app_debug"})
public abstract interface Service {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "posts")
    public abstract retrofit2.Call<com.upco.kloset.model.entity.RedirectionInfo> createPost(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String auth, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.upco.kloset.model.entity.Post post);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "posts")
    public abstract retrofit2.Call<com.upco.kloset.model.entity.RedirectionInfo> getPosts(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String auth);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "posts/{uid}")
    public abstract retrofit2.Call<com.upco.kloset.model.entity.RedirectionInfo> getPost(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String auth, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "uid")
    java.lang.String uid);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.PUT(value = "posts/{uid}")
    public abstract retrofit2.Call<com.upco.kloset.model.entity.RedirectionInfo> updatePost(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String auth, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "uid")
    java.lang.String uid, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.upco.kloset.model.entity.Post post);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.DELETE(value = "posts/{uid}")
    public abstract retrofit2.Call<com.upco.kloset.model.entity.RedirectionInfo> deletePost(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String auth, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "uid")
    java.lang.String uid);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "looks")
    public abstract retrofit2.Call<com.upco.kloset.model.entity.RedirectionInfo> createLook(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String auth, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.upco.kloset.model.entity.Look look);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "looks")
    public abstract retrofit2.Call<com.upco.kloset.model.entity.RedirectionInfo> getLooks(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String auth);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "looks/{uid}")
    public abstract retrofit2.Call<com.upco.kloset.model.entity.RedirectionInfo> getLook(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String auth, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "uid")
    java.lang.String uid);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.PUT(value = "looks/{uid}")
    public abstract retrofit2.Call<com.upco.kloset.model.entity.RedirectionInfo> updateLook(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String auth, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "uid")
    java.lang.String uid, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.upco.kloset.model.entity.Look look);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.DELETE(value = "looks/{uid}")
    public abstract retrofit2.Call<com.upco.kloset.model.entity.RedirectionInfo> deleteLook(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String auth, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "uid")
    java.lang.String uid);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "items")
    public abstract retrofit2.Call<com.upco.kloset.model.entity.RedirectionInfo> createItem(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String auth, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.upco.kloset.model.entity.Item item);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "items")
    public abstract retrofit2.Call<com.upco.kloset.model.entity.RedirectionInfo> getItems(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String auth);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "items/{uid}")
    public abstract retrofit2.Call<com.upco.kloset.model.entity.RedirectionInfo> getItem(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String auth, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "uid")
    java.lang.String uid);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.PUT(value = "items/{uid}")
    public abstract retrofit2.Call<com.upco.kloset.model.entity.RedirectionInfo> updateItem(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String auth, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "uid")
    java.lang.String uid, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.upco.kloset.model.entity.Item item);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.DELETE(value = "items/{uid}")
    public abstract retrofit2.Call<com.upco.kloset.model.entity.RedirectionInfo> deleteItem(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String auth, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "uid")
    java.lang.String uid);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "comments")
    public abstract retrofit2.Call<com.upco.kloset.model.entity.RedirectionInfo> createComment(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String auth, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.upco.kloset.model.entity.Comment comment);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "comments")
    public abstract retrofit2.Call<com.upco.kloset.model.entity.RedirectionInfo> getComments(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String auth);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "comments/{uid}")
    public abstract retrofit2.Call<com.upco.kloset.model.entity.RedirectionInfo> getComment(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String auth, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "uid")
    java.lang.String uid);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.PUT(value = "comments/{uid}")
    public abstract retrofit2.Call<com.upco.kloset.model.entity.RedirectionInfo> updateComment(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String auth, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "uid")
    java.lang.String uid, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.upco.kloset.model.entity.Comment comment);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.DELETE(value = "comments/{uid}")
    public abstract retrofit2.Call<com.upco.kloset.model.entity.RedirectionInfo> deleteComment(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String auth, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "uid")
    java.lang.String uid);
}