package Presentacion;

import Logica.RegistroEjercicio;
import Logica.Sistema;

import javax.swing.*;

import java.awt.Color;
import java.awt.Font;

import java.awt.Image;

public class EjercicioGUI extends JFrame {

    private JLabel lblTipo;
    private JLabel lblMinutos;
    private JLabel lblCalorias;

    private JTextField txtTipo;
    private JTextField txtMinutos;
    private JTextField txtCalorias;

    private JButton btnGuardar;
    private JButton btnVolver;

    public EjercicioGUI() {

        setTitle("Registrar Ejercicio");

        setSize(400,350);

        setLocationRelativeTo(null);

        setLayout(null);

        getContentPane().setBackground(
                new Color(36,37,42)
        );

        // TIPO

        lblTipo =
                new JLabel("Tipo:");

        lblTipo.setBounds(
                50,
                40,
                100,
                30
        );

        lblTipo.setForeground(
                Color.WHITE
        );

        lblTipo.setFont(
                new Font(
                        "Arial",
                        Font.PLAIN,
                        16
                )
        );

        txtTipo =
                new JTextField();

        txtTipo.setBounds(
                170,
                40,
                150,
                30
        );

        // MINUTOS

        lblMinutos =
                new JLabel("Minutos:");

        lblMinutos.setBounds(
                50,
                90,
                100,
                30
        );

        lblMinutos.setForeground(
                Color.WHITE
        );

        lblMinutos.setFont(
                new Font(
                        "Arial",
                        Font.PLAIN,
                        16
                )
        );

        txtMinutos =
                new JTextField();

        txtMinutos.setBounds(
                170,
                90,
                150,
                30
        );

        // CALORÍAS

        lblCalorias =
                new JLabel("Calorías:");

        lblCalorias.setBounds(
                50,
                140,
                100,
                30
        );

        lblCalorias.setForeground(
                Color.WHITE
        );

        lblCalorias.setFont(
                new Font(
                        "Arial",
                        Font.PLAIN,
                        16
                )
        );

        txtCalorias =
                new JTextField();

        txtCalorias.setBounds(
                170,
                140,
                150,
                30
        );

        // BOTONES

        btnGuardar =
                crearBoton(
                        "Guardar",
                        50
                );

        btnVolver =
                crearBoton(
                        "Volver",
                        200
                );

        // ADD

        add(lblTipo);
        add(txtTipo);

        add(lblMinutos);
        add(txtMinutos);

        add(lblCalorias);
        add(txtCalorias);

        add(btnGuardar);
        add(btnVolver);

        // =========================
        // GUARDAR
        // =========================

        btnGuardar.addActionListener(e -> {

            try {

                String tipo =
                        txtTipo.getText();

                int minutos =
                        Integer.parseInt(
                                txtMinutos.getText()
                        );

                int calorias =
                        Integer.parseInt(
                                txtCalorias.getText()
                        );

                RegistroEjercicio ejercicio =
                        new RegistroEjercicio(
                                tipo,
                                minutos,
                                calorias,
                                "24/05/2026"
                        );

                boolean registrado =
                        Sistema.gestorHabitos
                                .registrarEjercicio(
                                        ejercicio
                                );

                if(registrado){

                    JOptionPane.showMessageDialog(
                            null,
                            "Ejercicio registrado"
                    );

                    txtTipo.setText("");
                    txtMinutos.setText("");
                    txtCalorias.setText("");

                }else{

                    JOptionPane.showMessageDialog(
                            null,
                            "Datos inválidos"
                    );
                }

            }catch(Exception ex){

                JOptionPane.showMessageDialog(
                        null,
                        "Ingrese números válidos"
                );
            }
        });

        // =========================
        // VOLVER
        // =========================

        btnVolver.addActionListener(e -> {

            new MenuGUI();

            dispose();
        });

        setVisible(true);
    }

    private JButton crearBoton(
            String texto,
            int x){

        JButton boton =
                new JButton(texto);

        boton.setBounds(
                x,
                230,
                120,
                40
        );

        boton.setBackground(
                new Color(0,153,255)
        );

        boton.setForeground(
                Color.WHITE
        );

        boton.setFocusPainted(false);

        boton.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        14
                )
        );

        return boton;
    }
}