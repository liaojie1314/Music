package com.example.music;

import java.lang.System;

@androidx.annotation.Keep()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0002\u00a8\u0006\u0007"}, d2 = {"Lcom/example/music/MyApplication;", "Landroid/app/Application;", "()V", "onCreate", "", "startMusicService", "Companion", "app_debug"})
public final class MyApplication extends android.app.Application {
    public static android.content.Context context;
    public static com.tencent.mmkv.MMKV mmkv;
    @org.jetbrains.annotations.Nullable()
    private static com.example.music.service.MusicBinderInterface musicBinderInterface;
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.Lazy musicServiceConnection$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.HashMap<java.lang.String, java.util.List<okhttp3.Cookie>> cookieStore = null;
    public static com.example.music.manager.UserManager userManager;
    public static com.example.music.manager.ActivityManager activityManager;
    public static com.example.music.manager.CloudMusicManager cloudMusicManager;
    public static com.example.music.room.AppDatabase appDatabase;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.music.MyApplication.Companion Companion = null;
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    private final void startMusicService() {
    }
    
    public MyApplication() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR9\u0010\u001b\u001a*\u0012\u0004\u0012\u00020\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0\u001cj\u0014\u0012\u0004\u0012\u00020\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e` \u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020$X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u001c\u0010)\u001a\u0004\u0018\u00010*X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001b\u0010/\u001a\u0002008FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b3\u00104\u001a\u0004\b1\u00102R\u001a\u00105\u001a\u000206X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:\u00a8\u0006;"}, d2 = {"Lcom/example/music/MyApplication$Companion;", "", "()V", "activityManager", "Lcom/example/music/manager/ActivityManager;", "getActivityManager", "()Lcom/example/music/manager/ActivityManager;", "setActivityManager", "(Lcom/example/music/manager/ActivityManager;)V", "appDatabase", "Lcom/example/music/room/AppDatabase;", "getAppDatabase", "()Lcom/example/music/room/AppDatabase;", "setAppDatabase", "(Lcom/example/music/room/AppDatabase;)V", "cloudMusicManager", "Lcom/example/music/manager/CloudMusicManager;", "getCloudMusicManager", "()Lcom/example/music/manager/CloudMusicManager;", "setCloudMusicManager", "(Lcom/example/music/manager/CloudMusicManager;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "cookieStore", "Ljava/util/HashMap;", "", "", "Lokhttp3/Cookie;", "Lkotlin/collections/HashMap;", "getCookieStore", "()Ljava/util/HashMap;", "mmkv", "Lcom/tencent/mmkv/MMKV;", "getMmkv", "()Lcom/tencent/mmkv/MMKV;", "setMmkv", "(Lcom/tencent/mmkv/MMKV;)V", "musicBinderInterface", "Lcom/example/music/service/MusicBinderInterface;", "getMusicBinderInterface", "()Lcom/example/music/service/MusicBinderInterface;", "setMusicBinderInterface", "(Lcom/example/music/service/MusicBinderInterface;)V", "musicServiceConnection", "Lcom/example/music/service/MusicServiceConnection;", "getMusicServiceConnection", "()Lcom/example/music/service/MusicServiceConnection;", "musicServiceConnection$delegate", "Lkotlin/Lazy;", "userManager", "Lcom/example/music/manager/UserManager;", "getUserManager", "()Lcom/example/music/manager/UserManager;", "setUserManager", "(Lcom/example/music/manager/UserManager;)V", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Context getContext() {
            return null;
        }
        
        public final void setContext(@org.jetbrains.annotations.NotNull()
        android.content.Context p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.tencent.mmkv.MMKV getMmkv() {
            return null;
        }
        
        public final void setMmkv(@org.jetbrains.annotations.NotNull()
        com.tencent.mmkv.MMKV p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.example.music.service.MusicBinderInterface getMusicBinderInterface() {
            return null;
        }
        
        public final void setMusicBinderInterface(@org.jetbrains.annotations.Nullable()
        com.example.music.service.MusicBinderInterface p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.music.service.MusicServiceConnection getMusicServiceConnection() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.HashMap<java.lang.String, java.util.List<okhttp3.Cookie>> getCookieStore() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.music.manager.UserManager getUserManager() {
            return null;
        }
        
        public final void setUserManager(@org.jetbrains.annotations.NotNull()
        com.example.music.manager.UserManager p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.music.manager.ActivityManager getActivityManager() {
            return null;
        }
        
        public final void setActivityManager(@org.jetbrains.annotations.NotNull()
        com.example.music.manager.ActivityManager p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.music.manager.CloudMusicManager getCloudMusicManager() {
            return null;
        }
        
        public final void setCloudMusicManager(@org.jetbrains.annotations.NotNull()
        com.example.music.manager.CloudMusicManager p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.music.room.AppDatabase getAppDatabase() {
            return null;
        }
        
        public final void setAppDatabase(@org.jetbrains.annotations.NotNull()
        com.example.music.room.AppDatabase p0) {
        }
        
        private Companion() {
            super();
        }
    }
}