package com.example.music.music.standard

import android.annotation.SuppressLint
import android.graphics.Bitmap
import androidx.core.graphics.drawable.toBitmap
import com.example.music.MyApplication
import com.example.music.R
import com.example.music.api.API_FCZBL_VIP
import com.example.music.music.local.LocalMusic
import com.example.music.music.standard.data.*
import com.example.music.util.GlideUtil
import com.example.music.util.dp
import com.example.music.util.loge
import org.jetbrains.annotations.TestOnly

object SongPicture {

    const val TYPE_LARGE = 1

    /**
     * 标准
     */
    @SuppressLint("UseCompatLoadingForDrawables")
    fun getSongPicture(songData: StandardSongData, type: Int, success: (Bitmap) -> Unit) {
        // 普通背景
        if (songData.source == SOURCE_LOCAL) {
            val commonBitmap: Bitmap? = MyApplication.context.getDrawable(R.drawable.bq_no_data_song)?.toBitmap()
            if (commonBitmap != null) {
                success.invoke(commonBitmap)
            }
        } else {
            val url = getSongPictureUrl(songData, type)
            GlideUtil.load(url) {
                success.invoke(it)
            }
        }
    }

    /**
     * 获取图片
     */
    private fun getSongPictureUrl(songData: StandardSongData, type: Int): String {
        return when (songData.source) {
            SOURCE_NETEASE -> {
                // url = url.replace("?param=300y300", "?param=1000y60")
                when (type) {
                    TYPE_LARGE -> {
                        // "${songData.imageUrl}?param=300y300"
                        "$API_FCZBL_VIP/?type=cover&id=${songData.id}&param=${240.dp()}y${240.dp()}"
                    }
                    else -> {
                        "$API_FCZBL_VIP/?type=cover&id=${songData.id}"
                    }
                }

            }
            else -> {
                "https://s4.music.126.net/style/web2/img/default/default_album.jpg"
            }
        }

    }

    /**
     * 获取 PlayerActivityCover 图片
     */
    @SuppressLint("UseCompatLoadingForDrawables")
    @TestOnly
    fun getPlayerActivityCoverBitmap(songData: StandardSongData, size: Int, success: (Bitmap) -> Unit) {
        when(songData.source) {
            SOURCE_NETEASE -> {
                loge("getPlayerActivityCoverBitmap网易云图片原url【${songData.imageUrl}】")
                val url = if (songData.imageUrl == "https://p2.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg"
                    || songData.imageUrl == "https://p1.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg") {
                    "$API_FCZBL_VIP/?type=cover&id=${songData.id}"
                } else {
                    "${songData.imageUrl}?param=${size}y${size}"
                }
                loge("getPlayerActivityCoverBitmap网易云图片url【${songData.imageUrl}?param=${size}y${size}】")

                GlideUtil.load(url) {
                    success.invoke(it)
                }
            }
            SOURCE_LOCAL -> {
                songData.imageUrl?.let {
                    try {
                        val bitmap = LocalMusic.loadCover(it)
                        success.invoke(bitmap)
                    } catch (e: Exception) {

                    }

                }
            }
            else -> {
                val commonBitmap: Bitmap? = MyApplication.context.getDrawable(R.drawable.bq_no_data_song)?.toBitmap()
                if (commonBitmap != null) {
                    success.invoke(commonBitmap)
                }
            }
        }

    }

}