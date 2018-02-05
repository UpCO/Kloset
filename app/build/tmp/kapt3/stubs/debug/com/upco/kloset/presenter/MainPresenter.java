package com.upco.kloset.presenter;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0002X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/upco/kloset/presenter/MainPresenter;", "Lcom/upco/kloset/contract/BaseContract$PresenterImpl;", "Lcom/upco/kloset/contract/MainContract$ViewImpl;", "()V", "model", "Lcom/upco/kloset/contract/MainContract$ModelImpl;", "view", "attachView", "", "detachView", "getContext", "Landroid/content/Context;", "showToast", "msg", "", "app_debug"})
public final class MainPresenter implements com.upco.kloset.contract.BaseContract.PresenterImpl<com.upco.kloset.contract.MainContract.ViewImpl> {
    private final com.upco.kloset.contract.MainContract.ModelImpl model = null;
    private com.upco.kloset.contract.MainContract.ViewImpl view;
    
    @java.lang.Override()
    public void attachView(@org.jetbrains.annotations.NotNull()
    com.upco.kloset.contract.MainContract.ViewImpl view) {
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
    
    public MainPresenter() {
        super();
    }
}