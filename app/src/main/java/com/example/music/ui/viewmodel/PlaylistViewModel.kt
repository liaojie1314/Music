package com.example.music.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.music.data.PLAYLIST_TAG_NORMAL
import com.example.music.music.local.MyFavorite
import com.example.music.music.standard.data.SOURCE_LOCAL
import com.example.music.music.standard.data.SOURCE_NETEASE
import com.example.music.music.standard.data.StandardSongData
import com.example.music.util.runOnMainThread

class PlaylistViewModel: ViewModel() {

    // id
    var id = 0L

    // source
    var source = SOURCE_NETEASE

    // tag
    var tag = MutableLiveData<Int>().also {
        it.value = PLAYLIST_TAG_NORMAL
    }

    // 歌单
    var playlist = MutableLiveData<ArrayList<StandardSongData>>()

    /**
     * 更新歌单
     */
    fun updatePlaylist() {

        // 数据库
        when (source) {
            SOURCE_LOCAL -> {
                // 我喜欢的歌曲
                if (id == 0L) {
                    MyFavorite.read {
                        runOnMainThread {
                            playlist.value = it
                        }
                    }
                }
            }
        }

    }

    fun setTag(newTag: Int) {
        tag.value = newTag
    }

}