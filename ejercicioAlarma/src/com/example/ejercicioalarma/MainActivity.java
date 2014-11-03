package com.example.ejercicioalarma;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    public void onClick(View view){
    	createAlarm("Alarma de prueba", 14, 30);
 
    	}
    
    	public void createAlarm (String message, int hour, int minutes) {
    	    Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM)
    	            .putExtra(AlarmClock.EXTRA_MESSAGE, message)
    	            .putExtra(AlarmClock.EXTRA_HOUR, hour)
    	            .putExtra(AlarmClock.EXTRA_MINUTES, minutes);
    	    if (intent.resolveActivity(getPackageManager()) != null) {
    	        startActivity(intent);
    	    }
    }
    	
    	
    	
    	
    	
}
