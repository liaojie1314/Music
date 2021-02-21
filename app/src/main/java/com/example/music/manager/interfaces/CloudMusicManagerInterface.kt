package com.example.music.manager.interfaces

import androidx.annotation.Keep
import com.example.music.data.CommentData
import com.example.music.data.UserPlaylistData
import com.example.music.music.netease.data.*

/**
 * 网易云音乐接口管理
 */
@Deprecated("MVVM 分发到各个模块，避免单例跑")
@Keep
interface CloudMusicManagerInterface {

    /**
     * 获取评论
     */
    fun getComment(id: String, success: (CommentData) -> Unit, failure: () -> Unit)

    /**
     * 获取用户详细资料
     */
    fun getUserDetail(userId: Long, success: (UserDetailData) -> Unit, failure: () -> Unit)

    fun loginByTell(tell: String, password: String, success: (UserDetailData) -> Unit, failure: () -> Unit)

    fun likeSong(songId: String, success: () -> Unit, failure: () -> Unit)

    fun getBanner(success: (BannerData) -> Unit, failure: () -> Unit)

    fun sendComment(t: Int, type: Int, id: String, content: String, commentId: Long = 0L, success: (CodeData) -> Unit, failure: () -> Unit)

    fun getPrivateLetter(success: (PrivateLetterData) -> Unit, failure: () -> Unit)

    fun getPicture(url: String, heightOrWeight: Int): String

    fun getSearchDefault(success: (SearchDefaultData) -> Unit)

    /**
     * 获取热搜
     */
    fun getSearchHot(success: (SearchHotData) -> Unit)

    fun getArtists(artistId: Long, success: (ArtistsData) -> Unit)

    fun getLyric(songId: Long, success: (LyricData) -> Unit)

    /**
     * 获取歌曲信息
     */
    fun getSongInfo(id: String, success: (SongUrlData.UrlData) -> Unit)

    fun loginByUid(uid: String, success: () -> Unit)

    fun getUserDetail(uid: String, success: (result: com.example.music.data.UserDetailData) -> Unit, failure: (error: String) -> Unit)

    @Deprecated("过时")
    fun getUserPlaylist(uid: Long, success: (UserPlaylistData) -> Unit)

}