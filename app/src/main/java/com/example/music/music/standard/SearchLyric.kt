package com.example.music.music.standard

import com.example.music.music.standard.data.SOURCE_NETEASE
import com.example.music.music.standard.data.StandardSongData
import com.example.music.util.MagicHttp
import com.google.gson.Gson

object SearchLyric {

    fun getLyricString(songData: StandardSongData, success: (String) -> Unit) {
        var url = ""
        when (songData.source) {
            // 网易云
            SOURCE_NETEASE -> {
                url = "http://music.eleuu.com/lyric?id=${songData.id}"
            }
        }

        MagicHttp.OkHttpManager().newGet(url, { response ->
            var lyric = response

            when (songData.source) {
                SOURCE_NETEASE -> {
                    if (Gson().fromJson(lyric, NeteaseSongLyric::class.java).lrc != null) {
                        lyric = Gson().fromJson(lyric, NeteaseSongLyric::class.java).lrc?.lyric.toString()
                        success.invoke(lyric)
                    } else {
                        success.invoke("")
                    }
                }
            }

        }, {

        })
    }

    data class NeteaseSongLyric(
        val lrc: NeteaseSongLrc?
    )

    data class NeteaseSongLrc(
        val lyric: String?
    )

}
