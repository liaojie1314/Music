package com.example.music.ui.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.music.MyApplication
import com.example.music.databinding.ActivityLoginByPhoneBinding
import com.example.music.util.runOnMainThread
import com.example.music.util.toast

class LoginByPhoneActivity : AppCompatActivity() {

    lateinit var binding: ActivityLoginByPhoneBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginByPhoneBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initListener()

    }

    private fun initListener() {
        binding.btnLoginByPhone.setOnClickListener {
            val phone = binding.etPhone.text.toString()
            val password = binding.etPassword.text.toString()
            if (phone == "" || password == "") {
                toast("请输入手机号或密码")
            } else {
                binding.btnLoginByPhone.visibility = View.GONE
                binding.llLoading.visibility = View.VISIBLE
                binding.lottieLoading.repeatCount = -1
                binding.lottieLoading.playAnimation()
                MyApplication.cloudMusicManager.loginByTell(phone, password, {
                    // 发送广播
                    val intent = Intent("com.example.music.LOGIN")
                    intent.setPackage(packageName)
                    sendBroadcast(intent)
                    // 通知 Login 关闭
                    setResult(RESULT_OK, Intent())
                    finish()
                }, {
                    runOnMainThread {
                        binding.btnLoginByPhone.visibility = View.VISIBLE
                        binding.llLoading.visibility = View.GONE
                        binding.lottieLoading.cancelAnimation()
                        toast("登录失败，请检查用户名或者密码")
                    }
                })
            }
        }
    }

}