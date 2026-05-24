package Presentacion;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import Logica.*;

import java.awt.Color;
import java.awt.Font;

import java.awt.Image;

public class HistorialGUI extends JFrame {

    private JTable tabla;

    private JScrollPane scroll;

    private JButton btnVolver;

    public HistorialGUI() {

        setTitle("Historial");

        setSize(700,400);

        setLocationRelativeTo(null);

        setLayout(null);

        getContentPane().setBackground(
                new Color(36,37,42)
        );

        // COLUMNAS

        String[] columnas = {
            "Tipo",
            "Dato",
            "Fecha"
        };

        // MODELO

        DefaultTableModel modelo =
                new DefaultTableModel(
                        columnas,
                        0
                );

        // AGUA

        for(RegistroAgua agua :
                Sistema.gestorHabitos
                        .getListaAgua()){

            Object[] fila = {

                "Agua",

                agua.getCantidadAgua()
                        + " vasos",

                agua.getFecha()
            };

            modelo.addRow(fila);
        }

        // SUEÑO

        for(RegistroSuenho suenho :
                Sistema.gestorHabitos
                        .getListaSuenho()){

            Object[] fila = {

                "Sueño",

                suenho.getHorasSuenho()
                        + " horas",

                suenho.getFecha()
            };

            modelo.addRow(fila);
        }

        // EJERCICIO

        for(RegistroEjercicio ejercicio :
                Sistema.gestorHabitos
                        .getListaEjercicios()){

            Object[] fila = {

                "Ejercicio",

                ejercicio.getTipoEjercicio()
                        + " - "
                        + ejercicio.getMinutos()
                        + " min",

                ejercicio.getFecha()
            };

            modelo.addRow(fila);
        }

        // TABLA

        tabla =
                new JTable(modelo);

        tabla.setRowHeight(30);

        tabla.setFont(
                new Font(
                        "Arial",
                        Font.PLAIN,
                        14
                )
        );

        tabla.getTableHeader().setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        14
                )
        );

        scroll =
                new JScrollPane(tabla);

        scroll.setBounds(
                30,
                30,
                620,
                250
        );

        // BOTÓN VOLVER

        btnVolver =
                new JButton("Volver");

        btnVolver.setBounds(
                270,
                300,
                120,
                35
        );

        btnVolver.setBackground(
                new Color(0,153,255)
        );

        btnVolver.setForeground(
                Color.WHITE
        );

        btnVolver.setFocusPainted(false);

        btnVolver.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        14
                )
        );

        // ADD

        add(scroll);

        add(btnVolver);

        // VOLVER

        btnVolver.addActionListener(e -> {

            new MenuGUI();

            dispose();
        });

        setVisible(true);
    }
}