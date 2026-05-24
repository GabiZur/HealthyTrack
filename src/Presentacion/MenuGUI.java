package Presentacion;

import javax.swing.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

public class MenuGUI extends JFrame {

    // =========================
    // COMPONENTES
    // =========================

    private JPanel panelLateral;
    private JPanel panelPrincipal;

    private JLabel lblTitulo;
    private JLabel lblSubtitulo;
    private JLabel lblLogo;

    private JButton btnAgua;
    private JButton btnSuenho;
    private JButton btnEjercicio;
    private JButton btnHistorial;
    private JButton btnCerrarSesion;

    public MenuGUI() {

        // =========================
        // CONFIGURACIÓN VENTANA
        // =========================

        setTitle("HealthyTrack");

        setSize(950, 600);

        setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE
        );

        setLocationRelativeTo(null);

        setLayout(null);

        getContentPane().setBackground(
                new Color(24,24,28)
        );

        // =========================
        // PANEL LATERAL
        // =========================

        panelLateral =
                new JPanel();

        panelLateral.setLayout(null);

        panelLateral.setBounds(
                0,
                0,
                260,
                600
        );

        panelLateral.setBackground(
                new Color(18,18,22)
        );

        add(panelLateral);

        // =========================
        // LOGO ARRIBA IZQUIERDA
        // =========================

        ImageIcon logo =
                new ImageIcon(
                        "src/Recursos/logo.png"
                );

        Image imagenLogo =
                logo.getImage();

        Image nuevaLogo =
                imagenLogo.getScaledInstance(
                        150,
                        150,
                        Image.SCALE_SMOOTH
                );

        lblLogo =
                new JLabel(
                        new ImageIcon(
                                nuevaLogo
                        )
                );

        lblLogo.setBounds(
                40,
                10,
                150,
                150
        );

        panelLateral.add(lblLogo);

        // =========================
        // TITULO
        // =========================

        lblTitulo =
                new JLabel("HealthyTrack");

        lblTitulo.setBounds(
                35,
                120,
                220,
                40
        );

        lblTitulo.setForeground(
                Color.WHITE
        );

        lblTitulo.setFont(
                new Font(
                        "Segoe UI",
                        Font.BOLD,
                        30
                )
        );

        panelLateral.add(lblTitulo);

        // =========================
        // SUBTITULO
        // =========================

        lblSubtitulo =
                new JLabel(
                        "Controla tus hábitos"
                );

        lblSubtitulo.setBounds(
                45,
                160,
                200,
                25
        );

        lblSubtitulo.setForeground(
                new Color(170,170,170)
        );

        lblSubtitulo.setFont(
                new Font(
                        "Segoe UI",
                        Font.PLAIN,
                        15
                )
        );

        panelLateral.add(lblSubtitulo);

        // =========================
        // BOTONES
        // =========================

        btnAgua =
                crearBoton(
                        "Registrar Agua",
                        240
                );

        btnSuenho =
                crearBoton(
                        "Registrar Sueño",
                        310
                );

        btnEjercicio =
                crearBoton(
                        "Registrar Ejercicio",
                        380
                );

        btnHistorial =
                crearBoton(
                        "Ver Historial",
                        450
                );

        btnCerrarSesion =
                crearBoton(
                        "Cerrar Sesión",
                        520
                );

        panelLateral.add(btnAgua);
        panelLateral.add(btnSuenho);
        panelLateral.add(btnEjercicio);
        panelLateral.add(btnHistorial);
        panelLateral.add(btnCerrarSesion);

        // =========================
        // PANEL PRINCIPAL
        // =========================

        panelPrincipal =
                new JPanel();

        panelPrincipal.setLayout(null);

        panelPrincipal.setBounds(
                260,
                0,
                690,
                600
        );

        panelPrincipal.setBackground(
                new Color(24,24,28)
        );

        add(panelPrincipal);

        // =========================
        // TITULO PRINCIPAL
        // =========================

        JLabel lblBienvenida =
                new JLabel(
                        "Bienvenido a HealthyTrack"
                );

        lblBienvenida.setBounds(
                50,
                60,
                550,
                50
        );

        lblBienvenida.setForeground(
                Color.WHITE
        );

        lblBienvenida.setFont(
                new Font(
                        "Segoe UI",
                        Font.BOLD,
                        36
                )
        );

        panelPrincipal.add(lblBienvenida);

        // =========================
        // DESCRIPCIÓN
        // =========================

        JLabel lblDescripcion =
                new JLabel(
                        "<html>"
                        + "Monitorea tu agua, sueño y ejercicio "
                        + "de manera simple y moderna.<br><br>"
                        + "HealthyTrack te ayuda a mantener hábitos "
                        + "saludables y mejorar tu bienestar diario."
                        + "</html>"
                );

        lblDescripcion.setBounds(
                55,
                150,
                500,
                120
        );

        lblDescripcion.setForeground(
                new Color(180,180,180)
        );

        lblDescripcion.setFont(
                new Font(
                        "Segoe UI",
                        Font.PLAIN,
                        20
                )
        );

        panelPrincipal.add(lblDescripcion);

        // =========================
        // IMAGEN CENTRAL
        // =========================

        ImageIcon imagenCentral =
                new ImageIcon(
                        "src/Recursos/logo.png"
                );

        Image img =
                imagenCentral.getImage();

        Image nuevaImg =
                img.getScaledInstance(
                        250,
                        250,
                        Image.SCALE_SMOOTH
                );

        JLabel lblImagen =
                new JLabel(
                        new ImageIcon(
                                nuevaImg
                        )
                );

        lblImagen.setBounds(
                330,
                240,
                300,
                300
        );

        panelPrincipal.add(lblImagen);

        // =========================
        // ACCIONES BOTONES
        // =========================

        btnAgua.addActionListener(e -> {

            new AguaGUI();

            dispose();
        });

        btnSuenho.addActionListener(e -> {

            new SuenhoGUI();

            dispose();
        });

        btnEjercicio.addActionListener(e -> {

            new EjercicioGUI();

            dispose();
        });

        btnHistorial.addActionListener(e -> {

            new HistorialGUI();

            dispose();
        });

        btnCerrarSesion.addActionListener(e -> {

            new LoginGUI();

            dispose();
        });

        setVisible(true);
    }

    // =========================
    // BOTONES MODERNOS
    // =========================

    private JButton crearBoton(
            String texto,
            int y){

        JButton boton =
                new JButton(texto);

        boton.setBounds(
                20,
                y,
                210,
                50
        );

        boton.setBackground(
                new Color(35,35,42)
        );

        boton.setForeground(
                Color.WHITE
        );

        boton.setFocusPainted(false);

        boton.setBorderPainted(false);

        boton.setFont(
                new Font(
                        "Segoe UI",
                        Font.BOLD,
                        17
                )
        );

        return boton;
    }
}