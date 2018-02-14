package com.upco.kloset.presenter;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u0002H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\"\u0010\u0014\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t0\u0005J\u0016\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\u0007j\b\u0012\u0004\u0012\u00020\u000b`\tJ\b\u0010\u0016\u001a\u0004\u0018\u00010\bJ\b\u0010\u0017\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\u0018\u001a\u00020\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ\u0010\u0010\u001b\u001a\u00020\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ\u000e\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\bJ\u000e\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u000bJ\u0010\u0010 \u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u0006H\u0016J&\u0010\"\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u00062\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tJ\u000e\u0010$\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u000bJ\u001e\u0010%\u001a\u00020\u00102\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\u0007j\b\u0012\u0004\u0012\u00020\u000b`\tR*\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t0\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\u0007j\b\u0012\u0004\u0012\u00020\u000b`\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0002X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lcom/upco/kloset/presenter/ClosetPresenter;", "Lcom/upco/kloset/contract/BaseContract$PresenterImpl;", "Lcom/upco/kloset/contract/ClosetContract$ViewImpl;", "()V", "items", "", "", "Ljava/util/ArrayList;", "Lcom/upco/kloset/model/entity/Item;", "Lkotlin/collections/ArrayList;", "looks", "Lcom/upco/kloset/model/entity/Look;", "model", "Lcom/upco/kloset/contract/ClosetContract$ModelImpl;", "view", "attachView", "", "detachView", "getContext", "Landroid/content/Context;", "getItems", "getLooks", "getSelectedItem", "getSelectedLook", "retrieveItems", "savedInstanceState", "Landroid/os/Bundle;", "retrieveLooks", "setSelectedItem", "item", "setSelectedLook", "look", "showToast", "msg", "updateItems", "lookUid", "updateLook", "updateLooks", "app_debug"})
public final class ClosetPresenter implements com.upco.kloset.contract.BaseContract.PresenterImpl<com.upco.kloset.contract.ClosetContract.ViewImpl> {
    private final java.util.ArrayList<com.upco.kloset.model.entity.Look> looks = null;
    private final java.util.Map<java.lang.String, java.util.ArrayList<com.upco.kloset.model.entity.Item>> items = null;
    private final com.upco.kloset.contract.ClosetContract.ModelImpl model = null;
    private com.upco.kloset.contract.ClosetContract.ViewImpl view;
    
    @java.lang.Override()
    public void attachView(@org.jetbrains.annotations.NotNull()
    com.upco.kloset.contract.ClosetContract.ViewImpl view) {
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
    
    public final void retrieveLooks(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void retrieveItems(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.upco.kloset.model.entity.Look> getLooks() {
        return null;
    }
    
    public final void updateLooks(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.upco.kloset.model.entity.Look> looks) {
    }
    
    public final void updateLook(@org.jetbrains.annotations.NotNull()
    com.upco.kloset.model.entity.Look look) {
    }
    
    public final void updateItems(@org.jetbrains.annotations.NotNull()
    java.lang.String lookUid, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.upco.kloset.model.entity.Item> items) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.util.ArrayList<com.upco.kloset.model.entity.Item>> getItems() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.upco.kloset.model.entity.Look getSelectedLook() {
        return null;
    }
    
    public final void setSelectedLook(@org.jetbrains.annotations.NotNull()
    com.upco.kloset.model.entity.Look look) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.upco.kloset.model.entity.Item getSelectedItem() {
        return null;
    }
    
    public final void setSelectedItem(@org.jetbrains.annotations.NotNull()
    com.upco.kloset.model.entity.Item item) {
    }
    
    public ClosetPresenter() {
        super();
    }
}