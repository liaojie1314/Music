package com.example.music.ui.activity

import android.animation.ObjectAnimator
import android.annotation.SuppressLint
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.content.res.Configuration
import android.os.Handler
import android.os.Looper
import android.os.Message
import android.view.KeyEvent
import android.view.View
import android.view.WindowInsetsController
import android.view.animation.LinearInterpolator
import android.widget.SeekBar
import androidx.activity.viewModels
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.palette.graphics.Palette
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.dirror.lyricviewx.OnPlayClickListener
import com.dirror.lyricviewx.OnSingleClickListener
import com.example.music.MyApplication
import com.example.music.R
import com.example.music.audio.VolumeManager
import com.example.music.databinding.ActivityPlayerLandBinding
import com.example.music.music.standard.SongPicture
import com.example.music.music.standard.data.SOURCE_LOCAL
import com.example.music.music.standard.data.SOURCE_NETEASE
import com.example.music.service.MusicService
import com.example.music.ui.base.SlideBackActivity
import com.example.music.ui.dialog.PlayerMenuMoreDialog
import com.example.music.ui.dialog.PlaylistDialog
import com.example.music.ui.dialog.SoundEffectDialog
import com.example.music.ui.viewmodel.PlayerViewModel
import com.example.music.util.*
import jp.wasabeef.glide.transformations.BlurTransformation

class PlayerActivity : SlideBackActivity() {

    companion object {
        private const val MUSIC_BROADCAST_ACTION = "com.example.music.MUSIC_BROADCAST"
        private const val DELAY_MILLIS = 500L

        // Handle 消息，播放进度
        private const val MSG_PROGRESS = 0

        private const val BACKGROUND_SCALE_Y = 1.5F
        private const val BACKGROUND_SCALE_X = 2.5F
        private const val CD_SIZE = 240

        // 背景模糊系数
        private const val BLUR_RADIUS = 15
        private const val BLUR_SAMPLING = 5

        // 动画循环时长
        private const val DURATION_CD = 25_000L
        private const val DURATION_BACKGROUND = 50_000L
        private const val DURATION_TAPE = 6_000L
        private const val ANIMATION_REPEAT_COUNTS = -1
        private const val ANIMATION_PROPERTY_NAME = "rotation"
    }

    private lateinit var binding: ActivityPlayerLandBinding

    // 音乐广播接收者
    private lateinit var musicBroadcastReceiver: MusicBroadcastReceiver

    // ViewModel 数据和视图分离
    private val playViewModel: PlayerViewModel by viewModels()

    // Looper + Handler
    private val handler = object : Handler(Looper.getMainLooper()) {
        override fun handleMessage(msg: Message) {
            if (msg.what == MSG_PROGRESS) {
                playViewModel.refreshProgress()
            }
        }
    }

    // CD 旋转动画
    private val objectAnimator: ObjectAnimator by lazy {
        ObjectAnimator.ofFloat(binding.ivCover, ANIMATION_PROPERTY_NAME, 0f, 360f).apply {
            interpolator = LinearInterpolator()
            duration = DURATION_CD
            repeatCount = ANIMATION_REPEAT_COUNTS
            start()
        }
    }

    // 背景 旋转动画
    private val objectAnimatorBackground: ObjectAnimator by lazy {
        ObjectAnimator.ofFloat(binding.ivBackground, ANIMATION_PROPERTY_NAME, 0f, 360f).apply {
            interpolator = LinearInterpolator()
            duration = DURATION_BACKGROUND
            repeatCount = ANIMATION_REPEAT_COUNTS
            start()
        }
    }

    // 前动画
    private val objectAnimatorTapeNormal: ObjectAnimator by lazy {
        ObjectAnimator.ofFloat(
            binding.ivTypePrevious,
            ANIMATION_PROPERTY_NAME,
            0f, -360f
        ).apply {
            interpolator = LinearInterpolator()
            duration = DURATION_TAPE
            repeatCount = ANIMATION_REPEAT_COUNTS
            start()
        }
    }

    // 后动画
    private val objectAnimatorTapeNextNormal: ObjectAnimator by lazy {
        ObjectAnimator.ofFloat(
            binding.ivTypeNext,
            ANIMATION_PROPERTY_NAME,
            0f, -360f
        ).apply {
            interpolator = LinearInterpolator()
            duration = DURATION_TAPE
            repeatCount = ANIMATION_REPEAT_COUNTS
            start()
        }
    }

