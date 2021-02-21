package com.example.music.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\b"}, d2 = {"Lcom/example/music/util/InternetState;", "", "()V", "isInternetAvailable", "", "context", "Landroid/content/Context;", "isWifi", "app_debug"})
public final class InternetState {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.music.util.InternetState INSTANCE = null;
    
    /**
     * 判断网络是否有用
     */
    @kotlin.Suppress(names = {"DEPRECATION"})
    public final boolean isInternetAvailable(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    /**
     * 判断是 wifi 还是移动网络
     */
    public final boolean isWifi(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    private InternetState() {
        super();
    }
}