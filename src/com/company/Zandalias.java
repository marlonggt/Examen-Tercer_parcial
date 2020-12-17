package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Zandalias extends Zapato {
    private String estiloZapato;
    private String estiloZandalia;

    public Zandalias(){

    }

    public Zandalias(String marca, String estiloZandalia, int medida){
        setMarca(marca);
        setTipo("Zandalias");
        setTalla(medida);
        this.estiloZandalia = estiloZandalia;

    }

    public String getEstiloZandalia() {
        return estiloZandalia;
    }

    public void setEstiloZandalia(String estiloZandalia) {
        this.estiloZandalia = estiloZandalia;
    }

    public Zandalias(String estiloZandalia) {
        this.estiloZandalia = estiloZandalia;
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
        estiloZapato = estiloZandalia;
        return estiloZapato;
    }
}
