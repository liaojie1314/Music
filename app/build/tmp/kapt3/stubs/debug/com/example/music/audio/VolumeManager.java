package com.example.music.audio;

import java.lang.System;

/**
 * 音量管理
 */
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\r"}, d2 = {"Lcom/example/music/audio/VolumeManager;", "", "()V", "audioManger", "Landroid/media/AudioManager;", "maxVolume", "", "getMaxVolume", "()I", "getCurrentVolume", "setStreamVolume", "", "volume", "app_debug"})
public final class VolumeManager {
    private static final android.media.AudioManager audioManger = null;
    private static final int maxVolume = 0;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.music.audio.VolumeManager INSTANCE = null;
    
    public final int getMaxVolume() {
        return 0;
    }
    
    /**
     * 传入 [volume] 设置音量
     */
    public final void setStreamVolume(int volume) {
    }
    
    /**
     * 获取当前媒体音
     * @return 当前音量
     */
    public final int getCurrentVolume() {
        return 0;
    }
    
    private VolumeManager() {
        super();
    }
}