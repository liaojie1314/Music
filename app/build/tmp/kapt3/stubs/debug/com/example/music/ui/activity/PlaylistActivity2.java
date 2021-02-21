package com.example.music.ui.activity;

import java.lang.System;

/**
 * 新版 Playlist
 */
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001e2\u00020\u0001:\u0003\u001e\u001f B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u0012H\u0014J\b\u0010\u0014\u001a\u00020\u0012H\u0014J\b\u0010\u0015\u001a\u00020\u0012H\u0015J\b\u0010\u0016\u001a\u00020\u0012H\u0014J\b\u0010\u0017\u001a\u00020\u0012H\u0014J\b\u0010\u0018\u001a\u00020\u0012H\u0014J\b\u0010\u0019\u001a\u00020\u0012H\u0002J\b\u0010\u001a\u001a\u00020\u0012H\u0002J\u0010\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001dH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00060\bR\u00020\u0000X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u0012\u0010\u000f\u001a\u00060\u0010R\u00020\u0000X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/example/music/ui/activity/PlaylistActivity2;", "Lcom/example/music/ui/base/BaseActivity;", "()V", "binding", "Lcom/example/music/databinding/ActivityPlaylistBinding;", "detailPlaylistAdapter", "Lcom/example/music/adapter/DetailPlaylistAdapter;", "musicBroadcastReceiver", "Lcom/example/music/ui/activity/PlaylistActivity2$MusicBroadcastReceiver;", "playlistViewModel", "Lcom/example/music/ui/viewmodel/PlaylistViewModel;", "getPlaylistViewModel", "()Lcom/example/music/ui/viewmodel/PlaylistViewModel;", "playlistViewModel$delegate", "Lkotlin/Lazy;", "updatePlaylistReceiver", "Lcom/example/music/ui/activity/PlaylistActivity2$UpdatePlaylistReceiver;", "initBinding", "", "initBroadcastReceiver", "initListener", "initObserver", "initView", "onDestroy", "onStart", "refreshLayoutPlay", "refreshPlayState", "setPicture", "bitmap", "Landroid/graphics/Bitmap;", "Companion", "MusicBroadcastReceiver", "UpdatePlaylistReceiver", "app_debug"})
public final class PlaylistActivity2 extends com.example.music.ui.base.BaseActivity {
    private com.example.music.databinding.ActivityPlaylistBinding binding;
    private com.example.music.ui.activity.PlaylistActivity2.MusicBroadcastReceiver musicBroadcastReceiver;
    private com.example.music.ui.activity.PlaylistActivity2.UpdatePlaylistReceiver updatePlaylistReceiver;
    private com.example.music.adapter.DetailPlaylistAdapter detailPlaylistAdapter;
    private final kotlin.Lazy playlistViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_PLAYLIST_SOURCE = "int_playlist_source";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_LONG_PLAYLIST_ID = "int_playlist_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_INT_TAG = "int_tag";
    @org.jetbrains.annotations.NotNull()
    public static final com.example.music.ui.activity.PlaylistActivity2.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.example.music.ui.viewmodel.PlaylistViewModel getPlaylistViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void initBinding() {
    }
    
    @java.lang.Override()
    protected void initView() {
    }
    
    @java.lang.Override()
    protected void initBroadcastReceiver() {
    }
    
    @java.lang.Override()
    protected void initListener() {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    @java.lang.Override()
    protected void initObserver() {
    }
    
    private final void refreshPlayState() {
    }
    
    /**
     * 刷新下方播放框
     * 可能导致 stick 丢失
     */
    private final void refreshLayoutPlay() {
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    /**
     * 设置图片
     */
    private final void setPicture(android.graphics.Bitmap bitmap) {
    }
    
    public PlaylistActivity2() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\t"}, d2 = {"Lcom/example/music/ui/activity/PlaylistActivity2$MusicBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "(Lcom/example/music/ui/activity/PlaylistActivity2;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "app_debug"})
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
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\t"}, d2 = {"Lcom/example/music/ui/activity/PlaylistActivity2$UpdatePlaylistReceiver;", "Landroid/content/BroadcastReceiver;", "(Lcom/example/music/ui/activity/PlaylistActivity2;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "app_debug"})
    public final class UpdatePlaylistReceiver extends android.content.BroadcastReceiver {
        
        @java.lang.Override()
        public void onReceive(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        android.content.Intent intent) {
        }
        
        public UpdatePlaylistReceiver() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/example/music/ui/activity/PlaylistActivity2$Companion;", "", "()V", "EXTRA_INT_TAG", "", "EXTRA_LONG_PLAYLIST_ID", "EXTRA_PLAYLIST_SOURCE", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}