package com.upco.kloset.view.adapter;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\r\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\nJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0010H\u0016J\u000e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\nJ\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0010H\u0016R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\n0\u0006j\b\u0012\u0004\u0012\u00020\n`\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/upco/kloset/view/adapter/MainViewPagerAdapter;", "Landroid/support/v4/app/FragmentPagerAdapter;", "manager", "Landroid/support/v4/app/FragmentManager;", "(Landroid/support/v4/app/FragmentManager;)V", "fragmentList", "Ljava/util/ArrayList;", "Landroid/support/v4/app/Fragment;", "Lkotlin/collections/ArrayList;", "fragmentTitleList", "", "addFragment", "", "fragment", "title", "getCount", "", "getItem", "position", "getItemPositionWithTitle", "getPageTitle", "", "app_debug"})
public final class MainViewPagerAdapter extends android.support.v4.app.FragmentPagerAdapter {
    private java.util.ArrayList<android.support.v4.app.Fragment> fragmentList;
    private java.util.ArrayList<java.lang.String> fragmentTitleList;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.support.v4.app.Fragment getItem(int position) {
        return null;
    }
    
    @java.lang.Override()
    public int getCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.CharSequence getPageTitle(int position) {
        return null;
    }
    
    public final void addFragment(@org.jetbrains.annotations.NotNull()
    android.support.v4.app.Fragment fragment, @org.jetbrains.annotations.NotNull()
    java.lang.String title) {
    }
    
    public final int getItemPositionWithTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String title) {
        return 0;
    }
    
    public MainViewPagerAdapter(@org.jetbrains.annotations.NotNull()
    android.support.v4.app.FragmentManager manager) {
        super(null);
    }
}