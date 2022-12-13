package com.app.applicda;

import static android.provider.AlarmClock.ACTION_SET_ALARM;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class Home extends AppCompatActivity {
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void sms(View v){
        Intent i = new Intent(android.content.Intent.ACTION_VIEW);
        i.putExtra("address", "0642397375");
        i.putExtra("sms_body", "Je te recommande cette appli du tonnerre trop ouf via laquelle je t'envoie ce sms!!");
        i.setType("vnd.android-dir/mms-sms");
        startActivity(i);
    }

    public void appel(View v) {
            Intent i = new Intent(Intent.ACTION_CALL, Uri.parse("tel:0780432927"));
            startActivity(i);
    }

    public void site(View v){
        String url = "https://www.youtube.com/watch?v=dQw4w9WgXcQ";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    public void alarme(View v){
        Intent i = new Intent(ACTION_SET_ALARM);
        startActivity(i);
    }

    public void mail (View v){
        Intent i = new Intent(Intent.ACTION_SENDTO,Uri.parse("mailto:"));
        startActivity(i);
    }

    public void doodle(View v){
        Intent i= new Intent(getApplicationContext(),Games.class);
        i.putExtra("msg","dj");
        startActivity(i);
    }

    public void flappy(View v){
        Intent i= new Intent(getApplicationContext(),Games.class);
        i.putExtra("msg","fb");
        startActivity(i);
    }

    public void puissance(View v){
        Intent i= new Intent(getApplicationContext(),Games.class);
        i.putExtra("msg","p4");
        startActivity(i);
    }
    public void video(View v){
        Intent i=new Intent(getApplicationContext(),Bunny.class);
        startActivity(i);
    }
}