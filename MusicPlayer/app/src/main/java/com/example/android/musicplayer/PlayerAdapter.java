package com.example.android.musicplayer;

/**
 * Created by Chris on 2018-02-24.
 */

public interface PlayerAdapter {


    void loadMedia(int resourceId);

    void release();

    boolean isPlaying();

    void play();

    void reset();

    void pause();

    void initializeProgressCallback();

    void seekTo(int position);
}
