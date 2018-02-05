package com.upco.kloset.view.activity;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\b\u0010\u000f\u001a\u00020\u000bH\u0014J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0012\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000eH\u0014J\b\u0010\u0016\u001a\u00020\u000bH\u0014J\b\u0010\u0017\u001a\u00020\u000bH\u0002J \u0010\u0018\u001a\u00020\u000b2\u0016\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u001b0\u001aj\b\u0012\u0004\u0012\u00020\u001b`\u001cH\u0002J\u0010\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u000bH\u0016J\u0010\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020#H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/upco/kloset/view/activity/AnswerActivity;", "Landroid/support/v7/app/AppCompatActivity;", "Lcom/upco/kloset/contract/AnswerContract$ViewImpl;", "()V", "answersAdapter", "Lcom/upco/kloset/view/adapter/AnswerRecyclerAdapter;", "presenter", "Lcom/upco/kloset/presenter/AnswerPresenter;", "getCtx", "Landroid/content/Context;", "onBackPressed", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "onSaveInstanceState", "outState", "onStart", "setupToolbar", "setupUI", "answers", "Ljava/util/ArrayList;", "Lcom/upco/kloset/model/entity/Comment;", "Lkotlin/collections/ArrayList;", "showToast", "msg", "", "updateAnswersRecycler", "updateAnswersRecyclerItem", "position", "", "app_debug"})
public final class AnswerActivity extends android.support.v7.app.AppCompatActivity implements com.upco.kloset.contract.AnswerContract.ViewImpl {
    private com.upco.kloset.view.adapter.AnswerRecyclerAdapter answersAdapter;
    private final com.upco.kloset.presenter.AnswerPresenter presenter = null;
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
    public void updateAnswersRecycler() {
    }
    
    @java.lang.Override()
    public void updateAnswersRecyclerItem(int position) {
    }
    
    private final void setupToolbar() {
    }
    
    private final void setupUI(java.util.ArrayList<com.upco.kloset.model.entity.Comment> answers) {
    }
    
    public AnswerActivity() {
        super();
    }
}