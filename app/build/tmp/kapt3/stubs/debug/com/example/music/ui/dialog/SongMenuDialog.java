package com.example.music.ui.dialog;

import java.lang.System;

/**
 * 每个歌曲右边三个点点击后显示
 */
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/example/music/ui/dialog/SongMenuDialog;", "Lcom/example/music/ui/base/BaseBottomSheetDialog;", "context", "Landroid/content/Context;", "activity", "Landroid/app/Activity;", "songData", "Lcom/example/music/music/standard/data/StandardSongData;", "tag", "", "(Landroid/content/Context;Landroid/app/Activity;Lcom/example/music/music/standard/data/StandardSongData;I)V", "binding", "Lcom/example/music/databinding/DialogSongMenuBinding;", "initListener", "", "Companion", "app_debug"})
public final class SongMenuDialog extends com.example.music.ui.base.BaseBottomSheetDialog {
    private com.example.music.databinding.DialogSongMenuBinding binding;
    private final android.app.Activity activity = null;
    private final com.example.music.music.standard.data.StandardSongData songData = null;
    private final int tag = 0;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BROADCAST_UPDATE_PLAYLIST = "com.example.music.UPDATE_PLAYLIST";
    @org.jetbrains.annotations.NotNull()
    public static final com.example.music.ui.dialog.SongMenuDialog.Companion Companion = null;
    
    @java.lang.Override()
    public void initListener() {
    }
    
    public SongMenuDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    com.example.music.music.standard.data.StandardSongData songData, int tag) {
        super(null);
    }
    
    public SongMenuDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    com.example.music.music.standard.data.StandardSongData songData) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/music/ui/dialog/SongMenuDialog$Companion;", "", "()V", "BROADCAST_UPDATE_PLAYLIST", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}