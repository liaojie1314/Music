package com.example.music.manager.interfaces;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0003H&J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0005H&\u00a8\u0006\r"}, d2 = {"Lcom/example/music/manager/interfaces/UserManagerInterface;", "", "getCloudMusicCookie", "", "getCurrentUid", "", "isUidLogin", "", "setCloudMusicCookie", "", "cookie", "setUid", "uid", "app_debug"})
public abstract interface UserManagerInterface {
    
    /**
     * uid 是否登录
     */
    public abstract boolean isUidLogin();
    
    /**
     * 获取当前 uid
     */
    public abstract long getCurrentUid();
    
    public abstract void setUid(long uid);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getCloudMusicCookie();
    
    public abstract void setCloudMusicCookie(@org.jetbrains.annotations.NotNull()
    java.lang.String cookie);
}