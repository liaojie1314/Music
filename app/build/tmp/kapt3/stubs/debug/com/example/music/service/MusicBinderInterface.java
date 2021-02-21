package com.example.music.service;

import java.lang.System;

/**
 * 音乐 Binder 接口
 * MyApplication.musicBinderInterface 是音乐服务外部唯一管理者
 */
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000f\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0007H&J\b\u0010\t\u001a\u00020\u0007H&J\n\u0010\n\u001a\u0004\u0018\u00010\u000bH&J\b\u0010\f\u001a\u00020\u0007H&J\b\u0010\r\u001a\u00020\u0007H&J\b\u0010\u000e\u001a\u00020\u000fH&J\u001c\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0011j\n\u0012\u0004\u0012\u00020\u000b\u0018\u0001`\u0012H&J\b\u0010\u0013\u001a\u00020\u0007H&J\b\u0010\u0014\u001a\u00020\u0015H&J\b\u0010\u0016\u001a\u00020\u0003H&J\b\u0010\u0017\u001a\u00020\u0003H&J\b\u0010\u0018\u001a\u00020\u0003H&J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0007H&J\b\u0010\u001b\u001a\u00020\u0003H&J\b\u0010\u001c\u001a\u00020\u0003H&J\b\u0010\u001d\u001a\u00020\u0003H&J \u0010\u001e\u001a\u00020\u00032\u0016\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\u0011j\b\u0012\u0004\u0012\u00020\u000b`\u0012H&J\u0010\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u0007H&J\u0010\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u0015H&\u00a8\u0006$"}, d2 = {"Lcom/example/music/service/MusicBinderInterface;", "", "changePlayMode", "", "changePlayState", "decreasePitchLevel", "getAudioSessionId", "", "getDuration", "getNowPosition", "getNowSongData", "Lcom/example/music/music/standard/data/StandardSongData;", "getPitchLevel", "getPlayMode", "getPlayState", "", "getPlaylist", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getProgress", "getSpeed", "", "increasePitchLevel", "pause", "play", "playMusic", "songPosition", "playNext", "playPrevious", "sendBroadcast", "setPlaylist", "songListData", "setProgress", "newProgress", "setSpeed", "speed", "app_debug"})
public abstract interface MusicBinderInterface {
    
    /**
     * 设置播放列表（歌单）
     */
    public abstract void setPlaylist(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.music.music.standard.data.StandardSongData> songListData);
    
    /**
     * 获取当前歌单
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.util.ArrayList<com.example.music.music.standard.data.StandardSongData> getPlaylist();
    
    /**
     * 播放歌单指定位置 [songPosition] 歌曲
     */
    public abstract void playMusic(int songPosition);
    
    /**
     * 改变播放状态
     * 取消过时，继续用，也可以用 [play] 或者 [pause]
     */
    public abstract void changePlayState();
    
    /**
     * 获取播放状态
     * @return true 正在播放，false 暂停
     */
    public abstract boolean getPlayState();
    
    /**
     * 获取当前歌曲时长
     */
    public abstract int getDuration();
    
    /**
     * 获取当前播放进度
     */
    public abstract int getProgress();
    
    /**
     * 设置播放进度
     */
    public abstract void setProgress(int newProgress);
    
    /**
     * 获取当前播放歌曲
     */
    @org.jetbrains.annotations.Nullable()
    public abstract com.example.music.music.standard.data.StandardSongData getNowSongData();
    
    /**
     * 改变当前播放模式
     */
    public abstract void changePlayMode();
    
    /**
     * 获取当前播放模式
     */
    public abstract int getPlayMode();
    
    /**
     * 播放上一首
     */
    public abstract void playPrevious();
    
    /**
     * 播放下一首
     */
    public abstract void playNext();
    
    /**
     * 获取当前歌曲在歌单中的位置
     */
    public abstract int getNowPosition();
    
    /**
     * 获取音频 Session ID
     */
    public abstract int getAudioSessionId();
    
    /**
     * 请求服务主动发送广播
     */
    public abstract void sendBroadcast();
    
    /**
     * 设置播放速度
     */
    public abstract void setSpeed(float speed);
    
    /**
     * 获取播放速度
     */
    public abstract float getSpeed();
    
    /**
     * 获取音高等级
     */
    public abstract int getPitchLevel();
    
    /**
     * 升调
     */
    public abstract void increasePitchLevel();
    
    /**
     * 降调
     */
    public abstract void decreasePitchLevel();
    
    /**
     * 开始播放
     */
    public abstract void play();
    
    /**
     * 暂停播放
     */
    public abstract void pause();
}