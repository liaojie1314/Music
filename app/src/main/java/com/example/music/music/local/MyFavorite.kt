package com.example.music.music.local

import com.example.music.MyApplication
import com.example.music.music.standard.data.StandardSongData
import com.example.music.room.MyFavoriteData
import com.example.music.util.toast
import org.jetbrains.annotations.TestOnly
import kotlin.concurrent.thread

/**
 * 本地我喜欢的
 */
object MyFavorite {

    private val myFavoriteDao = MyApplication.appDatabase.myFavoriteDao()

    /**
     * 读取本地歌曲
     */
    @TestOnly
    fun read(success: (ArrayList<StandardSongData>) -> Unit) {
        thread {
            val data = ArrayList<StandardSongData>()
            for (myFavorite in myFavoriteDao.loadAll()) {
                data.add(0, myFavorite.songData)
            }
            success.invoke(data)
        }
    }

    /**
     * 添加一首歌
     */
    @TestOnly
    fun addSong(songData: StandardSongData) {
        thread {
            val myFavoriteData = MyFavoriteData(songData)
            if (myFavoriteData !in myFavoriteDao.loadAll()) {
                myFavoriteDao.insert(myFavoriteData)
                toast("添加成功")
            } else {
                toast("已经添加过了哦~")
            }
        }
    }

    /**
     * 删除一首歌
     */
    @TestOnly
    fun delete(songData: StandardSongData) {
        thread {
            myFavoriteDao.delete(MyFavoriteData(songData))
        }
    }

    /**
     * 通过 id 删除一首歌
     */
    fun deleteById(id: String) {
        thread {
            myFavoriteDao.deleteById(id)
        }
    }

}
