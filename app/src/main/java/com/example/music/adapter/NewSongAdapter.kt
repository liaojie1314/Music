package com.example.music.adapter

import android.app.Activity
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.music.MyApplication
import com.example.music.R
import com.example.music.music.standard.data.StandardSongData
import com.example.music.ui.activity.PlayerActivity
import com.example.music.util.GlideUtil
import com.example.music.util.parseArtist

/**
 * 歌单适配器
 */
class NewSongAdapter(private val songDataList: ArrayList<StandardSongData>): RecyclerView.Adapter<NewSongAdapter.ViewHolder>() {

    inner class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val clTrack: ConstraintLayout = view.findViewById(R.id.clTrack)
        val ivCover: ImageView = view.findViewById(R.id.ivCover)
        val tvName: TextView = view.findViewById(R.id.tvName)
        val tvTrackCount: TextView = view.findViewById(R.id.tvTrackCount)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        LayoutInflater.from(parent.context).inflate(R.layout.layout_playlist, parent, false).apply {
            return ViewHolder(this)
        }
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val songData = songDataList[position]
        holder.apply {
            songData.imageUrl?.let { GlideUtil.load(it, ivCover) }
            tvName.text = songData.name
            tvTrackCount.text = songData.artists?.let { parseArtist(it) }
            clTrack.setOnClickListener {
                playMusic(position, it)
            }
        }
    }

    override fun getItemCount(): Int {
        return songDataList.size
    }

    /**
     * 播放音乐
     */
    private fun playMusic(position: Int, view: View?) {
        // 歌单相同
        if (MyApplication.musicBinderInterface?.getPlaylist() == songDataList) {
            if (position == MyApplication.musicBinderInterface?.getNowPosition()) {
                if (view != null) {
                    view.context.startActivity(Intent(view.context, PlayerActivity::class.java))
                    (view.context as Activity).overridePendingTransition(
                        R.anim.anim_slide_enter_bottom,
                        R.anim.anim_no_anim
                    )
                }
            } else {
                MyApplication.musicBinderInterface?.playMusic(position)
            }
        } else {
            // 设置歌单
            MyApplication.musicBinderInterface?.setPlaylist(songDataList)
            // 播放歌单
            MyApplication.musicBinderInterface?.playMusic(position)
        }
    }

}