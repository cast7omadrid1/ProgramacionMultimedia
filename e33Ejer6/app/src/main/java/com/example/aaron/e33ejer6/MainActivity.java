package com.example.aaron.e33ejer6;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends Activity {

    //creamos el string de valores
   /*
    private TextView lblTitulo;
    private TextView lblAutor;
    private TextView lblDuracion;
    private ListView LstOpciones;
*/

    private Cancion[] datos = new Cancion[]{
            new Cancion(R.drawable.estopa,"Ya no me acuerdo", "Estopa", "3:20"),
            new Cancion(R.drawable.melendi,"Sin noticias de Holanda", "Melendi", "4:30"),
            new Cancion(R.drawable.wakemeup,"Wake me up", "Avicii", "3:45"),
            new Cancion(R.drawable.wearethechampions,"We are the champions", "Queen", "2:59"),
            new Cancion(R.drawable.camaron,"La leyenda del tiempo", "Camaron", "3:50")};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }//Fin onCreate


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}//fin Main
