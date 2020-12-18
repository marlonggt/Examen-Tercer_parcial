package com.company;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        Scanner rd = new Scanner(System.in);
        ArrayList <String> zapatosArr = new ArrayList<String>();

        File file1 = new File("ArchivoBotas.txt");
        File file2 = new File("ArchivoTenis.txt");
        File file3 = new File("ArchivoZandalias.txt");
        try{
            boolean archivoCreado = file3.createNewFile();
            if(archivoCreado){
                System.out.println("Archivo creado");
            } else{
                System.out.println("Archivo ya existe");
            }
        } catch (IOException e){
            System.out.println("Problema al crear el archivo"+e);
        }


        boolean cont = true;

        while(cont){
            System.out.println("Que tipo de zapato desea agregar");
            System.out.println("1._Botas");
            System.out.println("2._Tenis");
            System.out.println("3._Zandalias");
            int opc = rd.nextInt();
            char opc2;
            rd.nextLine();

            if(opc==1){
                System.out.println("elija la Marca:");
                String marca = rd.nextLine();


                System.out.println("elija el Estilo:");
                String estilo = rd.nextLine();


                System.out.println("elija la Talla:");
                int talla = rd.nextInt();
                rd.nextLine();


                System.out.println("desea agregar otro zapato? s para continuar:");
                opc2 = rd.nextLine().charAt(0);

                if(opc2 !='s'){
                    cont = false;
                }

                Zapato zp1 = new Botas(marca,estilo,talla);
                zapatosArr.add(zp1.toString());
                zp1.toFile(file1);
                System.out.println(zp1.calzar());

            } else if (opc == 2){
                System.out.println("elija la Marca:");
                String marca = rd.nextLine();


                System.out.println("elija el Estilo:");
                String estilo = rd.nextLine();

                System.out.println("elija la Talla:");
                int talla = rd.nextInt();
                rd.nextLine();

                System.out.println("desea agregar otro zapato? s para continuar:");
                opc2 = rd.next().charAt(0);
                if(opc2 !='s'){
                    cont = false;
                }

                Zapato zp2 = new Tenis(marca,estilo,talla);
                zapatosArr.add(zp2.toString());
                zp2.toFile(file2);
                System.out.println(zp2.calzar());

            } else if (opc == 3){
                System.out.println("elija la Marca:");
                String marca = rd.nextLine();


                System.out.println("elija el Estilo:");
                String estilo = rd.nextLine();

                System.out.println("elija la Talla:");
                int talla = rd.nextInt();
                rd.nextLine();

                System.out.println("desea agregar otro zapato? s para continuar:");
                opc2 = rd.next().charAt(0);
                if(opc2 !='s'){
                    cont = false;
                }

                Zapato zp3 = new Zandalias(marca,estilo,talla);
                zapatosArr.add(zp3.toString());
                zp3.toFile(file3);
                System.out.println(zp3.calzar());
            }

        }


        for(int i = 0; i < zapatosArr.size(); i++){
            System.out.println(zapatosArr.get(i));
        }

    }

}

