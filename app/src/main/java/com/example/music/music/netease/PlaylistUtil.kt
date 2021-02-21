package com.example.music.music.netease

import android.content.ContentValues.TAG
import android.content.Context
import android.util.Log
import com.example.music.api.*
import com.example.music.data.DetailPlaylistData
import com.example.music.data.DetailPlaylistInnerData
import com.example.music.music.compat.CompatSearchData
import com.example.music.music.compat.compatSearchDataToStandardPlaylistData
import com.example.music.music.standard.data.StandardSongData
import com.example.music.util.MagicHttp
import com.example.music.util.loge
import com.example.music.util.toast
import com.google.gson.Gson

object PlaylistUtil {

    @Deprecated("过时")
    fun getDetailPlaylist(id: Long, success: (ArrayList<StandardSongData>) -> Unit, failure: (String) -> Unit) {
        val url = "$API_MUSIC_ELEUU/playlist/detail?id=$id"
        loge("url:$url")
        MagicHttp.OkHttpManager().newGet(url, { response ->
            val detailPlaylistData = Gson().fromJson(response, DetailPlaylistData::class.java)
            // 406 为操作频繁错误
            if (detailPlaylistData.code != 406) {
                detailPlaylistDataToStandardSongDataList(detailPlaylistData) {
                    success.invoke(it)
                }
            }
        }, {
            failure.invoke(it)
        })
    }

    @Deprecated("过时")
    private fun detailPlaylistDataToStandardSongDataList(
        detailPlaylistData: DetailPlaylistData,
        success: (ArrayList<StandardSongData>) -> Unit
    ) {
        // 获取全 id
        val trackIds = detailPlaylistData.playlist?.trackIds
        val ids = ArrayList<Long>()
        if (trackIds != null) {
            for (trackId in 0..trackIds.lastIndex) {
                val id = trackIds[trackId].id
                ids.add(id)
            }
        }
        getSongListByIds(ids) {
            success.invoke(it)
        }

    }

    @Deprecated("过时")
    private fun getSongListByIds(ids: ArrayList<Long>, success: (ArrayList<StandardSongData>) -> Unit) {
        var idsString = ""
        for (id in 0..ids.lastIndex) {
            idsString = "$idsString${ids[id]},"
        }
        // loge(idsString)
        if (idsString != "") {
            idsString = idsString.substring(0, idsString.lastIndex)
        }
        val url = "${API_NETEASE}/song/detail/?ids=%5B${idsString}%5D"
        Log.e(TAG, "getSongListByIds: $url", )
        MagicHttp.OkHttpManager().newGet(url, {
            val data = Gson().fromJson(it, CompatSearchData::class.java)
            if (data.code == -460) {
                toast("-460 Cheating")
            } else {
                success.invoke(compatSearchDataToStandardPlaylistData(data))
            }
        }, {

        })
    }

    /**
     * 获取歌单信息
     */
    fun getPlaylistInfo(context: Context, id: Long, success: (DetailPlaylistInnerData) -> Unit) {
        val url = "$API_AUTU/playlist/detail?id=$id"
        loge("playlistActivity 歌单信息 url:$url")
        MagicHttp.OkHttpManager().getByCache(context, url, { response ->
            val playlistInfo = Gson().fromJson(response, DetailPlaylistData::class.java).playlist
            if (playlistInfo != null) {
                success.invoke(playlistInfo)
            }
        }, {

        })
    }

}