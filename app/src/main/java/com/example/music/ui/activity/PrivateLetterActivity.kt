package com.example.music.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.music.MyApplication
import com.example.music.adapter.PrivateLetterAdapter
import com.example.music.databinding.ActivityPrivateLetterBinding
import com.example.music.util.toast

class PrivateLetterActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPrivateLetterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPrivateLetterBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initView()
    }

    private fun initView() {
        binding.rvPrivateLetter.layoutManager = LinearLayoutManager(this)
        MyApplication.cloudMusicManager.getPrivateLetter({
            runOnUiThread {
                binding.rvPrivateLetter.adapter = PrivateLetterAdapter(it.msgs)
            }
        }, {
            toast("获取失败")
        })

    }

}