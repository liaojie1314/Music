package com.example.music.service;

import java.lang.System;

/**
 * 音乐服务
 * TODO 蓝牙耳机切歌、暂停
 */
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 ?2\u00020\u0001:\u0002?@B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010$\u001a\u00020%H\u0002J\b\u0010&\u001a\u00020%H\u0002J\b\u0010\'\u001a\u00020%H\u0002J\b\u0010(\u001a\u00020%H\u0002J\b\u0010)\u001a\u00020\u0010H\u0002J\b\u0010*\u001a\u00020+H\u0002J\b\u0010,\u001a\u00020+H\u0002J\b\u0010-\u001a\u00020+H\u0002J\u0012\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101H\u0016J\b\u00102\u001a\u00020+H\u0016J\b\u00103\u001a\u00020+H\u0016J\"\u00104\u001a\u00020\u00102\b\u00105\u001a\u0004\u0018\u0001012\u0006\u00106\u001a\u00020\u00102\u0006\u00107\u001a\u00020\u0010H\u0016J\b\u00108\u001a\u00020+H\u0002J\"\u00109\u001a\u00020+2\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020\u001f2\b\u0010=\u001a\u0004\u0018\u00010>H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u0011\u001a\u00060\u0012R\u00020\u00008BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001aX\u0082D\u00a2\u0006\u0002\n\u0000R\"\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001ej\n\u0012\u0004\u0012\u00020\u001f\u0018\u0001` X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010!\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\"R\u000e\u0010#\u001a\u00020\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006A"}, d2 = {"Lcom/example/music/service/MusicService;", "Landroid/app/Service;", "()V", "audioAttributes", "Landroid/media/AudioAttributes;", "audioFocusRequest", "Landroid/media/AudioFocusRequest;", "audioManager", "Landroid/media/AudioManager;", "mediaPlayer", "Landroid/media/MediaPlayer;", "mediaSession", "Landroid/support/v4/media/session/MediaSessionCompat;", "mediaSessionCallback", "Landroid/support/v4/media/session/MediaSessionCompat$Callback;", "mode", "", "musicBinder", "Lcom/example/music/service/MusicService$MusicBinder;", "getMusicBinder", "()Lcom/example/music/service/MusicService$MusicBinder;", "musicBinder$delegate", "Lkotlin/Lazy;", "notificationManager", "Landroid/app/NotificationManager;", "pitch", "", "pitchLevel", "pitchUnit", "playlist", "Ljava/util/ArrayList;", "Lcom/example/music/music/standard/data/StandardSongData;", "Lkotlin/collections/ArrayList;", "position", "Ljava/lang/Integer;", "speed", "getPendingIntentActivity", "Landroid/app/PendingIntent;", "getPendingIntentNext", "getPendingIntentPlay", "getPendingIntentPrevious", "getPlayIcon", "initAudioFocus", "", "initChannel", "initMediaSession", "onBind", "Landroid/os/IBinder;", "p0", "Landroid/content/Intent;", "onCreate", "onDestroy", "onStartCommand", "intent", "flags", "startId", "refreshNotification", "showNotification", "mediaStyle", "Landroidx/media/app/NotificationCompat$MediaStyle;", "song", "bitmap", "Landroid/graphics/Bitmap;", "Companion", "MusicBinder", "app_debug"})
public final class MusicService extends android.app.Service {
    private android.media.MediaPlayer mediaPlayer;
    private final kotlin.Lazy musicBinder$delegate = null;
    private java.util.ArrayList<com.example.music.music.standard.data.StandardSongData> playlist;
    private java.lang.Integer position = 0;
    private int mode;
    private android.app.NotificationManager notificationManager;
    private android.support.v4.media.session.MediaSessionCompat.Callback mediaSessionCallback;
    private android.support.v4.media.session.MediaSessionCompat mediaSession;
    private float speed = 1.0F;
    private float pitch = 1.0F;
    private int pitchLevel = 0;
    private final float pitchUnit = 0.05F;
    private android.media.AudioManager audioManager;
    private android.media.AudioAttributes audioAttributes;
    private android.media.AudioFocusRequest audioFocusRequest;
    public static final int MODE_CIRCLE = 1;
    public static final int MODE_REPEAT_ONE = 2;
    public static final int MODE_RANDOM = 3;
    public static final int CODE_PREVIOUS = 1;
    public static final int CODE_PLAY = 2;
    public static final int CODE_NEXT = 3;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CHANNEL_ID = "Music Channel Id";
    public static final int START_FOREGROUND_ID = 10;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.music.service.MusicService.Companion Companion = null;
    
