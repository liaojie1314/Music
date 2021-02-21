package com.example.music.manager.interfaces;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J \u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0007H&J\u0018\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\fH&J \u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\fH&\u00a8\u0006\u001a"}, d2 = {"Lcom/example/music/manager/interfaces/ActivityManagerInterface;", "", "startArtistActivity", "", "activity", "Landroid/app/Activity;", "artistId", "", "startCommentActivity", "source", "", "id", "", "startFeedbackActivity", "startLoginActivity", "startLoginByPhoneActivity", "startLoginByUidActivity", "startPlayHistoryActivity", "startPlayerActivity", "startPrivateLetterActivity", "startSettingsActivity", "startUserActivity", "userId", "startWebActivity", "url", "title", "app_debug"})
public abstract interface ActivityManagerInterface {
    
    public abstract void startLoginActivity(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity);
    
    public abstract void startFeedbackActivity(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity);
    
    public abstract void startWebActivity(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    java.lang.String url);
    
    public abstract void startWebActivity(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    java.lang.String title);
    
    public abstract void startCommentActivity(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, int source, @org.jetbrains.annotations.NotNull()
    java.lang.String id);
    
    public abstract void startUserActivity(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, long userId);
    
    public abstract void startLoginByPhoneActivity(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity);
    
    public abstract void startSettingsActivity(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity);
    
    public abstract void startPrivateLetterActivity(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity);
    
    public abstract void startPlayerActivity(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity);
    
    public abstract void startLoginByUidActivity(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity);
    
    public abstract void startPlayHistoryActivity(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity);
    
    public abstract void startArtistActivity(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, long artistId);
}