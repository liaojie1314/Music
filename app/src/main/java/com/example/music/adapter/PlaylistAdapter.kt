package com.example.music.adapter

import android.annotation.SuppressLint
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
import com.example.music.data.PlaylistData
import com.example.music.music.standard.data.SOURCE_NETEASE
import com.example.music.ui.activity.PlaylistActivity
import com.example.music.util.GlideUtil
import com.example.music.util.dp

/**
 * 我的歌单适配器
 */
class PlaylistAdapter(private val playlist: ArrayList<PlaylistData>, val activity: Activity) : RecyclerView.Adapter<PlaylistAdapter.ViewHolder>() {

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val clTrack: ConstraintLayout = view.findViewById(R.id.clTrack)
        val ivCover: ImageView = view.findViewById(R.id.ivCover)
        val tvName: TextView = view.findViewById(R.id.tvName)
        val tvTrackCount: TextView = view.findViewById(R.id.tvTrackCount)

        val radius = view.context.resources.getDimension(R.dimen.defaultRadius)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_playlist, parent, false)
        return ViewHolder(view)
    }

    @SuppressLint("SetTextI18n", "StringFormatInvalid")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val play = playlist[position]
        val url = MyApplication.cloudMusicManager.getPicture(play.coverImgUrl, 56.dp())
        GlideUtil.loadCircle(url, holder.ivCover, holder.radius.toInt().dp(), 80.dp())
        GlideUtil.load(url, holder.ivCover)
        holder.tvName.text = play.name
        holder.tvTrackCount.text = holder.itemView.context.getString(R.string.songs, play.trackCount)
        holder.clTrack.setOnClickListener {
            val intent = Intent(it.context, PlaylistActivity::class.java)
            intent.putExtra(PlaylistActivity.EXTRA_PLAYLIST_SOURCE, SOURCE_NETEASE)
            intent.putExtra(PlaylistActivity.EXTRA_LONG_PLAYLIST_ID, play.id)
            it.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return playlist.size
    }

}
