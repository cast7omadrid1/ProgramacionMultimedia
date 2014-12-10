package com.example.aaron.e33ejer6;

/**
 * Created by Aaron on 10/12/2014.
 */

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

//Creamos nuestro propio adaptador
public class AdapterSongs extends ArrayAdapter<Cancion> {

    Activity context;

    Cancion[] song;

    //creamos el adaptador al que le pasamos el array de datos
    public AdapterSongs(Activity context, Cancion[] songs) {
        //le pasamos el contexto , que sera la actividad desde la que se cree el adaptador
        super(context, R.layout.activity_main,songs);
        this.context=context;
        this.song=songs;

    }//Fin ArrayAdapter

    public View getView(int posicion,View convertView,ViewGroup parent){

        //creamos el inflater
        //consultamos  nuestro layout y creamos e inicializamo la esructura java
        LayoutInflater inflater=context.getLayoutInflater();
        View item = inflater.inflate(R.layout.mi_layout,null);

        ImageView imagen = (ImageView)item.findViewById(R.id.imagen);
        imagen.setImageResource(song[posicion].getId());

        TextView Titulo =  (TextView)item.findViewById(R.id.lblDisco);
        Titulo.setText(song[posicion].getDisco());

        TextView autor = (TextView)item.findViewById(R.id.lblAutor);
        autor.setText(song[posicion].getAutor());

        TextView duracion = (TextView)item.findViewById(R.id.lblDuracion);
        duracion.setText(song[posicion].getDuracion());

        return(item);
    }



}//fin class
