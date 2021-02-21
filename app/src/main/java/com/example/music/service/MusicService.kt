package com.example.music.service

import android.app.*
import android.content.ContentUris
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.graphics.Bitmap
import android.media.*
import android.net.Uri
import android.os.*
import android.support.v4.media.MediaMetadataCompat
import android.support.v4.media.session.MediaSessionCompat
import android.support.v4.media.session.PlaybackStateCompat
import android.view.KeyEvent
import androidx.core.app.NotificationCompat
import com.example.music.MyApplication
import com.example.music.R
import com.example.music.broadcast.BecomingNoisyReceiver
import com.example.music.music.local.PlayHistory
import com.example.music.music.netease.SongUrl
import com.example.music.music.standard.SongPicture
import com.example.music.music.standard.data.*
import com.example.music.ui.activity.MainActivity
import com.example.music.ui.activity.PlayerActivity
import com.example.music.util.*
import org.jetbrains.annotations.TestOnly

/**
 * 音乐服务
 * TODO 蓝牙耳机切歌、暂停
 */
class MusicService : Service() {

    companion object {
        const val MODE_CIRCLE = 1 // 列表循环
        const val MODE_REPEAT_ONE = 2 // 单曲循环
        const val MODE_RANDOM = 3 // 随机播放

        const val CODE_PREVIOUS = 1 // 按钮事件，上一曲
        const val CODE_PLAY = 2 // 按钮事件，播放或者暂停
        const val CODE_NEXT = 3 // 按钮事件，下一曲

        const val CHANNEL_ID = "Music Channel Id" // 通知通道 ID
        const val START_FOREGROUND_ID = 10 // 开启前台服务的 ID
    }

    private var mediaPlayer: MediaPlayer? = null // 定义 MediaPlayer
    private val musicBinder by lazy { MusicBinder() } // 懒加载 musicBinder
    private var playlist: ArrayList<StandardSongData>? = null // 当前歌单
    private var position: Int? = 0 // 当前歌曲在 List 中的下标
    private var mode: Int = MyApplication.mmkv.decodeInt(Config.PLAY_MODE, MODE_CIRCLE)
    private var notificationManager: NotificationManager? = null // 通知管理

    private var mediaSessionCallback: MediaSessionCompat.Callback? = null
    private var mediaSession: MediaSessionCompat? = null

    private var speed = 1f // 默认播放速度，0f 表示暂停
    private var pitch = 1f // 默认音高
    private var pitchLevel = 0 // 音高等级
    private val pitchUnit = 0.05f // 音高单元，每次改变的音高单位

    private lateinit var audioManager: AudioManager
    private lateinit var audioAttributes: AudioAttributes
    private lateinit var audioFocusRequest: AudioFocusRequest

    override fun onCreate() {
        super.onCreate()

        notificationManager =
            getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager // 要在初始化通道前
        // 初始化 MediaSession
        initMediaSession()
        // 初始化通道
        initChannel()
        // 初始化音频焦点
        val mediaStyle = androidx.media.app.NotificationCompat.MediaStyle()
            .setMediaSession(mediaSession?.sessionToken)
        val notification = NotificationCompat.Builder(this, CHANNEL_ID)
            .setSmallIcon(R.drawable.ic_music_launcher_foreground)
            .setContentTitle("聆听好音乐")
            .setContentText("Music")
            .setContentIntent(getPendingIntentActivity())
            .setStyle(mediaStyle)
            .setOngoing(false)
            .build()
        startForeground(START_FOREGROUND_ID, notification)
    }

