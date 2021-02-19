package com.example.hepal.modelo;

import android.widget.ImageView;
import android.widget.TextView;

public class App {
    private int codApp;
    private String nombre;
    private int imagen;
    private boolean comprada;

    //constructores
    public App() {}

    public App(int codApp, String nombre, int imagen, boolean comprada) {
        this.codApp = codApp;
        this.nombre = nombre;
        this.imagen = imagen;
        this.comprada = comprada;
    }

    //getters, setters
    public int getCodApp() {
        return codApp;
    }

    public void setCodApp(int codApp) {
        this.codApp = codApp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int ImageView) {
        this.imagen = imagen;
    }

    public boolean isComprada() {
        return comprada;
    }

    public void setComprada(boolean comprada) {
        this.comprada = comprada;
    }
}
