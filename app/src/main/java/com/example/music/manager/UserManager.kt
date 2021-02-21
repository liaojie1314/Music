package com.example.music.manager

import com.example.music.MyApplication
import com.example.music.manager.interfaces.UserManagerInterface
import com.example.music.util.Config


class UserManager: UserManagerInterface {

    companion object {
        const val defaultUid = 0L 
        const val DEFAULT_COOKIE = ""
    }

    override fun isUidLogin(): Boolean {
        val uid = MyApplication.mmkv.decodeLong(Config.UID, defaultUid)
        return uid != defaultUid
    }

    override fun getCurrentUid(): Long {
        return MyApplication.mmkv.decodeLong(Config.UID, defaultUid)
    }

    override fun setUid(uid: Long) {
        MyApplication.mmkv.encode(Config.UID, uid)
    }

    override fun getCloudMusicCookie(): String {
        return MyApplication.mmkv.decodeString(Config.CLOUD_MUSIC_COOKIE, DEFAULT_COOKIE)
    }

    /**
     * 设置网易云音乐用户 Cookie
     */
    override fun setCloudMusicCookie(cookie: String) {
        MyApplication.mmkv.encode(Config.CLOUD_MUSIC_COOKIE, cookie)
    }

}