package com.example.music.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.music.R
import com.example.music.music.netease.PlaylistRecommend
import com.example.music.music.standard.data.SOURCE_NETEASE
import com.example.music.ui.activity.PlaylistActivity
import com.example.music.util.GlideUtil
import com.example.music.util.dp
import com.example.music.util.dp2px

/**
 * 歌单推荐适配器
 */
class PlaylistRecommendAdapter(private val playlistRecommendDataResult: ArrayList<PlaylistRecommend.PlaylistRecommendDataResult>) : RecyclerView.Adapter<PlaylistRecommendAdapter.ViewHolder>() {

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val clTrack: ConstraintLayout = view.findViewById(R.id.clTrack)
        val ivCover: ImageView = view.findViewById(R.id.ivCover)
        val tvName: TextView = view.findViewById(R.id.tvName)
        val tvPlayCount: TextView = view.findViewById(R.id.tvPlayCount)
        // val tvTrackCount: TextView = view.findViewById(R.id.tvTrackCount)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycle_view_playlist_recommend, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        if (position == 0 || position == 1) {
            val layoutParams = ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.MATCH_PARENT)
            layoutParams.setMargins(dp2px(10f).toInt(), 0, 0, 0)
            holder.clTrack.layoutParams = layoutParams

        }
        if (position == playlistRecommendDataResult.lastIndex
            || position == playlistRecommendDataResult.lastIndex - 1) {
            val layoutParams = ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.MATCH_PARENT)
            layoutParams.setMargins(0, 0, 10.dp(), 0)
            holder.clTrack.layoutParams = layoutParams
        }

        // 获取当前歌单
        val playlist = playlistRecommendDataResult[position]

        GlideUtil.load(playlist.picUrl, holder.ivCover)
        holder.clTrack.setOnClickListener {
            val intent = Intent(it.context, PlaylistActivity::class.java)
            intent.putExtra(PlaylistActivity.EXTRA_PLAYLIST_SOURCE, SOURCE_NETEASE)
            intent.putExtra(PlaylistActivity.EXTRA_LONG_PLAYLIST_ID, playlist.id)
            it.context.startActivity(intent)
        }
        holder.tvName.text = playlist.name


        holder.tvPlayCount.text = when (playlist.playCount) {
            in 1 until 10_000 -> playlist.playCount.toString()
            in 10_000 until 100_000_000 -> "${playlist.playCount / 10000} 万"
            else -> "${playlist.playCount / 100_000_000} 亿"
        }
    }

    override fun getItemCount(): Int {
        return playlistRecommendDataResult.size
    }

}
