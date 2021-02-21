package com.example.music.util

import android.app.Activity
import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.content.Intent
import android.graphics.Typeface
import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.Window
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import cn.bmob.v3.BuildConfig
import com.example.music.MyApplication
import com.example.music.music.standard.data.StandardSongData.StandardArtistData
import java.lang.Exception

/**
 * 全局 toast
 */
fun toast(msg: String) {
    runOnMainThread {
        Toast.makeText(MyApplication.context, msg, Toast.LENGTH_SHORT).show()
    }
}

/**
 * 运行在主线程，更新 UI
 */
fun runOnMainThread(runnable: Runnable) {
    Handler(Looper.getMainLooper()).post(runnable)
}

/**
 * 全局 log
 */
@JvmOverloads
fun loge(msg: String, tag: String = "默认") {
    runOnMainThread {
        Log.e(tag, "【$msg】")
    }
}

/**
 * dp 转 px
 */
fun dp2px(dp: Float): Float = dp * MyApplication.context.resources.displayMetrics.density

/**
 * 获取系统当前时间
 */
fun getCurrentTime() : Long {
    return System.currentTimeMillis()
}

/**
 * 标准歌手数组转文本
 * @param artistList 歌手数组
 * @return 文本
 */
fun parseArtist(artistList: ArrayList<StandardArtistData>): String {
    var artist = ""
    for (artistName in 0..artistList.lastIndex) {
        if (artistName != 0) {
            artist += " / "
        }
        artist += artistList[artistName].name
    }
    return artist
}

/**
 * 毫秒转日期
 */
fun msTimeToFormatDate(msTime: Long): String {
    return TimeUtil.msTimeToFormatDate(msTime)
}

/**
 * 获取状态栏高度
 * @return px 值
 */
fun getStatusBarHeight(window: Window, context: Context): Int {
    return StatusBarUtil.getStatusBarHeight(window, context)
}

/**
 * 获取底部导航栏高度
 */
fun getNavigationBarHeight(activity: Activity): Int {
    return ScreenUtil.getNavigationBarHeight(activity)
}
fun getVisionCode(): Int {
    return BuildConfig.VERSION_CODE
}

fun getVisionName(): String {
    return BuildConfig.VERSION_NAME
}

fun copyToClipboard(activity: Activity, text: String) {
    val clipboardManager = activity.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
    val clipData = ClipData.newPlainText("Label", text)
    clipboardManager.setPrimaryClip(clipData)
}
