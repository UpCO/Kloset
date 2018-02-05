package com.upco.kloset.repository.remote;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\'J,\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\'J2\u0010\u000b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e0\u00032\b\b\u0001\u0010\u000f\u001a\u00020\u00062\b\b\u0001\u0010\u0010\u001a\u00020\u0006H\'J2\u0010\u0011\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e0\u00032\b\b\u0001\u0010\u000f\u001a\u00020\u00062\b\b\u0001\u0010\u0012\u001a\u00020\u0006H\'J\"\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u0006H\'J\u0018\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J,\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\'\u00a8\u0006\u0016"}, d2 = {"Lcom/upco/kloset/repository/remote/Service;", "", "createLook", "Lretrofit2/Call;", "Lcom/upco/kloset/model/entity/RedirectionInfo;", "auth", "", "look", "Lcom/upco/kloset/model/entity/Look;", "deleteLook", "uid", "getAnswers", "Ljava/util/ArrayList;", "Lcom/upco/kloset/model/entity/Comment;", "Lkotlin/collections/ArrayList;", "method", "commentUid", "getComments", "lookUid", "getLook", "getLooks", "updateLook", "app_debug"})
public abstract interface Service {
    
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
    java.lang.String uid, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.upco.kloset.model.entity.Look look);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "ctrl/CtrlComment.php")
    @retrofit2.http.FormUrlEncoded()
    public abstract retrofit2.Call<java.util.ArrayList<com.upco.kloset.model.entity.Comment>> getComments(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "method")
    java.lang.String method, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "lookUid")
    java.lang.String lookUid);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "ctrl/CtrlAnswer.php")
    @retrofit2.http.FormUrlEncoded()
    public abstract retrofit2.Call<java.util.ArrayList<com.upco.kloset.model.entity.Comment>> getAnswers(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "method")
    java.lang.String method, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "commentUid")
    java.lang.String commentUid);
}