package com.example.music.adapter;

import java.lang.System;

/**
 * 歌单适配器
 */
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001cB3\b\u0007\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\r\u001a\u00020\nH\u0016J\u001c\u0010\u000e\u001a\u00020\u000f2\n\u0010\u0010\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\nH\u0016J\u001c\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nH\u0016J\u0006\u0010\u0016\u001a\u00020\u000fJ\u001a\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002J\u0018\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0019H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\f\u00a8\u0006\u001d"}, d2 = {"Lcom/example/music/adapter/DetailPlaylistAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/music/adapter/DetailPlaylistAdapter$ViewHolder;", "songDataList", "Ljava/util/ArrayList;", "Lcom/example/music/music/standard/data/StandardSongData;", "Lkotlin/collections/ArrayList;", "activity", "Landroid/app/Activity;", "tag", "", "(Ljava/util/ArrayList;Landroid/app/Activity;Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getItemCount", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "playFirst", "playMusic", "view", "Landroid/view/View;", "showSongMenuDialog", "songData", "ViewHolder", "app_debug"})
public final class DetailPlaylistAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.music.adapter.DetailPlaylistAdapter.ViewHolder> {
    private final java.util.ArrayList<com.example.music.music.standard.data.StandardSongData> songDataList = null;
    private final android.app.Activity activity = null;
    private final java.lang.Integer tag = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.music.adapter.DetailPlaylistAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.music.adapter.DetailPlaylistAdapter.ViewHolder holder, int position) {
    }
    
    private final void showSongMenuDialog(com.example.music.music.standard.data.StandardSongData songData, android.view.View view) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void playFirst() {
    }
    
    private final void playMusic(int position, android.view.View view) {
    }
    
    public DetailPlaylistAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.music.music.standard.data.StandardSongData> songDataList, @org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.Nullable()
    java.lang.Integer tag) {
        super();
    }
    
    public DetailPlaylistAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.music.music.standard.data.StandardSongData> songDataList, @org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010\u00a8\u0006\u0015"}, d2 = {"Lcom/example/music/adapter/DetailPlaylistAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/example/music/adapter/DetailPlaylistAdapter;Landroid/view/View;)V", "clSong", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getClSong", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "ivMore", "Landroid/widget/ImageView;", "getIvMore", "()Landroid/widget/ImageView;", "tvArtist", "Landroid/widget/TextView;", "getTvArtist", "()Landroid/widget/TextView;", "tvName", "getTvName", "tvNumber", "getTvNumber", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView tvNumber = null;
        @org.jetbrains.annotations.NotNull()
        private final androidx.constraintlayout.widget.ConstraintLayout clSong = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView tvName = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView tvArtist = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView ivMore = null;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvNumber() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.constraintlayout.widget.ConstraintLayout getClSong() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvArtist() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getIvMore() {
            return null;
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
}