package com.upco.kloset.model;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\n\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lcom/upco/kloset/model/CommentModel;", "Lcom/upco/kloset/contract/CommentContract$ModelImpl;", "presenter", "Lcom/upco/kloset/presenter/CommentPresenter;", "(Lcom/upco/kloset/presenter/CommentPresenter;)V", "getPresenter", "()Lcom/upco/kloset/presenter/CommentPresenter;", "getSelectedComment", "Lcom/upco/kloset/model/entity/Comment;", "retrieveComments", "", "setSelectedComment", "comment", "app_debug"})
public final class CommentModel implements com.upco.kloset.contract.CommentContract.ModelImpl {
    @org.jetbrains.annotations.NotNull()
    private final com.upco.kloset.presenter.CommentPresenter presenter = null;
    
    @java.lang.Override()
    public void retrieveComments() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.upco.kloset.model.entity.Comment getSelectedComment() {
        return null;
    }
    
    @java.lang.Override()
    public void setSelectedComment(@org.jetbrains.annotations.NotNull()
    com.upco.kloset.model.entity.Comment comment) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.upco.kloset.presenter.CommentPresenter getPresenter() {
        return null;
    }
    
    public CommentModel(@org.jetbrains.annotations.NotNull()
    com.upco.kloset.presenter.CommentPresenter presenter) {
        super();
    }
}