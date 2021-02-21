package com.example.music.ui.viewmodel;

import java.lang.System;

/**
 * MyFragment 的 ViewModel
 */
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\rR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u000f"}, d2 = {"Lcom/example/music/ui/viewmodel/MyFragmentViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_userPlaylistList", "Ljava/util/ArrayList;", "Lcom/example/music/data/PlaylistData;", "offset", "", "userPlaylistList", "Landroidx/lifecycle/MutableLiveData;", "getUserPlaylistList", "()Landroidx/lifecycle/MutableLiveData;", "clearPlaylist", "", "updatePlaylist", "app_debug"})
public final class MyFragmentViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.example.music.data.PlaylistData>> userPlaylistList = null;
    private final java.util.ArrayList<com.example.music.data.PlaylistData> _userPlaylistList = null;
    private int offset = 0;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.example.music.data.PlaylistData>> getUserPlaylistList() {
        return null;
    }
    
    /**
     * 更新歌单
     */
    public final void updatePlaylist() {
    }
    
    /**
     * 清空 Playlist
     */
    public final void clearPlaylist() {
    }
    
    public MyFragmentViewModel() {
        super();
    }
}