    override fun initBinding() {
        binding = ActivityPlayerLandBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun initView() {
        // 设置 SlideBackLayout
        bindSlide(this, binding.clBase)
        // 屏幕旋转
        val configuration = this.resources.configuration //获取设置的配置信息
        if (configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            // 横屏隐藏状态栏
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.R) {
                window.insetsController?.hide(WindowInsetsController.BEHAVIOR_SHOW_BARS_BY_SWIPE)
            } else {
                val uiOptions = (View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                        or View.SYSTEM_UI_FLAG_FULLSCREEN
                        or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION)
                window.decorView.systemUiVisibility = uiOptions
            }
        }
        // 页面状态栏适配
        (binding.titleBar.layoutParams as ConstraintLayout.LayoutParams).apply {
            topToTop = ConstraintLayout.LayoutParams.PARENT_ID
            topMargin = getStatusBarHeight(window, this@PlayerActivity)
        }
        // 页面导航栏适配
        (binding.clBottom.layoutParams as ConstraintLayout.LayoutParams).apply {
            bottomToBottom = ConstraintLayout.LayoutParams.PARENT_ID
            bottomMargin = getNavigationBarHeight(this@PlayerActivity)
        }
        binding.apply {
            // 时长右对齐
            ttvDuration.setAlignRight()
            // 背景图片放大
            ivBackground.scaleY = BACKGROUND_SCALE_Y
            ivBackground.scaleX = BACKGROUND_SCALE_X
            // 默认隐藏翻译按钮
            ivTranslation.visibility = View.GONE
            // 初始化音量调节
            seekBarVolume.max = VolumeManager.maxVolume
            seekBarVolume.progress = VolumeManager.getCurrentVolume()

            lyricView.setLabel("暂无歌词")
            lyricView.setTimelineTextColor(ContextCompat.getColor(this@PlayerActivity, R.color.colorTextForeground))
        }
    }

    @SuppressLint("ClickableViewAccessibility")
    override fun initListener() {
        binding.apply {
            // 返回按钮
            ivBack.setOnClickListener { finish() }
            // 开始 / 暂停播放按钮
            ivPlay.setOnClickListener { playViewModel.changePlayState() }
            // 上一曲
            ivLast.setOnClickListener { playViewModel.playLast() }
            // 下一曲
            ivNext.setOnClickListener { playViewModel.playNext() }
            // 切换播放模式
            ivMode.setOnClickListener { playViewModel.changePlayMode() }
            // 均衡器
            ivEqualizer.setOnClickListener { SoundEffectDialog(this@PlayerActivity, this@PlayerActivity).show() }
            // 评论
            ivComment.setOnClickListener {
                playViewModel.standardSongData.value?.let {
                    if (it.source != SOURCE_LOCAL) {
                        MyApplication.activityManager.startCommentActivity(this@PlayerActivity, it.source, it.id)
                    }
                }
            }
            // 下载歌曲
            ivDownload.setOnClickListener { toast("开发中") }
            // 更多菜单
            ivMore.setOnClickListener { PlayerMenuMoreDialog(this@PlayerActivity).show() }
            // 播放列表
            ivList.setOnClickListener { PlaylistDialog(this@PlayerActivity).show() }
            // 喜欢音乐
            ivLike.setOnClickListener { playViewModel.likeMusic() }
            // CD
            clCd.setOnClickListener {
                if (binding.clLyric.visibility == View.INVISIBLE) {
                    AnimationUtil.fadeOut(binding.clCd, true)
                    AnimationUtil.fadeOut(binding.clMenu, true)
                    binding.clLyric.visibility = View.VISIBLE
                    slideBackEnabled = false
                }
            }
            // lyricView
            lyricView.setDraggable(true, object : OnPlayClickListener {
                override fun onPlayClick(time: Long): Boolean {
                    playViewModel.setProgress(time.toInt())
                    return true
                }

            })
            lyricView.setOnSingerClickListener(object : OnSingleClickListener {
                override fun onClick() {
                    AnimationUtil.fadeIn(binding.clCd)
                    AnimationUtil.fadeIn(binding.clMenu)
                    binding.clLyric.visibility = View.INVISIBLE
                    slideBackEnabled = true
                }

            })
            edgeTransparentView.setOnClickListener {
                AnimationUtil.fadeIn(binding.clCd)
                AnimationUtil.fadeIn(binding.clMenu)
                binding.clLyric.visibility = View.INVISIBLE
                slideBackEnabled = true
            }
            // 艺术家
            clArtist.setOnClickListener {
                // 测试
                playViewModel.standardSongData.value?.let { standardSongData ->
                    if (standardSongData.source == SOURCE_NETEASE) {
                        standardSongData.artists?.let {
                            it[0].artistId?.let { artistId ->
                                MyApplication.activityManager.startArtistActivity(this@PlayerActivity, artistId)
                            }
                        }
                    } else {
                        toast("未找到信息")
                    }
                }
            }
            // 翻译更改
            ivTranslation.setOnClickListener {
                playViewModel.setLyricTranslation(playViewModel.lyricTranslation.value != true)
            }
            // 歌曲进度条变化的监听
            seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {

                override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                    // 判断是否为用户
                    if (fromUser) {
                        playViewModel.setProgress(progress)
                    }
                }

                override fun onStartTrackingTouch(seekBar: SeekBar?) {}

                override fun onStopTrackingTouch(seekBar: SeekBar?) {}

            })
            // 音量调节监听
            seekBarVolume.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {

                override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                    // 判断是否为用户
                    if (fromUser) {
                        playViewModel.currentVolume.value = progress
                        VolumeManager.setStreamVolume(progress)
                    }
                }

