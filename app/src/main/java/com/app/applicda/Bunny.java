package com.app.applicda;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class Bunny extends AppCompatActivity {
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bunny);
        Uri raw_uri= Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.bigbunny);
        VideoView myVideoView=(VideoView)findViewById(R.id.vid);
        myVideoView.setVideoURI(raw_uri);
        myVideoView.setMediaController(new MediaController(this));
        myVideoView.start();
    }
}