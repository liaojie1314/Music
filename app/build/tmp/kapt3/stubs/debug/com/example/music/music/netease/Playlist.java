package com.example.music.music.netease;

import java.lang.System;

/**
 * 获取网易云歌单全部，对于大型歌单也要成功
 */
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u001bB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J2\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\n0\n\"\u0004\b\u0000\u0010\u000b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u0002H\u000b\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\u0004H\u0002JH\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\"\u0010\u0014\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00170\u0016j\b\u0012\u0004\u0012\u00020\u0017`\u0018\u0012\u0004\u0012\u00020\u000f0\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001aR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/example/music/music/netease/Playlist;", "", "()V", "CHEATING_CODE", "", "PLAYLIST_URL", "", "SONG_DETAIL_URL", "SPLIT_PLAYLIST_NUMBER", "averageAssignFixLength", "", "T", "source", "splitItemNum", "getPlaylist", "", "context", "Landroid/content/Context;", "playlistId", "", "success", "Lkotlin/Function1;", "Ljava/util/ArrayList;", "Lcom/example/music/music/standard/data/StandardSongData;", "Lkotlin/collections/ArrayList;", "failure", "Lkotlin/Function0;", "PlaylistData", "app_debug"})
public final class Playlist {
    private static final int SPLIT_PLAYLIST_NUMBER = 1000;
    private static final int CHEATING_CODE = -460;
    private static final java.lang.String PLAYLIST_URL = "http://music.eleuu.com/playlist/detail?id=";
    private static final java.lang.String SONG_DETAIL_URL = "http://music.eleuu.com/song/detail";
    @org.jetbrains.annotations.NotNull()
    public static final com.example.music.music.netease.Playlist INSTANCE = null;
    
    /**
     * 传入歌单 [playlistId] id
     */
    @org.jetbrains.annotations.TestOnly()
    public final void getPlaylist(@org.jetbrains.annotations.NotNull()
    android.content.Context context, long playlistId, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.ArrayList<com.example.music.music.standard.data.StandardSongData>, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> failure) {
    }
    
    /**
     * 切割歌单
     */
    private final <T extends java.lang.Object>java.util.List<java.util.List<T>> averageAssignFixLength(java.util.List<? extends T> source, int splitItemNum) {
        return null;
    }
    
    private Playlist() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0010B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/example/music/music/netease/Playlist$PlaylistData;", "", "playlist", "Lcom/example/music/music/netease/Playlist$PlaylistData$TrackIds;", "(Lcom/example/music/music/netease/Playlist$PlaylistData$TrackIds;)V", "getPlaylist", "()Lcom/example/music/music/netease/Playlist$PlaylistData$TrackIds;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "TrackIds", "app_debug"})
    public static final class PlaylistData {
        @org.jetbrains.annotations.Nullable()
        private final com.example.music.music.netease.Playlist.PlaylistData.TrackIds playlist = null;
        
        @org.jetbrains.annotations.Nullable()
        public final com.example.music.music.netease.Playlist.PlaylistData.TrackIds getPlaylist() {
            return null;
        }
        
        public PlaylistData(@org.jetbrains.annotations.Nullable()
        com.example.music.music.netease.Playlist.PlaylistData.TrackIds playlist) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.example.music.music.netease.Playlist.PlaylistData.TrackIds component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.music.music.netease.Playlist.PlaylistData copy(@org.jetbrains.annotations.Nullable()
        com.example.music.music.netease.Playlist.PlaylistData.TrackIds playlist) {
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
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0012B!\u0012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005\u00a2\u0006\u0002\u0010\u0006J\u001d\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005H\u00c6\u0003J\'\u0010\n\u001a\u00020\u00002\u001c\b\u0002\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005H\u00c6\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R%\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0013"}, d2 = {"Lcom/example/music/music/netease/Playlist$PlaylistData$TrackIds;", "", "trackIds", "Ljava/util/ArrayList;", "Lcom/example/music/music/netease/Playlist$PlaylistData$TrackIds$TrackId;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)V", "getTrackIds", "()Ljava/util/ArrayList;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "TrackId", "app_debug"})
        public static final class TrackIds {
            @org.jetbrains.annotations.Nullable()
            private final java.util.ArrayList<com.example.music.music.netease.Playlist.PlaylistData.TrackIds.TrackId> trackIds = null;
            
            @org.jetbrains.annotations.Nullable()
            public final java.util.ArrayList<com.example.music.music.netease.Playlist.PlaylistData.TrackIds.TrackId> getTrackIds() {
                return null;
            }
            
            public TrackIds(@org.jetbrains.annotations.Nullable()
            java.util.ArrayList<com.example.music.music.netease.Playlist.PlaylistData.TrackIds.TrackId> trackIds) {
                super();
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.util.ArrayList<com.example.music.music.netease.Playlist.PlaylistData.TrackIds.TrackId> component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.example.music.music.netease.Playlist.PlaylistData.TrackIds copy(@org.jetbrains.annotations.Nullable()
            java.util.ArrayList<com.example.music.music.netease.Playlist.PlaylistData.TrackIds.TrackId> trackIds) {
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
            
            @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/example/music/music/netease/Playlist$PlaylistData$TrackIds$TrackId;", "", "id", "", "(J)V", "getId", "()J", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
            public static final class TrackId {
                private final long id = 0L;
                
                public final long getId() {
                    return 0L;
                }
                
                public TrackId(long id) {
                    super();
                }
                
                public final long component1() {
                    return 0L;
                }
                
                @org.jetbrains.annotations.NotNull()
                public final com.example.music.music.netease.Playlist.PlaylistData.TrackIds.TrackId copy(long id) {
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
        }
    }
}