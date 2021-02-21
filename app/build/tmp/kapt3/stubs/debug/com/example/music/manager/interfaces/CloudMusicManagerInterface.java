package com.example.music.manager.interfaces;

import java.lang.System;

/**
 * 网易云音乐接口管理
 */
@androidx.annotation.Keep()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u0007H&J*\u0010\t\u001a\u00020\u00032\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\fH&J2\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00030\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\fH&J$\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00030\u0007H&J\u0018\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017H&J*\u0010\u0018\u001a\u00020\u00032\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00030\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\fH&J\u001c\u0010\u001a\u001a\u00020\u00032\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00030\u0007H&J\u001c\u0010\u001c\u001a\u00020\u00032\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00030\u0007H&J$\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00030\u0007H&J2\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00030\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\fH&JV\u0010 \u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u000f2!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110$\u00a2\u0006\f\b%\u0012\b\b&\u0012\u0004\b\b(\'\u0012\u0004\u0012\u00020\u00030\u00072!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u000f\u00a2\u0006\f\b%\u0012\b\b&\u0012\u0004\b\b((\u0012\u0004\u0012\u00020\u00030\u0007H&J$\u0010)\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u00030\u0007H\'J,\u0010+\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u000f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\fH&J:\u0010,\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020\u000f2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00030\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\fH&J\u001e\u0010/\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u000f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\fH&JT\u00100\u001a\u00020\u00032\u0006\u00101\u001a\u00020\u00172\u0006\u00102\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u00103\u001a\u00020\u000f2\b\b\u0002\u00104\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u00030\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\fH&\u00a8\u00066"}, d2 = {"Lcom/example/music/manager/interfaces/CloudMusicManagerInterface;", "", "getArtists", "", "artistId", "", "success", "Lkotlin/Function1;", "Lcom/example/music/music/netease/data/ArtistsData;", "getBanner", "Lcom/example/music/music/netease/data/BannerData;", "failure", "Lkotlin/Function0;", "getComment", "id", "", "Lcom/example/music/data/CommentData;", "getLyric", "songId", "Lcom/example/music/music/netease/data/LyricData;", "getPicture", "url", "heightOrWeight", "", "getPrivateLetter", "Lcom/example/music/music/netease/data/PrivateLetterData;", "getSearchDefault", "Lcom/example/music/music/netease/data/SearchDefaultData;", "getSearchHot", "Lcom/example/music/music/netease/data/SearchHotData;", "getSongInfo", "Lcom/example/music/music/netease/data/SongUrlData$UrlData;", "getUserDetail", "userId", "Lcom/example/music/music/netease/data/UserDetailData;", "uid", "Lcom/example/music/data/UserDetailData;", "Lkotlin/ParameterName;", "name", "result", "error", "getUserPlaylist", "Lcom/example/music/data/UserPlaylistData;", "likeSong", "loginByTell", "tell", "password", "loginByUid", "sendComment", "t", "type", "content", "commentId", "Lcom/example/music/music/netease/data/CodeData;", "app_debug"})
@java.lang.Deprecated()
public abstract interface CloudMusicManagerInterface {
    
    /**
     * 获取评论
     */
    public abstract void getComment(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.music.data.CommentData, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> failure);
    
    /**
     * 获取用户详细资料
     */
    public abstract void getUserDetail(long userId, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.music.music.netease.data.UserDetailData, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> failure);
    
    public abstract void loginByTell(@org.jetbrains.annotations.NotNull()
    java.lang.String tell, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.music.music.netease.data.UserDetailData, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> failure);
    
    public abstract void likeSong(@org.jetbrains.annotations.NotNull()
    java.lang.String songId, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> failure);
    
    public abstract void getBanner(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.music.music.netease.data.BannerData, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> failure);
    
    public abstract void sendComment(int t, int type, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String content, long commentId, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.music.music.netease.data.CodeData, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> failure);
    
    public abstract void getPrivateLetter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.music.music.netease.data.PrivateLetterData, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> failure);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getPicture(@org.jetbrains.annotations.NotNull()
    java.lang.String url, int heightOrWeight);
    
    public abstract void getSearchDefault(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.music.music.netease.data.SearchDefaultData, kotlin.Unit> success);
    
    /**
     * 获取热搜
     */
    public abstract void getSearchHot(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.music.music.netease.data.SearchHotData, kotlin.Unit> success);
    
    public abstract void getArtists(long artistId, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.music.music.netease.data.ArtistsData, kotlin.Unit> success);
    
    public abstract void getLyric(long songId, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.music.music.netease.data.LyricData, kotlin.Unit> success);
    
    /**
     * 获取歌曲信息
     */
    public abstract void getSongInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.music.music.netease.data.SongUrlData.UrlData, kotlin.Unit> success);
    
    public abstract void loginByUid(@org.jetbrains.annotations.NotNull()
    java.lang.String uid, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> success);
    
    public abstract void getUserDetail(@org.jetbrains.annotations.NotNull()
    java.lang.String uid, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.music.data.UserDetailData, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure);
    
    @java.lang.Deprecated()
    public abstract void getUserPlaylist(long uid, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.music.data.UserPlaylistData, kotlin.Unit> success);
    
    /**
     * 网易云音乐接口管理
     */
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}