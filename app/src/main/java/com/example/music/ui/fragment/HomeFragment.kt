package com.example.music.ui.fragment

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.example.music.R
import com.example.music.adapter.NewSongAdapter
import com.example.music.adapter.PlaylistRecommendAdapter
import com.example.music.databinding.FragmentHomeBinding
import com.example.music.music.netease.NewSong
import com.example.music.music.netease.PlaylistRecommend
import com.example.music.music.standard.data.SOURCE_example
import com.example.music.ui.activity.PlaylistActivity
import com.example.music.util.dp
import com.example.music.util.runOnMainThread

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val windowManager = activity?.getSystemService(Context.WINDOW_SERVICE) as WindowManager
        val width = windowManager.defaultDisplay.width

        (binding.banner.layoutParams as LinearLayout.LayoutParams).apply {
            height = ((width - 40.dp()).toFloat() / 108 * 42).toInt() + 8.dp()
        }
        initView()
        initListener()
        update()
    }

    private fun initView() {
        binding.swipeRefreshLayout.setColorSchemeResources(R.color.colorAppThemeColor)
    }

    /**
     * 刷新整个页面
     */
    private fun update() {
        binding.swipeRefreshLayout.isRefreshing = true
        // 推荐歌单
        refreshPlaylistRecommend()
        // 新歌速递
        updateNewSong()
    }



    private fun initListener() {

        binding.clMusic.setOnClickListener {
            val intent = Intent(this.context, PlaylistActivity::class.java)
            intent.putExtra(PlaylistActivity.EXTRA_PLAYLIST_SOURCE, SOURCE_example)
            intent.putExtra(PlaylistActivity.EXTRA_LONG_PLAYLIST_ID, 0)
            startActivity(intent)
        }

        binding.swipeRefreshLayout.setOnRefreshListener { update() }
    }


    private fun refreshPlaylistRecommend() {
        PlaylistRecommend.getPlaylistRecommend({
            runOnMainThread {
                binding.rvPlaylistRecommend.layoutManager = GridLayoutManager(context, 2, GridLayoutManager.HORIZONTAL, false)
                binding.rvPlaylistRecommend.adapter = PlaylistRecommendAdapter(it)

                binding.swipeRefreshLayout.isRefreshing = false
            }
        }, {

        })

    }

    private fun updateNewSong() {
        this.context?.let {
            NewSong.getNewSong(it) {
                runOnMainThread {
                    binding.rvNewSong.layoutManager = GridLayoutManager(this.context, 2)
                    binding.rvNewSong.adapter = NewSongAdapter(it)
                }
            }
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
    }

}