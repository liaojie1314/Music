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

    private val myFavoriteMusic = MyApplication.appDatabase.myFavoriteDao()

    /**
     * 读取本地歌曲
     */
    @TestOnly
    fun read(success: (ArrayList<StandardSongData>) -> Unit) {
        thread {
            val data = ArrayList<StandardSongData>()
            for (myFavorite in myFavoriteMusic.loadAll()) {
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
            if (myFavoriteData !in myFavoriteMusic.loadAll()) {
                myFavoriteMusic.insert(myFavoriteData)
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
            myFavoriteMusic.delete(MyFavoriteData(songData))
        }
    }
    /**
    *判断歌曲是否在数据库中
     */
    fun isExist(songData: StandardSongData,exist:(Boolean)->Unit){
        thread {
            val myFavoriteData=MyFavoriteData(songData)
            if (myFavoriteData in myFavoriteMusic.loadAll()){
                exist.invoke(true)
            }else{
                exist.invoke(false)
            }
        }
    }

    /**
     * 通过 id 删除一首歌
     */
    fun deleteById(id: String) {
        thread {
            myFavoriteMusic.deleteById(id)
        }
    }

}
