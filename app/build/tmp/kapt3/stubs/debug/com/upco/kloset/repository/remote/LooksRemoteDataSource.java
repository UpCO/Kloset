package com.upco.kloset.repository.remote;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J \u0010\t\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u0004H\u0016J \u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u0012H\u0016J \u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011H\u0016\u00a8\u0006\u0014"}, d2 = {"Lcom/upco/kloset/repository/remote/LooksRemoteDataSource;", "Lcom/upco/kloset/repository/LooksDataSource;", "()V", "deleteAllLooks", "", "deleteLook", "auth", "", "lookUid", "getLook", "callback", "Lcom/upco/kloset/repository/LooksDataSource$GetLookCallback;", "getLooks", "Lcom/upco/kloset/repository/LooksDataSource$LoadLooksCallback;", "refreshLooks", "saveLook", "look", "Lcom/upco/kloset/model/entity/Look;", "Lcom/upco/kloset/repository/LooksDataSource$SaveLookCallback;", "updateLook", "app_debug"})
public final class LooksRemoteDataSource implements com.upco.kloset.repository.LooksDataSource {
    public static final com.upco.kloset.repository.remote.LooksRemoteDataSource INSTANCE = null;
    
    @java.lang.Override()
    public void getLooks(@org.jetbrains.annotations.NotNull()
    java.lang.String auth, @org.jetbrains.annotations.NotNull()
    com.upco.kloset.repository.LooksDataSource.LoadLooksCallback callback) {
    }
    
    @java.lang.Override()
    public void getLook(@org.jetbrains.annotations.NotNull()
    java.lang.String auth, @org.jetbrains.annotations.NotNull()
    java.lang.String lookUid, @org.jetbrains.annotations.NotNull()
    com.upco.kloset.repository.LooksDataSource.GetLookCallback callback) {
    }
    
    @java.lang.Override()
    public void saveLook(@org.jetbrains.annotations.NotNull()
    java.lang.String auth, @org.jetbrains.annotations.NotNull()
    com.upco.kloset.model.entity.Look look, @org.jetbrains.annotations.NotNull()
    com.upco.kloset.repository.LooksDataSource.SaveLookCallback callback) {
    }
    
    @java.lang.Override()
    public void updateLook(@org.jetbrains.annotations.NotNull()
    java.lang.String auth, @org.jetbrains.annotations.NotNull()
    java.lang.String lookUid, @org.jetbrains.annotations.NotNull()
    com.upco.kloset.model.entity.Look look) {
    }
    
    @java.lang.Override()
    public void refreshLooks() {
    }
    
    @java.lang.Override()
    public void deleteLook(@org.jetbrains.annotations.NotNull()
    java.lang.String auth, @org.jetbrains.annotations.NotNull()
    java.lang.String lookUid) {
    }
    
    @java.lang.Override()
    public void deleteAllLooks() {
    }
    
    private LooksRemoteDataSource() {
        super();
    }
}