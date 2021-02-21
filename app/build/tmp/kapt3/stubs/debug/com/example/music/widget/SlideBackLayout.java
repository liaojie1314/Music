package com.example.music.widget;

import java.lang.System;

/**
 * 拖拽关闭 Activity
 */
@android.annotation.SuppressLint(value = {"ViewConstructor"})
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001!B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0019\u001a\u00020\u001aJ\b\u0010\u001b\u001a\u00020\u001aH\u0016J\u0010\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0010\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001fH\u0017R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u0006\""}, d2 = {"Lcom/example/music/widget/SlideBackLayout;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "scrollableView", "Landroid/view/View;", "(Landroid/content/Context;Landroid/view/View;)V", "activity", "Landroid/app/Activity;", "cancelHideHeightPercent", "", "decorView", "Landroid/view/ViewGroup;", "myRootView", "screenHeight", "", "slideHeight", "viewDragHelper", "Landroidx/customview/widget/ViewDragHelper;", "viewEnabled", "", "getViewEnabled", "()Z", "setViewEnabled", "(Z)V", "bind", "", "computeScroll", "init", "onInterceptTouchEvent", "event", "Landroid/view/MotionEvent;", "onTouchEvent", "DragCallback", "app_debug"})
public final class SlideBackLayout extends android.widget.FrameLayout {
    private android.view.ViewGroup decorView;
    private android.view.View myRootView;
    private android.app.Activity activity;
    private androidx.customview.widget.ViewDragHelper viewDragHelper;
    private float slideHeight = 0.0F;
    private int screenHeight = 0;
    private final float cancelHideHeightPercent = 0.15F;
    private boolean viewEnabled = true;
    private final android.view.View scrollableView = null;
    private java.util.HashMap _$_findViewCache;
    
    public final boolean getViewEnabled() {
        return false;
    }
    
    public final void setViewEnabled(boolean p0) {
    }
    
    private final void init(android.content.Context context) {
    }
    
    public final void bind() {
    }
    
    @java.lang.Override()
    public boolean onInterceptTouchEvent(@org.jetbrains.annotations.NotNull()
    android.view.MotionEvent event) {
        return false;
    }
    
    @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
    @java.lang.Override()
    public boolean onTouchEvent(@org.jetbrains.annotations.NotNull()
    android.view.MotionEvent event) {
        return false;
    }
    
    @java.lang.Override()
    public void computeScroll() {
    }
    
    public SlideBackLayout(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.view.View scrollableView) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0016J \u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J0\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0016J \u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0004H\u0016\u00a8\u0006\u0018"}, d2 = {"Lcom/example/music/widget/SlideBackLayout$DragCallback;", "Landroidx/customview/widget/ViewDragHelper$Callback;", "(Lcom/example/music/widget/SlideBackLayout;)V", "clampViewPositionHorizontal", "", "child", "Landroid/view/View;", "left", "dx", "clampViewPositionVertical", "top", "dy", "getViewVerticalDragRange", "onViewPositionChanged", "", "changedView", "onViewReleased", "releasedChild", "xvel", "", "yvel", "tryCaptureView", "", "pointerId", "app_debug"})
    public final class DragCallback extends androidx.customview.widget.ViewDragHelper.Callback {
        
        @java.lang.Override()
        public boolean tryCaptureView(@org.jetbrains.annotations.NotNull()
        android.view.View child, int pointerId) {
            return false;
        }
        
        @java.lang.Override()
        public void onViewReleased(@org.jetbrains.annotations.NotNull()
        android.view.View releasedChild, float xvel, float yvel) {
        }
        
        @java.lang.Override()
        public int getViewVerticalDragRange(@org.jetbrains.annotations.NotNull()
        android.view.View child) {
            return 0;
        }
        
        @java.lang.Override()
        public void onViewPositionChanged(@org.jetbrains.annotations.NotNull()
        android.view.View changedView, int left, int top, int dx, int dy) {
        }
        
        @java.lang.Override()
        public int clampViewPositionHorizontal(@org.jetbrains.annotations.NotNull()
        android.view.View child, int left, int dx) {
            return 0;
        }
        
        @java.lang.Override()
        public int clampViewPositionVertical(@org.jetbrains.annotations.NotNull()
        android.view.View child, int top, int dy) {
            return 0;
        }
        
        public DragCallback() {
            super();
        }
    }
}