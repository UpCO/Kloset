package com.upco.kloset.repository;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0007H\u0016J \u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0016\u001a\u00020\u0007H\u0002J\u0018\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0007H\u0002J\u0018\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u001cH\u0002J \u0010\u001e\u001a\u00020\u00132\u0016\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\b0 j\b\u0012\u0004\u0012\u00020\b`!H\u0002J(\u0010\"\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00072\u0016\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\b0 j\b\u0012\u0004\u0012\u00020\b`!H\u0002J\b\u0010#\u001a\u00020\u0013H\u0016J\u0018\u0010$\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006&"}, d2 = {"Lcom/upco/kloset/repository/LooksRepository;", "Lcom/upco/kloset/repository/LooksDataSource;", "()V", "cacheIsDirty", "", "cachedLooks", "", "", "Lcom/upco/kloset/model/entity/Look;", "looksLocalDataSource", "Lcom/upco/kloset/repository/local/LooksLocalDataSource;", "looksRemoteDataSource", "Lcom/upco/kloset/repository/remote/LooksRemoteDataSource;", "selectedLook", "getSelectedLook", "()Lcom/upco/kloset/model/entity/Look;", "setSelectedLook", "(Lcom/upco/kloset/model/entity/Look;)V", "deleteAllLooks", "", "deleteLook", "auth", "lookUid", "getLook", "callback", "Lcom/upco/kloset/repository/LooksDataSource$GetLookCallback;", "getLookWithUid", "getLooks", "Lcom/upco/kloset/repository/LooksDataSource$LoadLooksCallback;", "getLooksFromRemoteDataSource", "refreshCache", "looks", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "refreshLocalDataSource", "refreshLooks", "saveLook", "look", "app_debug"})
public final class LooksRepository implements com.upco.kloset.repository.LooksDataSource {
    @org.jetbrains.annotations.Nullable()
    private static com.upco.kloset.model.entity.Look selectedLook;
    private static java.util.Map<java.lang.String, com.upco.kloset.model.entity.Look> cachedLooks;
    private static boolean cacheIsDirty;
    private static final com.upco.kloset.repository.remote.LooksRemoteDataSource looksRemoteDataSource = null;
    private static final com.upco.kloset.repository.local.LooksLocalDataSource looksLocalDataSource = null;
    public static final com.upco.kloset.repository.LooksRepository INSTANCE = null;
    
    @org.jetbrains.annotations.Nullable()
    public final com.upco.kloset.model.entity.Look getSelectedLook() {
        return null;
    }
    
    public final void setSelectedLook(@org.jetbrains.annotations.Nullable()
    com.upco.kloset.model.entity.Look p0) {
    }
    
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
    
    private final void getLooksFromRemoteDataSource(java.lang.String auth) {
    }
    
    private final void getLooksFromRemoteDataSource(java.lang.String auth, com.upco.kloset.repository.LooksDataSource.LoadLooksCallback callback) {
    }
    
    private final void refreshCache(java.util.ArrayList<com.upco.kloset.model.entity.Look> looks) {
    }
    
    private final void refreshLocalDataSource(java.lang.String auth, java.util.ArrayList<com.upco.kloset.model.entity.Look> looks) {
    }
    
    private final com.upco.kloset.model.entity.Look getLookWithUid(java.lang.String lookUid) {
        return null;
    }
    
    private LooksRepository() {
        super();
    }
}