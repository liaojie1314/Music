package com.example.music.ui.dialog

import android.content.Context
import android.os.Bundle
import android.view.Gravity
import android.view.ViewGroup
import com.example.music.MyApplication
import com.example.music.R
import com.example.music.databinding.DialogSongInfoBinding
import com.example.music.music.cloud.SearchSong
import com.example.music.music.standard.data.*
import com.example.music.util.parseSize
import com.example.music.util.runOnMainThread
import com.google.android.material.bottomsheet.BottomSheetDialog

class SongInfoDialog(context: Context, private val songData: StandardSongData) : BottomSheetDialog(context, R.style.style_default_dialog) {

    private var binding: DialogSongInfoBinding = DialogSongInfoBinding.inflate(layoutInflater)

    init {
        setContentView(binding.root)
        window?.setGravity(Gravity.BOTTOM)
        window?.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        window?.setWindowAnimations(R.style.dialog_animation)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.apply {
            valueViewId.setValue(songData.id) // ID
            valueViewSource.setValue("未知")
            valueViewBitrate.setValue("未知")
            binding.valueViewSize.setValue("未知")
            binding.valueViewType.setValue("未知")
        }

        songData.let {
            when (it.source) {
                SOURCE_NETEASE -> {
                    MyApplication.cloudMusicManager.getSongInfo(it.id) { data ->
                        runOnMainThread {
                            if (SearchSong.getExampleSongUrl(it.id) != "") {
                                binding.valueViewSource.setValue("音乐随心听")
                            } else {
                                binding.valueViewSource.setValue("网易云音乐")
                            }
                            binding.valueViewBitrate.setValue("${data.br / 1000} kbps")
                            binding.valueViewSize.setValue(data.size.parseSize())
                            binding.valueViewType.setValue(data.type ?: "未知")
                        }
                    }
                }
                SOURCE_LOCAL -> {
                    binding.valueViewSource.setValue(context.getString(R.string.local_music))
                    binding.valueViewBitrate.setValue("未知")
                    val size = songData.localInfo?.size ?: 0L
                    binding.valueViewSize.setValue(size.parseSize())
                    binding.valueViewType.setValue("未知")
                }
            }

        }

    }

}