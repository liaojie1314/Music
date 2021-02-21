package com.example.music.manager.interfaces

interface UserManagerInterface {
    /**
     * uid 是否登录
     */
    fun isUidLogin(): Boolean

    /**
     * 获取当前 uid
     */
    fun getCurrentUid(): Long

    fun setUid(uid: Long)

    fun getCloudMusicCookie(): String

    fun setCloudMusicCookie(cookie: String)
}