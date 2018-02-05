package com.upco.kloset.view.widget;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000 32\u00020\u0001:\u000234B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010,\u001a\u00020-J\u000e\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020\u0018J\u0006\u00100\u001a\u00020-J\u0006\u00101\u001a\u00020-J\u000e\u00101\u001a\u00020-2\u0006\u0010/\u001a\u00020\u0018J\u0006\u00102\u001a\u00020-R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001f\u001a\u00020\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010 \"\u0004\b$\u0010\"R\u0011\u0010%\u001a\u00020&\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(R\u001a\u0010)\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\n\"\u0004\b+\u0010\f\u00a8\u00065"}, d2 = {"Lcom/upco/kloset/view/widget/AutoScrollViewPager;", "Lcom/upco/kloset/view/widget/ViewPager;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "autoScrollFactor", "", "getAutoScrollFactor", "()D", "setAutoScrollFactor", "(D)V", "direction", "", "getDirection", "()I", "setDirection", "(I)V", "handler", "Lcom/upco/kloset/view/widget/AutoScrollViewPager$Handler;", "getHandler", "()Lcom/upco/kloset/view/widget/AutoScrollViewPager$Handler;", "interval", "", "getInterval", "()J", "setInterval", "(J)V", "isAutoScroll", "", "isBorderAnimation", "()Z", "setBorderAnimation", "(Z)V", "isCycle", "setCycle", "scroller", "Lcom/upco/kloset/view/widget/CustomDurationScroller;", "getScroller", "()Lcom/upco/kloset/view/widget/CustomDurationScroller;", "swipeScrollFactor", "getSwipeScrollFactor", "setSwipeScrollFactor", "scrollOnce", "", "sendScrollMessage", "delayTimeInMills", "setViewPagerScroller", "startAutoScroll", "stopAutoScroll", "Companion", "Handler", "app_debug"})
public final class AutoScrollViewPager extends com.upco.kloset.view.widget.ViewPager {
    private long interval;
    private int direction;
    private boolean isCycle;
    private boolean isBorderAnimation;
    private double autoScrollFactor;
    private double swipeScrollFactor;
    @org.jetbrains.annotations.NotNull()
    private final com.upco.kloset.view.widget.AutoScrollViewPager.Handler handler = null;
    @org.jetbrains.annotations.NotNull()
    private final com.upco.kloset.view.widget.CustomDurationScroller scroller = null;
    private boolean isAutoScroll;
    private static final long DEFAULT_INTERVAL = 1500L;
    private static final int LEFT = 0;
    private static final int RIGHT = 1;
    private static final int SCROLL_WHAT = 0;
    public static final com.upco.kloset.view.widget.AutoScrollViewPager.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    public final long getInterval() {
        return 0L;
    }
    
    public final void setInterval(long p0) {
    }
    
    public final int getDirection() {
        return 0;
    }
    
    public final void setDirection(int p0) {
    }
    
    public final boolean isCycle() {
        return false;
    }
    
    public final void setCycle(boolean p0) {
    }
    
    public final boolean isBorderAnimation() {
        return false;
    }
    
    public final void setBorderAnimation(boolean p0) {
    }
    
    public final double getAutoScrollFactor() {
        return 0.0;
    }
    
    public final void setAutoScrollFactor(double p0) {
    }
    
    public final double getSwipeScrollFactor() {
        return 0.0;
    }
    
    public final void setSwipeScrollFactor(double p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.upco.kloset.view.widget.AutoScrollViewPager.Handler getHandler() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.upco.kloset.view.widget.CustomDurationScroller getScroller() {
        return null;
    }
    
    public final void startAutoScroll() {
    }
    
    public final void startAutoScroll(long delayTimeInMills) {
    }
    
    public final void stopAutoScroll() {
    }
    
    public final void sendScrollMessage(long delayTimeInMills) {
    }
    
    public final void setViewPagerScroller() {
    }
    
    public final void scrollOnce() {
    }
    
    public AutoScrollViewPager(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs) {
        super(null, null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/upco/kloset/view/widget/AutoScrollViewPager$Handler;", "Landroid/os/Handler;", "autoScrollViewPager", "Lcom/upco/kloset/view/widget/AutoScrollViewPager;", "(Lcom/upco/kloset/view/widget/AutoScrollViewPager;)V", "Ljava/lang/ref/WeakReference;", "handleMessage", "", "msg", "Landroid/os/Message;", "app_debug"})
    public static final class Handler extends android.os.Handler {
        private final java.lang.ref.WeakReference<com.upco.kloset.view.widget.AutoScrollViewPager> autoScrollViewPager = null;
        
        @java.lang.Override()
        public void handleMessage(@org.jetbrains.annotations.Nullable()
        android.os.Message msg) {
        }
        
        public Handler(@org.jetbrains.annotations.NotNull()
        com.upco.kloset.view.widget.AutoScrollViewPager autoScrollViewPager) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\bX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\bX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n\u00a8\u0006\u000f"}, d2 = {"Lcom/upco/kloset/view/widget/AutoScrollViewPager$Companion;", "", "()V", "DEFAULT_INTERVAL", "", "getDEFAULT_INTERVAL", "()J", "LEFT", "", "getLEFT", "()I", "RIGHT", "getRIGHT", "SCROLL_WHAT", "getSCROLL_WHAT", "app_debug"})
    public static final class Companion {
        
        public final long getDEFAULT_INTERVAL() {
            return 0L;
        }
        
        public final int getLEFT() {
            return 0;
        }
        
        public final int getRIGHT() {
            return 0;
        }
        
        public final int getSCROLL_WHAT() {
            return 0;
        }
        
        private Companion() {
            super();
        }
    }
}