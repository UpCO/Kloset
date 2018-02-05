package com.upco.kloset.repository;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0007H\u0016J\u0018\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0016\u001a\u00020\u0007H\u0002J\u0018\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u0007H\u0002J\u0018\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u001dH\u0002J \u0010\u001f\u001a\u00020\u00142\u0016\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\b0!j\b\u0012\u0004\u0012\u00020\b`\"H\u0002J\b\u0010#\u001a\u00020\u0014H\u0016J \u0010$\u001a\u00020\u00142\u0016\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\b0!j\b\u0012\u0004\u0012\u00020\b`\"H\u0002J\u0010\u0010%\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\'"}, d2 = {"Lcom/upco/kloset/repository/CommentsRepository;", "Lcom/upco/kloset/repository/CommentsDataSource;", "()V", "cacheIsDirty", "", "cachedComments", "", "", "Lcom/upco/kloset/model/entity/Comment;", "cachedLookUid", "commentsLocalDataSource", "Lcom/upco/kloset/repository/local/CommentsLocalDataSource;", "commentsRemoteDataSource", "Lcom/upco/kloset/repository/remote/CommentsRemoteDataSource;", "selectedComment", "getSelectedComment", "()Lcom/upco/kloset/model/entity/Comment;", "setSelectedComment", "(Lcom/upco/kloset/model/entity/Comment;)V", "deleteAllComments", "", "deleteComment", "commentUid", "getComment", "callback", "Lcom/upco/kloset/repository/CommentsDataSource$GetCommentCallback;", "getCommentWithUid", "getComments", "lookUid", "Lcom/upco/kloset/repository/CommentsDataSource$LoadCommentsCallback;", "getCommentsFromRemoteDataSource", "refreshCache", "comments", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "refreshComments", "refreshLocalDataSource", "saveComment", "comment", "app_debug"})
public final class CommentsRepository implements com.upco.kloset.repository.CommentsDataSource {
    @org.jetbrains.annotations.Nullable()
    private static com.upco.kloset.model.entity.Comment selectedComment;
    private static java.util.Map<java.lang.String, com.upco.kloset.model.entity.Comment> cachedComments;
    private static boolean cacheIsDirty;
    private static java.lang.String cachedLookUid;
    private static final com.upco.kloset.repository.remote.CommentsRemoteDataSource commentsRemoteDataSource = null;
    private static final com.upco.kloset.repository.local.CommentsLocalDataSource commentsLocalDataSource = null;
    public static final com.upco.kloset.repository.CommentsRepository INSTANCE = null;
    
    @org.jetbrains.annotations.Nullable()
    public final com.upco.kloset.model.entity.Comment getSelectedComment() {
        return null;
    }
    
    public final void setSelectedComment(@org.jetbrains.annotations.Nullable()
    com.upco.kloset.model.entity.Comment p0) {
    }
    
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
    
    private final void getCommentsFromRemoteDataSource(java.lang.String lookUid) {
    }
    
    private final void getCommentsFromRemoteDataSource(java.lang.String lookUid, com.upco.kloset.repository.CommentsDataSource.LoadCommentsCallback callback) {
    }
    
    private final void refreshCache(java.util.ArrayList<com.upco.kloset.model.entity.Comment> comments) {
    }
    
    private final void refreshLocalDataSource(java.util.ArrayList<com.upco.kloset.model.entity.Comment> comments) {
    }
    
    private final com.upco.kloset.model.entity.Comment getCommentWithUid(java.lang.String commentUid) {
        return null;
    }
    
    private CommentsRepository() {
        super();
    }
}