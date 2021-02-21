package com.example.music.ui.dialog

import android.annotation.SuppressLint
import android.content.Context
import android.os.Build
import com.example.music.databinding.DialogTextInfoBinding
import com.example.music.room.AppDatabase
import com.example.music.ui.base.BaseBottomSheetDialog
import com.example.music.util.getVisionCode
import com.example.music.util.getVisionName

class AppInfoDialog(context: Context) : BaseBottomSheetDialog(context) {

    val binding = DialogTextInfoBinding.inflate(layoutInflater)

    init {
        setContentView(binding.root)
    }

    @SuppressLint("SetTextI18n")
    override fun initView() {
        super.initView()


        binding.apply {
            tvText.text = """
                [app.ver     ] ${getVisionName()}
                [app.build   ] ${getVisionCode()}
                [database.ver] ${AppDatabase.DATABASE_VERSION}
                [model       ] ${Build.MODEL}
                [android.ver ] ${Build.VERSION.RELEASE}
                [android.sdk ] ${Build.VERSION.SDK_INT}
            """.trimIndent()
        }
    }

}