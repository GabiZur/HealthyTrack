package Presentacion;

import Logica.RegistroSuenho;
import Logica.Sistema;

import javax.swing.*;

import java.awt.Color;
import java.awt.Font;

import java.awt.Image;

public class SuenhoGUI extends JFrame {

    private JLabel lblHoras;

    private JTextField txtHoras;

    private JButton btnGuardar;
    private JButton btnVolver;

    public SuenhoGUI() {

        setTitle("Registrar Sueño");

        setSize(350,250);

        setLocationRelativeTo(null);

        setLayout(null);

        getContentPane().setBackground(
                new Color(36,37,42)
        );

        // LABEL

        lblHoras =
                new JLabel(
                        "Horas de sueño:"
                );

        lblHoras.setBounds(
                40,
                50,
                150,
                30
        );

        lblHoras.setForeground(
                Color.WHITE
        );

        lblHoras.setFont(
                new Font(
                        "Arial",
                        Font.PLAIN,
                        16
                )
        );

        // TEXTFIELD

        txtHoras =
                new JTextField();

        txtHoras.setBounds(
                170,
                50,
                100,
                30
        );

        txtHoras.setFont(
                new Font(
                        "Arial",
                        Font.PLAIN,
                        14
                )
        );

        // BOTONES

        btnGuardar =
                crearBoton(
                        "Guardar",
                        40
                );

        btnVolver =
                crearBoton(
                        "Volver",
                        180
                );

        // ADD

        add(lblHoras);

        add(txtHoras);

        add(btnGuardar);

        add(btnVolver);

        // =========================
        // GUARDAR
        // =========================

        btnGuardar.addActionListener(e -> {

            try {

                double horas =
                        Double.parseDouble(
                                txtHoras.getText()
                        );

                RegistroSuenho suenho =
                        new RegistroSuenho(
                                horas,
                                "24/05/2026"
                        );

                boolean registrado =
                        Sistema.gestorHabitos
                                .registrarSuenho(
                                        suenho
                                );

                if(registrado){

                    JOptionPane.showMessageDialog(
                            null,
                            "Sueño registrado"
                    );

                    txtHoras.setText("");

                }else{

                    JOptionPane.showMessageDialog(
                            null,
                            "Horas inválidas"
                    );
                }

            }catch(Exception ex){

                JOptionPane.showMessageDialog(
                        null,
                        "Ingrese números"
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
                130,
                120,
                35
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