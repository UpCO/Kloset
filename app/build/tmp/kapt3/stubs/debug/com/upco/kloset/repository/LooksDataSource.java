package com.upco.kloset.repository;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0002\u0012\u0013J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H&J \u0010\b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH&J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u0003H&J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010H&J \u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010H&\u00a8\u0006\u0014"}, d2 = {"Lcom/upco/kloset/repository/LooksDataSource;", "", "deleteAllLooks", "", "deleteLook", "auth", "", "lookUid", "getLook", "callback", "Lcom/upco/kloset/repository/LooksDataSource$GetLookCallback;", "getLooks", "Lcom/upco/kloset/repository/LooksDataSource$LoadLooksCallback;", "refreshLooks", "saveLook", "look", "Lcom/upco/kloset/model/entity/Look;", "updateLook", "GetLookCallback", "LoadLooksCallback", "app_debug"})
public abstract interface LooksDataSource {
    
    public abstract void getLooks(@org.jetbrains.annotations.NotNull()
    java.lang.String auth, @org.jetbrains.annotations.NotNull()
    com.upco.kloset.repository.LooksDataSource.LoadLooksCallback callback);
    
    public abstract void getLook(@org.jetbrains.annotations.NotNull()
    java.lang.String auth, @org.jetbrains.annotations.NotNull()
    java.lang.String lookUid, @org.jetbrains.annotations.NotNull()
    com.upco.kloset.repository.LooksDataSource.GetLookCallback callback);
    
    public abstract void saveLook(@org.jetbrains.annotations.NotNull()
    java.lang.String auth, @org.jetbrains.annotations.NotNull()
    com.upco.kloset.model.entity.Look look);
    
    public abstract void updateLook(@org.jetbrains.annotations.NotNull()
    java.lang.String auth, @org.jetbrains.annotations.NotNull()
    java.lang.String lookUid, @org.jetbrains.annotations.NotNull()
    com.upco.kloset.model.entity.Look look);
    
    public abstract void refreshLooks();
    
    public abstract void deleteLook(@org.jetbrains.annotations.NotNull()
    java.lang.String auth, @org.jetbrains.annotations.NotNull()
    java.lang.String lookUid);
    
    public abstract void deleteAllLooks();
    
    @kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J \u0010\u0004\u001a\u00020\u00032\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bH&\u00a8\u0006\t"}, d2 = {"Lcom/upco/kloset/repository/LooksDataSource$LoadLooksCallback;", "", "onDataNotAvailable", "", "onLooksLoaded", "looks", "Ljava/util/ArrayList;", "Lcom/upco/kloset/model/entity/Look;", "Lkotlin/collections/ArrayList;", "app_debug"})
    public static abstract interface LoadLooksCallback {
        
        public abstract void onLooksLoaded(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<com.upco.kloset.model.entity.Look> looks);
        
        public abstract void onDataNotAvailable();
    }
    
    @kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lcom/upco/kloset/repository/LooksDataSource$GetLookCallback;", "", "onDataNotAvailable", "", "onLookLoaded", "look", "Lcom/upco/kloset/model/entity/Look;", "app_debug"})
    public static abstract interface GetLookCallback {
        
        public abstract void onLookLoaded(@org.jetbrains.annotations.NotNull()
        com.upco.kloset.model.entity.Look look);
        
        public abstract void onDataNotAvailable();
    }
}