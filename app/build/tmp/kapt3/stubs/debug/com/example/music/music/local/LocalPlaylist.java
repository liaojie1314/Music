package com.example.music.music.local;

import java.lang.System;

/**
 * 本地歌单类
 */
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004J\b\u0010\n\u001a\u00020\u000bH\u0002J\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/example/music/music/local/LocalPlaylist;", "", "()V", "ARRAY_LOCAL_PLAYLIST", "", "create", "", "name", "description", "imageUrl", "read", "Lcom/example/music/music/local/data/LocalPlaylistArrayData;", "save", "oldData", "app_debug"})
public final class LocalPlaylist {
    private static final java.lang.String ARRAY_LOCAL_PLAYLIST = "array_local_playlist";
    @org.jetbrains.annotations.NotNull()
    public static final com.example.music.music.local.LocalPlaylist INSTANCE = null;
    
    /**
     * 读取本地歌单集合
     * @return 本地歌单集合返回
     */
    private final com.example.music.music.local.data.LocalPlaylistArrayData read() {
        return null;
    }
    
    /**
     * 创建一个本地歌单
     * 传入 [name] 歌单名称，[description] 歌单描述，[imageUrl] 歌单封面链接
     */
    public final void create(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.lang.String imageUrl) {
    }
    
    /**
     * 保存本地歌单数据
     * 传入旧数据 [oldData]
     */
    public final void save(@org.jetbrains.annotations.NotNull()
    com.example.music.music.local.data.LocalPlaylistArrayData oldData) {
    }
    
    private LocalPlaylist() {
        super();
    }
}