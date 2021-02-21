package com.example.music.music.netease;

import java.lang.System;

/**
 * 获取网易云推荐歌单
 */
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0002\f\rB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J8\u0010\u0003\u001a\u00020\u00042\"\u0010\u0005\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t\u0012\u0004\u0012\u00020\u00040\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b\u00a8\u0006\u000e"}, d2 = {"Lcom/example/music/music/netease/PlaylistRecommend;", "", "()V", "getPlaylistRecommend", "", "success", "Lkotlin/Function1;", "Ljava/util/ArrayList;", "Lcom/example/music/music/netease/PlaylistRecommend$PlaylistRecommendDataResult;", "Lkotlin/collections/ArrayList;", "failure", "Lkotlin/Function0;", "PlaylistRecommendData", "PlaylistRecommendDataResult", "app_debug"})
public final class PlaylistRecommend {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.music.music.netease.PlaylistRecommend INSTANCE = null;
    
    public final void getPlaylistRecommend(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.ArrayList<com.example.music.music.netease.PlaylistRecommend.PlaylistRecommendDataResult>, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> failure) {
    }
    
    private PlaylistRecommend() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005H\u00c6\u0003J#\u0010\n\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005H\u00c6\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R!\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0012"}, d2 = {"Lcom/example/music/music/netease/PlaylistRecommend$PlaylistRecommendData;", "", "result", "Ljava/util/ArrayList;", "Lcom/example/music/music/netease/PlaylistRecommend$PlaylistRecommendDataResult;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)V", "getResult", "()Ljava/util/ArrayList;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
    public static final class PlaylistRecommendData {
        @org.jetbrains.annotations.NotNull()
        private final java.util.ArrayList<com.example.music.music.netease.PlaylistRecommend.PlaylistRecommendDataResult> result = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<com.example.music.music.netease.PlaylistRecommend.PlaylistRecommendDataResult> getResult() {
            return null;
        }
        
        public PlaylistRecommendData(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<com.example.music.music.netease.PlaylistRecommend.PlaylistRecommendDataResult> result) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<com.example.music.music.netease.PlaylistRecommend.PlaylistRecommendDataResult> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.music.music.netease.PlaylistRecommend.PlaylistRecommendData copy(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<com.example.music.music.netease.PlaylistRecommend.PlaylistRecommendDataResult> result) {
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
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n\u00a8\u0006\u001a"}, d2 = {"Lcom/example/music/music/netease/PlaylistRecommend$PlaylistRecommendDataResult;", "", "id", "", "picUrl", "", "name", "playCount", "(JLjava/lang/String;Ljava/lang/String;J)V", "getId", "()J", "getName", "()Ljava/lang/String;", "getPicUrl", "getPlayCount", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
    public static final class PlaylistRecommendDataResult {
        private final long id = 0L;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String picUrl = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String name = null;
        private final long playCount = 0L;
        
        public final long getId() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPicUrl() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getName() {
            return null;
        }
        
        public final long getPlayCount() {
            return 0L;
        }
        
        public PlaylistRecommendDataResult(long id, @org.jetbrains.annotations.NotNull()
        java.lang.String picUrl, @org.jetbrains.annotations.NotNull()
        java.lang.String name, long playCount) {
            super();
        }
        
        public final long component1() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component3() {
            return null;
        }
        
        public final long component4() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.music.music.netease.PlaylistRecommend.PlaylistRecommendDataResult copy(long id, @org.jetbrains.annotations.NotNull()
        java.lang.String picUrl, @org.jetbrains.annotations.NotNull()
        java.lang.String name, long playCount) {
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