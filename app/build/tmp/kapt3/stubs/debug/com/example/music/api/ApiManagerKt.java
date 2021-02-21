package com.example.music.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"API_AUTU", "", "API_DEFAULT", "API_FCZBL_VIP", "API_MUSIC_API", "API_MUSIC_ELEUU", "API_NETEASE", "app_debug"})
public final class ApiManagerKt {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_DEFAULT = "https://cloudmusic.moriafly.xyz";
    
    /**
     * @名称 音乐 网易云 api
     * @限制 暂无
     * @测试 主要 api，绝大多数稳定
     * @类型 适用 NodeJs 版
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_MUSIC_API = "http://musicapi.leanapp.cn";
    
    /**
     * @名称 网易云简单 api
     * @限制 暂无，很快，稳定
     * @测试 用于歌词，很简单
     * @获取歌词 https://api.fczbl.vip/163/?type=lrc&id=1438470159 // 传入歌曲 id
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_FCZBL_VIP = "https://api.fczbl.vip/163";
    
    /**
     * 网易云官方 api
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_NETEASE = "https://music.163.com/api";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_MUSIC_ELEUU = "http://music.eleuu.com";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_AUTU = "https://autumnfish.cn";
}