package com.upco.kloset.view.adapter;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0018B%\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u001e\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0018\u00010\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\u001e\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u000fH\u0016R!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0019"}, d2 = {"Lcom/upco/kloset/view/adapter/AnswerRecyclerAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/upco/kloset/view/adapter/AnswerRecyclerAdapter$ViewHolder;", "answers", "Ljava/util/ArrayList;", "Lcom/upco/kloset/model/entity/Comment;", "Lkotlin/collections/ArrayList;", "context", "Landroid/content/Context;", "(Ljava/util/ArrayList;Landroid/content/Context;)V", "getAnswers", "()Ljava/util/ArrayList;", "getContext", "()Landroid/content/Context;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class AnswerRecyclerAdapter extends android.support.v7.widget.RecyclerView.Adapter<com.upco.kloset.view.adapter.AnswerRecyclerAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.upco.kloset.model.entity.Comment> answers = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.upco.kloset.view.adapter.AnswerRecyclerAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.Nullable()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.Nullable()
    com.upco.kloset.view.adapter.AnswerRecyclerAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.upco.kloset.model.entity.Comment> getAnswers() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public AnswerRecyclerAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.upco.kloset.model.entity.Comment> answers, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\u000e\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001fR\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0015\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\n\u001a\u0004\b\u0016\u0010\u0013R\u001b\u0010\u0018\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001a\u0010\n\u001a\u0004\b\u0019\u0010\u0013\u00a8\u0006 "}, d2 = {"Lcom/upco/kloset/view/adapter/AnswerRecyclerAdapter$ViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/upco/kloset/view/adapter/AnswerRecyclerAdapter;Landroid/view/View;)V", "btn_answer", "Landroid/widget/Button;", "getBtn_answer", "()Landroid/widget/Button;", "btn_answer$delegate", "Lkotlin/Lazy;", "iv_userphoto", "Landroid/widget/ImageView;", "getIv_userphoto", "()Landroid/widget/ImageView;", "iv_userphoto$delegate", "tv_content", "Landroid/widget/TextView;", "getTv_content", "()Landroid/widget/TextView;", "tv_content$delegate", "tv_timestamp", "getTv_timestamp", "tv_timestamp$delegate", "tv_username", "getTv_username", "tv_username$delegate", "gotoAnswer", "", "setupUI", "answer", "Lcom/upco/kloset/model/entity/Comment;", "app_debug"})
    public final class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        private final kotlin.Lazy iv_userphoto$delegate = null;
        private final kotlin.Lazy tv_username$delegate = null;
        private final kotlin.Lazy tv_content$delegate = null;
        private final kotlin.Lazy tv_timestamp$delegate = null;
        private final kotlin.Lazy btn_answer$delegate = null;
        
        private final android.widget.ImageView getIv_userphoto() {
            return null;
        }
        
        private final android.widget.TextView getTv_username() {
            return null;
        }
        
        private final android.widget.TextView getTv_content() {
            return null;
        }
        
        private final android.widget.TextView getTv_timestamp() {
            return null;
        }
        
        private final android.widget.Button getBtn_answer() {
            return null;
        }
        
        private final void gotoAnswer() {
        }
        
        public final void setupUI(@org.jetbrains.annotations.NotNull()
        com.upco.kloset.model.entity.Comment answer) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
}