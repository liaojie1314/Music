package com.example.music.util

import android.app.Activity
import android.content.Context
import android.content.res.Resources
import android.graphics.Point
import android.os.Build
import android.view.KeyCharacterMap
import android.view.KeyEvent
import android.view.ViewConfiguration

/**
 * 屏幕工具类
 */
object ScreenUtil {

    fun getNavigationBarHeight(activity: Activity): Int {
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            val display = activity.windowManager.defaultDisplay
            val size = Point()
            val realSize = Point()
            display.getSize(size)
            display.getRealSize(realSize)
            val resources: Resources = activity.resources
            val resourceId: Int = resources.getIdentifier("navigation_bar_height", "dimen", "android")
            val height: Int = resources.getDimensionPixelSize(resourceId)
            //超出系统默认的导航栏高度以上，则认为存在虚拟导航
            if (realSize.y - size.y > height - 10) {
                height
            } else 0
        } else {
            val menu = ViewConfiguration.get(activity).hasPermanentMenuKey()
            val back = KeyCharacterMap.deviceHasKey(KeyEvent.KEYCODE_BACK)
            if (menu || back) {
                0
            } else {
                val resources: Resources = activity.resources
                val resourceId: Int =
                    resources.getIdentifier("navigation_bar_height", "dimen", "android")
                resources.getDimensionPixelSize(resourceId)
            }
        }
    }
}