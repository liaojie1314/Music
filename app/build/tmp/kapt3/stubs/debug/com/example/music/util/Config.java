package com.example.music.util;

import java.lang.System;

/**
 * 配置
 */
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/example/music/util/Config;", "", "()V", "CLOUD_MUSIC_COOKIE", "", "FILTER_RECORD", "LOCAL_PLAYLIST", "LYRIC_TRANSLATION", "PARSE_HOME_NAVIGATION", "PARSE_INTERNET_LYRIC_LOCAL_MUSIC", "PAUSE_SONG_AFTER_UNPLUG_HEADSET", "PLAY_HISTORY", "PLAY_MODE", "PLAY_ON_MOBILE", "SEARCH_ENGINE", "SKIP_ERROR_MUSIC", "SMART_FILTER", "UID", "app_debug"})
public final class Config {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String UID = "long_uid";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PAUSE_SONG_AFTER_UNPLUG_HEADSET = "pause_song_after_unplug_headset";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LOCAL_PLAYLIST = "local_playlist";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PLAY_ON_MOBILE = "boolean_play_on_mobile";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PLAY_HISTORY = "list_play_history";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PLAY_MODE = "int_play_mode";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SEARCH_ENGINE = "int_search_engine";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CLOUD_MUSIC_COOKIE = "string_cloud_music_cookie";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FILTER_RECORD = "boolean_filter_record";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARSE_INTERNET_LYRIC_LOCAL_MUSIC = "boolean_parse_internet_lyric_local_music";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SKIP_ERROR_MUSIC = "boolean_skip_error_music";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LYRIC_TRANSLATION = "boolean_lyric_translation";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SMART_FILTER = "smart_filter";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARSE_HOME_NAVIGATION = "parse_home_navigation";
    @org.jetbrains.annotations.NotNull()
    public static final com.example.music.util.Config INSTANCE = null;
    
    private Config() {
        super();
    }
}