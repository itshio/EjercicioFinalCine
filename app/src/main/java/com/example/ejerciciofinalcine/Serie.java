package com.example.ejerciciofinalcine;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by DIDACT on 20/02/2018.
 */

public class Serie implements Parcelable{

    String nombre;
    String imagen;
    int año;
    int temporadas;
    int episodios;
    String genero_superior;


    public static final Parcelable.Creator<Serie> CREATOR = new Parcelable.Creator<Serie>(){
        public Serie createFromParcel(Parcel in) {
            return new Serie(in);
        }
        public Serie[] newArray(int size){
            return new Serie[size];
        }
    };

    public Serie(String nombre, String imagen, int año, int temporadas, int episodios, String genero_superior) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.año = año;
        this.temporadas = temporadas;
        this.episodios = episodios;
        this.genero_superior = genero_superior;
    }

    public Serie (Parcel parcel) {

        ReadFromParcel(parcel);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public String getGenero_superior() {
        return genero_superior;
    }

    public void setGenero_superior(String genero_superior) {
        this.genero_superior = genero_superior;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

        dest.writeString(this.nombre);
        dest.writeString(this.imagen);
        dest.writeInt(this.año);
        dest.writeInt(this.temporadas);
        dest.writeInt(this.episodios);
        dest.writeString(this.genero_superior);



    }

    public void ReadFromParcel (Parcel parcel){

        this.nombre=parcel.readString();
        this.imagen=parcel.readString();
        this.año=parcel.readInt();
        this.temporadas=parcel.readInt();
        this.episodios=parcel.readInt();
        this.genero_superior=parcel.readString();

    }
}
