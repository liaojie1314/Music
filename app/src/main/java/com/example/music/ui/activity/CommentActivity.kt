package com.example.music.ui.activity

import android.os.Bundle
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.music.MyApplication
import com.example.music.R
import com.example.music.adapter.CommentAdapter
import com.example.music.databinding.ActivityCommentBinding
import com.example.music.music.standard.data.SOURCE_NETEASE
import com.example.music.util.getStatusBarHeight
import com.example.music.util.runOnMainThread
import com.example.music.util.toast
import com.example.music.widget.SlideBackLayout

class CommentActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_INT_SOURCE = "extra_int_source"
        const val EXTRA_STRING_ID = "extra_string_id"
    }

    private lateinit var binding: ActivityCommentBinding

    private lateinit var id: String
    private var source: Int = SOURCE_NETEASE

    // SlideBackLayout 拖拽关闭 Activity
    private lateinit var slideBackLayout: SlideBackLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCommentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 设置 SlideBackLayout
        slideBackLayout = SlideBackLayout(this, binding.clBase)
        slideBackLayout.bind()

        id = intent.getStringExtra(EXTRA_STRING_ID)?:""
        source = intent.getIntExtra(EXTRA_INT_SOURCE, SOURCE_NETEASE)
        initData()
        initView()
        initListener()
    }

    private fun initListener() {

        binding.btnSendComment.setOnClickListener {
            val content = binding.etCommentContent.text.toString()
            if (content != "") {
                when (source) {
                    SOURCE_NETEASE -> {
                        MyApplication.cloudMusicManager.sendComment(1, 0, id, content, 0L, {
                            toast("评论成功")
                        }, {
                            toast("评论失败")
                        })
                    }
                }
            } else {
                toast("请输入")
            }
        }
    }

    private fun initData() {

        when (source) {
            SOURCE_NETEASE -> {
                MyApplication.cloudMusicManager.getComment(id?: "", {
                    runOnMainThread {
                        binding.rvComment.layoutManager = LinearLayoutManager(this@CommentActivity)
                        binding.rvComment.adapter = CommentAdapter(it, this@CommentActivity)
                    }
                }, {

                })
            }
        }

    }

    private fun initView() {
        var rvPlaylistScrollY = 0
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.M) {
            binding.rvComment.setOnScrollChangeListener { _, _, _, _, oldScrollY ->
                rvPlaylistScrollY += oldScrollY
                slideBackLayout.viewEnabled = rvPlaylistScrollY == 0
            }
        }
    }

    override fun finish() {
        super.finish()
        overridePendingTransition(
            R.anim.anim_no_anim,
            R.anim.anim_slide_exit_bottom
        )
    }

}