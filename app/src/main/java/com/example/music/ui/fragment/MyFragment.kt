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
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.music.adapter.PlaylistAdapter
import com.example.music.data.PLAYLIST_TAG_MY_FAVORITE
import com.example.music.data.PlaylistData
import com.example.music.databinding.FragmentMyBinding
import com.example.music.music.standard.data.SOURCE_LOCAL
import com.example.music.ui.activity.LocalMusicActivity
import com.example.music.ui.activity.PlayHistoryActivity
import com.example.music.ui.activity.PlaylistActivity2
import com.example.music.ui.viewmodel.MainViewModel
import com.example.music.ui.viewmodel.MyFragmentViewModel
import com.example.music.util.*

/**
 * 我的
 */
class MyFragment : Fragment() {

    private var _binding: FragmentMyBinding? = null
    private val binding get() = _binding!!

    private val mainViewModel: MainViewModel by activityViewModels()

    private val myFragmentViewModel: MyFragmentViewModel by viewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentMyBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
        initListener()
        initObserver()
    }

    private fun initView() {
        val windowManager = activity?.getSystemService(Context.WINDOW_SERVICE) as WindowManager
        val width = windowManager.defaultDisplay.width

        (binding.llTop.layoutParams as LinearLayout.LayoutParams).apply {
            this.height = (width / 2.4).toInt()
        }
    }

    private fun initListener() {
        binding.apply {
            // 我喜欢的音乐
            clMyFavorite.setOnClickListener {
                val intent = Intent(this@MyFragment.context, PlaylistActivity2::class.java).apply {
                    putExtra(PlaylistActivity2.EXTRA_PLAYLIST_SOURCE, SOURCE_LOCAL)
                    putExtra(PlaylistActivity2.EXTRA_LONG_PLAYLIST_ID, 0L)
                    putExtra(PlaylistActivity2.EXTRA_INT_TAG, PLAYLIST_TAG_MY_FAVORITE)
                }
                startActivity(intent)
            }
            // 新建歌单
            clNewPlaylist.setOnClickListener {
                toast("开发中")
            }
            // 本地音乐
            clLocalMusic.setOnClickListener {
                val intent = Intent(this@MyFragment.context, LocalMusicActivity::class.java)
                startActivity(intent)
            }
            // 播放历史
            clHistory.setOnClickListener {
                val intent = Intent(this@MyFragment.context, PlayHistoryActivity::class.java)
                startActivity(intent)
            }
        }
    }

    private fun initObserver() {
        mainViewModel.userId.observe(viewLifecycleOwner, {
            // 清空歌单
            myFragmentViewModel.clearPlaylist()
            // toast("更新歌单")
            myFragmentViewModel.updatePlaylist()
        })
        // 用户歌单的观察
        myFragmentViewModel.userPlaylistList.observe(viewLifecycleOwner, {
            // toast(it.size.toString())
            setPlaylist(it)
        })
    }

    /**
     * 设置歌单
     */
    private fun setPlaylist(playlist: ArrayList<PlaylistData>) {

        runOnMainThread {
            binding.rvPlaylist.layoutManager =  LinearLayoutManager(this.context)
            binding.rvPlaylist.adapter = activity?.let { it1 -> PlaylistAdapter(playlist, it1) }
        }
    }
    override fun onDestroy() {
        super.onDestroy()
    }
}