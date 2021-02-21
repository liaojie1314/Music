//package com.example.music.ui.activity
//
//import android.os.Bundle
//import androidx.appcompat.app.AppCompatActivity
//import androidx.recyclerview.widget.LinearLayoutManager
//import com.example.music.adapter.OpenAdapter
//import com.example.music.data.OpenData
//import com.example.music.databinding.ActivityOpenSourceBinding
//
//class OpenSourceActivity : AppCompatActivity() {
//
//    companion object {
//        private const val AL2 = "Apache License (Version 2.0)"
//    }
//
//    private lateinit var binding: ActivityOpenSourceBinding
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        binding = ActivityOpenSourceBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//        initView()
//    }
//
//    private fun initView() {
//        val openSourceList = listOf(
//            OpenData("Kotlin Programming Language", "https://github.com/JetBrains/kotlin", AL2),
//            OpenData("OkHttp", "https://github.com/square/okhttp", AL2),
//            OpenData("Gson", "https://github.com/google/gson","BSD, part MIT and Apache 2.0"),
//            OpenData("Glide", "https://github.com/bumptech/glide","BSD, part MIT and Apache 2.0"),
//            OpenData("Glide Transformations", "https://github.com/wasabeef/glide-transformations", AL2),
//            OpenData("Banner", "https://github.com/youth5201314/banner", AL2),
//            OpenData("MMKV", "https://github.com/Tencent/MMKV","BSD 3-Clause license"),
//            OpenData("Lottie", "https://github.com/airbnb/lottie-android", AL2),
//            OpenData("EdgeTranslucent", "https://github.com/qinci/EdgeTranslucent","Unknown"),
//            OpenData("NeteaseCloudMusic-MVVM", "https://github.com/zion223/NeteaseCloudMusic-MVVM","Unknown"),
//            OpenData("LyricViewX", "https://github.com/Moriafly/LyricViewX","GPL-3.0 License"),
//            OpenData("Switcher", "https://github.com/bitvale/Switcher", AL2),
//            OpenData("Aria", "https://github.com/AriaLyy/Aria", AL2),
//            OpenData("BlurView", "https://github.com/Dimezis/BlurView", AL2),
//            OpenData("ASimpleCache", "https://github.com/yangfuhai/ASimpleCache", AL2)
//            )
//        binding.rvOpenSource.layoutManager = LinearLayoutManager(this)
//        binding.rvOpenSource.adapter = OpenAdapter(openSourceList)
//    }
//}