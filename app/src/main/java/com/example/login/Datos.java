package com.example.login;

import java.io.Serializable;

public class Datos implements Serializable {
    private int id;
    private String Lamina;
    private int Imagen;

    public Datos(int id, String lamina, int imagen) {
        this.id = id;
        Lamina = lamina;
        Imagen = imagen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLamina() {
        return Lamina;
    }

    public void setLamina(String lamina) {
        Lamina = lamina;
    }

    public int getImagen() {
        return Imagen;
    }

    public void setImagen(int imagen) {
        Imagen = imagen;
    }
}
