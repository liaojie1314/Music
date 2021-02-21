package com.example.music.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.music.MyApplication
import com.example.music.api.CloudMusicApi
import com.example.music.data.PlaylistData
import com.example.music.data.UserPlaylistData
import com.example.music.util.MagicHttp
import com.example.music.util.loge
import com.example.music.util.runOnMainThread
import com.google.gson.Gson

/**
 * MyFragment 的 ViewModel
 */
class MyFragmentViewModel : ViewModel() {

    // 用户歌单
    val userPlaylistList = MutableLiveData<ArrayList<PlaylistData>>()

    // 对内
    private val _userPlaylistList = ArrayList<PlaylistData>()

    // offset
    private var offset = 0

    /**
     * 更新歌单
     */
    fun updatePlaylist() {
        // 当前 UID
        val uid = MyApplication.userManager.getCurrentUid()
        // 请求
        val url = "${CloudMusicApi.USER_PLAYLIST}?limit=30&offset=${offset * 30}&uid=${uid}"
        loge(url, "myFragment")
        MagicHttp.OkHttpManager().newGet(url, {
            val userPlaylistData = Gson().fromJson(it, UserPlaylistData::class.java)
            for (playlist in userPlaylistData.playlist) {
                _userPlaylistList.add(playlist)
            }
            if (userPlaylistData.more && offset < 3) {
                offset++
                updatePlaylist()
            } else {
                offset = 0
                runOnMainThread {
                    userPlaylistList.value = _userPlaylistList
                }
            }
        }, { })
    }

    /**
     * 清空 Playlist
     */
    fun clearPlaylist() {
        _userPlaylistList.clear()
        userPlaylistList.value?.clear()
    }

}