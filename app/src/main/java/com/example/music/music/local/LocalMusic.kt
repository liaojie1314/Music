package com.example.music.music.local

import android.app.Activity
import android.content.ContentResolver
import android.database.Cursor
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.media.MediaMetadataRetriever
import com.example.music.MyApplication
import com.example.music.music.standard.data.SOURCE_LOCAL
import com.example.music.music.standard.data.StandardSongData
import com.example.music.music.standard.data.StandardSongData.LocalInfo
import com.example.music.music.standard.data.StandardSongData.StandardArtistData
import com.example.music.util.Config
import com.example.music.util.toast
import java.io.*
import java.net.URL


object LocalMusic {

    fun scanLocalMusic(activity: Activity, success: (ArrayList<StandardSongData>) -> Unit, failure: () -> Unit) {

        val songList = ArrayList<StandardSongData>()

        val resolver: ContentResolver = activity.contentResolver
        val uri = android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI
        val cursor: Cursor? = resolver.query(uri, null, null, null, null)
        when {
            cursor == null -> {
                toast("错误")
                failure.invoke()
            }
            !cursor.moveToFirst() -> {
                toast("无音乐")
                failure.invoke()
            }
            else -> {
                val titleColumn: Int = cursor.getColumnIndex(android.provider.MediaStore.Audio.Media.TITLE)
                val idColumn: Int = cursor.getColumnIndex(android.provider.MediaStore.Audio.Media._ID)
                val artistColumn: Int = cursor.getColumnIndex(android.provider.MediaStore.Audio.Media.ARTIST)

                val dataColumn: Int = cursor.getColumnIndex(android.provider.MediaStore.Audio.Media.DATA)
                val sizeColumn: Int = cursor.getColumnIndex(android.provider.MediaStore.Audio.Media.SIZE) // 码率
                do {
                    val id = cursor.getLong(idColumn) // 音乐 id
                    val path = cursor.getString(dataColumn)
                    val title = cursor.getString(titleColumn) // 音乐名称
                    var artist = cursor.getString(artistColumn) // 艺术家
                    val size = cursor.getLong(sizeColumn)
                    if (title == "" && artist == "<unknown>") {
                        continue
                    }
                    if (artist == "<unknown>") {
                        artist = "未知歌手"
                    }
                    // 大小为 0 过滤
                    if (size == 0L) {
                        continue
                    }
                    if (MyApplication.mmkv.decodeBool(Config.SMART_FILTER, true)) {
                        if (size <= 500_000) {
                            continue
                        }
                    }
                    // 是否过滤录音
                    if (MyApplication.mmkv.decodeBool(Config.FILTER_RECORD, true)) {
                        if (artist == "Meizu Recorder") {
                            continue
                        }
                    }
                    // loge("本地歌曲：$id，标题【$title】，艺术家【$artist】")

                    val artistList = ArrayList<StandardArtistData>()
                    artistList.add(
                        StandardArtistData(
                            null,
                            artist
                        )
                    )
                    songList.add(
                        StandardSongData(
                            SOURCE_LOCAL,
                            id.toString(),
                            title,
                            path,
                            artistList,
                            null,
                            LocalInfo(size),
                            null
                        )
                    )

                } while (cursor.moveToNext())
                success.invoke(songList)
            }
        }
        cursor?.close()

    }


    @Throws(IOException::class)
    private fun copy(inputStream: InputStream, out: OutputStream) {
        val bytes = ByteArray(1024)
        var read: Int
        while (inputStream.read(bytes).also { read = it } != -1) {
            out.write(bytes, 0, read)
        }
    }

    fun loadCover(path: String): Bitmap {
        val mediaMetadataRetriever = MediaMetadataRetriever()
        mediaMetadataRetriever.setDataSource(path)
        val cover = mediaMetadataRetriever.embeddedPicture
        val bitmap = BitmapFactory.decodeByteArray(cover, 0, cover!!.size)
        return bitmap
    }

}