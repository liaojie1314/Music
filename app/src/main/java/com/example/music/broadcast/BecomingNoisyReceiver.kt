package com.example.music.broadcast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.media.AudioManager
import com.example.music.MyApplication

/**
 * 监听耳机拔出
 */
class BecomingNoisyReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        if (intent.action == AudioManager.ACTION_AUDIO_BECOMING_NOISY) {
            MyApplication.musicBinderInterface?.pause()
        }
    }

}
