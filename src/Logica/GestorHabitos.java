package Logica;

import Persistencia.ArchivoHabitos;

import java.util.ArrayList;
import java.util.Iterator;

public class GestorHabitos {

    private ArrayList<RegistroAgua> listaAgua;
    private ArrayList<RegistroSuenho> listaSuenho;
    private ArrayList<RegistroEjercicio> listaEjercicios;

    private ArchivoHabitos archivo;

    // =========================
    // CONSTRUCTOR
    // =========================

    public GestorHabitos() {

        listaAgua = new ArrayList<>();
        listaSuenho = new ArrayList<>();
        listaEjercicios = new ArrayList<>();

        archivo = new ArchivoHabitos();
    }

    // =========================
    // CREATE
    // =========================

    public boolean registrarAgua(
            RegistroAgua agua) {

        if (agua.getCantidadAgua() <= 0) {

            System.out.println(
                    "Cantidad inválida"
            );

            return false;
        }

        listaAgua.add(agua);

        archivo.guardarAgua(agua);

        System.out.println(
                "Agua registrada correctamente"
        );

        return true;
    }

    public boolean registrarSuenho(
            RegistroSuenho suenho) {

        if (suenho.getHorasSuenho() <= 0) {

            System.out.println(
                    "Las horas no pueden ser negativas"
            );

            return false;
        }

        if (suenho.getHorasSuenho() > 24) {

            System.out.println(
                    "Las horas no pueden ser mayores a 24"
            );

            return false;
        }

        listaSuenho.add(suenho);

        archivo.guardarSuenho(suenho);

        System.out.println(
                "Sueño registrado correctamente"
        );

        return true;
    }

    public boolean registrarEjercicio(
            RegistroEjercicio ejercicio) {

        if (ejercicio.getTipoEjercicio()
                .trim().isEmpty()) {

            System.out.println(
                    "El tipo de ejercicio está vacío"
            );

            return false;
        }

        if (ejercicio.getMinutos() <= 0) {

            System.out.println(
                    "Los minutos son inválidos"
            );

            return false;
        }

        if (ejercicio.getCalorias() <= 0) {

            System.out.println(
                    "Las calorías son inválidas"
            );

            return false;
        }

        if (ejercicio.getMinutos() > 300) {

            System.out.println(
                    "Tiempo excesivo"
            );

            return false;
        }

        listaEjercicios.add(ejercicio);

        archivo.guardarEjercicio(
                ejercicio
        );

        System.out.println(
                "Ejercicio registrado correctamente"
        );

        return true;
    }

    // =========================
    // READ
    // =========================

    public void mostrarAgua() {

        for (RegistroAgua agua : listaAgua) {

            System.out.println(agua);
        }
    }

    public void mostrarSuenho() {

        for (RegistroSuenho suenho : listaSuenho) {

            System.out.println(suenho);
        }
    }

    public void mostrarEjercicio() {

        for (RegistroEjercicio ejercicio
                : listaEjercicios) {

            System.out.println(ejercicio);
        }
    }

    // =========================
    // HISTORIAL GENERAL
    // =========================

    public void mostrarHistorialCompleto() {

        System.out.println(
                "===== AGUA ====="
        );

        mostrarAgua();

        System.out.println(
                "\n===== SUEÑO ====="
        );

        mostrarSuenho();

        System.out.println(
                "\n===== EJERCICIO ====="
        );

        mostrarEjercicio();
    }

    // =========================
    // UPDATE
    // =========================

    public boolean editarAgua(
            int posicion,
            int nuevaCantidad) {

        if (posicion >= 0
                && posicion < listaAgua.size()) {

            if (nuevaCantidad > 0) {

                listaAgua.get(posicion)
                        .setCantidadAgua(
                                nuevaCantidad
                        );

                return true;
            }
        }

        return false;
    }

    public boolean editarSuenho(
            int posicion,
            double nuevasHoras) {

        if (posicion >= 0
                && posicion < listaSuenho.size()) {

            if (nuevasHoras > 0
                    && nuevasHoras <= 24) {

                listaSuenho.get(posicion)
                        .setHorasSuenho(
                                nuevasHoras
                        );

                return true;
            }
        }

        return false;
    }

    public boolean editarEjercicio(
            int posicion,
            String nuevoTipo,
            int nuevosMinutos,
            int nuevasCalorias) {

        if (posicion >= 0
                && posicion < listaEjercicios.size()) {

            RegistroEjercicio ejercicio =
                    listaEjercicios.get(posicion);

            ejercicio.setTipoEjercicio(
                    nuevoTipo
            );

            ejercicio.setMinutos(
                    nuevosMinutos
            );

            ejercicio.setCalorias(
                    nuevasCalorias
            );

            return true;
        }

        return false;
    }

    // =========================
    // DELETE
    // =========================

    public boolean eliminarAgua(
            int cantidad) {

        Iterator<RegistroAgua> iterator =
                listaAgua.iterator();

        while (iterator.hasNext()) {

            RegistroAgua agua =
                    iterator.next();

            if (agua.getCantidadAgua()
                    == cantidad) {

                iterator.remove();

                return true;
            }
        }

        return false;
    }

    public boolean eliminarSuenho(
            double horas) {

        Iterator<RegistroSuenho> iterator =
                listaSuenho.iterator();

        while (iterator.hasNext()) {

            RegistroSuenho suenho =
                    iterator.next();

            if (suenho.getHorasSuenho()
                    == horas) {

                iterator.remove();

                return true;
            }
        }

        return false;
    }

    public boolean eliminarEjercicio(
            String tipo) {

        Iterator<RegistroEjercicio> iterator =
                listaEjercicios.iterator();

        while (iterator.hasNext()) {

            RegistroEjercicio ejercicio =
                    iterator.next();

            if (ejercicio.getTipoEjercicio()
                    .equalsIgnoreCase(tipo)) {

                iterator.remove();

                return true;
            }
        }

        return false;
    }

    // =========================
    // GETTERS
    // =========================

    public ArrayList<RegistroAgua>
    getListaAgua() {

        return listaAgua;
    }

    public ArrayList<RegistroSuenho>
    getListaSuenho() {

        return listaSuenho;
    }

    public ArrayList<RegistroEjercicio>
    getListaEjercicios() {

        return listaEjercicios;
    }
}