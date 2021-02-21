package com.example.music.music.local;

import java.lang.System;

/**
 * 本地我喜欢的
 */
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fJ\"\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\u000fJ*\u0010\u0011\u001a\u00020\u00062\"\u0010\u0012\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b0\u0013j\b\u0012\u0004\u0012\u00020\b`\u0014\u0012\u0004\u0012\u00020\u00060\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/example/music/music/local/MyFavorite;", "", "()V", "myFavoriteMusic", "Lcom/example/music/room/MyFavoriteMusic;", "addSong", "", "songData", "Lcom/example/music/music/standard/data/StandardSongData;", "delete", "deleteById", "id", "", "isExist", "exist", "Lkotlin/Function1;", "", "read", "success", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "app_debug"})
public final class MyFavorite {
    private static final com.example.music.room.MyFavoriteMusic myFavoriteMusic = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.music.music.local.MyFavorite INSTANCE = null;
    
    /**
     * 读取本地歌曲
     */
    @org.jetbrains.annotations.TestOnly()
    public final void read(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.ArrayList<com.example.music.music.standard.data.StandardSongData>, kotlin.Unit> success) {
    }
    
    /**
     * 添加一首歌
     */
    @org.jetbrains.annotations.TestOnly()
    public final void addSong(@org.jetbrains.annotations.NotNull()
    com.example.music.music.standard.data.StandardSongData songData) {
    }
    
    /**
     * 删除一首歌
     */
    @org.jetbrains.annotations.TestOnly()
    public final void delete(@org.jetbrains.annotations.NotNull()
    com.example.music.music.standard.data.StandardSongData songData) {
    }
    
    /**
     * 判断歌曲是否在数据库中
     */
    public final void isExist(@org.jetbrains.annotations.NotNull()
    com.example.music.music.standard.data.StandardSongData songData, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> exist) {
    }
    
    /**
     * 通过 id 删除一首歌
     */
    public final void deleteById(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
    
    private MyFavorite() {
        super();
    }
}