                override fun onStartTrackingTouch(seekBar: SeekBar?) {}

                override fun onStopTrackingTouch(seekBar: SeekBar?) {}

            })

            // 横屏
            clTapeCenter?.setOnClickListener { playViewModel.changePlayState() }
            // 横屏上一曲
            ivTypePrevious?.setOnClickListener { playViewModel.playLast() }
            // 横屏下一曲
            ivTypeNext?.setOnClickListener { playViewModel.playNext() }

        }
    }

    override fun initBroadcastReceiver() {
        // Intent 过滤器，只接收 "com.example.foyou.MUSIC_BROADCAST" 标识广播
        val intentFilter = IntentFilter()
        intentFilter.addAction(MUSIC_BROADCAST_ACTION)
        musicBroadcastReceiver = MusicBroadcastReceiver()
        // 注册接收器
        registerReceiver(musicBroadcastReceiver, intentFilter)
    }

    override fun initObserver() {
        playViewModel.apply {
            // 播放模式的观察
            playMode.observe(this@PlayerActivity, {
                when (it) {
                    MusicService.MODE_CIRCLE -> binding.ivMode.setImageResource(R.drawable.ic_bq_player_mode_circle)
                    MusicService.MODE_REPEAT_ONE -> binding.ivMode.setImageResource(R.drawable.ic_bq_player_mode_repeat_one)
                    MusicService.MODE_RANDOM -> binding.ivMode.setImageResource(R.drawable.ic_bq_player_mode_random)
                }
            })
            // 当前歌曲的观察
            standardSongData.observe(this@PlayerActivity, {
                it?.let {
                    binding.tvName.text = it.name
                    binding.tvArtist.text = it.artists?.let { artists ->
                        parseArtist(artists)
                    }
                    // val url = MyApplication.cloudMusicManager.getPicture(imageUrl, CD_SIZE.dp())
                    SongPicture.getPlayerActivityCoverBitmap(it, CD_SIZE.dp()) { bitmap ->
                        // 设置 CD 图片
                        binding.ivCover.setImageBitmap(bitmap)
                        // 设置 背景 图片
                        Glide.with(MyApplication.context)
                            .load(bitmap)
                            .placeholder(binding.ivBackground.drawable)
                            .apply(RequestOptions.bitmapTransform(BlurTransformation(BLUR_RADIUS, BLUR_SAMPLING)))
                            .into(binding.ivBackground)
                        // 设置色调
                        Palette.from(bitmap)
                            .clearFilters()
                            .generate { palette ->
                                if (palette?.vibrantSwatch != null) {
                                    palette.vibrantSwatch?.rgb?.let { rgb ->
                                        playViewModel.color.value = rgb
                                    }
                                } else {
                                    playViewModel.color.value = PlayerViewModel.DEFAULT_COLOR
                                }
                            }
                    }
                    // 刷新歌词
                    playViewModel.updateLyric()
                }
            })
            // 播放状态的观察
            playState.observe(this@PlayerActivity, {
                if (it) {
                    binding.ivPlay.setImageResource(R.drawable.ic_pause_btn)
                    startRotateAlways()
                    handler.sendEmptyMessageDelayed(MSG_PROGRESS, DELAY_MILLIS)
                } else {
                    binding.ivPlay.setImageResource(R.drawable.ic_play_btn)
                    pauseRotateAlways()
                    handler.removeMessages(MSG_PROGRESS)
                }
            })
            // 总时长的观察
            duration.observe(this@PlayerActivity, {
                binding.seekBar.max = it
                binding.ttvDuration.setText(it)
            })
            // 进度的观察
            progress.observe(this@PlayerActivity, {
                binding.seekBar.progress = it
                binding.ttvProgress.setText(it)
                handler.sendEmptyMessageDelayed(MSG_PROGRESS, DELAY_MILLIS)
                // 更新歌词播放进度
                binding.lyricView.updateTime(it.toLong())
            })
            // 翻译观察
            lyricTranslation.observe(this@PlayerActivity, {
                if (it == true) {
                    binding.ivTranslation.alpha = 1F
                } else {
                    binding.ivTranslation.alpha = 0.3F
                }
            })
            // 歌词观察
            lyricViewData.observe(this@PlayerActivity, {
                // 翻译歌词为空
                binding.ivTranslation.visibility = if (it.secondLyric.isEmpty()) {
                    View.GONE
                } else {
                    View.VISIBLE
                }
                if (playViewModel.lyricTranslation.value == true) {
                    binding.lyricView.loadLyric(it.lyric, it.secondLyric)
                } else {
                    binding.lyricView.loadLyric(it.lyric)
                }
            })
            // 音量观察
            currentVolume.observe(this@PlayerActivity, {
                binding.seekBarVolume.progress = it
            })
            // 颜色观察
            color.observe(this@PlayerActivity, {
                binding.ivPlay.setColorFilter(it)
                binding.ivLast.setColorFilter(it)
                binding.ivNext.setColorFilter(it)
            })
        }

    }

    /**
     * 开启旋转动画
     */
    private fun startRotateAlways() {
        objectAnimator.resume()
        objectAnimatorBackground.resume()
        objectAnimatorTapeNormal.resume()
        objectAnimatorTapeNextNormal.resume()
    }

    /**
     * 关闭旋转动画
     */
    private fun pauseRotateAlways() {
        playViewModel.rotation = binding.ivCover.rotation
        playViewModel.rotationBackground = binding.ivBackground.rotation
        binding.ivTypePrevious?.rotation?.let {
            playViewModel.rotationTypeNormal = it
        }
        objectAnimator.pause()
        objectAnimatorBackground.pause()
        objectAnimatorTapeNormal.pause()
        objectAnimatorTapeNextNormal.pause()
    }

    override fun onDestroy() {
        super.onDestroy()
        // 取消广播接收器的注册
        unregisterReceiver(musicBroadcastReceiver)
        // 清空 Handler 发送的所有消息，防止内存泄漏
        handler.removeCallbacksAndMessages(null)
    }

    override fun finish() {
        super.finish()
        overridePendingTransition(
            R.anim.anim_no_anim,
            R.anim.anim_slide_exit_bottom
        )
    }

    /**
     * 内部类
     * 音乐广播接收器
     */
    inner class MusicBroadcastReceiver : BroadcastReceiver() {
        override fun onReceive(context: Context, intent: Intent) {
            // ViewModel 数据刷新
            playViewModel.refresh()
        }
    }

    /**
     * 监听音量物理按键
     */
    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        when (keyCode) {
            KeyEvent.KEYCODE_VOLUME_UP -> {
                playViewModel.addVolume()
                return true
            }
            KeyEvent.KEYCODE_VOLUME_DOWN -> {
                playViewModel.reduceVolume()
                return true
            }
        }
        return super.onKeyDown(keyCode, event)
    }

}