package com.upco.kloset.presenter;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u0002H\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0006\u0010\u0013\u001a\u00020\tJ\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0015\u001a\u00020\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\u0010\u0010\u0018\u001a\u00020\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\u000e\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0006J\u0010\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u000e\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0006J\u001e\u0010\u001f\u001a\u00020\u000e2\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007J\u000e\u0010 \u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\tR\u001e\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u0002X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/upco/kloset/presenter/LookPresenter;", "Lcom/upco/kloset/contract/BaseContract$PresenterImpl;", "Lcom/upco/kloset/contract/LookContract$ViewImpl;", "()V", "comments", "Ljava/util/ArrayList;", "Lcom/upco/kloset/model/entity/Comment;", "Lkotlin/collections/ArrayList;", "look", "Lcom/upco/kloset/model/entity/Look;", "model", "Lcom/upco/kloset/contract/LookContract$ModelImpl;", "view", "attachView", "", "detachView", "getComments", "getContext", "Landroid/content/Context;", "getLook", "getSelectedComment", "retrieveComments", "savedInstanceState", "Landroid/os/Bundle;", "retrieveLook", "setSelectedComment", "comment", "showToast", "msg", "", "updateComment", "updateComments", "updateLook", "app_debug"})
public final class LookPresenter implements com.upco.kloset.contract.BaseContract.PresenterImpl<com.upco.kloset.contract.LookContract.ViewImpl> {
    private com.upco.kloset.model.entity.Look look;
    private final java.util.ArrayList<com.upco.kloset.model.entity.Comment> comments = null;
    private final com.upco.kloset.contract.LookContract.ModelImpl model = null;
    private com.upco.kloset.contract.LookContract.ViewImpl view;
    
    @java.lang.Override()
    public void attachView(@org.jetbrains.annotations.NotNull()
    com.upco.kloset.contract.LookContract.ViewImpl view) {
    }
    
    @java.lang.Override()
    public void detachView() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.content.Context getContext() {
        return null;
    }
    
    @java.lang.Override()
    public void showToast(@org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    public final void retrieveLook(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void retrieveComments(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void updateLook(@org.jetbrains.annotations.NotNull()
    com.upco.kloset.model.entity.Look look) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.upco.kloset.model.entity.Look getLook() {
        return null;
    }
    
    public final void updateComments(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.upco.kloset.model.entity.Comment> comments) {
    }
    
    public final void updateComment(@org.jetbrains.annotations.NotNull()
    com.upco.kloset.model.entity.Comment comment) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.upco.kloset.model.entity.Comment> getComments() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.upco.kloset.model.entity.Comment getSelectedComment() {
        return null;
    }
    
    public final void setSelectedComment(@org.jetbrains.annotations.NotNull()
    com.upco.kloset.model.entity.Comment comment) {
    }
    
    public LookPresenter() {
        super();
    }
}