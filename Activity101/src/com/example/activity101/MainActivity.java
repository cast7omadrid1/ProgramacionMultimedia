package com.example.activity101;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

	String tag="Lifecycle";
    @Override
    //Metodo que se ejecuta para inicicar la actividad 
    //llama a la actividad principal "activity_main.xml"
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(tag, "In the onCreate() event"); 
    }
    
    public void onStart()
    {
    super.onStart();
    Log.d(tag, "In the onStart() event");
    }
    
    public void onRestart()
    {
    super.onRestart();
    Log.d(tag, "In the onRestart() event");
    }
    
    public void onResume()
    {
    super.onResume();
    Log.d(tag, "In the onResume() event");
    }
    
    public void onPause()
    {
    super.onPause();
    Log.d(tag, "In the onPause() event");
    }
    public void onStop()
    {
    	super.onStop();
    	Log.d(tag, "In the onStop() event");
    	}	
    	
    public void onDestroy()
    {
    super.onDestroy();
    Log.d(tag, "In the onDestroy() event");
    }	
    	
    }

