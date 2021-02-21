package com.example.music.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u00012\u00020\u0003:\u0002\u0017\u0018B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\u001c\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u001c\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nH\u0016J\u0010\u0010\u0016\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\bR\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/example/music/adapter/SearchHotAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/music/adapter/SearchHotAdapter$ViewHolder;", "Landroid/view/View$OnClickListener;", "searchHotData", "Lcom/example/music/music/netease/data/SearchHotData;", "(Lcom/example/music/music/netease/data/SearchHotData;)V", "onItemClick", "Lcom/example/music/adapter/SearchHotAdapter$OnItemClick;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onClick", "v", "Landroid/view/View;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setOnItemClick", "OnItemClick", "ViewHolder", "app_debug"})
public final class SearchHotAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.music.adapter.SearchHotAdapter.ViewHolder> implements android.view.View.OnClickListener {
    private com.example.music.adapter.SearchHotAdapter.OnItemClick onItemClick;
    private final com.example.music.music.netease.data.SearchHotData searchHotData = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.music.adapter.SearchHotAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.music.adapter.SearchHotAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void setOnItemClick(@org.jetbrains.annotations.Nullable()
    com.example.music.adapter.SearchHotAdapter.OnItemClick onItemClick) {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.NotNull()
    android.view.View v) {
    }
    
    public SearchHotAdapter(@org.jetbrains.annotations.NotNull()
    com.example.music.music.netease.data.SearchHotData searchHotData) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u000f\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0011\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR\u0011\u0010\u0013\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\f\u00a8\u0006\u0015"}, d2 = {"Lcom/example/music/adapter/SearchHotAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/example/music/adapter/SearchHotAdapter;Landroid/view/View;)V", "clItem", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getClItem", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "tvContent", "Landroid/widget/TextView;", "getTvContent", "()Landroid/widget/TextView;", "tvHot", "getTvHot", "tvNumber", "getTvNumber", "tvScore", "getTvScore", "tvText", "getTvText", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView tvNumber = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView tvText = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView tvContent = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView tvScore = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView tvHot = null;
        @org.jetbrains.annotations.NotNull()
        private final androidx.constraintlayout.widget.ConstraintLayout clItem = null;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvNumber() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvText() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvContent() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvScore() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvHot() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.constraintlayout.widget.ConstraintLayout getClItem() {
            return null;
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/example/music/adapter/SearchHotAdapter$OnItemClick;", "", "onItemClick", "", "view", "Landroid/view/View;", "position", "", "app_debug"})
    public static abstract interface OnItemClick {
        
        public abstract void onItemClick(@org.jetbrains.annotations.Nullable()
        android.view.View view, int position);
    }
}