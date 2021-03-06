package com.example.music.room;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\'J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\rH\'J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u000f"}, d2 = {"Lcom/example/music/room/MyFavoriteMusic;", "", "delete", "", "myFavoriteData", "Lcom/example/music/room/MyFavoriteData;", "deleteById", "", "id", "", "insert", "", "loadAll", "", "update", "app_debug"})
public abstract interface MyFavoriteMusic {
    
    @androidx.room.Insert()
    public abstract long insert(@org.jetbrains.annotations.NotNull()
    com.example.music.room.MyFavoriteData myFavoriteData);
    
    @androidx.room.Update()
    public abstract void update(@org.jetbrains.annotations.NotNull()
    com.example.music.room.MyFavoriteData myFavoriteData);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "select * from MyFavoriteData")
    public abstract java.util.List<com.example.music.room.MyFavoriteData> loadAll();
    
    @androidx.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    com.example.music.room.MyFavoriteData myFavoriteData);
    
    @androidx.room.Query(value = "delete from MyFavoriteData where id = :id")
    public abstract int deleteById(@org.jetbrains.annotations.NotNull()
    java.lang.String id);
}