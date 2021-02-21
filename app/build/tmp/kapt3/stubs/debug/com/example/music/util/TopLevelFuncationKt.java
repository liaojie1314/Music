package com.example.music.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000P\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007\u001a\u0006\u0010\t\u001a\u00020\n\u001a\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0016\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011\u001a\u0006\u0010\u0012\u001a\u00020\f\u001a\u0006\u0010\u0013\u001a\u00020\u0005\u001a\u001a\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u0005H\u0007\u001a\u000e\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\n\u001a\u001e\u0010\u0019\u001a\u00020\u00052\u0016\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u001c0\u001bj\b\u0012\u0004\u0012\u00020\u001c`\u001d\u001a\u000e\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020 \u001a\u000e\u0010!\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0005\u00a8\u0006\""}, d2 = {"copyToClipboard", "", "activity", "Landroid/app/Activity;", "text", "", "dp2px", "", "dp", "getCurrentTime", "", "getNavigationBarHeight", "", "getStatusBarHeight", "window", "Landroid/view/Window;", "context", "Landroid/content/Context;", "getVisionCode", "getVisionName", "loge", "msg", "tag", "msTimeToFormatDate", "msTime", "parseArtist", "artistList", "Ljava/util/ArrayList;", "Lcom/example/music/music/standard/data/StandardSongData$StandardArtistData;", "Lkotlin/collections/ArrayList;", "runOnMainThread", "runnable", "Ljava/lang/Runnable;", "toast", "app_debug"})
public final class TopLevelFuncationKt {
    
    /**
     * 全局 toast
     */
    public static final void toast(@org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    /**
     * 运行在主线程，更新 UI
     */
    public static final void runOnMainThread(@org.jetbrains.annotations.NotNull()
    java.lang.Runnable runnable) {
    }
    
    /**
     * 全局 log
     */
    public static final void loge(@org.jetbrains.annotations.NotNull()
    java.lang.String msg, @org.jetbrains.annotations.NotNull()
    java.lang.String tag) {
    }
    
    /**
     * 全局 log
     */
    public static final void loge(@org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    /**
     * dp 转 px
     */
    public static final float dp2px(float dp) {
        return 0.0F;
    }
    
    /**
     * 获取系统当前时间
     */
    public static final long getCurrentTime() {
        return 0L;
    }
    
    /**
     * 标准歌手数组转文本
     * @param artistList 歌手数组
     * @return 文本
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String parseArtist(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.music.music.standard.data.StandardSongData.StandardArtistData> artistList) {
        return null;
    }
    
    /**
     * 毫秒转日期
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String msTimeToFormatDate(long msTime) {
        return null;
    }
    
    /**
     * 获取状态栏高度
     * @return px 值
     */
    public static final int getStatusBarHeight(@org.jetbrains.annotations.NotNull()
    android.view.Window window, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return 0;
    }
    
    /**
     * 获取底部导航栏高度
     */
    public static final int getNavigationBarHeight(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
        return 0;
    }
    
    public static final int getVisionCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getVisionName() {
        return null;
    }
    
    public static final void copyToClipboard(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
}