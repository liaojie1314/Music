package com.example.music.ui.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001bB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\u0012\u0010\n\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\b\u0010\r\u001a\u00020\bH\u0014J-\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00102\u000e\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0016\u00a2\u0006\u0002\u0010\u0016J\b\u0010\u0017\u001a\u00020\bH\u0002J\b\u0010\u0018\u001a\u00020\bH\u0002J\b\u0010\u0019\u001a\u00020\bH\u0002J\b\u0010\u001a\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00060\u0006R\u00020\u0000X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/example/music/ui/activity/LocalMusicActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/example/music/databinding/ActivityLocalMusicBinding;", "musicBroadcastReceiver", "Lcom/example/music/ui/activity/LocalMusicActivity$MusicBroadcastReceiver;", "initData", "", "initListener", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onRequestPermissionsResult", "requestCode", "", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "refreshLayoutPlay", "refreshPlayState", "scanLocalMusic", "scanLocalMusicByCheckPermission", "MusicBroadcastReceiver", "app_debug"})
public final class LocalMusicActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.example.music.databinding.ActivityLocalMusicBinding binding;
    private com.example.music.ui.activity.LocalMusicActivity.MusicBroadcastReceiver musicBroadcastReceiver;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initData() {
    }
    
    private final void initListener() {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    private final void scanLocalMusicByCheckPermission() {
    }
    
    private final void scanLocalMusic() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    private final void refreshPlayState() {
    }
    
    private final void refreshLayoutPlay() {
    }
    
    public LocalMusicActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\t"}, d2 = {"Lcom/example/music/ui/activity/LocalMusicActivity$MusicBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "(Lcom/example/music/ui/activity/LocalMusicActivity;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "app_debug"})
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
}