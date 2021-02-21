package com.example.music.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\bJ\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bJ\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bJ\u0016\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bJ\u001e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011J&\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011J(\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u000bH\u0007\u00a8\u0006\u0016"}, d2 = {"Lcom/example/music/util/GlideUtil;", "", "()V", "load", "", "url", "", "success", "Lkotlin/Function1;", "Landroid/graphics/Bitmap;", "imageView", "Landroid/widget/ImageView;", "placeHolder", "Landroid/graphics/drawable/Drawable;", "placeHolderImageView", "loadCircle", "needSize", "", "dpSize", "loadCloudMusicImage", "width", "height", "app_debug"})
public final class GlideUtil {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.music.util.GlideUtil INSTANCE = null;
    
    public final void load(@org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageView) {
    }
    
    public final void load(@org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageView, @org.jetbrains.annotations.NotNull()
    android.graphics.drawable.Drawable placeHolder) {
    }
    
    public final void load(@org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageView, @org.jetbrains.annotations.NotNull()
    android.widget.ImageView placeHolderImageView) {
    }
    
    public final void load(@org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.graphics.Bitmap, kotlin.Unit> success) {
    }
    
    @java.lang.Deprecated()
    public final void loadCloudMusicImage(@org.jetbrains.annotations.NotNull()
    java.lang.String url, int width, int height, @org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageView) {
    }
    
    /**
     * 加载圆形图片
     */
    public final void loadCircle(@org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageView) {
    }
    
    public final void loadCircle(@org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageView, int needSize) {
    }
    
    /**
     */
    public final void loadCircle(@org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageView, int dpSize, int needSize) {
    }
    
    private GlideUtil() {
        super();
    }
}