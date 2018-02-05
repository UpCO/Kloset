package com.upco.kloset.listener;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/upco/kloset/listener/OnCommentSelectedListener;", "", "onCommentSelected", "", "comment", "Lcom/upco/kloset/model/entity/Comment;", "app_debug"})
public abstract interface OnCommentSelectedListener {
    
    public abstract void onCommentSelected(@org.jetbrains.annotations.NotNull()
    com.upco.kloset.model.entity.Comment comment);
}