    private final com.example.music.service.MusicService.MusicBinder getMusicBinder() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    /**
     * 初始化音频焦点
     */
    @org.jetbrains.annotations.TestOnly()
    private final void initAudioFocus() {
    }
    
    /**
     * 初始化媒体会话 MediaSession
     */
    private final void initMediaSession() {
    }
    
    @java.lang.Override()
    public int onStartCommand(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent, int flags, int startId) {
        return 0;
    }
    
    /**
     * 绑定
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.os.IBinder onBind(@org.jetbrains.annotations.Nullable()
    android.content.Intent p0) {
        return null;
    }
    
    private final void initChannel() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    private final android.app.PendingIntent getPendingIntentActivity() {
        return null;
    }
    
    private final android.app.PendingIntent getPendingIntentPrevious() {
        return null;
    }
    
    private final android.app.PendingIntent getPendingIntentPlay() {
        return null;
    }
    
    private final android.app.PendingIntent getPendingIntentNext() {
        return null;
    }
    
    /**
     * 刷新通知
     */
    private final void refreshNotification() {
    }
    
    /**
     * 显示通知
     */
    private final void showNotification(androidx.media.app.NotificationCompat.MediaStyle mediaStyle, com.example.music.music.standard.data.StandardSongData song, android.graphics.Bitmap bitmap) {
    }
    
    /**
     * 获取通知栏播放的图标
     */
    private final int getPlayIcon() {
        return 0;
    }
    
    public MusicService() {
        super();
    }
    
