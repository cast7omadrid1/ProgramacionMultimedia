package com.example.aaron.e33ejer6;

/**
 * Created by Aaron on 10/12/2014.
 */
public class Cancion {

    private int id;
    private String Disco;
    private String Autor;
    private String Duracion;

    public Cancion(int id,String Disco,String Autor,String Duracion){

        this.id=id;
        this.Disco=Disco;
        this.Autor=Autor;
        this.Duracion=Duracion;

    }//fin constructor

       public int getId(){
        return id;
    }

    public String getDisco(){
        return Disco;
    }

    public String getAutor(){
        return Autor;
    }

    public String getDuracion(){
        return Duracion;
    }


}
