package com.example.alex.ejemplorecyclerview;

/**
 * Created by Alex on 26/1/2018.
 */

public class Destino {
    String nombre;
    int imagen;
    int estado;

    public Destino() {
    }

    public Destino(String nombre, int imagen, int estado) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.estado = estado;
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

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
