package com.example.calendario;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.provider.CalendarContract;
import android.provider.CalendarContract.Events;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    @SuppressLint("NewApi") public void onClick(View view){
    	

     Intent intent = new Intent(Intent.ACTION_INSERT)
                .setData(Events.CONTENT_URI)
                .putExtra(Events.TITLE, "Cita medico")
                .putExtra(CalendarContract.EXTRA_EVENT_ALL_DAY, true)
                .putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME, 10)
                .putExtra(CalendarContract.EXTRA_EVENT_END_TIME, 12);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
      }
 
}

    
    
    
    
    
    
    
    
    
    
    
    

