package com.example.music.music.local

import android.os.Parcelable
import com.example.music.MyApplication
import com.example.music.music.standard.data.StandardSongData
import com.example.music.util.Config
import kotlinx.android.parcel.Parcelize
import org.jetbrains.annotations.TestOnly

/**
 * 播放历史单例类
 */
object PlayHistory {

    private var playHistory = PlayHistoryData(ArrayList())

    /**
     * 加入播放历史
     */
    @TestOnly
    fun addPlayHistory(songData: StandardSongData) {
        // 如果不在歌单中，就添加
        if (songData !in playHistory.list) {
            playHistory.list.add(0, songData)
            // playlist.add(songData)
        }
        MyApplication.mmkv.encode(Config.PLAY_HISTORY, playHistory)

    }

    /**
     * 读取播放历史
     */
    @TestOnly
    fun readPlayHistory(): ArrayList<StandardSongData> {
        playHistory = MyApplication.mmkv.decodeParcelable(Config.PLAY_HISTORY, PlayHistoryData::class.java, PlayHistoryData(
            ArrayList()
        ))
        return playHistory.list
    }

    @Parcelize
    data class PlayHistoryData(
        val list: ArrayList<StandardSongData>
    ): Parcelable

}