package com.upco.kloset.contract;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/upco/kloset/contract/AnswerContract;", "Lcom/upco/kloset/contract/BaseContract;", "ModelImpl", "ViewImpl", "app_debug"})
public abstract interface AnswerContract extends com.upco.kloset.contract.BaseContract {
    
    @kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/upco/kloset/contract/AnswerContract$ModelImpl;", "", "retrieveAnswers", "", "app_debug"})
    public static abstract interface ModelImpl {
        
        public abstract void retrieveAnswers();
    }
    
    @kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\b"}, d2 = {"Lcom/upco/kloset/contract/AnswerContract$ViewImpl;", "Lcom/upco/kloset/contract/BaseContract$ViewImpl;", "updateAnswersRecycler", "", "updateAnswersRecyclerItem", "position", "", "Companion", "app_debug"})
    public static abstract interface ViewImpl extends com.upco.kloset.contract.BaseContract.ViewImpl {
        public static final com.upco.kloset.contract.AnswerContract.ViewImpl.Companion Companion = null;
        
        public abstract void updateAnswersRecycler();
        
        public abstract void updateAnswersRecyclerItem(int position);
        
        @kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/upco/kloset/contract/AnswerContract$ViewImpl$Companion;", "", "()V", "ANSWERS_KEY", "", "getANSWERS_KEY", "()Ljava/lang/String;", "app_debug"})
        public static final class Companion {
            @org.jetbrains.annotations.NotNull()
            private static final java.lang.String ANSWERS_KEY = "answers";
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getANSWERS_KEY() {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
}