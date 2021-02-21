package com.example.music.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.music.MyApplication
import com.example.music.music.netease.data.UserDetailData
import com.example.music.ui.fragment.HomeFragment
import com.example.music.ui.fragment.MyFragment
import com.example.music.util.toast

class MainViewModel: ViewModel() {

    val myFragment = MyFragment()
    val homeFragment = HomeFragment()

    val userId =  MutableLiveData<Long>().also {
        it.value = MyApplication.userManager.getCurrentUid()
    }

    private val userDetail = MutableLiveData<UserDetailData>()

    fun setUserId() {
        userId.value = MyApplication.userManager.getCurrentUid()
    }
}