package com.upco.kloset.contract;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/upco/kloset/contract/BaseContract;", "", "ModelImpl", "PresenterImpl", "ViewImpl", "app_debug"})
public abstract interface BaseContract {
    
    @kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"}, d2 = {"Lcom/upco/kloset/contract/BaseContract$ModelImpl;", "", "app_debug"})
    public static abstract interface ModelImpl {
    }
    
    @kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u0000*\n\b\u0000\u0010\u0001 \u0000*\u00020\u00022\u00020\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\u0005H&J\b\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH&\u00a8\u0006\u000e"}, d2 = {"Lcom/upco/kloset/contract/BaseContract$PresenterImpl;", "T", "Lcom/upco/kloset/contract/BaseContract$ViewImpl;", "", "attachView", "", "view", "(Lcom/upco/kloset/contract/BaseContract$ViewImpl;)V", "detachView", "getContext", "Landroid/content/Context;", "showToast", "msg", "", "app_debug"})
    public static abstract interface PresenterImpl<T extends com.upco.kloset.contract.BaseContract.ViewImpl> {
        
        @org.jetbrains.annotations.NotNull()
        public abstract android.content.Context getContext();
        
        public abstract void showToast(@org.jetbrains.annotations.NotNull()
        java.lang.String msg);
        
        public abstract void attachView(@org.jetbrains.annotations.NotNull()
        T view);
        
        public abstract void detachView();
    }
    
    @kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/upco/kloset/contract/BaseContract$ViewImpl;", "", "getCtx", "Landroid/content/Context;", "showToast", "", "msg", "", "app_debug"})
    public static abstract interface ViewImpl {
        
        @org.jetbrains.annotations.NotNull()
        public abstract android.content.Context getCtx();
        
        public abstract void showToast(@org.jetbrains.annotations.NotNull()
        java.lang.String msg);
    }
}