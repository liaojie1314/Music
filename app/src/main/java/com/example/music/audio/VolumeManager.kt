package com.example.music.audio

import android.content.Context
import android.media.AudioManager
import com.example.music.MyApplication

/**
 * 音量管理
 */
object VolumeManager {

    // 音频管理器
    private val audioManger = MyApplication.context.getSystemService(Context.AUDIO_SERVICE) as AudioManager

    // 获取最大媒体音
    val maxVolume = audioManger.getStreamMaxVolume(AudioManager.STREAM_MUSIC)


    /**
     * 传入 [volume] 设置音量
     */
    fun setStreamVolume(volume: Int) {
        audioManger.setStreamVolume(AudioManager.STREAM_MUSIC, volume, AudioManager.FLAG_SHOW_UI)
    }

    /**
     * 获取当前媒体音
     * @return 当前音量
     */
    fun getCurrentVolume(): Int {
        return audioManger.getStreamVolume(AudioManager.STREAM_MUSIC)
    }

}