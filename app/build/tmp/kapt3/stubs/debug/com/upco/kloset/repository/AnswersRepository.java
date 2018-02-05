package com.upco.kloset.repository;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000bH\u0016J\u0018\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0011\u001a\u00020\u000bH\u0002J\u0018\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000bH\u0002J\u0018\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0018H\u0002J\b\u0010\u001a\u001a\u00020\u000fH\u0016J \u0010\u001b\u001a\u00020\u000f2\u0016\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\f0\u001dj\b\u0012\u0004\u0012\u00020\f`\u001eH\u0002J \u0010\u001f\u001a\u00020\u000f2\u0016\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\f0\u001dj\b\u0012\u0004\u0012\u00020\f`\u001eH\u0002J\u0010\u0010 \u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/upco/kloset/repository/AnswersRepository;", "Lcom/upco/kloset/repository/AnswersDataSource;", "()V", "answersLocalDataSource", "Lcom/upco/kloset/repository/local/AnswersLocalDataSource;", "answersRemoteDataSource", "Lcom/upco/kloset/repository/remote/AnswersRemoteDataSource;", "cacheIsDirty", "", "cachedAnswers", "", "", "Lcom/upco/kloset/model/entity/Comment;", "cachedCommentUid", "deleteAllAnswers", "", "deleteAnswer", "answerUid", "getAnswer", "callback", "Lcom/upco/kloset/repository/AnswersDataSource$GetAnswerCallback;", "getAnswerWithUid", "getAnswers", "commentUid", "Lcom/upco/kloset/repository/AnswersDataSource$LoadAnswersCallback;", "getAnswersFromRemoteDataSource", "refreshAnswers", "refreshCache", "answers", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "refreshLocalDataSource", "saveAnswer", "answer", "app_debug"})
public final class AnswersRepository implements com.upco.kloset.repository.AnswersDataSource {
    private static final com.upco.kloset.repository.remote.AnswersRemoteDataSource answersRemoteDataSource = null;
    private static final com.upco.kloset.repository.local.AnswersLocalDataSource answersLocalDataSource = null;
    private static java.util.Map<java.lang.String, com.upco.kloset.model.entity.Comment> cachedAnswers;
    private static boolean cacheIsDirty;
    private static java.lang.String cachedCommentUid;
    public static final com.upco.kloset.repository.AnswersRepository INSTANCE = null;
    
    @java.lang.Override()
    public void getAnswers(@org.jetbrains.annotations.NotNull()
    java.lang.String commentUid, @org.jetbrains.annotations.NotNull()
    com.upco.kloset.repository.AnswersDataSource.LoadAnswersCallback callback) {
    }
    
    @java.lang.Override()
    public void getAnswer(@org.jetbrains.annotations.NotNull()
    java.lang.String answerUid, @org.jetbrains.annotations.NotNull()
    com.upco.kloset.repository.AnswersDataSource.GetAnswerCallback callback) {
    }
    
    @java.lang.Override()
    public void saveAnswer(@org.jetbrains.annotations.NotNull()
    com.upco.kloset.model.entity.Comment answer) {
    }
    
    @java.lang.Override()
    public void refreshAnswers() {
    }
    
    @java.lang.Override()
    public void deleteAnswer(@org.jetbrains.annotations.NotNull()
    java.lang.String answerUid) {
    }
    
    @java.lang.Override()
    public void deleteAllAnswers() {
    }
    
    private final void getAnswersFromRemoteDataSource(java.lang.String commentUid) {
    }
    
    private final void getAnswersFromRemoteDataSource(java.lang.String commentUid, com.upco.kloset.repository.AnswersDataSource.LoadAnswersCallback callback) {
    }
    
    private final void refreshCache(java.util.ArrayList<com.upco.kloset.model.entity.Comment> answers) {
    }
    
    private final void refreshLocalDataSource(java.util.ArrayList<com.upco.kloset.model.entity.Comment> answers) {
    }
    
    private final com.upco.kloset.model.entity.Comment getAnswerWithUid(java.lang.String answerUid) {
        return null;
    }
    
    private AnswersRepository() {
        super();
    }
}