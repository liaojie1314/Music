package com.example.music.ui.viewmodel;

import java.lang.System;

/**
 * PlayerActivity ViewModel
 */
@androidx.annotation.Keep()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\r\b\u0007\u0018\u0000 ?2\u00020\u0001:\u0001?B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u00102\u001a\u000203J\u0006\u00104\u001a\u000203J\u0006\u00105\u001a\u000203J\u0006\u00106\u001a\u000203J\u0006\u00107\u001a\u000203J\u0006\u00108\u001a\u000203J\u0006\u00109\u001a\u000203J\u0006\u0010:\u001a\u000203J\u0006\u0010;\u001a\u000203J\u000e\u0010\u0015\u001a\u0002032\u0006\u0010<\u001a\u00020\u0013J\u000e\u0010!\u001a\u0002032\u0006\u0010=\u001a\u00020\u0007J\u0006\u0010>\u001a\u000203R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000bR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\t\"\u0004\b\u0015\u0010\u000bR \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\t\"\u0004\b\u0018\u0010\u000bR \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\t\"\u0004\b\u001b\u0010\u000bR \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\t\"\u0004\b\u001e\u0010\u000bR \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\t\"\u0004\b!\u0010\u000bR\u001a\u0010\"\u001a\u00020#X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u001a\u0010(\u001a\u00020#X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010%\"\u0004\b*\u0010\'R\u001a\u0010+\u001a\u00020#X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010%\"\u0004\b-\u0010\'R\"\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\t\"\u0004\b1\u0010\u000b\u00a8\u0006@"}, d2 = {"Lcom/example/music/ui/viewmodel/PlayerViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_lyricViewData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/music/data/LyricViewData;", "color", "", "getColor", "()Landroidx/lifecycle/MutableLiveData;", "setColor", "(Landroidx/lifecycle/MutableLiveData;)V", "currentVolume", "getCurrentVolume", "setCurrentVolume", "duration", "getDuration", "setDuration", "lyricTranslation", "", "getLyricTranslation", "setLyricTranslation", "lyricViewData", "getLyricViewData", "setLyricViewData", "playMode", "getPlayMode", "setPlayMode", "playState", "getPlayState", "setPlayState", "progress", "getProgress", "setProgress", "rotation", "", "getRotation", "()F", "setRotation", "(F)V", "rotationBackground", "getRotationBackground", "setRotationBackground", "rotationTypeNormal", "getRotationTypeNormal", "setRotationTypeNormal", "standardSongData", "Lcom/example/music/music/standard/data/StandardSongData;", "getStandardSongData", "setStandardSongData", "addVolume", "", "changePlayMode", "changePlayState", "likeMusic", "playLast", "playNext", "reduceVolume", "refresh", "refreshProgress", "open", "newProgress", "updateLyric", "Companion", "app_debug"})
public final class PlayerViewModel extends androidx.lifecycle.ViewModel {
    private float rotation = 0.0F;
    private float rotationBackground = 0.0F;
    private float rotationTypeNormal = 0.0F;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Integer> playMode;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.example.music.music.standard.data.StandardSongData> standardSongData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> playState;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Integer> duration;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Integer> progress;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> lyricTranslation;
    private androidx.lifecycle.MutableLiveData<com.example.music.data.LyricViewData> _lyricViewData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.example.music.data.LyricViewData> lyricViewData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Integer> currentVolume;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Integer> color;
    private static final int DEFAULT_COLOR = 0;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.music.ui.viewmodel.PlayerViewModel.Companion Companion = null;
    
    public final float getRotation() {
        return 0.0F;
    }
    
    public final void setRotation(float p0) {
    }
    
    public final float getRotationBackground() {
        return 0.0F;
    }
    
    public final void setRotationBackground(float p0) {
    }
    
    public final float getRotationTypeNormal() {
        return 0.0F;
    }
    
    public final void setRotationTypeNormal(float p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getPlayMode() {
        return null;
    }
    
    public final void setPlayMode(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.music.music.standard.data.StandardSongData> getStandardSongData() {
        return null;
    }
    
    public final void setStandardSongData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.example.music.music.standard.data.StandardSongData> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getPlayState() {
        return null;
    }
    
    public final void setPlayState(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getDuration() {
        return null;
    }
    
    public final void setDuration(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getProgress() {
        return null;
    }
    
    public final void setProgress(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getLyricTranslation() {
        return null;
    }
    
    public final void setLyricTranslation(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.music.data.LyricViewData> getLyricViewData() {
        return null;
    }
    
    public final void setLyricViewData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.example.music.data.LyricViewData> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getCurrentVolume() {
        return null;
    }
    
    public final void setCurrentVolume(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getColor() {
        return null;
    }
    
    public final void setColor(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Integer> p0) {
    }
    
    /**
     * 刷新
     */
    public final void refresh() {
    }
    
    /**
     * 刷新 progress
     */
    public final void refreshProgress() {
    }
    
    /**
     * 改变播放状态
     */
    public final void changePlayState() {
    }
    
    /**
     * 播放上一曲
     */
    public final void playLast() {
    }
    
    /**
     * 播放下一曲
     */
    public final void playNext() {
    }
    
    /**
     * 改变播放模式
     */
    public final void changePlayMode() {
    }
    
    /**
     * 设置 progress
     */
    public final void setProgress(int newProgress) {
    }
    
    /**
     * 喜欢音乐
     */
    public final void likeMusic() {
    }
    
    /**
     * 更新歌词
     */
    public final void updateLyric() {
    }
    
    /**
     * 设置歌词翻译
     */
    public final void setLyricTranslation(boolean open) {
    }
    
    /**
     * 音量加
     */
    public final void addVolume() {
    }
    
    /**
     * 音量减
     */
    public final void reduceVolume() {
    }
    
    public PlayerViewModel() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/music/ui/viewmodel/PlayerViewModel$Companion;", "", "()V", "DEFAULT_COLOR", "", "getDEFAULT_COLOR", "()I", "app_debug"})
    public static final class Companion {
        
        public final int getDEFAULT_COLOR() {
            return 0;
        }
        
        private Companion() {
            super();
        }
    }
}