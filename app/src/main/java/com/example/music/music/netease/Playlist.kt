package com.example.music.music.netease

import android.content.Context
import com.example.music.api.API_MUSIC_ELEUU
import com.example.music.music.compat.CompatSearchData
import com.example.music.music.compat.compatSearchDataToStandardPlaylistData
import com.example.music.music.standard.data.StandardSongData
import com.example.music.util.MagicHttp
import com.example.music.util.loge
import com.example.music.util.toast
import com.google.gson.Gson
import org.jetbrains.annotations.Contract
import org.jetbrains.annotations.TestOnly
import kotlin.system.measureTimeMillis

/**
 * 获取网易云歌单全部，对于大型歌单也要成功
 */
object Playlist {

    private const val SPLIT_PLAYLIST_NUMBER = 1000 // 切割歌单
    private const val CHEATING_CODE = -460 // Cheating 错误

    private const val PLAYLIST_URL = "${API_MUSIC_ELEUU}/playlist/detail?id=" // 获取歌单链接
    private const val SONG_DETAIL_URL = "${API_MUSIC_ELEUU}/song/detail" // 歌曲详情

    /**
     * 传入歌单 [playlistId] id
     */
    @TestOnly
    fun getPlaylist(context: Context, playlistId: Long, success: (ArrayList<StandardSongData>) -> Unit, failure: () -> Unit) {
        // 请求链接
        val url = PLAYLIST_URL + playlistId
        loge("playlist 请求全部 ids url:$url")
        // 发送 Get 请求获取全部 trackId
        MagicHttp.OkHttpManager().getByCache(context, url, { response ->
            // 解析得到全部 trackIds
            val trackIds = ArrayList<Long>()
            try {
                Gson().fromJson(response, PlaylistData::class.java).playlist?.trackIds?.forEach {
                    trackIds.add(it.id)
                }
            } catch (e: Exception) {
                failure.invoke()
            }
            // POST 请求全部 trackIds
            val allSongData = ArrayList<StandardSongData>()

            averageAssignFixLength(trackIds, SPLIT_PLAYLIST_NUMBER).forEach { list ->
                var json = Gson().toJson(list)

                json = json.replace("[", "")
                json = json.replace("]", "")

                loge("json:${json}")

                MagicHttp.OkHttpManager().postByCache(context, SONG_DETAIL_URL, json) { response ->
                    loge(response)
                    // toast("服务器返回字符数：${response.length.toString()}")
                    val data = Gson().fromJson(response, CompatSearchData::class.java)
                    if (data.code == CHEATING_CODE) {
                        toast("-460 Cheating")
                        // 发生了欺骗立刻返回
                        success.invoke(allSongData)
                    } else {
                        val compatMS = measureTimeMillis {
                            compatSearchDataToStandardPlaylistData(data).forEach {
                                allSongData.add(it)
                            }
                        }
                        loge("Compat 转换耗时：${compatMS} 毫秒")

                        // 全部读取完成再返回
                        if (allSongData.size == trackIds.size) {
                            success.invoke(allSongData)
                        }
                    }
                }
            }

        }, {
            // 获取 trackId 失败
            failure.invoke()
        })

    }

    data class PlaylistData(
        val playlist: TrackIds?
    ) {
        data class TrackIds(
            val trackIds: ArrayList<TrackId>?
        ) {
            data class TrackId(
                val id: Long
            )
        }
    }

    /**
     * 切割歌单
     */
    private fun <T> averageAssignFixLength(source: List<T>?, splitItemNum: Int): List<List<T>> {
        val result = ArrayList<List<T>>()
        if (source != null && source.run { isNotEmpty() } && splitItemNum > 0) {
            if (source.size <= splitItemNum) {
                // 源List元素数量小于等于目标分组数量
                result.add(source)
            } else {
                // 计算拆分后list数量
                val splitNum = if (source.size % splitItemNum == 0) source.size / splitItemNum else source.size / splitItemNum + 1

                var value: List<T>? = null
                for (i in 0 until splitNum) {
                    value = if (i < splitNum - 1) {
                        source.subList(i * splitItemNum, (i + 1) * splitItemNum)
                    } else {
                        // 最后一组
                        source.subList(i * splitItemNum, source.size)
                    }
                    result.add(value)
                }
            }
        }
        return result
    }

}