package com.example.music.music.netease

import com.example.music.music.cloud.SearchSong

object SongUrl {

    fun getSongUrl(id: String): String {
        return if (SearchSong.getExampleSongUrl(id) != "") {
            SearchSong.getExampleSongUrl(id)
        } else {
            "https://music.163.com/song/media/outer/url?id=${id}.mp3"
        }
    }

}