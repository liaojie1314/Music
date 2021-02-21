package com.example.music.ui.activity

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.music.MyApplication
import com.example.music.R
import com.example.music.adapter.DetailPlaylistAdapter
import com.example.music.databinding.ActivityPlayHistoryBinding
import com.example.music.music.local.PlayHistory
import com.example.music.music.standard.SongPicture
import com.example.music.ui.dialog.PlaylistDialog
import com.example.music.util.parseArtist

class PlayHistoryActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPlayHistoryBinding

    private lateinit var musicBroadcastReceiver: MusicBroadcastReceiver // 音乐广播接收

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPlayHistoryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intentFilter = IntentFilter()
        intentFilter.addAction("com.example.music.MUSIC_BROADCAST") // 只接收 "com.example.foyou.MUSIC_BROADCAST" 标识广播
        musicBroadcastReceiver = MusicBroadcastReceiver() //
        registerReceiver(musicBroadcastReceiver, intentFilter) // 注册接收器

        // 请求广播
        MyApplication.musicBinderInterface?.sendBroadcast()

        initView()

    }

    private fun initView() {
        binding.apply {
            rvPlayHistory.layoutManager = LinearLayoutManager(this@PlayHistoryActivity)
            rvPlayHistory.adapter = DetailPlaylistAdapter(PlayHistory.readPlayHistory(), this@PlayHistoryActivity)
        }


        // Mini Player
        binding.miniPlayer.apply {
            root.setOnClickListener {
                MyApplication.activityManager.startPlayerActivity(this@PlayHistoryActivity)
            }
            ivPlay.setOnClickListener {
                MyApplication.musicBinderInterface?.changePlayState()
                refreshPlayState()
            }
            ivPlaylist.setOnClickListener { PlaylistDialog(this@PlayHistoryActivity).show() }
        }
    }

    inner class MusicBroadcastReceiver : BroadcastReceiver() {
        override fun onReceive(context: Context, intent: Intent) {
            val song = MyApplication.musicBinderInterface?.getNowSongData()
            if (song != null) {
                binding.miniPlayer.tvName.text = song.name
                binding.miniPlayer.tvArtist.text = song.artists?.let { parseArtist(it) }
                // 这里应该用小的，等待修改
                SongPicture.getSongPicture(song, SongPicture.TYPE_LARGE) {
                    binding.miniPlayer.ivCover.setImageBitmap(it)
                }
            }
            refreshPlayState()
        }
    }

    private fun refreshPlayState() {
        if (MyApplication.musicBinderInterface?.getPlayState()!!) {
            binding.miniPlayer.ivPlay.setImageResource(R.drawable.ic_bq_control_pause)
        } else {
            binding.miniPlayer.ivPlay.setImageResource(R.drawable.ic_mini_player_play)
        }
    }

}