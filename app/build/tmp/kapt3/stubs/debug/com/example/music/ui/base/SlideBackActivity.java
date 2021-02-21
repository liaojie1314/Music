package com.example.music.ui.base;

import java.lang.System;

/**
 * 可拖拽 Activity
 */
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/example/music/ui/base/SlideBackActivity;", "Lcom/example/music/ui/base/BaseActivity;", "()V", "value", "", "slideBackEnabled", "getSlideBackEnabled", "()Z", "setSlideBackEnabled", "(Z)V", "slideBackLayout", "Lcom/example/music/widget/SlideBackLayout;", "bindSlide", "", "context", "Landroid/content/Context;", "view", "Landroid/view/View;", "app_debug"})
public abstract class SlideBackActivity extends com.example.music.ui.base.BaseActivity {
    private com.example.music.widget.SlideBackLayout slideBackLayout;
    private boolean slideBackEnabled = true;
    private java.util.HashMap _$_findViewCache;
    
    public final boolean getSlideBackEnabled() {
        return false;
    }
    
    public final void setSlideBackEnabled(boolean value) {
    }
    
    public final void bindSlide(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public SlideBackActivity() {
        super();
    }
}