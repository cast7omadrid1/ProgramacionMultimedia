/*
Resolver la colision de intents
Ejercicio pagina 85 libro android 4
*/
package com.example.c2intent2;



import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {
    int request_Code = 1;
    
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    public void onClick(View view) {
       startActivity(new Intent("com.example.c2intent2.SecondActivity"));
        
         }
    

}
