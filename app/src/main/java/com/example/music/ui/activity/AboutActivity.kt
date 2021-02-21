package com.example.music.ui.activity

import com.example.music.databinding.ActivityAboutBinding
import com.example.music.ui.base.BaseActivity
import com.example.music.ui.dialog.AppInfoDialog
import com.example.music.util.*
import kotlinx.android.synthetic.main.activity_about.*

class AboutActivity : BaseActivity() {

    private lateinit var binding: ActivityAboutBinding

    override fun initBinding() {
        binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun initListener() {
        binding.apply {
            // 检查更新
            itemCheckForUpdates.setOnClickListener {
                toast("开发中")
            }
            // 更新日志
            itemUpdateLog.setOnClickListener {
                toast("开发中")
            }
            // 使用开源项目
            itemTeamWork.setOnClickListener {
                toast("开发中")
            }
            // ivLogo
            ivLogo.setOnLongClickListener {
                AppInfoDialog(this@AboutActivity).show()
                return@setOnLongClickListener true
            }
        }
    }
}