package com.example.music.util

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2

/**
 * 消除 ViewPager2 的边界阴影
 */
object ViewPager2Util {

    fun changeToNeverMode(viewPager2: ViewPager2): ViewPager2 {
        return changeOverScrollMode(viewPager2, View.OVER_SCROLL_NEVER)
    }
    fun changeOverScrollMode(viewPager2: ViewPager2, overMode: Int): ViewPager2 {
        val childView = viewPager2.getChildAt(0)
        (childView as? RecyclerView)?.overScrollMode = overMode
        return viewPager2
    }
}