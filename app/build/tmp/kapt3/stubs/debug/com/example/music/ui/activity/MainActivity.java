package com.example.music.ui.activity;

import java.lang.System;

/**
 * MainActivity
 */
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0019\u001aB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0003J\b\u0010\u0012\u001a\u00020\u0010H\u0002J\b\u0010\u0013\u001a\u00020\u0010H\u0002J\u0012\u0010\u0014\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\b\u0010\u0017\u001a\u00020\u0010H\u0014J\b\u0010\u0018\u001a\u00020\u0010H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00060\u0006R\u00020\u0000X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u0012\u0010\r\u001a\u00060\u000eR\u00020\u0000X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/example/music/ui/activity/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/example/music/databinding/ActivityMainBinding;", "loginReceiver", "Lcom/example/music/ui/activity/MainActivity$LoginReceiver;", "mainViewModel", "Lcom/example/music/ui/viewmodel/MainViewModel;", "getMainViewModel", "()Lcom/example/music/ui/viewmodel/MainViewModel;", "mainViewModel$delegate", "Lkotlin/Lazy;", "musicBroadcastReceiver", "Lcom/example/music/ui/activity/MainActivity$MusicBroadcastReceiver;", "initData", "", "initListener", "initObserve", "initView", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "refreshPlayState", "LoginReceiver", "MusicBroadcastReceiver", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.example.music.databinding.ActivityMainBinding binding;
    private com.example.music.ui.activity.MainActivity.MusicBroadcastReceiver musicBroadcastReceiver;
    private com.example.music.ui.activity.MainActivity.LoginReceiver loginReceiver;
    private final kotlin.Lazy mainViewModel$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.example.music.ui.viewmodel.MainViewModel getMainViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initData() {
    }
    
    private final void initView() {
    }
    
    @android.annotation.SuppressLint(value = {"WrongConstant"})
    private final void initListener() {
    }
    
    private final void initObserve() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    /**
     * 刷新播放状态
     */
    private final void refreshPlayState() {
    }
    
    public MainActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\t"}, d2 = {"Lcom/example/music/ui/activity/MainActivity$MusicBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "(Lcom/example/music/ui/activity/MainActivity;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "app_debug"})
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
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\t"}, d2 = {"Lcom/example/music/ui/activity/MainActivity$LoginReceiver;", "Landroid/content/BroadcastReceiver;", "(Lcom/example/music/ui/activity/MainActivity;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "app_debug"})
    public final class LoginReceiver extends android.content.BroadcastReceiver {
        
        @java.lang.Override()
        public void onReceive(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        android.content.Intent intent) {
        }
        
        public LoginReceiver() {
            super();
        }
    }
}