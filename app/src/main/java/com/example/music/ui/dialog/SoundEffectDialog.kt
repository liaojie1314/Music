package com.example.music.ui.dialog

import android.app.Activity
import android.content.Context
import com.example.music.MyApplication
import com.example.music.databinding.DialogSoundEffectBinding
import com.example.music.ui.base.BaseBottomSheetDialog
import com.example.music.util.IntentUtil

class SoundEffectDialog(context: Context, private val activity: Activity): BaseBottomSheetDialog(context) {

    private val binding = DialogSoundEffectBinding.inflate(layoutInflater)

    private var speed = 1f

    init {
        setContentView(binding.root)
    }

    override fun initView() {
        speed = MyApplication.musicBinderInterface?.getSpeed() ?: 1f
        refreshPitch()
    }

    override fun initListener() {
        binding.apply {
            itemEqualizer.setOnClickListener {
                IntentUtil.openEqualizer(activity)
                dismiss()
            }
            ivIncreasePitch.setOnClickListener {
                MyApplication.musicBinderInterface?.increasePitchLevel()
                refreshPitch()
            }
            ivDecreasePitch.setOnClickListener {
                MyApplication.musicBinderInterface?.decreasePitchLevel()
                refreshPitch()
            }
        }
    }

    /**
     * 刷新 Pitch
     */
    private fun refreshPitch() {
        binding.tvPitch.text = MyApplication.musicBinderInterface?.getPitchLevel().toString()
    }

}