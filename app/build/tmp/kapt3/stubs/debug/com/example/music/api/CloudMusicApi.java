package com.example.music.api;

import java.lang.System;

/**
 * 网易云 API 地址
 */
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/example/music/api/CloudMusicApi;", "", "()V", "ARTISTS", "", "LYRIC", "PERSONALIZED_NEW_SONG", "SEARCH_DEFAULT", "SEARCH_HOT_DETAIL", "USER_PLAYLIST", "app_debug"})
public final class CloudMusicApi {
    
    /**
     * 默认搜索关键词
     * 说明 : 调用此接口 , 可获取默认搜索关键词
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SEARCH_DEFAULT = "https://autumnfish.cn/search/default";
    
    /**
     * 热搜列表(详细)
     * 说明 : 调用此接口,可获取热门搜索列表
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SEARCH_HOT_DETAIL = "https://autumnfish.cn/search/hot/detail";
    
    /**
     * 获取歌手部分信息和歌手单曲
     * 说明 : 调用此接口 , 传入歌手 id, 可获得歌手部分信息和热门歌曲
     * 必选参数 : id: 歌手 id, 可由搜索接口获得
     * 接口地址 : /artists
     * 调用例子 : /artists?id=6452
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ARTISTS = "https://autumnfish.cn/artists";
    
    /**
     * 获取歌词
     * 说明 : 调用此接口 , 传入音乐 id 可获得对应音乐的歌词 ( 不需要登录 )
     * 必选参数 : id: 音乐 id
     * 接口地址 : /lyric
     * 调用例子 : /lyric?id=33894312
     * 返回数据如下图 : 获取歌词
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LYRIC = "https://autumnfish.cn/lyric";
    
    /**
     * 获取用户歌单
     * 说明 : 登录后调用此接口 , 传入用户 id, 可以获取用户歌单
     * 必选参数 : uid : 用户 id
     * 可选参数 :
     * limit : 返回数量 , 默认为 30
     * offset : 偏移数量，用于分页 , 如 :( 页数 -1)*30, 其中 30 为 limit 的值 , 默认为 0
     * 接口地址 : /user/playlist
     * 调用例子 : /user/playlist?uid=32953014
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String USER_PLAYLIST = "http://music.eleuu.com/user/playlist";
    
    /**
     * 推荐新音乐
     * 说明 : 调用此接口 , 可获取推荐新音乐
     * 可选参数 : limit: 取出数量 , 默认为 10 (不支持 offset)
     * 接口地址 : /personalized/newsong
     * 调用例子 : /personalized/newsong
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PERSONALIZED_NEW_SONG = "http://music.eleuu.com/personalized/newsong";
    @org.jetbrains.annotations.NotNull()
    public static final com.example.music.api.CloudMusicApi INSTANCE = null;
    
    private CloudMusicApi() {
        super();
    }
}