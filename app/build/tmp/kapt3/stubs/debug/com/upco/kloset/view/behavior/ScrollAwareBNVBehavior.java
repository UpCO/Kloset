package com.upco.kloset.view.behavior;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007B\u0005\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0002H\u0002JH\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u0013H\u0016J8\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u0013H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/upco/kloset/view/behavior/ScrollAwareBNVBehavior;", "Landroid/support/design/widget/CoordinatorLayout$Behavior;", "Landroid/support/design/widget/BottomNavigationView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "()V", "INTERPOLATOR", "Landroid/support/v4/view/animation/LinearOutSlowInInterpolator;", "hidden", "", "mOffsetValueAnimator", "Landroid/support/v4/view/ViewPropertyAnimatorCompat;", "animateOffset", "", "child", "offset", "", "ensureOrCancelAnimator", "onNestedScroll", "coordinatorLayout", "Landroid/support/design/widget/CoordinatorLayout;", "target", "Landroid/view/View;", "dxConsumed", "dyConsumed", "dxUnconsumed", "dyUnconsumed", "type", "onStartNestedScroll", "directTargetChild", "axes", "app_debug"})
public final class ScrollAwareBNVBehavior extends android.support.design.widget.CoordinatorLayout.Behavior<android.support.design.widget.BottomNavigationView> {
    private final android.support.v4.view.animation.LinearOutSlowInInterpolator INTERPOLATOR = null;
    private android.support.v4.view.ViewPropertyAnimatorCompat mOffsetValueAnimator;
    private boolean hidden;
    
    @java.lang.Override()
    public boolean onStartNestedScroll(@org.jetbrains.annotations.NotNull()
    android.support.design.widget.CoordinatorLayout coordinatorLayout, @org.jetbrains.annotations.NotNull()
    android.support.design.widget.BottomNavigationView child, @org.jetbrains.annotations.NotNull()
    android.view.View directTargetChild, @org.jetbrains.annotations.NotNull()
    android.view.View target, int axes, int type) {
        return false;
    }
    
    @java.lang.Override()
    public void onNestedScroll(@org.jetbrains.annotations.NotNull()
    android.support.design.widget.CoordinatorLayout coordinatorLayout, @org.jetbrains.annotations.NotNull()
    android.support.design.widget.BottomNavigationView child, @org.jetbrains.annotations.NotNull()
    android.view.View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type) {
    }
    
    private final void animateOffset(android.support.design.widget.BottomNavigationView child, int offset) {
    }
    
    private final void ensureOrCancelAnimator(android.support.design.widget.BottomNavigationView child) {
    }
    
    public ScrollAwareBNVBehavior() {
        super();
    }
    
    public ScrollAwareBNVBehavior(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs) {
        super();
    }
}