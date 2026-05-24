package Main;

import Logica.*;
import Presentacion.LoginGUI;

public class main {

    public static void main(String[] args) {

        Usuario admin =
                new Usuario(
                        "Gabriel",
                        "gabriel@gmail.com",
                        "1234"
                );

        SistemaUsuarios
                .gestorUsuarios
                .registrarUsuario(admin);

        LoginGUI login =
                new LoginGUI();
    }
}