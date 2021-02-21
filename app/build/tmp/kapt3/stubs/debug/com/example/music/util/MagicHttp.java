package com.example.music.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0002\n\u000bB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/example/music/util/MagicHttp;", "", "()V", "DEFAULT_CACHE_TIME_GET", "", "DEFAULT_CACHE_TIME_POST", "runOnMainThread", "", "runnable", "Ljava/lang/Runnable;", "MagicHttpInterface", "OkHttpManager", "app_debug"})
public final class MagicHttp {
    public static final int DEFAULT_CACHE_TIME_GET = 14400;
    public static final int DEFAULT_CACHE_TIME_POST = com.example.music.util.cache.ACache.TIME_DAY;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.music.util.MagicHttp INSTANCE = null;
    
    public final void runOnMainThread(@org.jetbrains.annotations.NotNull()
    java.lang.Runnable runnable) {
    }
    
    private MagicHttp() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J@\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\tH&J8\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\tH&J,\u0010\f\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\tH&J4\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\tH&\u00a8\u0006\u000f"}, d2 = {"Lcom/example/music/util/MagicHttp$MagicHttpInterface;", "", "getByCache", "", "context", "Landroid/content/Context;", "url", "", "success", "Lkotlin/Function1;", "failure", "newGet", "post", "json", "postByCache", "app_debug"})
    public static abstract interface MagicHttpInterface {
        
        public abstract void newGet(@org.jetbrains.annotations.NotNull()
        java.lang.String url, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure);
        
        public abstract void post(@org.jetbrains.annotations.NotNull()
        java.lang.String url, @org.jetbrains.annotations.NotNull()
        java.lang.String json, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> success);
        
        /**
         * 支持缓存
         */
        public abstract void getByCache(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String url, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure);
        
        public abstract void postByCache(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String url, @org.jetbrains.annotations.NotNull()
        java.lang.String json, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> success);
    }
    
    /**
     * 可用多个，不是单例类
     */
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J@\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\nH\u0016J8\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\nH\u0016J,\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\nH\u0016J4\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\nH\u0016\u00a8\u0006\u0010"}, d2 = {"Lcom/example/music/util/MagicHttp$OkHttpManager;", "Lcom/example/music/util/MagicHttp$MagicHttpInterface;", "()V", "getByCache", "", "context", "Landroid/content/Context;", "url", "", "success", "Lkotlin/Function1;", "failure", "newGet", "post", "json", "postByCache", "app_debug"})
    public static final class OkHttpManager implements com.example.music.util.MagicHttp.MagicHttpInterface {
        
        @java.lang.Override()
        public void newGet(@org.jetbrains.annotations.NotNull()
        java.lang.String url, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure) {
        }
        
        /**
         * post 请求
         */
        @java.lang.Override()
        public void post(@org.jetbrains.annotations.NotNull()
        java.lang.String url, @org.jetbrains.annotations.NotNull()
        java.lang.String json, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> success) {
        }
        
        @java.lang.Override()
        public void getByCache(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String url, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure) {
        }
        
        @java.lang.Override()
        public void postByCache(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String url, @org.jetbrains.annotations.NotNull()
        java.lang.String json, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> success) {
        }
        
        public OkHttpManager() {
            super();
        }
    }
}