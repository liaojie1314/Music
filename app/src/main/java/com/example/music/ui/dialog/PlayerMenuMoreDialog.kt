package com.example.music.ui.dialog

import android.content.Context
import android.content.Intent
import com.example.music.MyApplication
import com.example.music.databinding.DialogPlayMoreBinding
import com.example.music.music.local.MyFavorite
import com.example.music.music.standard.data.SOURCE_NETEASE
import com.example.music.music.standard.data.StandardSongData
import com.example.music.ui.activity.PlayHistoryActivity
import com.example.music.ui.base.BaseBottomSheetDialog
import com.example.music.util.toast

class PlayerMenuMoreDialog(context: Context) : BaseBottomSheetDialog(context) {

    private val binding: DialogPlayMoreBinding = DialogPlayMoreBinding.inflate(layoutInflater)

    init {
        setContentView(binding.root)
    }


    private var song: StandardSongData? = null

    override fun initView() {

        MyApplication.musicBinderInterface?.getNowSongData()?.let { it ->
            binding.tvSongName.text = it.name
            song = it
        }
    }

    override fun initListener() {
        binding.apply {
            // 添加到本地我喜欢
            itemAddLocalMyFavorite.setOnClickListener {
                song?.let { data ->
                    MyFavorite.addSong(data)
                    dismiss()
                }
            }
            // 添加到网易云我喜欢
            itemAddNeteaseFavorite.setOnClickListener {
                if (MyApplication.userManager.getCloudMusicCookie().isEmpty()) {
                    toast("离线模式无法收藏到在线我喜欢~")
                } else {
                    song?.let {
                        when (it.source) {
                            SOURCE_NETEASE -> {
                                MyApplication.cloudMusicManager.likeSong(it.id, {
                                    toast("添加到我喜欢成功")
                                }, {
                                    toast("添加到我喜欢失败")
                                })
                            }
                        }
                    }
                }
            }
            // 歌曲信息
            itemSongInfo.setOnClickListener {
                MyApplication.musicBinderInterface?.getNowSongData()?.let { it1 ->
                    SongInfoDialog(context, it1).show()
                }
                dismiss()
            }

            // 播放历史
            itemPlayHistory.setOnClickListener {
                it.context.startActivity(Intent(it.context, PlayHistoryActivity::class.java))
                dismiss()
            }
        }
    }



}