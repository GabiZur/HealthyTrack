package Presentacion;

import Logica.*;

import javax.swing.*;

import java.awt.Color;
import java.awt.Font;

public class RegistroGUI extends JFrame {

    private JLabel lblTitulo;
    private JLabel lblNombre;
    private JLabel lblCorreo;
    private JLabel lblContrasenha;

    private JTextField txtNombre;
    private JTextField txtCorreo;

    private JPasswordField txtContrasenha;

    private JButton btnRegistrar;
    private JButton btnVolver;

    public RegistroGUI() {

        setTitle("Registro");

        setSize(400,400);

        setLocationRelativeTo(null);

        setLayout(null);

        getContentPane().setBackground(
                new Color(36,37,42)
        );

        // TITULO

        lblTitulo =
                new JLabel("CREAR CUENTA");

        lblTitulo.setBounds(
                90,
                20,
                250,
                40
        );

        lblTitulo.setForeground(
                Color.WHITE
        );

        lblTitulo.setFont(
                new Font(
                        "Segoe UI",
                        Font.BOLD,
                        24
                )
        );

        // NOMBRE

        lblNombre =
                new JLabel("Nombre:");

        lblNombre.setBounds(
                40,
                90,
                100,
                30
        );

        lblNombre.setForeground(
                Color.WHITE
        );

        txtNombre =
                new JTextField();

        txtNombre.setBounds(
                150,
                90,
                180,
                30
        );

        // CORREO

        lblCorreo =
                new JLabel("Correo:");

        lblCorreo.setBounds(
                40,
                140,
                100,
                30
        );

        lblCorreo.setForeground(
                Color.WHITE
        );

        txtCorreo =
                new JTextField();

        txtCorreo.setBounds(
                150,
                140,
                180,
                30
        );

        // CONTRASEÑA

        lblContrasenha =
                new JLabel("Contraseña:");

        lblContrasenha.setBounds(
                40,
                190,
                100,
                30
        );

        lblContrasenha.setForeground(
                Color.WHITE
        );

        txtContrasenha =
                new JPasswordField();

        txtContrasenha.setBounds(
                150,
                190,
                180,
                30
        );

        // BOTÓN REGISTRAR

        btnRegistrar =
                new JButton("Registrar");

        btnRegistrar.setBounds(
                50,
                280,
                120,
                35
        );

        btnRegistrar.setBackground(
                new Color(0,153,255)
        );

        btnRegistrar.setForeground(
                Color.WHITE
        );

        btnRegistrar.setFocusPainted(false);

        // BOTÓN VOLVER

        btnVolver =
                new JButton("Volver");

        btnVolver.setBounds(
                210,
                280,
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

        // ADD

        add(lblTitulo);

        add(lblNombre);
        add(txtNombre);

        add(lblCorreo);
        add(txtCorreo);

        add(lblContrasenha);
        add(txtContrasenha);

        add(btnRegistrar);
        add(btnVolver);

        // =========================
        // REGISTRAR
        // =========================

        btnRegistrar.addActionListener(e -> {

            String nombre =
                    txtNombre.getText();

            String correo =
                    txtCorreo.getText();

            String contrasenha =
                    new String(
                            txtContrasenha
                                    .getPassword()
                    );

            if(nombre.isEmpty()
                    || correo.isEmpty()
                    || contrasenha.isEmpty()){

                JOptionPane.showMessageDialog(
                        null,
                        "Complete todos los campos"
                );

                return;
            }

            Usuario usuario =
                    new Usuario(
                            nombre,
                            correo,
                            contrasenha
                    );

            SistemaUsuarios
                    .gestorUsuarios
                    .registrarUsuario(
                            usuario
                    );

            JOptionPane.showMessageDialog(
                    null,
                    "Usuario registrado correctamente"
            );

            new LoginGUI();

            dispose();
        });

        // =========================
        // VOLVER
        // =========================

        btnVolver.addActionListener(e -> {

            new LoginGUI();

            dispose();
        });

        setVisible(true);
    }
}
