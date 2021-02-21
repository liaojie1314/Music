package com.example.music.ui.activity
import android.Manifest
import android.annotation.SuppressLint
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.content.pm.PackageManager
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.LinearLayout
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.music.MyApplication
import com.example.music.R
import com.example.music.databinding.ActivityMainBinding
import com.example.music.music.standard.SongPicture
import com.example.music.ui.dialog.PlaylistDialog
import com.example.music.ui.viewmodel.MainViewModel
import com.example.music.util.*
import com.example.music.util.GlideUtil
import com.google.android.material.tabs.TabLayoutMediator
import eightbitlab.com.blurview.RenderScriptBlur
import kotlinx.android.synthetic.main.menu_main.*

/**
 * MainActivity
 */
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var musicBroadcastReceiver: MusicBroadcastReceiver // 音乐广播接收
    private lateinit var loginReceiver: LoginReceiver // 登录广播接收

    private val mainViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initData()
        initView()
        initListener()
        initObserve()
    }

    private fun initData() {
        // Intent 过滤器
        var intentFilter = IntentFilter()
        intentFilter.addAction("com.example.music.MUSIC_BROADCAST")
        musicBroadcastReceiver = MusicBroadcastReceiver() //
        registerReceiver(musicBroadcastReceiver, intentFilter) // 注册接收器

        intentFilter = IntentFilter()
        intentFilter.addAction("android.intent.action.HEADSET_PLUG")
        intentFilter = IntentFilter()

        intentFilter.addAction("com.example.music.LOGIN")
        loginReceiver = LoginReceiver()
        registerReceiver(loginReceiver, intentFilter) // 注册接收器
//        UpdateUtil.checkNewVersion(this, false)
    }

    private fun initView() {
        window.allowEnterTransitionOverlap = true
        window.allowReturnTransitionOverlap = true
        // 请求广播
        MyApplication.musicBinderInterface?.sendBroadcast()

        val radius = 20f
        val decorView: View = window.decorView
        val windowBackground: Drawable = decorView.background
        binding.blurViewPlay.setupWith(decorView.findViewById(R.id.viewPager2))
            .setFrameClearDrawable(windowBackground)
            .setBlurAlgorithm(RenderScriptBlur(this))
            .setBlurRadius(radius)
            .setHasFixedTransformationMatrix(true)

        // 适配状态栏
        val statusBarHeight = getStatusBarHeight(window, this) // px
        (binding.titleBar.layoutParams as ConstraintLayout.LayoutParams).apply{
            topMargin = statusBarHeight
        }
        // 侧滑状态栏适配
        (binding.menuMain.cvUser.layoutParams as LinearLayout.LayoutParams).apply{
            topMargin = statusBarHeight + 8.dp()
        }

        // 适配导航栏
        val navigationBarHeight = if (MyApplication.mmkv.decodeBool(Config.PARSE_HOME_NAVIGATION, true)) {
            getNavigationBarHeight(this)
        } else {
            0
        }

        (binding.clPlay.layoutParams as ConstraintLayout.LayoutParams).apply{
            bottomMargin = navigationBarHeight
        }
        (binding.blurViewPlay.layoutParams as ConstraintLayout.LayoutParams).apply{
            height = 56.dp() + navigationBarHeight
        }
        (binding.blurViewPlayBottom.layoutParams as ConstraintLayout.LayoutParams).apply {
            height = 56.dp() + navigationBarHeight
        }

        binding.viewPager2.adapter = object : FragmentStateAdapter(this) {
            override fun getItemCount(): Int {
                return 2 // 2 个页面
            }

            override fun createFragment(position: Int): Fragment {
                return when (position) {
                    0 -> mainViewModel.myFragment
                    else -> mainViewModel.homeFragment
                }
            }
        }

        TabLayoutMediator(binding.tabLayout, binding.viewPager2) { tab, position ->
            tab.text = when (position) {
                0 -> getString(R.string.my)
                else -> getString(R.string.home)
            }
        }.attach()

        ViewPager2Util.changeToNeverMode(binding.viewPager2)
    }

    @SuppressLint("WrongConstant")
    private fun initListener() {
        //
        binding.apply {
            // 搜索按钮
            ivSearch.setOnClickListener {
                startActivity(Intent(this@MainActivity, SearchActivity::class.java))
            }
            // 设置按钮
            ivSettings.setOnClickListener {
                binding.drawerLayout.openDrawer(Gravity.START)
            }
        }


        // 侧滑
        binding.menuMain.apply {
            clUser.setOnClickListener {
                if (MyApplication.userManager.getCurrentUid() == 0L) {
                    MyApplication.activityManager.startLoginActivity(this@MainActivity)
                } else {
                    MyApplication.activityManager.startUserActivity(this@MainActivity, MyApplication.userManager.getCurrentUid())
                }
            }

            itemSwitchAccount.setOnClickListener {
                MyApplication.activityManager.startLoginActivity(this@MainActivity)
            }

            itemSettings.setOnClickListener {
                MyApplication.activityManager.startSettingsActivity(this@MainActivity)
            }

            itemPrivateLetter.setOnClickListener {
                val cookie = MyApplication.userManager.getCloudMusicCookie()
                if (cookie != "") {
                    MyApplication.activityManager.startPrivateLetterActivity(this@MainActivity)
                } else {
                    toast("当前为离线模式,请先登录")
                }
            }
            // 反馈
            itemFeedback.setOnClickListener {
                startActivity(Intent(this@MainActivity, FeedbackActivity::class.java))
            }
        }

        binding.menuMain.itemShop.setOnClickListener {
            toast("开发中")
        }
        binding.menuMain.itemMessage.setOnClickListener {
            toast("开发中")
        }
        binding.menuMain.itemCenter.setOnClickListener {
            toast("开发中")
        }

        binding.menuMain.itemAbout.setOnClickListener {
            startActivity(Intent(this, AboutActivity::class.java))
        }

        // Mini Player
        binding.includePlayer.apply {
            root.setOnClickListener {
                MyApplication.activityManager.startPlayerActivity(this@MainActivity)
            }
            ivPlay.setOnClickListener {
                MyApplication.musicBinderInterface?.changePlayState()
                refreshPlayState()
            }
            ivPlaylist.setOnClickListener { PlaylistDialog(this@MainActivity).show() }
        }


    }

    private fun initObserve() {
        mainViewModel.userId.observe(this, { userId ->
            // toast("侧栏收到变化：${userId}")
            if (userId == 0L) {
                binding.menuMain.tvUserName.text = "立即登录"
            } else {
                MyApplication.cloudMusicManager.getUserDetail(userId, {
                    runOnUiThread {
                        // toast("通知头像更新")
                        GlideUtil.loadCircle(it.profile.avatarUrl, binding.menuMain.ivCover)
                        binding.menuMain.tvUserName.text = it.profile.nickname
                    }
                }, {

                })
            }
        })
    }

    override fun onDestroy() {
        super.onDestroy()
        // 解绑广播接收
        unregisterReceiver(musicBroadcastReceiver)
        unregisterReceiver(loginReceiver)
    }

    inner class MusicBroadcastReceiver : BroadcastReceiver() {
        override fun onReceive(context: Context, intent: Intent) {
            val song = MyApplication.musicBinderInterface?.getNowSongData()
            if (song != null) {
                binding.includePlayer.tvName.text = song.name
                binding.includePlayer.tvArtist.text = song.artists?.let { parseArtist(it) }
                // 这里应该用小的，等待修改
                SongPicture.getSongPicture(song, SongPicture.TYPE_LARGE) {
                    binding.includePlayer.ivCover.setImageBitmap(it)
                }
            }
            refreshPlayState()
        }
    }

    inner class LoginReceiver : BroadcastReceiver() {
        override fun onReceive(context: Context, intent: Intent) {
            mainViewModel.setUserId()
        }
    }

    /**
     * 刷新播放状态
     */
    private fun refreshPlayState() {
        if (MyApplication.musicBinderInterface?.getPlayState()!!) {
            binding.includePlayer.ivPlay.setImageResource(R.drawable.ic_bq_control_pause)
        } else {
            binding.includePlayer.ivPlay.setImageResource(R.drawable.ic_mini_player_play)
        }
    }

}