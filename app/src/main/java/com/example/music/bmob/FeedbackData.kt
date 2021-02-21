package com.example.music.bmob

import androidx.annotation.Keep
import cn.bmob.v3.BmobObject

@Keep
class FeedbackData : BmobObject() {
    var feedback: String? = null
    var contact: String? = null
}