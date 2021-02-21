package com.example.music.music.standard;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J,\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u000bH\u0007J,\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u000bH\u0007J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/example/music/music/standard/SongPicture;", "", "()V", "TYPE_LARGE", "", "getPlayerActivityCoverBitmap", "", "songData", "Lcom/example/music/music/standard/data/StandardSongData;", "size", "success", "Lkotlin/Function1;", "Landroid/graphics/Bitmap;", "getSongPicture", "type", "getSongPictureUrl", "", "app_debug"})
public final class SongPicture {
    public static final int TYPE_LARGE = 1;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.music.music.standard.SongPicture INSTANCE = null;
    
    /**
     * 标准
     */
    @android.annotation.SuppressLint(value = {"UseCompatLoadingForDrawables"})
    public final void getSongPicture(@org.jetbrains.annotations.NotNull()
    com.example.music.music.standard.data.StandardSongData songData, int type, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.graphics.Bitmap, kotlin.Unit> success) {
    }
    
    /**
     * 获取图片
     */
    private final java.lang.String getSongPictureUrl(com.example.music.music.standard.data.StandardSongData songData, int type) {
        return null;
    }
    
    /**
     * 获取 PlayerActivityCover 图片
     */
    @org.jetbrains.annotations.TestOnly()
    @android.annotation.SuppressLint(value = {"UseCompatLoadingForDrawables"})
    public final void getPlayerActivityCoverBitmap(@org.jetbrains.annotations.NotNull()
    com.example.music.music.standard.data.StandardSongData songData, int size, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.graphics.Bitmap, kotlin.Unit> success) {
    }
    
    private SongPicture() {
        super();
    }
}