package com.example.music.ui.dialog;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/example/music/ui/dialog/SongInfoDialog;", "Lcom/google/android/material/bottomsheet/BottomSheetDialog;", "context", "Landroid/content/Context;", "songData", "Lcom/example/music/music/standard/data/StandardSongData;", "(Landroid/content/Context;Lcom/example/music/music/standard/data/StandardSongData;)V", "binding", "Lcom/example/music/databinding/DialogSongInfoBinding;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class SongInfoDialog extends com.google.android.material.bottomsheet.BottomSheetDialog {
    private com.example.music.databinding.DialogSongInfoBinding binding;
    private final com.example.music.music.standard.data.StandardSongData songData = null;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public SongInfoDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.example.music.music.standard.data.StandardSongData songData) {
        super(null);
    }
}