package com.example.music

import android.app.Application
import android.content.Context
import android.content.Intent
import androidx.annotation.Keep
import com.example.music.manager.ActivityManager
import com.example.music.manager.CloudMusicManager
import com.example.music.manager.UserManager
import com.example.music.room.AppDatabase
import com.example.music.service.MusicBinderInterface
import com.example.music.service.MusicService
import com.example.music.service.MusicServiceConnection
import com.tencent.mmkv.MMKV
import okhttp3.Cookie

@Keep
class MyApplication : Application() {

    companion object {

        lateinit var context: Context // 注入懒加载 全局 context
        lateinit var mmkv: MMKV // mmkv
        var musicBinderInterface: MusicBinderInterface? = null // MusicBinderInterface
        val musicServiceConnection by lazy { MusicServiceConnection() } // 音乐服务连接

        val cookieStore: HashMap<String, List<Cookie>> = HashMap() // cookie

        // 管理
        lateinit var userManager: UserManager
        lateinit var activityManager: ActivityManager
        lateinit var cloudMusicManager: CloudMusicManager

        // 数据库
        lateinit var appDatabase: AppDatabase

    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
        // MMKV 初始化
        MMKV.initialize(this)
        mmkv = MMKV.defaultMMKV() // MMKV
        // 管理初始化
        userManager = UserManager()
        activityManager = ActivityManager()
        cloudMusicManager = CloudMusicManager()
        // 初始化数据库
        appDatabase = AppDatabase.getDatabase(this)
        startMusicService()
    }
    private fun startMusicService() {
        val intent = Intent(this, MusicService::class.java)
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            startForegroundService(intent)
        } else {
            startService(intent)
        }
        // 绑定服务
        bindService(intent, musicServiceConnection, BIND_AUTO_CREATE)
    }

}