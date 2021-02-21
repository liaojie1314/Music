package com.example.music.ui.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0012J\u0006\u0010\u001c\u001a\u00020\u001aR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR&\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010\u00a8\u0006\u001d"}, d2 = {"Lcom/example/music/ui/viewmodel/PlaylistViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "id", "", "getId", "()J", "setId", "(J)V", "playlist", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/ArrayList;", "Lcom/example/music/music/standard/data/StandardSongData;", "getPlaylist", "()Landroidx/lifecycle/MutableLiveData;", "setPlaylist", "(Landroidx/lifecycle/MutableLiveData;)V", "source", "", "getSource", "()I", "setSource", "(I)V", "tag", "getTag", "setTag", "", "newTag", "updatePlaylist", "app_debug"})
public final class PlaylistViewModel extends androidx.lifecycle.ViewModel {
    private long id = 0L;
    private int source = 2;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Integer> tag;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.example.music.music.standard.data.StandardSongData>> playlist;
    
    public final long getId() {
        return 0L;
    }
    
    public final void setId(long p0) {
    }
    
    public final int getSource() {
        return 0;
    }
    
    public final void setSource(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getTag() {
        return null;
    }
    
    public final void setTag(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.example.music.music.standard.data.StandardSongData>> getPlaylist() {
        return null;
    }
    
    public final void setPlaylist(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.example.music.music.standard.data.StandardSongData>> p0) {
    }
    
    /**
     * 更新歌单
     */
    public final void updatePlaylist() {
    }
    
    public final void setTag(int newTag) {
    }
    
    public PlaylistViewModel() {
        super();
    }
}