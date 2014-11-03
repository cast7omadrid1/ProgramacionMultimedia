package com.example.ejerciciosonido;

import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    
    public void onClick (View view){
    	
    	MediaPlayer mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.applause);
    	mediaPlayer.start(); // no need to call prepare(); create() does that for you
    	
    }
  
}
