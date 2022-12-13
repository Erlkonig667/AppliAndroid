package com.app.applicda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private final String TAG="Activité Principale";
    EditText chlog,chpwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"OnCreate");
        if(savedInstanceState!= null){
            onRestoreInstanceState(savedInstanceState);
        }
        chlog=findViewById(R.id.login);
        chpwd=findViewById(R.id.password);
    }
    //The final call you receive before your activity is destroyed.
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"OnDestroy");
    }
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"OnStop");
    }
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"OnStart");
    }
    //Called when the system is about to start resuming a previous activity
    protected void onPause(Bundle savedInstanceState) {
        super.onPause();
        Log.i(TAG,"OnPause");
        onSaveInstanceState(savedInstanceState);
    }
    //Called when the activity will start interacting with the user
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"OnResume");
    }
    //This method is called before an activity may be killed so that when it comes back some time in the future it can restore its state.
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        Log.i(TAG,"OnsaveinstanceState");
    }
    //This method is called after onStart() when the activity is being re-initialized from a previously saved state
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(TAG, "OnrestoreInstanceState");
    }
    //Called when the activity will start interacting with the user
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,"OnRestart");
    }

    public void valid (View v){
        if ((chlog.getText().toString()!=null && chlog.getText().toString().equals(getResources().getString(R.string.logOK)))&&(chpwd.getText().toString()!=null && chpwd.getText().toString().equals(getResources().getString(R.string.pwdOK)))){
            Intent i=new Intent(getApplicationContext(),Home.class);
            i.putExtra("login",chlog.getText().toString());
            startActivity(i);
        }
        else{
            Toast.makeText(getApplicationContext(),"Login et/ou mdp incorrect(s).Veuillez réessayer.", Toast.LENGTH_LONG).show();
        }
    }
    public void fermer(View v){
        finish();
    }

    public void efface(View v){
        chlog.setText("");
        chpwd.setText("");
    }
}