    /**
     * 初始化音频焦点
     */
    @TestOnly
    private fun initAudioFocus() {
        audioManager = getSystemService(AUDIO_SERVICE) as AudioManager
        audioAttributes = AudioAttributes.Builder()
            .setUsage(AudioAttributes.USAGE_GAME)
            .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
            .build()
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            audioFocusRequest = AudioFocusRequest.Builder(AudioManager.AUDIOFOCUS_GAIN)
                .setAudioAttributes(audioAttributes)
                .setOnAudioFocusChangeListener { focusChange ->
                    when (focusChange) {
                        AudioManager.AUDIOFOCUS_GAIN -> musicBinder.play()
                        AudioManager.AUDIOFOCUS_GAIN_TRANSIENT -> musicBinder.play()
                        AudioManager.AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK -> musicBinder.play()
                        AudioManager.AUDIOFOCUS_LOSS -> musicBinder.pause()
                        AudioManager.AUDIOFOCUS_LOSS_TRANSIENT -> musicBinder.pause()
                        AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK -> musicBinder.pause()
                    }
                }.build()
            audioManager.requestAudioFocus(audioFocusRequest)
        }

    }

    /**
     * 初始化媒体会话 MediaSession
     */
    private fun initMediaSession() {
        val intentFilter = IntentFilter(AudioManager.ACTION_AUDIO_BECOMING_NOISY)

        var myNoisyAudioStreamReceiverTag = false
        val myNoisyAudioStreamReceiver = BecomingNoisyReceiver()
        // 媒体会话的回调，Service 控制通知这个 Callback 来控制 MediaPlayer
        mediaSessionCallback = object : MediaSessionCompat.Callback() {
            // 播放
            override fun onPlay() {
                // 注册广播
                if (!myNoisyAudioStreamReceiverTag) {
                    registerReceiver(myNoisyAudioStreamReceiver, intentFilter)
                    myNoisyAudioStreamReceiverTag = true
                }

                mediaSession?.setPlaybackState(
                    PlaybackStateCompat.Builder()
                        .setState(
                            PlaybackStateCompat.STATE_PLAYING,
                            (MyApplication.musicBinderInterface?.getProgress() ?: 0).toLong(),
                            1f
                        )
                        .setActions(PlaybackStateCompat.ACTION_SEEK_TO)
                        .build()
                )
            }

            // 暂停
            override fun onPause() {
                mediaSession?.setPlaybackState(
                    PlaybackStateCompat.Builder()
                        .setState(
                            PlaybackStateCompat.STATE_PAUSED,
                            (MyApplication.musicBinderInterface?.getProgress() ?: 0).toLong(),
                            1f
                        )
                        .setActions(PlaybackStateCompat.ACTION_SEEK_TO)
                        .build()
                )
            }

            // 播放下一首
            override fun onSkipToNext() {
                musicBinder.playNext()
            }

            // 播放上一首
            override fun onSkipToPrevious() {
                // AudioPlayer.get().prev()
            }

            // 关闭
            override fun onStop() {
                // 注销广播
                if (myNoisyAudioStreamReceiverTag) {
                    unregisterReceiver(myNoisyAudioStreamReceiver)
                    myNoisyAudioStreamReceiverTag = false
                }
            }

            // 跳转
            override fun onSeekTo(pos: Long) {
                mediaPlayer?.seekTo(pos.toInt())
                if (musicBinder.getPlayState()) {
                    onPlay()
                }
            }

            override fun onMediaButtonEvent(mediaButtonEvent: Intent?): Boolean {
                if (mediaButtonEvent != null) {
                    val keyEvent =
                        mediaButtonEvent.getParcelableExtra(Intent.EXTRA_KEY_EVENT) as KeyEvent?
                    when (mediaButtonEvent.action) {
                        Intent.ACTION_MEDIA_BUTTON -> {
                            if (keyEvent != null) {
                                when (keyEvent.action) {
                                    // 按键按下
                                    KeyEvent.ACTION_DOWN -> {
                                        when (keyEvent.keyCode) {
                                            KeyEvent.KEYCODE_MEDIA_PLAY -> { // 播放按钮
                                                MyApplication.musicBinderInterface?.play()
                                            }
                                            KeyEvent.KEYCODE_MEDIA_PLAY_PAUSE -> {
                                                MyApplication.musicBinderInterface?.changePlayState()
                                            }
                                            KeyEvent.KEYCODE_MEDIA_PAUSE -> {
                                                MyApplication.musicBinderInterface?.pause()
                                            }
                                            KeyEvent.KEYCODE_MEDIA_NEXT -> { // 下一首
                                                // toast("KEY_NEXT")
                                                MyApplication.musicBinderInterface?.playNext()
                                            }
                                            KeyEvent.KEYCODE_MEDIA_PREVIOUS -> { // 上一首
                                                // toast("KEY_PREVIOUS")
                                                MyApplication.musicBinderInterface?.playPrevious()
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return true
            }

        }
        // 初始化 MediaSession
        mediaSession = MediaSessionCompat(this, "MusicService").apply {
            // 设置 Callback
            setCallback(mediaSessionCallback, Handler(Looper.getMainLooper()))
            // 把 MediaSession 置为 active，这样才能开始接收各种信息
            if (!isActive) {
                isActive = true
            }
        }
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        when (intent?.getIntExtra("int_code", 0)) {
            CODE_PREVIOUS -> musicBinder.playPrevious()
            CODE_PLAY -> {
                if (musicBinder.getPlayState()) {
                    musicBinder.pause()
                } else {
                    musicBinder.play()
                }
            }
            CODE_NEXT -> musicBinder.playNext()
        }
        return START_NOT_STICKY // 非粘性服务
    }

    /**
     * 绑定
     */
    override fun onBind(p0: Intent?): IBinder {
        return musicBinder
    }

    private fun initChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val name = "Music Notification"
            val descriptionText = "Music 音乐通知"
            val importance = NotificationManager.IMPORTANCE_LOW
            val channel = NotificationChannel(CHANNEL_ID, name, importance)
            channel.description = descriptionText
            notificationManager?.createNotificationChannel(channel)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        // 释放 mediaSession
        mediaSession?.let {
            it.setCallback(null)
            it.release()
        }
    }

    /**
     * 内部类
     * MusicBinder
     */
    inner class MusicBinder : Binder(), MusicBinderInterface, MediaPlayer.OnPreparedListener,
        MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener {

        private var isPrepared = false // 音乐是否准备完成

        /**
         * 设置播放歌单
         */
        override fun setPlaylist(songListData: ArrayList<StandardSongData>) {
            playlist = songListData
        }

        /**
         * 获取当前歌单全部
         */
        override fun getPlaylist(): ArrayList<StandardSongData>? {
            return playlist
        }

        /**
         * 播放音乐
         */
        override fun playMusic(songPosition: Int) {
            isPrepared = false
            position = songPosition
            loge("MusicService songPosition:${position}")
            loge("MusicService 歌单歌曲数量:${playlist?.size}")
            // 当前的歌曲
            val song = playlist?.get(position ?: 0)

            // 如果 MediaPlayer 已经存在，释放
            if (mediaPlayer != null) {
                mediaPlayer?.reset()
                mediaPlayer?.release()
                mediaPlayer = null
            }

            when (song?.source) {
                SOURCE_NETEASE -> {
                    startPlayUrl(SongUrl.getSongUrl(song.id))
                }
                SOURCE_LOCAL -> {
                    val id = song.id.toLong()
                    val contentUri: Uri =
                        ContentUris.withAppendedId(
                            android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI,
                            id
                        )

                    mediaPlayer = MediaPlayer().apply {
                        setOnPreparedListener(this@MusicBinder) // 歌曲准备完成的监听
                        setOnCompletionListener(this@MusicBinder) // 歌曲完成后的回调
                        setOnErrorListener(this@MusicBinder)
                        setDataSource(applicationContext, contentUri)
                        prepareAsync()
                    }
                }
                SOURCE_example -> {
                    song.dirrorInfo?.let {
                        // toast(it.url)
                        startPlayUrl(it.url)
                    }
                }
            }

        }

        private fun startPlayUrl(url: String) {

            if (!InternetState.isWifi(MyApplication.context) && !MyApplication.mmkv.decodeBool(
                    Config.PLAY_ON_MOBILE,
                    false
                )
            ) {
                toast("移动网络下已禁止播放,请在设置中打开选项")
            } else {
                // 初始化
                mediaPlayer = MediaPlayer()
                mediaPlayer?.let {
                    it.setOnPreparedListener(this@MusicBinder) // 歌曲准备完成的监听
                    it.setOnCompletionListener(this@MusicBinder) // 歌曲完成后的回调
                    it.setOnErrorListener(this@MusicBinder)
                    it.setDataSource(url)
                    it.prepareAsync()
                }
            }
        }

        /**
         * 发送广播
         */
        private fun sendMusicBroadcast() {
            // Service 通知
            val intent = Intent("com.example.music.MUSIC_BROADCAST")
            intent.setPackage(packageName)
            sendBroadcast(intent)
        }

        /**
         * 准备完成
         */
        override fun onPrepared(p0: MediaPlayer?) {
            isPrepared = true
            p0?.start()
            sendMusicBroadcast()
            refreshNotification()
            setPlaybackParams()
            // 添加到播放历史
            getNowSongData()?.let {
                PlayHistory.addPlayHistory(it)
            }
        }

        /**
         * 更新播放状态
         * 播放或者暂停
         */
        override fun changePlayState() {
            val isPlaying = mediaPlayer?.isPlaying
            isPlaying?.let {
                if (it) {
                    mediaPlayer?.pause()
                    mediaSessionCallback?.onPause()
                } else {
                    mediaPlayer?.start()
                    mediaSessionCallback?.onPlay()
                }
            }
            sendMusicBroadcast()
            refreshNotification()
        }

        /**
         * 开始播放
         */
        override fun play() {
            mediaPlayer?.start()
            mediaSessionCallback?.onPlay()
            sendMusicBroadcast()
            refreshNotification()
        }

        /**
         * 暂停播放
         */
        override fun pause() {
            mediaPlayer?.pause()
            mediaSessionCallback?.onPause()
            sendMusicBroadcast()
            refreshNotification()
        }

        /**
         * 获取当前播放状态
         */
        override fun getPlayState(): Boolean {
            return mediaPlayer?.isPlaying ?: false
        }

        /**
         * 获取总进度
         * getDuration 必须在 prepared 回调完成后才可以调用。
         */
        override fun getDuration(): Int {
            return if (isPrepared) {
                mediaPlayer?.duration ?: 0
            } else {
                0
            }
        }

        /**
         * 获取当前进度
         */
        override fun getProgress(): Int {
            return if (isPrepared) {
                mediaPlayer?.currentPosition ?: 0
            } else {
                0
            }
        }

        /**
         * 设置进度
         */
        override fun setProgress(newProgress: Int) {
            mediaPlayer?.seekTo(newProgress)
            mediaSessionCallback?.onPlay()
            // refreshNotification()
        }

        /**
         * 获取当前播放的音乐的信息
         */
        override fun getNowSongData(): StandardSongData? {
            return playlist?.get(position!!)
        }

        /**
         * 改变播放模式
         */
        override fun changePlayMode() {
            when (mode) {
                MODE_CIRCLE -> mode = MODE_REPEAT_ONE
                MODE_REPEAT_ONE -> mode = MODE_RANDOM
                MODE_RANDOM -> mode = MODE_CIRCLE
            }
            // 将播放模式存储
            MyApplication.mmkv.encode(Config.PLAY_MODE, mode)
            sendMusicBroadcast()
        }

        /**
         * 获取当前播放模式
         */
        override fun getPlayMode(): Int {
            return mode
        }

        /**
         * 播放上一曲
         */
        override fun playPrevious() {
            // 设置 position
            position = when (mode) {
                MODE_RANDOM -> {
                    playlist?.let {
                        (0..it.lastIndex).random()
                    }
                }
                // 单曲循环或者歌单顺序播放
                else -> {
                    // 如果当前是第一首，就跳到最后一首播放
                    if (position == 0) {
                        playlist?.lastIndex
                    } else {
                        // 否则播放上一首
                        position?.minus(1)
                    }
                }
            }
            // position 非空，调用播放方法
            position?.let { playMusic(it) }
        }

        /**
         * 播放下一曲
         */
        override fun playNext() {
            playlist?.let {
                position = when (mode) {
                    MODE_RANDOM -> {
                        (0..it.lastIndex).random()
                    }
                    else -> {
                        if (position == it.lastIndex) {
                            0
                        } else {
                            position?.plus(1)
                        }
                    }
                }
            }
            position?.let {
                playMusic(it)
            }
        }

        /**
         * 获取当前 position
         */
        override fun getNowPosition(): Int {
            return position ?: -1
        }

        /**
         * 获取 AudioSessionId，用于音效
         * 无则返回 0
         */
        override fun getAudioSessionId(): Int {
            return mediaPlayer?.audioSessionId ?: 0
        }

        /**
         * 外部请求发送广播
         */
        override fun sendBroadcast() {
            sendMusicBroadcast()
        }

        /**
         * 设置播放速度
         */
        override fun setSpeed(speed: Float) {
            this@MusicService.speed = speed
            setPlaybackParams()
        }

        /**
         * 获取播放速度
         */
        override fun getSpeed(): Float {
            return speed
        }

        /**
         * 获取音高等级
         */
        override fun getPitchLevel(): Int {
            return pitchLevel
        }

        /**
         * 升调
         */
        override fun increasePitchLevel() {
            pitchLevel++
            val value = pitchUnit * (pitchLevel + 1f / pitchUnit)
            if (value < 1.5f) {
                pitch = value
                setPlaybackParams()
            } else {
                decreasePitchLevel()
            }
        }

        /**
         * 降调
         */
        override fun decreasePitchLevel() {
            pitchLevel--
            val value = pitchUnit * (pitchLevel + 1f / pitchUnit)
            if (value > 0.5f) {
                pitch = value
                setPlaybackParams()
            } else {
                increasePitchLevel()
            }
        }

        /**
         * 设置 setPlaybackParams
         */
        private fun setPlaybackParams() {
            if (isPrepared) {
                mediaPlayer?.let {
                    try {
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                            val playbackParams = it.playbackParams
                            playbackParams.pitch = pitch
                            it.playbackParams = playbackParams
                        }
                    } catch (e: Exception) {

                    }

                    // }
                }
            }
        }

        /**
         * 歌曲完成后的回调，自动播放下一曲
         */
        override fun onCompletion(p0: MediaPlayer?) {
            autoPlayNext()
        }

        /**
         * 根据播放模式自动播放下一曲
         */
        private fun autoPlayNext() {
            when (mode) {
                MODE_CIRCLE -> {
                    position = if (position == playlist?.lastIndex) {
                        0
                    } else {
                        position?.plus(1)
                    }
                }
                // 单曲循环
                MODE_REPEAT_ONE -> {
                    setProgress(0)
                    play()
                    return
                }
                MODE_RANDOM -> {
                    position = (0..playlist?.lastIndex!!).random()
                }
            }
            playMusic(position ?: 0)
        }

        /**
         * 播放错误回调
         */
        override fun onError(p0: MediaPlayer?, p1: Int, p2: Int): Boolean {
            if (MyApplication.mmkv.decodeBool(Config.SKIP_ERROR_MUSIC, true)) {
                // 播放下一首
                toast("播放错误，开始播放下一首")
                playNext()
            } else {
                toast("播放错误")
            }
            return true
        }

    }

    private fun getPendingIntentActivity(): PendingIntent {
        val intentMain = Intent(this, MainActivity::class.java)
        val intentPlayer = Intent(this, PlayerActivity::class.java)
        val intents = arrayOf(intentMain, intentPlayer)
        return PendingIntent.getActivities(this, 1, intents, PendingIntent.FLAG_UPDATE_CURRENT)
    }

    private fun getPendingIntentPrevious(): PendingIntent {
        val intent = Intent(this, MusicService::class.java)
        intent.putExtra("int_code", CODE_PREVIOUS)
        return PendingIntent.getService(this, 2, intent, PendingIntent.FLAG_UPDATE_CURRENT)
    }

    private fun getPendingIntentPlay(): PendingIntent {
        val intent = Intent(this, MusicService::class.java)
        intent.putExtra("int_code", CODE_PLAY)
        return PendingIntent.getService(this, 3, intent, PendingIntent.FLAG_UPDATE_CURRENT)
    }

    private fun getPendingIntentNext(): PendingIntent {
        val intent = Intent(this, MusicService::class.java)
        intent.putExtra("int_code", CODE_NEXT)
        return PendingIntent.getService(this, 4, intent, PendingIntent.FLAG_UPDATE_CURRENT)
    }

    /**
     * 刷新通知
     */
    private fun refreshNotification() {

        val song = musicBinder.getNowSongData()
        mediaSession?.apply {
            setMetadata(
                MediaMetadataCompat.Builder()
                    .putLong(
                        MediaMetadata.METADATA_KEY_DURATION,
                        (MyApplication.musicBinderInterface?.getDuration() ?: 0).toLong()
                    )
                    .build()
            )
            setPlaybackState(
                PlaybackStateCompat.Builder()
                    .setState(
                        PlaybackStateCompat.STATE_PLAYING,
                        (MyApplication.musicBinderInterface?.getProgress() ?: 0).toLong(),
                        1f
                    )
                    .setActions(PlaybackStateCompat.ACTION_SEEK_TO)
                    .build()
            )
            setCallback(mediaSessionCallback)
            isActive = true // 必须设置为true，这样才能开始接收各种信息
        }

        if (!musicBinder.getPlayState()) {
            mediaSessionCallback?.onPause()
        }

        val mediaStyle = androidx.media.app.NotificationCompat.MediaStyle()
            .setMediaSession(mediaSession?.sessionToken)
            .setShowActionsInCompactView(0, 1, 2)
        if (song != null) {
            SongPicture.getPlayerActivityCoverBitmap(song, 100.dp()) { bitmap ->
                showNotification(mediaStyle, song, bitmap)
            }
        }

    }

    /**
     * 显示通知
     */
    private fun showNotification(
        mediaStyle: androidx.media.app.NotificationCompat.MediaStyle,
        song: StandardSongData,
        bitmap: Bitmap?
    ) {

        val notification = NotificationCompat.Builder(this, CHANNEL_ID)
            .setSmallIcon(R.drawable.ic_music_launcher_foreground)
            .setLargeIcon(bitmap)
            .setContentTitle(song.name)
            .setContentText(song.artists?.let { it1 -> parseArtist(it1) })
            .setContentIntent(getPendingIntentActivity())
            .addAction(
                R.drawable.ic_baseline_skip_previous_24,
                "Previous",
                getPendingIntentPrevious()
            )
            .addAction(getPlayIcon(), "play", getPendingIntentPlay())
            .addAction(R.drawable.ic_baseline_skip_next_24, "next", getPendingIntentNext())
            .setStyle(mediaStyle)
            .setOngoing(true)
            // .setTicker("Dso") 魅族状态栏歌词的实现方法
            // .setAutoCancel(true)
            .build()
        // 更新通知
        startForeground(START_FOREGROUND_ID, notification)
    }

    /**
     * 获取通知栏播放的图标
     */
    private fun getPlayIcon(): Int {
        return if (musicBinder.getPlayState()) {
            R.drawable.ic_baseline_pause_24
        } else {
            R.drawable.ic_baseline_play_arrow_24
        }
    }
}