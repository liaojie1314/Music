package com.example.music.music.standard.data

import android.os.Parcelable
import androidx.annotation.Keep
import kotlinx.android.parcel.Parcelize

const val SOURCE_LOCAL = 1
const val SOURCE_NETEASE = 2
const val SOURCE_example = 4

@Keep
@Parcelize
data class StandardLocalPlaylistData(
    val playlists: ArrayList<StandardPlaylistData>
) : Parcelable



