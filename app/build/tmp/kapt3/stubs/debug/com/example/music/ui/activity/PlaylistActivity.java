package com.example.music.ui.activity;

import java.lang.System;

/**
 * 歌单 Activity
 * 最新要求：兼容 网易和 QQ
 */
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 (2\u00020\u0001:\u0002()B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0002J\u0018\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\nH\u0002J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\nH\u0003J4\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\n2\"\u0010\u0015\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00180\u0017j\b\u0012\u0004\u0012\u00020\u0018`\u0019\u0012\u0004\u0012\u00020\u000e0\u0016H\u0002J*\u0010\u001a\u001a\u00020\u000e2\u0016\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u00180\u0017j\b\u0012\u0004\u0012\u00020\u0018`\u00192\b\b\u0002\u0010\u001c\u001a\u00020\fH\u0003J\b\u0010\u001d\u001a\u00020\u000eH\u0002J\u0012\u0010\u001e\u001a\u00020\u000e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0014J\b\u0010!\u001a\u00020\u000eH\u0014J\b\u0010\"\u001a\u00020\u000eH\u0014J\b\u0010#\u001a\u00020\u000eH\u0002J\b\u0010$\u001a\u00020\u000eH\u0002J\u0010\u0010%\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\'H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00060\bR\u00020\u0000X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lcom/example/music/ui/activity/PlaylistActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/example/music/databinding/ActivityPlaylistBinding;", "detailPlaylistAdapter", "Lcom/example/music/adapter/DetailPlaylistAdapter;", "musicBroadcastReceiver", "Lcom/example/music/ui/activity/PlaylistActivity$MusicBroadcastReceiver;", "playlistId", "", "playlistSource", "", "initData", "", "initListener", "initPlaylist", "source", "id", "initPlaylistInfo", "initPlaylistSongs", "success", "Lkotlin/Function1;", "Ljava/util/ArrayList;", "Lcom/example/music/music/standard/data/StandardSongData;", "Lkotlin/collections/ArrayList;", "initRecycleView", "songList", "tag", "initView", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onStart", "refreshLayoutPlay", "refreshPlayState", "setBackground", "bitmap", "Landroid/graphics/Bitmap;", "Companion", "MusicBroadcastReceiver", "app_debug"})
public final class PlaylistActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.example.music.databinding.ActivityPlaylistBinding binding;
    private com.example.music.ui.activity.PlaylistActivity.MusicBroadcastReceiver musicBroadcastReceiver;
    private com.example.music.adapter.DetailPlaylistAdapter detailPlaylistAdapter;
    private long playlistId = -1L;
    private int playlistSource = 2;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_PLAYLIST_SOURCE = "int_playlist_source";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_LONG_PLAYLIST_ID = "int_playlist_id";
    @org.jetbrains.annotations.NotNull()
    public static final com.example.music.ui.activity.PlaylistActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initData() {
    }
    
    private final void initView() {
    }
    
    private final void initListener() {
    }
    
    private final void initPlaylist(int source, long id) {
    }
    
    /**
     * 初始化歌单信息
     */
    @android.annotation.SuppressLint(value = {"UseCompatLoadingForDrawables"})
    private final void initPlaylistInfo(long id) {
    }
    
    private final void setBackground(android.graphics.Bitmap bitmap) {
    }
    
    private final void refreshPlayState() {
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    /**
     * 刷新下方播放框
     * 可能导致 stick 丢失
     */
    private final void refreshLayoutPlay() {
    }
    
    private final void initPlaylistSongs(long id, kotlin.jvm.functions.Function1<? super java.util.ArrayList<com.example.music.music.standard.data.StandardSongData>, kotlin.Unit> success) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void initRecycleView(java.util.ArrayList<com.example.music.music.standard.data.StandardSongData> songList, int tag) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    public PlaylistActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\t"}, d2 = {"Lcom/example/music/ui/activity/PlaylistActivity$MusicBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "(Lcom/example/music/ui/activity/PlaylistActivity;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "app_debug"})
    public final class MusicBroadcastReceiver extends android.content.BroadcastReceiver {
        
        @java.lang.Override()
        public void onReceive(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        android.content.Intent intent) {
        }
        
        public MusicBroadcastReceiver() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/example/music/ui/activity/PlaylistActivity$Companion;", "", "()V", "EXTRA_LONG_PLAYLIST_ID", "", "EXTRA_PLAYLIST_SOURCE", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}