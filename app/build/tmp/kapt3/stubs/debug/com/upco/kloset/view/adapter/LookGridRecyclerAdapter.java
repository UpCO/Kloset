package com.upco.kloset.view.adapter;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u00010B=\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000fJ\b\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020$H\u0002J\u0010\u0010&\u001a\u00020$2\u0006\u0010\'\u001a\u00020\"H\u0002J\u001e\u0010(\u001a\u00020$2\f\u0010)\u001a\b\u0018\u00010\u0002R\u00020\u00002\u0006\u0010\'\u001a\u00020\"H\u0016J\u001e\u0010*\u001a\u00060\u0002R\u00020\u00002\b\u0010+\u001a\u0004\u0018\u00010,2\u0006\u0010-\u001a\u00020\"H\u0016J\b\u0010.\u001a\u00020$H\u0002J\b\u0010/\u001a\u00020$H\u0002R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u0004j\b\u0012\u0004\u0012\u00020\u0013`\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001c\u001a\n \u001e*\u0004\u0018\u00010\u001d0\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 \u00a8\u00061"}, d2 = {"Lcom/upco/kloset/view/adapter/LookGridRecyclerAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/upco/kloset/view/adapter/LookGridRecyclerAdapter$ViewHolder;", "looks", "Ljava/util/ArrayList;", "Lcom/upco/kloset/model/entity/Look;", "Lkotlin/collections/ArrayList;", "presenter", "Lcom/upco/kloset/presenter/ClosetPresenter;", "context", "Landroid/content/Context;", "peekAndPop", "Lcom/peekandpop/shalskar/peekandpop/PeekAndPop;", "listener", "Lcom/upco/kloset/listener/OnLookSelectedListener;", "(Ljava/util/ArrayList;Lcom/upco/kloset/presenter/ClosetPresenter;Landroid/content/Context;Lcom/peekandpop/shalskar/peekandpop/PeekAndPop;Lcom/upco/kloset/listener/OnLookSelectedListener;)V", "getContext", "()Landroid/content/Context;", "images", "", "getListener", "()Lcom/upco/kloset/listener/OnLookSelectedListener;", "getLooks", "()Ljava/util/ArrayList;", "getPeekAndPop", "()Lcom/peekandpop/shalskar/peekandpop/PeekAndPop;", "peekAndPopAdapter", "Lcom/upco/kloset/view/adapter/LookSlidingImagesAdapter;", "peekView", "Landroid/view/View;", "kotlin.jvm.PlatformType", "getPresenter", "()Lcom/upco/kloset/presenter/ClosetPresenter;", "getItemCount", "", "gotoComment", "", "gotoLook", "loadPeekAndPop", "position", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setupPeekAndPop", "vibrate", "ViewHolder", "app_debug"})
public final class LookGridRecyclerAdapter extends android.support.v7.widget.RecyclerView.Adapter<com.upco.kloset.view.adapter.LookGridRecyclerAdapter.ViewHolder> {
    private final java.util.ArrayList<java.lang.String> images = null;
    private final com.upco.kloset.view.adapter.LookSlidingImagesAdapter peekAndPopAdapter = null;
    private final android.view.View peekView = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.upco.kloset.model.entity.Look> looks = null;
    @org.jetbrains.annotations.NotNull()
    private final com.upco.kloset.presenter.ClosetPresenter presenter = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final com.peekandpop.shalskar.peekandpop.PeekAndPop peekAndPop = null;
    @org.jetbrains.annotations.NotNull()
    private final com.upco.kloset.listener.OnLookSelectedListener listener = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.upco.kloset.view.adapter.LookGridRecyclerAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.Nullable()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.Nullable()
    com.upco.kloset.view.adapter.LookGridRecyclerAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    private final void setupPeekAndPop() {
    }
    
    private final void loadPeekAndPop(int position) {
    }
    
    private final void vibrate() {
    }
    
    private final void gotoLook() {
    }
    
    private final void gotoComment() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.upco.kloset.model.entity.Look> getLooks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.upco.kloset.presenter.ClosetPresenter getPresenter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.peekandpop.shalskar.peekandpop.PeekAndPop getPeekAndPop() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.upco.kloset.listener.OnLookSelectedListener getListener() {
        return null;
    }
    
    public LookGridRecyclerAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.upco.kloset.model.entity.Look> looks, @org.jetbrains.annotations.NotNull()
    com.upco.kloset.presenter.ClosetPresenter presenter, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.peekandpop.shalskar.peekandpop.PeekAndPop peekAndPop, @org.jetbrains.annotations.NotNull()
    com.upco.kloset.listener.OnLookSelectedListener listener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0002J*\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u001a\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013j\n\u0012\u0004\u0012\u00020\u0014\u0018\u0001`\u0015R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0016"}, d2 = {"Lcom/upco/kloset/view/adapter/LookGridRecyclerAdapter$ViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/upco/kloset/view/adapter/LookGridRecyclerAdapter;Landroid/view/View;)V", "getView", "()Landroid/view/View;", "vp_look", "Lcom/upco/kloset/view/widget/AutoScrollViewPager;", "getVp_look", "()Lcom/upco/kloset/view/widget/AutoScrollViewPager;", "vp_look$delegate", "Lkotlin/Lazy;", "gotoLook", "", "setupUI", "look", "Lcom/upco/kloset/model/entity/Look;", "items", "Ljava/util/ArrayList;", "Lcom/upco/kloset/model/entity/Item;", "Lkotlin/collections/ArrayList;", "app_debug"})
    public final class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        private final kotlin.Lazy vp_look$delegate = null;
        @org.jetbrains.annotations.NotNull()
        private final android.view.View view = null;
        
        private final com.upco.kloset.view.widget.AutoScrollViewPager getVp_look() {
            return null;
        }
        
        private final void gotoLook() {
        }
        
        public final void setupUI(@org.jetbrains.annotations.NotNull()
        com.upco.kloset.model.entity.Look look, @org.jetbrains.annotations.Nullable()
        java.util.ArrayList<com.upco.kloset.model.entity.Item> items) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.view.View getView() {
            return null;
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
}