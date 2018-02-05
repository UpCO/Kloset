package com.upco.kloset.repository.remote;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u0004H\u0016J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011H\u0016\u00a8\u0006\u0012"}, d2 = {"Lcom/upco/kloset/repository/remote/CommentsRemoteDataSource;", "Lcom/upco/kloset/repository/CommentsDataSource;", "()V", "deleteAllComments", "", "deleteComment", "commentUid", "", "getComment", "callback", "Lcom/upco/kloset/repository/CommentsDataSource$GetCommentCallback;", "getComments", "lookUid", "Lcom/upco/kloset/repository/CommentsDataSource$LoadCommentsCallback;", "refreshComments", "saveComment", "comment", "Lcom/upco/kloset/model/entity/Comment;", "app_debug"})
public final class CommentsRemoteDataSource implements com.upco.kloset.repository.CommentsDataSource {
    public static final com.upco.kloset.repository.remote.CommentsRemoteDataSource INSTANCE = null;
    
    @java.lang.Override()
    public void getComments(@org.jetbrains.annotations.NotNull()
    java.lang.String lookUid, @org.jetbrains.annotations.NotNull()
    com.upco.kloset.repository.CommentsDataSource.LoadCommentsCallback callback) {
    }
    
    @java.lang.Override()
    public void getComment(@org.jetbrains.annotations.NotNull()
    java.lang.String commentUid, @org.jetbrains.annotations.NotNull()
    com.upco.kloset.repository.CommentsDataSource.GetCommentCallback callback) {
    }
    
    @java.lang.Override()
    public void saveComment(@org.jetbrains.annotations.NotNull()
    com.upco.kloset.model.entity.Comment comment) {
    }
    
    @java.lang.Override()
    public void refreshComments() {
    }
    
    @java.lang.Override()
    public void deleteComment(@org.jetbrains.annotations.NotNull()
    java.lang.String commentUid) {
    }
    
    @java.lang.Override()
    public void deleteAllComments() {
    }
    
    private CommentsRemoteDataSource() {
        super();
    }
}