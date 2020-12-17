package com.company;

import java.io.File;
import java.io.IOException;

public abstract class Zapato {

    private String marca;
    private String tipo;
    private int talla;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String estilo) {
        this.tipo = estilo;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public String calzar(){
        String frase = "Que bien me quedan est@s "+getTipo()+" que son talla "+getTalla();

        return frase;
    }

    @Override
    public String toString() {
        return "Calzado{" +
                "marca='" + marca + '\'' +
                ", tipo='" + tipo + '\'' +
                ", medida=" + talla +
                ", estilo='" + estiloZapato() + '\'' +
                '}';
    }

    public abstract void toFile(File obj) throws IOException;
    public abstract String estiloZapato();
}
