package com.example.music.music.local;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ@\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\"\u0010\u0010\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00130\u0012j\b\u0012\u0004\u0012\u00020\u0013`\u0014\u0012\u0004\u0012\u00020\u00040\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0016\u00a8\u0006\u0017"}, d2 = {"Lcom/example/music/music/local/LocalMusic;", "", "()V", "copy", "", "inputStream", "Ljava/io/InputStream;", "out", "Ljava/io/OutputStream;", "loadCover", "Landroid/graphics/Bitmap;", "path", "", "scanLocalMusic", "activity", "Landroid/app/Activity;", "success", "Lkotlin/Function1;", "Ljava/util/ArrayList;", "Lcom/example/music/music/standard/data/StandardSongData;", "Lkotlin/collections/ArrayList;", "failure", "Lkotlin/Function0;", "app_debug"})
public final class LocalMusic {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.music.music.local.LocalMusic INSTANCE = null;
    
    public final void scanLocalMusic(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.ArrayList<com.example.music.music.standard.data.StandardSongData>, kotlin.Unit> success, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> failure) {
    }
    
    private final void copy(java.io.InputStream inputStream, java.io.OutputStream out) throws java.io.IOException {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.Bitmap loadCover(@org.jetbrains.annotations.NotNull()
    java.lang.String path) {
        return null;
    }
    
    private LocalMusic() {
        super();
    }
}