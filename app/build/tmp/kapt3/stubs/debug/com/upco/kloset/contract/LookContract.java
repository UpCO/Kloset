package com.upco.kloset.contract;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/upco/kloset/contract/LookContract;", "Lcom/upco/kloset/contract/BaseContract;", "ModelImpl", "ViewImpl", "app_debug"})
public abstract interface LookContract extends com.upco.kloset.contract.BaseContract {
    
    @kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0005H&J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0003H&\u00a8\u0006\u000b"}, d2 = {"Lcom/upco/kloset/contract/LookContract$ModelImpl;", "", "getSelectedComment", "Lcom/upco/kloset/model/entity/Comment;", "retrieveComments", "", "lookUid", "", "retrieveLook", "setSelectedComment", "comment", "app_debug"})
    public static abstract interface ModelImpl {
        
        public abstract void retrieveLook();
        
        public abstract void retrieveComments(@org.jetbrains.annotations.NotNull()
        java.lang.String lookUid);
        
        @org.jetbrains.annotations.Nullable()
        public abstract com.upco.kloset.model.entity.Comment getSelectedComment();
        
        public abstract void setSelectedComment(@org.jetbrains.annotations.NotNull()
        com.upco.kloset.model.entity.Comment comment);
    }
    
    @kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\b"}, d2 = {"Lcom/upco/kloset/contract/LookContract$ViewImpl;", "Lcom/upco/kloset/contract/BaseContract$ViewImpl;", "updateCommentsRecycler", "", "updateCommentsRecyclerItem", "position", "", "Companion", "app_debug"})
    public static abstract interface ViewImpl extends com.upco.kloset.contract.BaseContract.ViewImpl {
        public static final com.upco.kloset.contract.LookContract.ViewImpl.Companion Companion = null;
        
        public abstract void updateCommentsRecycler();
        
        public abstract void updateCommentsRecyclerItem(int position);
        
        @kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lcom/upco/kloset/contract/LookContract$ViewImpl$Companion;", "", "()V", "COMMENTS_KEY", "", "getCOMMENTS_KEY", "()Ljava/lang/String;", "LOOK_KEY", "getLOOK_KEY", "app_debug"})
        public static final class Companion {
            @org.jetbrains.annotations.NotNull()
            private static final java.lang.String LOOK_KEY = "look";
            @org.jetbrains.annotations.NotNull()
            private static final java.lang.String COMMENTS_KEY = "comments";
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getLOOK_KEY() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getCOMMENTS_KEY() {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
}