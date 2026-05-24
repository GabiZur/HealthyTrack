package Presentacion;

import Logica.*;

import javax.swing.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

public class LoginGUI extends JFrame {

    private JLabel lblTitulo;
    private JLabel lblCorreo;
    private JLabel lblContrasenha;

    private JTextField txtCorreo;

    private JPasswordField txtContrasenha;

    private JButton btnIngresar;
    private JButton btnRegistrarse;

    public LoginGUI() {

        // =========================
        // CONFIGURACIÓN VENTANA
        // =========================

        setTitle("HEALTHYTRACK");

        setSize(400,430);

        setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE
        );

        setLocationRelativeTo(null);

        setLayout(null);

        getContentPane().setBackground(
                new Color(36,37,42)
        );

        // =========================
        // LOGO
        // =========================

        JLabel lblLogo =
                crearLogo(
                        "src/Recursos/logo.png",
                        145,
                        55,
                        90,
                        90
                );

        add(lblLogo);

        // =========================
        // TITULO
        // =========================

        lblTitulo =
                new JLabel(
                        "HEALTHYTRACK"
                );

        lblTitulo.setBounds(
                65,
                10,
                300,
                40
        );

        lblTitulo.setForeground(
                Color.WHITE
        );

        lblTitulo.setFont(
                new Font(
                        "Segoe UI",
                        Font.BOLD,
                        26
                )
        );

        // =========================
        // CORREO
        // =========================

        lblCorreo =
                new JLabel("Correo:");

        lblCorreo.setBounds(
                50,
                165,
                100,
                30
        );

        lblCorreo.setForeground(
                Color.WHITE
        );

        lblCorreo.setFont(
                new Font(
                        "Segoe UI",
                        Font.PLAIN,
                        16
                )
        );

        txtCorreo =
                new JTextField();

        txtCorreo.setBounds(
                150,
                165,
                180,
                32
        );

        txtCorreo.setFont(
                new Font(
                        "Segoe UI",
                        Font.PLAIN,
                        14
                )
        );

        // =========================
        // CONTRASEÑA
        // =========================

        lblContrasenha =
                new JLabel("Contraseña:");

        lblContrasenha.setBounds(
                50,
                215,
                100,
                30
        );

        lblContrasenha.setForeground(
                Color.WHITE
        );

        lblContrasenha.setFont(
                new Font(
                        "Segoe UI",
                        Font.PLAIN,
                        16
                )
        );

        txtContrasenha =
                new JPasswordField();

        txtContrasenha.setBounds(
                150,
                215,
                180,
                32
        );

        txtContrasenha.setFont(
                new Font(
                        "Segoe UI",
                        Font.PLAIN,
                        14
                )
        );

        // =========================
        // BOTÓN INGRESAR
        // =========================

        btnIngresar =
                new JButton("Ingresar");

        btnIngresar.setBounds(
                120,
                270,
                140,
                38
        );

        btnIngresar.setBackground(
                new Color(0,153,255)
        );

        btnIngresar.setForeground(
                Color.WHITE
        );

        btnIngresar.setFocusPainted(false);

        btnIngresar.setFont(
                new Font(
                        "Segoe UI",
                        Font.BOLD,
                        14
                )
        );

        // =========================
        // BOTÓN REGISTRARSE
        // =========================

        btnRegistrarse =
                new JButton("Registrarse");

        btnRegistrarse.setBounds(
                120,
                320,
                140,
                38
        );

        btnRegistrarse.setBackground(
                new Color(0,153,255)
        );

        btnRegistrarse.setForeground(
                Color.WHITE
        );

        btnRegistrarse.setFocusPainted(false);

        btnRegistrarse.setFont(
                new Font(
                        "Segoe UI",
                        Font.BOLD,
                        14
                )
        );

        // =========================
        // AGREGAR COMPONENTES
        // =========================

        add(lblTitulo);

        add(lblCorreo);
        add(txtCorreo);

        add(lblContrasenha);
        add(txtContrasenha);

        add(btnIngresar);
        add(btnRegistrarse);

        // =========================
        // LOGIN
        // =========================

        btnIngresar.addActionListener(e -> {

            String correo =
                    txtCorreo.getText();

            String contrasenha =
                    new String(
                            txtContrasenha
                                    .getPassword()
                    );

            Usuario usuario =
                    SistemaUsuarios
                            .gestorUsuarios
                            .iniciarSesion(
                                    correo,
                                    contrasenha
                            );

            if(usuario != null){

                JOptionPane.showMessageDialog(
                        null,
                        "Bienvenido "
                                + usuario.getNombre()
                );

                new MenuGUI();

                dispose();

            }else{

                JOptionPane.showMessageDialog(
                        null,
                        "Credenciales incorrectas"
                );
            }
        });

        // =========================
        // REGISTRO
        // =========================

        btnRegistrarse.addActionListener(e -> {

            new RegistroGUI();

            dispose();
        });

        setVisible(true);
    }

    // =========================
    // MÉTODO LOGO
    // =========================

    private JLabel crearLogo(
            String ruta,
            int x,
            int y,
            int ancho,
            int alto){

        ImageIcon icono =
                new ImageIcon("src/Recursos/Logo.jpg");

        Image imagen =
                icono.getImage();

        Image nuevaImagen =
                imagen.getScaledInstance(
                        ancho,
                        alto,
                        Image.SCALE_SMOOTH
                );

        JLabel label =
                new JLabel(
                        new ImageIcon(
                                nuevaImagen
                        )
                );

        label.setBounds(
                x,
                y,
                ancho,
                alto
        );

        return label;
    }
}