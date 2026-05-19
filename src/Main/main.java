package Main;
import Logica.GestorHabitos;
import Logica.Usuario;
import Logica.GestorUsuarios;
import Logica.RegistroAgua;
import Logica.RegistroEjercicio;

public class main {

    public static void main(String[] args) {
        
        
        GestorUsuarios gestor = new GestorUsuarios();
        
        Usuario u1 = new Usuario("Gabriel", "gabriel@gmail.com", "12345678");
        
        gestor.registrarUsuario(u1);
        
        Usuario login = gestor.iniciarSesion("gabriel@gmail.com", "12345678");
        
        if(login != null){
            System.out.println("Bienvenido " + login.getNombre());
        }
        else{
            System.out.println("Credenciales incorrectas");
        }
        
        GestorHabitos gestorH = new GestorHabitos();
        
        RegistroAgua a1 = new RegistroAgua(10, "18/05/2026");
        
        gestorH.registrarAgua(a1);
        
        System.out.println("Agua registrada");
        
        RegistroEjercicio e1 = new RegistroEjercicio("Cardio", 30, 1000, "18/05/2026");
        
        gestorH.registrarEjercicio(e1);
        
        System.out.println("Ejercicio registrado");
        
        boolean registrado = gestorH.registrarEjercicio(e1);
        
        if(registrado){
            System.out.println("Ejercicio registrado");
        }
        else{
            System.out.println("Datos invalidos");
        }
    }
    
    
}
