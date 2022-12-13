package com.app.applicda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Games extends AppCompatActivity {
    WebView jeuxweb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games);
        Intent i=getIntent();
        String games=i.getStringExtra("msg");
        WebView webJeux= findViewById(R.id.jeuxweb);

        WebSettings webSettings= webJeux.getSettings();
        webSettings.setJavaScriptEnabled(true);

        if (games.equals("fb")){
            webJeux.loadUrl("file:///android_asset/flappyBird/index.html");
        }
        else if (games.equals("dj")){
            webJeux.loadUrl("file:///android_asset/doodleJump/index.html");
        }
        else if (games.equals("p4")){
            webJeux.loadUrl("file:///android_asset/puissance4/index.html");
        }
    }
}