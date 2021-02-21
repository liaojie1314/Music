package com.example.music.ui.activity

import android.annotation.SuppressLint
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.music.MyApplication
import com.example.music.R
import com.example.music.adapter.DetailPlaylistAdapter
import com.example.music.adapter.SearchHotAdapter
import com.example.music.databinding.ActivitySearchBinding
import com.example.music.music.netease.SearchUtil
import com.example.music.music.standard.SongPicture
import com.example.music.music.standard.data.StandardSongData
import com.example.music.ui.dialog.PlaylistDialog
import com.example.music.util.Config
import com.example.music.util.parseArtist
import com.example.music.util.runOnMainThread
import com.example.music.util.toast

class SearchActivity : AppCompatActivity() {

    companion object {
        const val ENGINE_NETEASE = 1
    }

    private lateinit var binding: ActivitySearchBinding
    private lateinit var musicBroadcastReceiver: MusicBroadcastReceiver // 音乐广播接收

    private var engine = ENGINE_NETEASE
    private var realKeyWord = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySearchBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initData()
        initView()
        initListener()
    }

    private fun initData() {
        val intentFilter = IntentFilter() // Intent 过滤器
        intentFilter.addAction("com.example.music.MUSIC_BROADCAST") // 只接收 "com.example.foyou.MUSIC_BROADCAST" 标识广播
        musicBroadcastReceiver = MusicBroadcastReceiver() //
        registerReceiver(musicBroadcastReceiver, intentFilter) // 注册接收器

        MyApplication.musicBinderInterface?.sendBroadcast()
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    private fun initView() {
        // 获取焦点
        binding.etSearch.apply {
            isFocusable = true
            isFocusableInTouchMode = true
            requestFocus()
        }

        // 获取推荐关键词
        MyApplication.cloudMusicManager.getSearchDefault {
            runOnMainThread {
                binding.etSearch.hint = it.data.showKeyword
                realKeyWord = it.data.realKeyword
            }
        }
        // 获取热搜
        MyApplication.cloudMusicManager.getSearchHot {
            runOnMainThread {
                binding.rvSearchHot.layoutManager = LinearLayoutManager(this)
                val searchHotAdapter = SearchHotAdapter(it)
                searchHotAdapter.setOnItemClick(object : SearchHotAdapter.OnItemClick {
                    override fun onItemClick(view: View?, position: Int) {
                        val searchWord = it.data[position].searchWord
                        binding.etSearch.setText(searchWord)
                        binding.etSearch.setSelection(searchWord.length)
                        search()
                    }
                })
                binding.rvSearchHot.adapter = searchHotAdapter
            }
        }
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    private fun initListener() {
        binding.apply {
            // ivBack
            ivBack.setOnClickListener {
                if (clPanel.visibility == View.VISIBLE) {
                    finish()
                } else {
                    clPanel.visibility = View.VISIBLE
                }
            }
            // 搜索
            btnSearch.setOnClickListener { search() }
        }

        binding.includePlayer.root.setOnClickListener {
            startActivity(Intent(this, PlayerActivity::class.java))
            overridePendingTransition(
                R.anim.anim_slide_enter_bottom,
                R.anim.anim_no_anim
            )
        }

        binding.includePlayer.ivPlay.setOnClickListener {
            // 更新
            MyApplication.musicBinderInterface?.changePlayState()
            refreshPlayState()
        }
        binding.includePlayer.ivPlaylist.setOnClickListener {
            PlaylistDialog(this).show()
        }

        // 搜索框
        binding.etSearch.apply {
            setOnEditorActionListener { _, p1, _ ->
                if (p1 == EditorInfo.IME_ACTION_SEARCH) { // 软键盘点击了搜索
                    search()
                }
                false
            }

            addTextChangedListener(object : TextWatcher {
                override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}
                override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}
                override fun afterTextChanged(s: Editable) {
                    if (binding.etSearch.text.toString() != "") {
                        binding.ivClear.visibility = View.VISIBLE // 有文字，显示清楚按钮
                    } else {
                        binding.ivClear.visibility = View.INVISIBLE // 隐藏
                    }
                }
            })
        }


        binding.ivClear.setOnClickListener {
            binding.etSearch.setText("")
        }

    }

    /**
     * 搜索音乐
     */
    private fun search() {
        // 关闭软键盘
        val inputMethodManager: InputMethodManager =
            this.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(this.window?.decorView?.windowToken, 0)


        var keywords = binding.etSearch.text.toString()
        if (keywords == "") {
            keywords = realKeyWord
            binding.etSearch.setText(keywords)
            binding.etSearch.setSelection(keywords.length)
        }
        if (keywords != "") {
            when (engine) {
                ENGINE_NETEASE -> {
                    SearchUtil.searchMusic(keywords, {
                        initRecycleView(it)
                    }, {
                        toast(it)
                    })
                }
            }
            binding.clPanel.visibility = View.GONE
        }


    }

    private fun initRecycleView(songList: ArrayList<StandardSongData>) {
        runOnMainThread {
            binding.rvPlaylist.layoutManager = LinearLayoutManager(this)
            binding.rvPlaylist.adapter = DetailPlaylistAdapter(songList, this)

        }
    }

    override fun onDestroy() {
        super.onDestroy()
        // 解绑广播接收
        unregisterReceiver(musicBroadcastReceiver)
        // 保存搜索引擎
        MyApplication.mmkv.encode(Config.SEARCH_ENGINE, engine)
    }

    override fun onBackPressed() {
        if (binding.clPanel.visibility == View.VISIBLE) {
            super.onBackPressed()
        } else {
            binding.clPanel.visibility = View.VISIBLE
        }
    }


    inner class MusicBroadcastReceiver : BroadcastReceiver() {
        override fun onReceive(context: Context, intent: Intent) {
            val song = MyApplication.musicBinderInterface?.getNowSongData()
            if (song != null) {
                SongPicture.getSongPicture(song, SongPicture.TYPE_LARGE) {
                    binding.includePlayer.ivCover.setImageBitmap(it)
                }
                binding.includePlayer.tvName.text = song.name
                binding.includePlayer.tvArtist.text = song.artists?.let { parseArtist(it) }
            }
            refreshPlayState()
        }
    }

    /**
     * 刷新播放状态
     */
    private fun refreshPlayState() {
        if (MyApplication.musicBinderInterface?.getPlayState()!!) {
            binding.includePlayer.ivPlay.setImageResource(R.drawable.ic_bq_control_pause)
        } else {
            binding.includePlayer.ivPlay.setImageResource(R.drawable.ic_mini_player_play)
        }
    }

}