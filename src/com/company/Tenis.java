package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Tenis extends Zapato {
    private String estiloZapato;
    private String estiloTenis;

    public Tenis(){

    }

    public Tenis(String marca, String estiloTenis, int medida){
        setMarca(marca);
        setTipo("Tenis");
        setTalla(medida);
        this.estiloTenis = estiloTenis;
    }

    public String getEstiloTenis() {
        return estiloTenis;
    }

    public void setEstiloTenis(String estiloTenis) {
        this.estiloTenis = estiloTenis;
    }


    @Override
    public void toFile(File obj) throws IOException {
        String propiedades = toString();
        FileWriter escribir = new FileWriter(obj,true);
        escribir.write(propiedades+"\n");
        escribir.close();

    }

    @Override
    public String estiloZapato() {
        estiloZapato = estiloTenis;
        return estiloZapato;
    }
}
