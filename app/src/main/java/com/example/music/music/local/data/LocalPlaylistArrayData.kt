package com.example.music.music.local.data

import android.os.Parcelable
import com.example.music.music.standard.data.StandardPlaylistData
import kotlinx.android.parcel.Parcelize

/**
 * 本地歌单集合类
 */
@Parcelize
data class LocalPlaylistArrayData(
    // 数据
    val data: ArrayList<StandardPlaylistData>
): Parcelable