    /**
     * 内部类
     * MusicBinder
     */
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u000fH\u0016J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u000fH\u0016J\b\u0010\u0015\u001a\u00020\u000fH\u0016J\b\u0010\u0016\u001a\u00020\bH\u0016J\u001c\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0018j\n\u0012\u0004\u0012\u00020\u0013\u0018\u0001`\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u000fH\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\nH\u0016J\u0012\u0010\u001e\u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\"\u0010!\u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010\"\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u000fH\u0016J\u0012\u0010$\u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010%\u001a\u00020\nH\u0016J\b\u0010&\u001a\u00020\nH\u0016J\u0010\u0010\'\u001a\u00020\n2\u0006\u0010(\u001a\u00020\u000fH\u0016J\b\u0010)\u001a\u00020\nH\u0016J\b\u0010*\u001a\u00020\nH\u0016J\b\u0010+\u001a\u00020\nH\u0016J\b\u0010,\u001a\u00020\nH\u0002J\b\u0010-\u001a\u00020\nH\u0002J \u0010.\u001a\u00020\n2\u0016\u0010/\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u0018j\b\u0012\u0004\u0012\u00020\u0013`\u0019H\u0016J\u0010\u00100\u001a\u00020\n2\u0006\u00101\u001a\u00020\u000fH\u0016J\u0010\u00102\u001a\u00020\n2\u0006\u00103\u001a\u00020\u001cH\u0016J\u0010\u00104\u001a\u00020\n2\u0006\u00105\u001a\u000206H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00067"}, d2 = {"Lcom/example/music/service/MusicService$MusicBinder;", "Landroid/os/Binder;", "Lcom/example/music/service/MusicBinderInterface;", "Landroid/media/MediaPlayer$OnPreparedListener;", "Landroid/media/MediaPlayer$OnCompletionListener;", "Landroid/media/MediaPlayer$OnErrorListener;", "(Lcom/example/music/service/MusicService;)V", "isPrepared", "", "autoPlayNext", "", "changePlayMode", "changePlayState", "decreasePitchLevel", "getAudioSessionId", "", "getDuration", "getNowPosition", "getNowSongData", "Lcom/example/music/music/standard/data/StandardSongData;", "getPitchLevel", "getPlayMode", "getPlayState", "getPlaylist", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getProgress", "getSpeed", "", "increasePitchLevel", "onCompletion", "p0", "Landroid/media/MediaPlayer;", "onError", "p1", "p2", "onPrepared", "pause", "play", "playMusic", "songPosition", "playNext", "playPrevious", "sendBroadcast", "sendMusicBroadcast", "setPlaybackParams", "setPlaylist", "songListData", "setProgress", "newProgress", "setSpeed", "speed", "startPlayUrl", "url", "", "app_debug"})
    public final class MusicBinder extends android.os.Binder implements com.example.music.service.MusicBinderInterface, android.media.MediaPlayer.OnPreparedListener, android.media.MediaPlayer.OnCompletionListener, android.media.MediaPlayer.OnErrorListener {
        private boolean isPrepared = false;
        
        /**
         * 设置播放歌单
         */
        @java.lang.Override()
        public void setPlaylist(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<com.example.music.music.standard.data.StandardSongData> songListData) {
        }
        
        /**
         * 获取当前歌单全部
         */
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public java.util.ArrayList<com.example.music.music.standard.data.StandardSongData> getPlaylist() {
            return null;
        }
        
        /**
         * 播放音乐
         */
        @java.lang.Override()
        public void playMusic(int songPosition) {
        }
        
        private final void startPlayUrl(java.lang.String url) {
        }
        
        /**
         * 发送广播
         */
        private final void sendMusicBroadcast() {
        }
        
        /**
         * 准备完成
         */
        @java.lang.Override()
        public void onPrepared(@org.jetbrains.annotations.Nullable()
        android.media.MediaPlayer p0) {
        }
        
        /**
         * 更新播放状态
         * 播放或者暂停
         */
        @java.lang.Override()
        public void changePlayState() {
        }
        
        /**
         * 开始播放
         */
        @java.lang.Override()
        public void play() {
        }
        
        /**
         * 暂停播放
         */
        @java.lang.Override()
        public void pause() {
        }
        
        /**
         * 获取当前播放状态
         */
        @java.lang.Override()
        public boolean getPlayState() {
            return false;
        }
        
        /**
         * 获取总进度
         * getDuration 必须在 prepared 回调完成后才可以调用。
         */
        @java.lang.Override()
        public int getDuration() {
            return 0;
        }
        
        /**
         * 获取当前进度
         */
        @java.lang.Override()
        public int getProgress() {
            return 0;
        }
        
        /**
         * 设置进度
         */
        @java.lang.Override()
        public void setProgress(int newProgress) {
        }
        
        /**
         * 获取当前播放的音乐的信息
         */
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public com.example.music.music.standard.data.StandardSongData getNowSongData() {
            return null;
        }
        
        /**
         * 改变播放模式
         */
        @java.lang.Override()
        public void changePlayMode() {
        }
        
        /**
         * 获取当前播放模式
         */
        @java.lang.Override()
        public int getPlayMode() {
            return 0;
        }
        
        /**
         * 播放上一曲
         */
        @java.lang.Override()
        public void playPrevious() {
        }
        
        /**
         * 播放下一曲
         */
        @java.lang.Override()
        public void playNext() {
        }
        
        /**
         * 获取当前 position
         */
        @java.lang.Override()
        public int getNowPosition() {
            return 0;
        }
        
        /**
         * 获取 AudioSessionId，用于音效
         * 无则返回 0
         */
        @java.lang.Override()
        public int getAudioSessionId() {
            return 0;
        }
        
        /**
         * 外部请求发送广播
         */
        @java.lang.Override()
        public void sendBroadcast() {
        }
        
        /**
         * 设置播放速度
         */
        @java.lang.Override()
        public void setSpeed(float speed) {
        }
        
        /**
         * 获取播放速度
         */
        @java.lang.Override()
        public float getSpeed() {
            return 0.0F;
        }
        
        /**
         * 获取音高等级
         */
        @java.lang.Override()
        public int getPitchLevel() {
            return 0;
        }
        
        /**
         * 升调
         */
        @java.lang.Override()
        public void increasePitchLevel() {
        }
        
        /**
         * 降调
         */
        @java.lang.Override()
        public void decreasePitchLevel() {
        }
        
        /**
         * 设置 setPlaybackParams
         */
        private final void setPlaybackParams() {
        }
        
        /**
         * 歌曲完成后的回调，自动播放下一曲
         */
        @java.lang.Override()
        public void onCompletion(@org.jetbrains.annotations.Nullable()
        android.media.MediaPlayer p0) {
        }
        
        /**
         * 根据播放模式自动播放下一曲
         */
        private final void autoPlayNext() {
        }
        
        /**
         * 播放错误回调
         */
        @java.lang.Override()
        public boolean onError(@org.jetbrains.annotations.Nullable()
        android.media.MediaPlayer p0, int p1, int p2) {
            return false;
        }
        
        public MusicBinder() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/example/music/service/MusicService$Companion;", "", "()V", "CHANNEL_ID", "", "CODE_NEXT", "", "CODE_PLAY", "CODE_PREVIOUS", "MODE_CIRCLE", "MODE_RANDOM", "MODE_REPEAT_ONE", "START_FOREGROUND_ID", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}