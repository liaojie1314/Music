package com.example.music.ui.activity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.music.MyApplication
import com.example.music.databinding.ActivityUserBinding
import com.example.music.util.GlideUtil
import com.example.music.util.getStatusBarHeight
import com.example.music.util.runOnMainThread

class UserActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_LONG_USER_ID = "extra_long_user_id"
    }

    private lateinit var binding: ActivityUserBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserBinding.inflate(layoutInflater)
        setContentView(binding.root)

        (binding.titleBar.layoutParams as ConstraintLayout.LayoutParams).apply{
            topToTop = ConstraintLayout.LayoutParams.PARENT_ID
            topMargin = getStatusBarHeight(window, this@UserActivity)
        }

        val userId = intent.getLongExtra(EXTRA_LONG_USER_ID, 0L)
        // toast("userId = $userId")
        MyApplication.cloudMusicManager.getUserDetail(userId, {
            runOnMainThread {
                GlideUtil.load(it.profile.backgroundUrl, binding.ivBackground)
                GlideUtil.load(it.profile.avatarUrl, binding.ivCover)
                binding.apply {
                    tvName.text = it.profile.nickname
                    tvUserId.text = "UID ${it.profile.userId}"
                    tvListenSongs.text = "累计听歌 ${it.listenSongs} 首"
                    tvSignature.text = it.profile.signature
                    tvFollow.text = "关注 ${it.profile.follows}    粉丝 ${it.profile.followeds}"
                }
            }
        }, {
            // 失败
        })

    }
}