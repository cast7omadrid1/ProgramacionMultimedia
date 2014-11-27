package com.example.e32sound;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class MainActivity extends Activity {
	ListView listView;
	

	  // Defined Array values to show in ListView
    String canciones[] = new String[6];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
        // Get ListView object from xml
        listView = (ListView)  findViewById(R.id.list);
        listView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        
        // ListView Item Click Listener
        listView.setOnItemClickListener(new OnItemClickListener() {

              @Override
              public void onItemClick(AdapterView<?> parent, View view,
                 int position, long id) {
                
               // variable para conseguir la posicion del elemento de la lista
               int itemPosition     = position;
               
               // variable para conseguir el nombre de la cancion
               String  itemValue    = (String) listView.getItemAtPosition(position);
                  
                //Mensaje flotante que mostarra la posicion y el nombre de la cancion
                Toast.makeText(getApplicationContext(),
                  "Posicion :"+itemPosition+"  Cancion : " +itemValue , Toast.LENGTH_LONG)
                  .show();
             
              }

         }); 
        
        
        
        
        
        getsongs();
       
       
        //llena el layout                              
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
        (this, android.R.layout.simple_list_item_checked, canciones);
           
        listView.setAdapter(adapter);
        
        //si escribimos con el teclado del emulador
        //una letra cualquiera nos sacara todasa aquellas
        //coincidencias que encuentre en las canciones
        listView.setTextFilterEnabled(true);
       
    }
    
 public  void getsongs(){
        
        try {
        	//abrimos el archivo para leer
        	InputStream instream = new FileInputStream("/data/getsongs.txt");

        	//si el archivo esta disponible para leer
        	if (instream != null) {
        	
        		//preapara el archivo para leer
        	  InputStreamReader inputreader = new InputStreamReader(instream);
        	  BufferedReader buffreader = new BufferedReader(inputreader);

        	  String line;

        	  int i=0;
        	  //leemos cada linea del archivo dentro de la variable line, una linea cada vez
        	
        	  do {
        	     line = buffreader.readLine();
        	     
        	    canciones[i]=line;
        	   
        	     
        	     i++;
        	  } while (line != null);

        	}
        	} catch (Exception ex) {
        	    //imprimimos la excepcion
        	} finally {
        	
			// cerramos el archivo
        	//instream.close();
        	}
        
        }//fin metodo
        
 
 
        
}
