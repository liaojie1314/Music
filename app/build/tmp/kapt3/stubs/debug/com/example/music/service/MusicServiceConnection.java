package com.example.music.service;

import java.lang.System;

/**
 * 音乐服务连接
 */
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016\u00a8\u0006\n"}, d2 = {"Lcom/example/music/service/MusicServiceConnection;", "Landroid/content/ServiceConnection;", "()V", "onServiceConnected", "", "p0", "Landroid/content/ComponentName;", "p1", "Landroid/os/IBinder;", "onServiceDisconnected", "app_debug"})
public final class MusicServiceConnection implements android.content.ServiceConnection {
    
    /**
     * 服务连接后
     */
    @java.lang.Override()
    public void onServiceConnected(@org.jetbrains.annotations.Nullable()
    android.content.ComponentName p0, @org.jetbrains.annotations.Nullable()
    android.os.IBinder p1) {
    }
    
    /**
     * 服务断开连接
     */
    @java.lang.Override()
    public void onServiceDisconnected(@org.jetbrains.annotations.Nullable()
    android.content.ComponentName p0) {
    }
    
    public MusicServiceConnection() {
        super();
    }
}