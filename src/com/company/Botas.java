package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Botas extends Zapato {
    private String estiloZapato;
    private String estiloBota;

    public Botas(){

    }

    public Botas(String marca, String estiloBota, int medida){
        setMarca(marca);
        setTipo("Bota");
        setTalla(medida);
        this.estiloBota = estiloBota;

    }


    public String getEstiloBota() {
        return estiloBota;
    }

    public void setEstiloBota(String estiloBota) {
        this.estiloBota = estiloBota;
    }


    @Override
    public void toFile(File obj) throws IOException {
        String propiedades = toString();
        FileWriter escribir = new FileWriter(obj);
        escribir.write(propiedades+"\n");
        escribir.close();

    }

    @Override
    public String estiloZapato() {
        estiloZapato = estiloBota;
        return estiloZapato;
    }
}
