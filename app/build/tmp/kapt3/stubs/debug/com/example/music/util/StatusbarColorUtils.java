package com.example.music.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000bH\u0002J\u0016\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u0004H\u0002J\u0016\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000bJ \u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u000bH\u0002J\u0016\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u0004J\u0018\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u000bH\u0002J\u0016\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u000bJ\u0016\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u0004J\u000e\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/example/music/util/StatusbarColorUtils;", "", "()V", "SYSTEM_UI_FLAG_LIGHT_STATUS_BAR", "", "mSetStatusBarColorIcon", "Ljava/lang/reflect/Method;", "mSetStatusBarDarkIcon", "mStatusBarColorFiled", "Ljava/lang/reflect/Field;", "changeMeizuFlag", "", "winParams", "Landroid/view/WindowManager$LayoutParams;", "flagName", "", "on", "isBlackColor", "color", "level", "setStatusBarColor", "", "window", "Landroid/view/Window;", "setStatusBarDarkIcon", "activity", "Landroid/app/Activity;", "dark", "flag", "view", "Landroid/view/View;", "toGrey", "rgb", "app_debug"})
public final class StatusbarColorUtils {
    private static java.lang.reflect.Method mSetStatusBarColorIcon;
    private static java.lang.reflect.Method mSetStatusBarDarkIcon;
    private static java.lang.reflect.Field mStatusBarColorFiled;
    private static int SYSTEM_UI_FLAG_LIGHT_STATUS_BAR = 0;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.music.util.StatusbarColorUtils INSTANCE = null;
    
    /**
     * 判断颜色是否偏黑色
     *
     * @param color 颜色
     * @param level 级别
     * @return
     */
    public final boolean isBlackColor(int color, int level) {
        return false;
    }
    
    /**
     * 颜色转换成灰度值
     *
     * @param rgb 颜色
     * @return　灰度值
     */
    public final int toGrey(int rgb) {
        return 0;
    }
    
    /**
     * 设置状态栏字体图标颜色
     *
     * @param activity 当前activity
     * @param color    颜色
     */
    public final void setStatusBarDarkIcon(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, int color) {
    }
    
    /**
     * 设置状态栏字体图标颜色(只限全屏非activity情况)
     *
     * @param window 当前窗口
     * @param color  颜色
     */
    public final void setStatusBarDarkIcon(@org.jetbrains.annotations.NotNull()
    android.view.Window window, int color) {
    }
    
    /**
     * 设置状态栏字体图标颜色
     *
     * @param activity 当前activity
     * @param dark     是否深色 true为深色 false 为白色
     */
    public final void setStatusBarDarkIcon(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, boolean dark) {
    }
    
    private final boolean changeMeizuFlag(android.view.WindowManager.LayoutParams winParams, java.lang.String flagName, boolean on) {
        return false;
    }
    
    /**
     * 设置状态栏颜色
     *
     * @param view
     * @param dark
     */
    private final void setStatusBarDarkIcon(android.view.View view, boolean dark) {
    }
    
    /**
     * 设置状态栏颜色
     *
     * @param window
     * @param color
     */
    private final void setStatusBarColor(android.view.Window window, int color) {
    }
    
    /**
     * 设置状态栏字体图标颜色(只限全屏非activity情况)
     *
     * @param window 当前窗口
     * @param dark   是否深色 true为深色 false 为白色
     */
    public final void setStatusBarDarkIcon(@org.jetbrains.annotations.NotNull()
    android.view.Window window, boolean dark) {
    }
    
    private final void setStatusBarDarkIcon(android.app.Activity activity, boolean dark, boolean flag) {
    }
    
    private StatusbarColorUtils() {
        super();
    }
}