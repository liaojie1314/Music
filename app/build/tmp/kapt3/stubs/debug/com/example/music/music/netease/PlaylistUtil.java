package com.example.music.music.netease;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J4\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\"\u0010\u0007\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b\u0012\u0004\u0012\u00020\u00040\bH\u0003JH\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\"\u0010\u0007\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b\u0012\u0004\u0012\u00020\u00040\b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00040\bH\u0007J*\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00040\bJD\u0010\u0015\u001a\u00020\u00042\u0016\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\tj\b\u0012\u0004\u0012\u00020\u000e`\u000b2\"\u0010\u0007\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b\u0012\u0004\u0012\u00020\u00040\bH\u0003\u00a8\u0006\u0017"}, d2 = {"Lcom/example/music/music/netease/PlaylistUtil;", "", "()V", "detailPlaylistDataToStandardSongDataList", "", "detailPlaylistData", "Lcom/example/music/data/DetailPlaylistData;", "success", "Lkotlin/Function1;", "Ljava/util/ArrayList;", "Lcom/example/music/music/standard/data/StandardSongData;", "Lkotlin/collections/ArrayList;", "getDetailPlaylist", "id", "", "failure", "", "getPlaylistInfo", "context", "Landroid/content/Context;", "Lcom/example/music/data/DetailPlaylistInnerData;", "getSongListByIds", "ids", "app_debug"})
public final class PlaylistUtil {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.music.music.netease.PlaylistUtil INSTANCE = null;
    
    @java.lang.Deprecated()
    public final void getDetailPlaylist(long id, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.ArrayList<com.example.music.music.standard.data.StandardSongData>, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure) {
    }
    
    @java.lang.Deprecated()
    private final void detailPlaylistDataToStandardSongDataList(com.example.music.data.DetailPlaylistData detailPlaylistData, kotlin.jvm.functions.Function1<? super java.util.ArrayList<com.example.music.music.standard.data.StandardSongData>, kotlin.Unit> success) {
    }
    
    @java.lang.Deprecated()
    private final void getSongListByIds(java.util.ArrayList<java.lang.Long> ids, kotlin.jvm.functions.Function1<? super java.util.ArrayList<com.example.music.music.standard.data.StandardSongData>, kotlin.Unit> success) {
    }
    
    /**
     * 获取歌单信息
     */
    public final void getPlaylistInfo(@org.jetbrains.annotations.NotNull()
    android.content.Context context, long id, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.music.data.DetailPlaylistInnerData, kotlin.Unit> success) {
    }
    
    private PlaylistUtil() {
        super();
    }
}