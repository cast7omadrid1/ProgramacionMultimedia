package com.example.sonidos_aleatorio;

import java.util.Random;

import com.example.sonidos_aleatorio.R;

import android.app.Activity;
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
	    	
		 	Random aleatorio=new Random();
		 
		 	int canciones[]=new int[] {R.raw.applause1,R.raw.hallwaycrowd,R.raw.laugh1};
		 	
		 	int sonidoazar=canciones[aleatorio.nextInt(canciones.length)]; 
		 	
	    	MediaPlayer mediaPlayer = MediaPlayer.create(getBaseContext(),sonidoazar  );
	    	mediaPlayer.start(); // no need to call prepare(); create() does that for you
	    	
	    }
}
