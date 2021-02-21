package com.example.music.manager;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0006H\u0016\u00a8\u0006\u000f"}, d2 = {"Lcom/example/music/manager/UserManager;", "Lcom/example/music/manager/interfaces/UserManagerInterface;", "()V", "getCloudMusicCookie", "", "getCurrentUid", "", "isUidLogin", "", "setCloudMusicCookie", "", "cookie", "setUid", "uid", "Companion", "app_debug"})
public final class UserManager implements com.example.music.manager.interfaces.UserManagerInterface {
    public static final long defaultUid = 0L;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEFAULT_COOKIE = "";
    @org.jetbrains.annotations.NotNull()
    public static final com.example.music.manager.UserManager.Companion Companion = null;
    
    @java.lang.Override()
    public boolean isUidLogin() {
        return false;
    }
    
    @java.lang.Override()
    public long getCurrentUid() {
        return 0L;
    }
    
    @java.lang.Override()
    public void setUid(long uid) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getCloudMusicCookie() {
        return null;
    }
    
    /**
     * 设置网易云音乐用户 Cookie
     */
    @java.lang.Override()
    public void setCloudMusicCookie(@org.jetbrains.annotations.NotNull()
    java.lang.String cookie) {
    }
    
    public UserManager() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/example/music/manager/UserManager$Companion;", "", "()V", "DEFAULT_COOKIE", "", "defaultUid", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}