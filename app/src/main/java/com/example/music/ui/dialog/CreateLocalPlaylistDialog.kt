package com.example.music.ui.dialog

import android.content.Context
import com.example.music.databinding.DialogCreateLocalPlaylistBinding
import com.example.music.music.local.LocalPlaylist
import com.example.music.ui.base.BaseBottomSheetDialog
import com.example.music.util.toast

/**
 * 创建本地歌单 Dialog
 */
class CreateLocalPlaylistDialog(context: Context) : BaseBottomSheetDialog(context) {

    private var binding = DialogCreateLocalPlaylistBinding.inflate(layoutInflater)

    init {
        setContentView(binding.root)
    }

    override fun initListener() {
        binding.apply {
            btnConfirm.setOnClickListener {
                val name = etName.text.toString()
                val description = etDescription.text.toString()
                val imageUrl = etImageUrl.text.toString()
                if (name.isEmpty()) {
                    toast("名称不为空")
                } else {
                    LocalPlaylist.create(name, description, imageUrl)
                }
            }
        }
    }

}