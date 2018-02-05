package com.upco.kloset.view.activity;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u0012\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0012\u0010\u0014\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\b\u0010\u0017\u001a\u00020\u0010H\u0014J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\nH\u0016J\u0010\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\fH\u0016J \u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\fH\u0016J\u0010\u0010\"\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\fH\u0016J\u0012\u0010#\u001a\u00020\u00102\b\u0010$\u001a\u0004\u0018\u00010\u0016H\u0014J\b\u0010%\u001a\u00020\u0010H\u0014J\b\u0010&\u001a\u00020\u0010H\u0002J\b\u0010\'\u001a\u00020\u0010H\u0002J\u0010\u0010(\u001a\u00020\u00102\u0006\u0010)\u001a\u00020*H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"}, d2 = {"Lcom/upco/kloset/view/activity/MainActivity;", "Landroid/support/v7/app/AppCompatActivity;", "Lcom/upco/kloset/contract/MainContract$ViewImpl;", "Landroid/support/design/widget/BottomNavigationView$OnNavigationItemSelectedListener;", "Landroid/support/v4/view/ViewPager$OnPageChangeListener;", "Landroid/view/View$OnClickListener;", "()V", "presenter", "Lcom/upco/kloset/presenter/MainPresenter;", "prevMenuItem", "Landroid/view/MenuItem;", "selectedPage", "", "getCtx", "Landroid/content/Context;", "gotoNewLook", "", "onClick", "v", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onNavigationItemSelected", "", "item", "onPageScrollStateChanged", "state", "onPageScrolled", "position", "positionOffset", "", "positionOffsetPixels", "onPageSelected", "onSaveInstanceState", "outState", "onStart", "setListeners", "setupUI", "showToast", "msg", "", "app_debug"})
public final class MainActivity extends android.support.v7.app.AppCompatActivity implements com.upco.kloset.contract.MainContract.ViewImpl, android.support.design.widget.BottomNavigationView.OnNavigationItemSelectedListener, android.support.v4.view.ViewPager.OnPageChangeListener, android.view.View.OnClickListener {
    private int selectedPage;
    private android.view.MenuItem prevMenuItem;
    private final com.upco.kloset.presenter.MainPresenter presenter = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @java.lang.Override()
    protected void onSaveInstanceState(@org.jetbrains.annotations.Nullable()
    android.os.Bundle outState) {
    }
    
    @java.lang.Override()
    public boolean onNavigationItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public void onPageSelected(int position) {
    }
    
    @java.lang.Override()
    public void onPageScrollStateChanged(int state) {
    }
    
    @java.lang.Override()
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.content.Context getCtx() {
        return null;
    }
    
    @java.lang.Override()
    public void showToast(@org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    private final void setListeners() {
    }
    
    private final void setupUI() {
    }
    
    private final void gotoNewLook() {
    }
    
    public MainActivity() {
        super();
    }
}