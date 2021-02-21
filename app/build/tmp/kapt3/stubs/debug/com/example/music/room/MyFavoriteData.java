package com.example.music.room;

import java.lang.System;

@androidx.room.TypeConverters(value = {com.example.music.room.StandardArtistDataConverter.class})
@androidx.room.Entity()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u0004\u00a8\u0006\u0017"}, d2 = {"Lcom/example/music/room/MyFavoriteData;", "", "songData", "Lcom/example/music/music/standard/data/StandardSongData;", "(Lcom/example/music/music/standard/data/StandardSongData;)V", "databaseId", "", "getDatabaseId", "()J", "setDatabaseId", "(J)V", "getSongData", "()Lcom/example/music/music/standard/data/StandardSongData;", "setSongData", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
public final class MyFavoriteData {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private long databaseId = 0L;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Embedded()
    private com.example.music.music.standard.data.StandardSongData songData;
    
    public final long getDatabaseId() {
        return 0L;
    }
    
    public final void setDatabaseId(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.music.music.standard.data.StandardSongData getSongData() {
        return null;
    }
    
    public final void setSongData(@org.jetbrains.annotations.NotNull()
    com.example.music.music.standard.data.StandardSongData p0) {
    }
    
    public MyFavoriteData(@org.jetbrains.annotations.NotNull()
    com.example.music.music.standard.data.StandardSongData songData) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.music.music.standard.data.StandardSongData component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.music.room.MyFavoriteData copy(@org.jetbrains.annotations.NotNull()
    com.example.music.music.standard.data.StandardSongData songData) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}