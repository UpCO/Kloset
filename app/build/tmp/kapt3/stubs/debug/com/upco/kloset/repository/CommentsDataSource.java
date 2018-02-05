package com.upco.kloset.repository;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0011\u0012J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH&J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u0003H&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H&\u00a8\u0006\u0013"}, d2 = {"Lcom/upco/kloset/repository/CommentsDataSource;", "", "deleteAllComments", "", "deleteComment", "commentUid", "", "getComment", "callback", "Lcom/upco/kloset/repository/CommentsDataSource$GetCommentCallback;", "getComments", "lookUid", "Lcom/upco/kloset/repository/CommentsDataSource$LoadCommentsCallback;", "refreshComments", "saveComment", "comment", "Lcom/upco/kloset/model/entity/Comment;", "GetCommentCallback", "LoadCommentsCallback", "app_debug"})
public abstract interface CommentsDataSource {
    
    public abstract void getComments(@org.jetbrains.annotations.NotNull()
    java.lang.String lookUid, @org.jetbrains.annotations.NotNull()
    com.upco.kloset.repository.CommentsDataSource.LoadCommentsCallback callback);
    
    public abstract void getComment(@org.jetbrains.annotations.NotNull()
    java.lang.String commentUid, @org.jetbrains.annotations.NotNull()
    com.upco.kloset.repository.CommentsDataSource.GetCommentCallback callback);
    
    public abstract void saveComment(@org.jetbrains.annotations.NotNull()
    com.upco.kloset.model.entity.Comment comment);
    
    public abstract void refreshComments();
    
    public abstract void deleteComment(@org.jetbrains.annotations.NotNull()
    java.lang.String commentUid);
    
    public abstract void deleteAllComments();
    
    @kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007H&J\b\u0010\b\u001a\u00020\u0003H&\u00a8\u0006\t"}, d2 = {"Lcom/upco/kloset/repository/CommentsDataSource$LoadCommentsCallback;", "", "onCommentsLoaded", "", "comments", "Ljava/util/ArrayList;", "Lcom/upco/kloset/model/entity/Comment;", "Lkotlin/collections/ArrayList;", "onDataNotAvailable", "app_debug"})
    public static abstract interface LoadCommentsCallback {
        
        public abstract void onCommentsLoaded(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<com.upco.kloset.model.entity.Comment> comments);
        
        public abstract void onDataNotAvailable();
    }
    
    @kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&\u00a8\u0006\u0007"}, d2 = {"Lcom/upco/kloset/repository/CommentsDataSource$GetCommentCallback;", "", "onCommentLoaded", "", "comment", "Lcom/upco/kloset/model/entity/Comment;", "onDataNotAvailable", "app_debug"})
    public static abstract interface GetCommentCallback {
        
        public abstract void onCommentLoaded(@org.jetbrains.annotations.NotNull()
        com.upco.kloset.model.entity.Comment comment);
        
        public abstract void onDataNotAvailable();
    }
}