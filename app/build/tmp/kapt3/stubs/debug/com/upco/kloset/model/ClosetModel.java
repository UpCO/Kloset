package com.upco.kloset.model;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\n\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\fH\u0016J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\bH\u0016J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\nH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0014"}, d2 = {"Lcom/upco/kloset/model/ClosetModel;", "Lcom/upco/kloset/contract/ClosetContract$ModelImpl;", "presenter", "Lcom/upco/kloset/presenter/ClosetPresenter;", "(Lcom/upco/kloset/presenter/ClosetPresenter;)V", "getPresenter", "()Lcom/upco/kloset/presenter/ClosetPresenter;", "getSelectedItem", "Lcom/upco/kloset/model/entity/Item;", "getSelectedLook", "Lcom/upco/kloset/model/entity/Look;", "retrieveItems", "", "lookUid", "", "retrieveLooks", "setSelectedItem", "item", "setSelectedLook", "look", "app_debug"})
public final class ClosetModel implements com.upco.kloset.contract.ClosetContract.ModelImpl {
    @org.jetbrains.annotations.NotNull()
    private final com.upco.kloset.presenter.ClosetPresenter presenter = null;
    
    @java.lang.Override()
    public void retrieveLooks() {
    }
    
    @java.lang.Override()
    public void retrieveItems(@org.jetbrains.annotations.NotNull()
    java.lang.String lookUid) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.upco.kloset.model.entity.Look getSelectedLook() {
        return null;
    }
    
    @java.lang.Override()
    public void setSelectedLook(@org.jetbrains.annotations.NotNull()
    com.upco.kloset.model.entity.Look look) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.upco.kloset.model.entity.Item getSelectedItem() {
        return null;
    }
    
    @java.lang.Override()
    public void setSelectedItem(@org.jetbrains.annotations.NotNull()
    com.upco.kloset.model.entity.Item item) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.upco.kloset.presenter.ClosetPresenter getPresenter() {
        return null;
    }
    
    public ClosetModel(@org.jetbrains.annotations.NotNull()
    com.upco.kloset.presenter.ClosetPresenter presenter) {
        super();
    }
}