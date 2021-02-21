package com.example.music.ui.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 -2\u00020\u0001:\u0002-.B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u001eH\u0014J\b\u0010 \u001a\u00020\u001eH\u0014J\b\u0010!\u001a\u00020\u001eH\u0015J\b\u0010\"\u001a\u00020\u001eH\u0014J\b\u0010#\u001a\u00020\u001eH\u0014J\b\u0010$\u001a\u00020\u001eH\u0014J\u001a\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u0010+\u001a\u00020\u001eH\u0002J\b\u0010,\u001a\u00020\u001eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00060\bR\u00020\u0000X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0010\u0010\fR\u001b\u0010\u0012\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0013\u0010\fR\u001b\u0010\u0015\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\u000e\u001a\u0004\b\u0016\u0010\fR\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001c\u0010\u000e\u001a\u0004\b\u001a\u0010\u001b\u00a8\u0006/"}, d2 = {"Lcom/example/music/ui/activity/PlayerActivity;", "Lcom/example/music/ui/base/SlideBackActivity;", "()V", "binding", "Lcom/example/music/databinding/ActivityPlayerLandBinding;", "handler", "Landroid/os/Handler;", "musicBroadcastReceiver", "Lcom/example/music/ui/activity/PlayerActivity$MusicBroadcastReceiver;", "objectAnimator", "Landroid/animation/ObjectAnimator;", "getObjectAnimator", "()Landroid/animation/ObjectAnimator;", "objectAnimator$delegate", "Lkotlin/Lazy;", "objectAnimatorBackground", "getObjectAnimatorBackground", "objectAnimatorBackground$delegate", "objectAnimatorTapeNextNormal", "getObjectAnimatorTapeNextNormal", "objectAnimatorTapeNextNormal$delegate", "objectAnimatorTapeNormal", "getObjectAnimatorTapeNormal", "objectAnimatorTapeNormal$delegate", "playViewModel", "Lcom/example/music/ui/viewmodel/PlayerViewModel;", "getPlayViewModel", "()Lcom/example/music/ui/viewmodel/PlayerViewModel;", "playViewModel$delegate", "finish", "", "initBinding", "initBroadcastReceiver", "initListener", "initObserver", "initView", "onDestroy", "onKeyDown", "", "keyCode", "", "event", "Landroid/view/KeyEvent;", "pauseRotateAlways", "startRotateAlways", "Companion", "MusicBroadcastReceiver", "app_debug"})
public final class PlayerActivity extends com.example.music.ui.base.SlideBackActivity {
    private com.example.music.databinding.ActivityPlayerLandBinding binding;
    private com.example.music.ui.activity.PlayerActivity.MusicBroadcastReceiver musicBroadcastReceiver;
    private final kotlin.Lazy playViewModel$delegate = null;
    private final android.os.Handler handler = null;
    private final kotlin.Lazy objectAnimator$delegate = null;
    private final kotlin.Lazy objectAnimatorBackground$delegate = null;
    private final kotlin.Lazy objectAnimatorTapeNormal$delegate = null;
    private final kotlin.Lazy objectAnimatorTapeNextNormal$delegate = null;
    private static final java.lang.String MUSIC_BROADCAST_ACTION = "com.example.music.MUSIC_BROADCAST";
    private static final long DELAY_MILLIS = 500L;
    private static final int MSG_PROGRESS = 0;
    private static final float BACKGROUND_SCALE_Y = 1.5F;
    private static final float BACKGROUND_SCALE_X = 2.5F;
    private static final int CD_SIZE = 240;
    private static final int BLUR_RADIUS = 15;
    private static final int BLUR_SAMPLING = 5;
    private static final long DURATION_CD = 25000L;
    private static final long DURATION_BACKGROUND = 50000L;
    private static final long DURATION_TAPE = 6000L;
    private static final int ANIMATION_REPEAT_COUNTS = -1;
    private static final java.lang.String ANIMATION_PROPERTY_NAME = "rotation";
    @org.jetbrains.annotations.NotNull()
    public static final com.example.music.ui.activity.PlayerActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.example.music.ui.viewmodel.PlayerViewModel getPlayViewModel() {
        return null;
    }
    
    private final android.animation.ObjectAnimator getObjectAnimator() {
        return null;
    }
    
    private final android.animation.ObjectAnimator getObjectAnimatorBackground() {
        return null;
    }
    
    private final android.animation.ObjectAnimator getObjectAnimatorTapeNormal() {
        return null;
    }
    
    private final android.animation.ObjectAnimator getObjectAnimatorTapeNextNormal() {
        return null;
    }
    
    @java.lang.Override()
    protected void initBinding() {
    }
    
    @java.lang.Override()
    protected void initView() {
    }
    
    @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
    @java.lang.Override()
    protected void initListener() {
    }
    
    @java.lang.Override()
    protected void initBroadcastReceiver() {
    }
    
    @java.lang.Override()
    protected void initObserver() {
    }
    
    /**
     * 开启旋转动画
     */
    private final void startRotateAlways() {
    }
    
    /**
     * 关闭旋转动画
     */
    private final void pauseRotateAlways() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @java.lang.Override()
    public void finish() {
    }
    
    /**
     * 监听音量物理按键
     */
    @java.lang.Override()
    public boolean onKeyDown(int keyCode, @org.jetbrains.annotations.Nullable()
    android.view.KeyEvent event) {
        return false;
    }
    
    public PlayerActivity() {
        super();
    }
    
    /**
     * 内部类
     * 音乐广播接收器
     */
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\t"}, d2 = {"Lcom/example/music/ui/activity/PlayerActivity$MusicBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "(Lcom/example/music/ui/activity/PlayerActivity;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "app_debug"})
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
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000eX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000eX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/example/music/ui/activity/PlayerActivity$Companion;", "", "()V", "ANIMATION_PROPERTY_NAME", "", "ANIMATION_REPEAT_COUNTS", "", "BACKGROUND_SCALE_X", "", "BACKGROUND_SCALE_Y", "BLUR_RADIUS", "BLUR_SAMPLING", "CD_SIZE", "DELAY_MILLIS", "", "DURATION_BACKGROUND", "DURATION_CD", "DURATION_TAPE", "MSG_PROGRESS", "MUSIC_BROADCAST_ACTION", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}