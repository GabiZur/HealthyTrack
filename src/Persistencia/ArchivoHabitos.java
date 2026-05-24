package Persistencia;

import Logica.*;

import java.io.*;

public class ArchivoHabitos {

    private final String ARCHIVO =
            "habitos.txt";

    // GUARDAR AGUA

    public void guardarAgua(
            RegistroAgua agua){

        try{

            BufferedWriter bw =
                    new BufferedWriter(
                            new FileWriter(
                                    ARCHIVO,
                                    true
                            )
                    );

            bw.write(
                    "AGUA;"
                    + agua.getCantidadAgua()
                    + ";"
                    + agua.getFecha()
            );

            bw.newLine();

            bw.close();

        }catch(IOException e){

            System.out.println(
                    "Error guardando agua"
            );
        }
    }

    // GUARDAR SUEÑO

    public void guardarSuenho(
            RegistroSuenho suenho){

        try{

            BufferedWriter bw =
                    new BufferedWriter(
                            new FileWriter(
                                    ARCHIVO,
                                    true
                            )
                    );

            bw.write(
                    "SUENHO;"
                    + suenho.getHorasSuenho()
                    + ";"
                    + suenho.getFecha()
            );

            bw.newLine();

            bw.close();

        }catch(IOException e){

            System.out.println(
                    "Error guardando sueño"
            );
        }
    }

    // GUARDAR EJERCICIO

    public void guardarEjercicio(
            RegistroEjercicio ejercicio){

        try{

            BufferedWriter bw =
                    new BufferedWriter(
                            new FileWriter(
                                    ARCHIVO,
                                    true
                            )
                    );

            bw.write(
                    "EJERCICIO;"
                    + ejercicio.getTipoEjercicio()
                    + ";"
                    + ejercicio.getMinutos()
                    + ";"
                    + ejercicio.getCalorias()
                    + ";"
                    + ejercicio.getFecha()
            );

            bw.newLine();

            bw.close();

        }catch(IOException e){

            System.out.println(
                    "Error guardando ejercicio"
            );
        }
    }
}
