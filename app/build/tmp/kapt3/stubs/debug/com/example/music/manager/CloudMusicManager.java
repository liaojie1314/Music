package com.example.music.manager;

import java.lang.System;

@androidx.annotation.Keep()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 82\u00020\u0001:\u00018B\u0005\u00a2\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\bH\u0016J*\u0010\n\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\rH\u0016J2\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00102\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00040\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\rH\u0016J$\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00040\bH\u0016J\u0018\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J*\u0010\u0019\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00040\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\rH\u0016J\u001c\u0010\u001b\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00040\bH\u0016J\u001c\u0010\u001d\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00040\bH\u0016J$\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00102\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00040\bH\u0016J2\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00040\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\rH\u0016JV\u0010!\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u00102!\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110%\u00a2\u0006\f\b&\u0012\b\b\'\u0012\u0004\b\b((\u0012\u0004\u0012\u00020\u00040\b2!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u0010\u00a2\u0006\f\b&\u0012\b\b\'\u0012\u0004\b\b()\u0012\u0004\u0012\u00020\u00040\bH\u0016J$\u0010*\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u00040\bH\u0016J,\u0010,\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00102\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\rH\u0016J:\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u00102\u0006\u0010/\u001a\u00020\u00102\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00040\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\rH\u0016J\u001e\u00100\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u00102\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\rH\u0016JR\u00101\u001a\u00020\u00042\u0006\u00102\u001a\u00020\u00182\u0006\u00103\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u00104\u001a\u00020\u00102\u0006\u00105\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\u00040\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\rH\u0016J\b\u00107\u001a\u00020\u0010H\u0002\u00a8\u00069"}, d2 = {"Lcom/example/music/manager/CloudMusicManager;", "Lcom/example/music/manager/interfaces/CloudMusicManagerInterface;", "()V", "getArtists", "", "artistId", "", "success", "Lkotlin/Function1;", "Lcom/example/music/music/netease/data/ArtistsData;", "getBanner", "Lcom/example/music/music/netease/data/BannerData;", "failure", "Lkotlin/Function0;", "getComment", "id", "", "Lcom/example/music/data/CommentData;", "getLyric", "songId", "Lcom/example/music/music/netease/data/LyricData;", "getPicture", "url", "heightOrWeight", "", "getPrivateLetter", "Lcom/example/music/music/netease/data/PrivateLetterData;", "getSearchDefault", "Lcom/example/music/music/netease/data/SearchDefaultData;", "getSearchHot", "Lcom/example/music/music/netease/data/SearchHotData;", "getSongInfo", "Lcom/example/music/music/netease/data/SongUrlData$UrlData;", "getUserDetail", "userId", "Lcom/example/music/music/netease/data/UserDetailData;", "uid", "Lcom/example/music/data/UserDetailData;", "Lkotlin/ParameterName;", "name", "result", "error", "getUserPlaylist", "Lcom/example/music/data/UserPlaylistData;", "likeSong", "loginByTell", "tell", "password", "loginByUid", "sendComment", "t", "type", "content", "commentId", "Lcom/example/music/music/netease/data/CodeData;", "timestamp", "Companion", "app_debug"})
@java.lang.Deprecated()
public final class CloudMusicManager implements com.example.music.manager.interfaces.CloudMusicManagerInterface {
    private static final java.lang.String URL_PRIVATE_LETTER = "https://cloudmusic.moriafly.xyz/msg/private";
    @org.jetbrains.annotations.NotNull()
    public static final com.example.music.manager.CloudMusicManager.Companion Companion = null;
    
    /**
     * 时间戳
     */
    private final java.lang.String timestamp() {
        return null;
    }
    
    @java.lang.Override()
    public void getComment(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.music.data.CommentData, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> failure) {
    }
    
    @java.lang.Override()
    public void getUserDetail(long userId, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.music.music.netease.data.UserDetailData, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> failure) {
    }
    
    @java.lang.Override()
    public void getUserDetail(@org.jetbrains.annotations.NotNull()
    java.lang.String uid, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.music.data.UserDetailData, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> failure) {
    }
    
    @java.lang.Override()
    public void loginByTell(@org.jetbrains.annotations.NotNull()
    java.lang.String tell, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.music.music.netease.data.UserDetailData, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> failure) {
    }
    
    @java.lang.Override()
    public void likeSong(@org.jetbrains.annotations.NotNull()
    java.lang.String songId, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> failure) {
    }
    
    @java.lang.Override()
    public void getBanner(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.music.music.netease.data.BannerData, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> failure) {
    }
    
    /**
     * 发送评论
     * @param t 1 发送 2 回复
     * @param type 0 歌曲 1 mv 2 歌单 3 专辑 4 电台 5 视频 6 动态
     * @param id 对应资源 id
     * @param content 要发送的内容
     * @param commentId 回复的评论id (回复评论时必填)
     */
    @java.lang.Override()
    public void sendComment(int t, int type, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String content, long commentId, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.music.music.netease.data.CodeData, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> failure) {
    }
    
    @java.lang.Override()
    public void getPrivateLetter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.music.music.netease.data.PrivateLetterData, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> failure) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getPicture(@org.jetbrains.annotations.NotNull()
    java.lang.String url, int heightOrWeight) {
        return null;
    }
    
    @java.lang.Override()
    public void getSearchDefault(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.music.music.netease.data.SearchDefaultData, kotlin.Unit> success) {
    }
    
    @java.lang.Override()
    public void getSearchHot(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.music.music.netease.data.SearchHotData, kotlin.Unit> success) {
    }
    
    @java.lang.Override()
    public void getArtists(long artistId, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.music.music.netease.data.ArtistsData, kotlin.Unit> success) {
    }
    
    @java.lang.Override()
    public void getLyric(long songId, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.music.music.netease.data.LyricData, kotlin.Unit> success) {
    }
    
    @java.lang.Override()
    public void getSongInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.music.music.netease.data.SongUrlData.UrlData, kotlin.Unit> success) {
    }
    
    @java.lang.Override()
    public void loginByUid(@org.jetbrains.annotations.NotNull()
    java.lang.String uid, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> success) {
    }
    
    @java.lang.Override()
    public void getUserPlaylist(long uid, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.music.data.UserPlaylistData, kotlin.Unit> success) {
    }
    
    public CloudMusicManager() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/music/manager/CloudMusicManager$Companion;", "", "()V", "URL_PRIVATE_LETTER", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}