package com.example.music.ui.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.music.MyApplication
import com.example.music.databinding.ActivityLoginBinding
import com.example.music.util.getStatusBarHeight

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initView()
        initListener()
    }

    private fun initView() {
        (binding.btnCancel.layoutParams as ConstraintLayout.LayoutParams).apply {
            topMargin = getStatusBarHeight(window, this@LoginActivity)
        }
    }

    private fun initListener() {
        binding.apply {
            // 取消
            btnCancel.setOnClickListener { finish() }
            // 手机号登录
            btnLoginByPhone.setOnClickListener {
                MyApplication.activityManager.startLoginByPhoneActivity(this@LoginActivity)
            }
            // UID 登录
            btnLoginByUid.setOnClickListener {
                MyApplication.activityManager.startLoginByUidActivity(this@LoginActivity)
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        when (requestCode) {
            0 -> if (resultCode == RESULT_OK) {
                finish()
            }
        }
    }

}