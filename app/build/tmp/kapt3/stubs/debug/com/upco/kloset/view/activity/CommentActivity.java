package com.upco.kloset.view.activity;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0012\u0010\u0010\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\b\u0010\u0013\u001a\u00020\fH\u0014J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0012\u0010\u0018\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0012H\u0014J\b\u0010\u001a\u001a\u00020\fH\u0014J\b\u0010\u001b\u001a\u00020\fH\u0002J \u0010\u001c\u001a\u00020\f2\u0016\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u001ej\b\u0012\u0004\u0012\u00020\u000f`\u001fH\u0002J\u0010\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020\fH\u0016J\u0010\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020&H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/upco/kloset/view/activity/CommentActivity;", "Landroid/support/v7/app/AppCompatActivity;", "Lcom/upco/kloset/contract/CommentContract$ViewImpl;", "Lcom/upco/kloset/listener/OnCommentSelectedListener;", "()V", "commentsAdapter", "Lcom/upco/kloset/view/adapter/CommentRecyclerAdapter;", "presenter", "Lcom/upco/kloset/presenter/CommentPresenter;", "getCtx", "Landroid/content/Context;", "onBackPressed", "", "onCommentSelected", "comment", "Lcom/upco/kloset/model/entity/Comment;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "onSaveInstanceState", "outState", "onStart", "setupToolbar", "setupUI", "comments", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "showToast", "msg", "", "updateCommentsRecycler", "updateCommentsRecyclerItem", "position", "", "app_debug"})
public final class CommentActivity extends android.support.v7.app.AppCompatActivity implements com.upco.kloset.contract.CommentContract.ViewImpl, com.upco.kloset.listener.OnCommentSelectedListener {
    private com.upco.kloset.view.adapter.CommentRecyclerAdapter commentsAdapter;
    private final com.upco.kloset.presenter.CommentPresenter presenter = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @java.lang.Override()
    protected void onSaveInstanceState(@org.jetbrains.annotations.Nullable()
    android.os.Bundle outState) {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.Nullable()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public void onCommentSelected(@org.jetbrains.annotations.NotNull()
    com.upco.kloset.model.entity.Comment comment) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.content.Context getCtx() {
        return null;
    }
    
    @java.lang.Override()
    public void showToast(@org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    @java.lang.Override()
    public void updateCommentsRecycler() {
    }
    
    @java.lang.Override()
    public void updateCommentsRecyclerItem(int position) {
    }
    
    private final void setupToolbar() {
    }
    
    private final void setupUI(java.util.ArrayList<com.upco.kloset.model.entity.Comment> comments) {
    }
    
    public CommentActivity() {
        super();
    }
}