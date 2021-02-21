package com.example.music.music.local.data;

import java.lang.System;

/**
 * 本地歌单集合类
 */
@kotlinx.android.parcel.Parcelize()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005H\u00c6\u0003J#\u0010\n\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005H\u00c6\u0001J\t\u0010\u000b\u001a\u00020\fH\u00d6\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\fH\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fH\u00d6\u0001R!\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0019"}, d2 = {"Lcom/example/music/music/local/data/LocalPlaylistArrayData;", "Landroid/os/Parcelable;", "data", "Ljava/util/ArrayList;", "Lcom/example/music/music/standard/data/StandardPlaylistData;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)V", "getData", "()Ljava/util/ArrayList;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
public final class LocalPlaylistArrayData implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.example.music.music.standard.data.StandardPlaylistData> data = null;
    public static final android.os.Parcelable.Creator<com.example.music.music.local.data.LocalPlaylistArrayData> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.music.music.standard.data.StandardPlaylistData> getData() {
        return null;
    }
    
    public LocalPlaylistArrayData(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.music.music.standard.data.StandardPlaylistData> data) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.music.music.standard.data.StandardPlaylistData> component1() {
        return null;
    }
    
    /**
     * 本地歌单集合类
     */
    @org.jetbrains.annotations.NotNull()
    public final com.example.music.music.local.data.LocalPlaylistArrayData copy(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.music.music.standard.data.StandardPlaylistData> data) {
        return null;
    }
    
    /**
     * 本地歌单集合类
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * 本地歌单集合类
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * 本地歌单集合类
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator<com.example.music.music.local.data.LocalPlaylistArrayData> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.example.music.music.local.data.LocalPlaylistArrayData[] newArray(int size) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.example.music.music.local.data.LocalPlaylistArrayData createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
    }
}