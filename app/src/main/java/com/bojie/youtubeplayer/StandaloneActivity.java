package com.bojie.youtubeplayer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeStandalonePlayer;

/**
 * Created by bojiejiang on 1/11/15.
 */

public class StandaloneActivity extends Activity implements View.OnClickListener {

    public static final String GOOGLE_API_KEY = "AIzaSyCStE1CUsyK7RTs3eUWpPvuGi_vScG3iYg";

    public static final String YOUTUBE_VIDEO_ID = "rwmBHvxVjAQ";

    public static final String YOUTUBE_PLAYLIST_ID = "PLToJHFcYEZb3cGjRedWuVUx_uDwvyU-E1";


    Button btn_play;
    Button btn_playlist;
    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.standalone);
        btn_play = (Button) findViewById(R.id.btn_start);
        btn_playlist = (Button) findViewById(R.id.btn_playlist);

        btn_play.setOnClickListener(this);
        btn_playlist.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;

        if(v == btn_play) {
            //play single video

            intent = YouTubeStandalonePlayer.createVideoIntent(this, GOOGLE_API_KEY, YOUTUBE_VIDEO_ID);
        } else if(v == btn_playlist) {
            // play the play list
            intent = YouTubeStandalonePlayer.createPlaylistIntent(this, GOOGLE_API_KEY, YOUTUBE_PLAYLIST_ID);
        }

        if(intent != null) {
            startActivity(intent);
        }
    }
}


