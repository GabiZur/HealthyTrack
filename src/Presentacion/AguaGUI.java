package Presentacion;

import Logica.RegistroAgua;
import Logica.Sistema;

import javax.swing.*;

import java.awt.Color;
import java.awt.Font;

import java.awt.Image;

public class AguaGUI extends JFrame {

    private JLabel lblCantidad;

    private JTextField txtCantidad;

    private JButton btnGuardar;
    private JButton btnVolver;

    public AguaGUI() {

        setTitle("Registrar Agua");

        setSize(350,250);

        setLocationRelativeTo(null);

        setLayout(null);

        getContentPane().setBackground(
                new Color(36,37,42)
        );

        lblCantidad =
                new JLabel(
                        "Cantidad de vasos:"
                );

        lblCantidad.setBounds(
                40,
                50,
                150,
                30
        );

        lblCantidad.setForeground(
                Color.WHITE
        );

        lblCantidad.setFont(
                new Font(
                        "Arial",
                        Font.PLAIN,
                        16
                )
        );

        txtCantidad =
                new JTextField();

        txtCantidad.setBounds(
                170,
                50,
                100,
                30
        );

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

        add(lblCantidad);
        add(txtCantidad);

        add(btnGuardar);
        add(btnVolver);

        btnGuardar.addActionListener(e -> {

            try {

                int cantidad =
                        Integer.parseInt(
                                txtCantidad.getText()
                        );

                RegistroAgua agua =
                        new RegistroAgua(
                                cantidad,
                                "24/05/2026"
                        );

                boolean registrado =
                        Sistema.gestorHabitos
                                .registrarAgua(
                                        agua
                                );

                if(registrado){

                    JOptionPane.showMessageDialog(
                            null,
                            "Agua registrada"
                    );

                    txtCantidad.setText("");

                }else{

                    JOptionPane.showMessageDialog(
                            null,
                            "Cantidad inválida"
                    );
                }

            }catch(Exception ex){

                JOptionPane.showMessageDialog(
                        null,
                        "Ingrese números"
                );
            }
        });

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