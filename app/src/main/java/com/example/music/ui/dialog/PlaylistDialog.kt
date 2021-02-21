package com.example.music.ui.dialog

import android.annotation.SuppressLint
import android.content.Context
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.music.MyApplication
import com.example.music.R
import com.example.music.adapter.PlaylistDialogAdapter
import com.example.music.databinding.DialogPlayListBinding
import com.example.music.ui.base.BaseBottomSheetDialog
@SuppressLint("StringFormatInvalid")
class PlaylistDialog(context: Context): BaseBottomSheetDialog(context) {

    private var binding: DialogPlayListBinding = DialogPlayListBinding.inflate(layoutInflater)

    init {
        setContentView(binding.root)
    }


    override fun initView() {
        super.initView()
        binding.rvPlaylist.layoutManager = LinearLayoutManager(context)
        MyApplication.musicBinderInterface?.getPlaylist()?.let {
            binding.rvPlaylist.adapter = PlaylistDialogAdapter(it)
            binding.tvPlaylist.text = this.context.getString(R.string.playlist_number, it.size)
        }
    }
}