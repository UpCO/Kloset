package com.upco.kloset.view.fragment;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J&\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0017\u001a\u00020\u000eH\u0016J\u0010\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u0010H\u0016J\b\u0010\u001d\u001a\u00020\u000eH\u0016J\b\u0010\u001e\u001a\u00020\u000eH\u0002J\b\u0010\u001f\u001a\u00020\u000eH\u0002J\u0010\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020\u000eH\u0016J\u0010\u0010$\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020&H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/upco/kloset/view/fragment/ClosetFragment;", "Landroid/support/v4/app/Fragment;", "Lcom/upco/kloset/contract/ClosetContract$ViewImpl;", "Lcom/upco/kloset/listener/OnLookSelectedListener;", "()V", "lookGridAdapter", "Lcom/upco/kloset/view/adapter/LookGridRecyclerAdapter;", "peekAndPop", "Lcom/peekandpop/shalskar/peekandpop/PeekAndPop;", "presenter", "Lcom/upco/kloset/presenter/ClosetPresenter;", "getCtx", "Landroid/content/Context;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onLookSelected", "look", "Lcom/upco/kloset/model/entity/Look;", "onSaveInstanceState", "outState", "onStart", "setupGridRecycler", "setupPeekAndPop", "showToast", "msg", "", "updateLooksRecycler", "updateLooksRecyclerItem", "position", "", "app_debug"})
public final class ClosetFragment extends android.support.v4.app.Fragment implements com.upco.kloset.contract.ClosetContract.ViewImpl, com.upco.kloset.listener.OnLookSelectedListener {
    private com.upco.kloset.view.adapter.LookGridRecyclerAdapter lookGridAdapter;
    private com.peekandpop.shalskar.peekandpop.PeekAndPop peekAndPop;
    private final com.upco.kloset.presenter.ClosetPresenter presenter = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @java.lang.Override()
    public void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    @java.lang.Override()
    public void onLookSelected(@org.jetbrains.annotations.NotNull()
    com.upco.kloset.model.entity.Look look) {
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
    public void updateLooksRecycler() {
    }
    
    @java.lang.Override()
    public void updateLooksRecyclerItem(int position) {
    }
    
    private final void setupGridRecycler() {
    }
    
    private final void setupPeekAndPop() {
    }
    
    public ClosetFragment() {
        super();
    }
}