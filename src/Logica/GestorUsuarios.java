package Logica;
import java.util.ArrayList;

public class GestorUsuarios {
    
    private ArrayList<Usuario> listaUsuarios;

    public GestorUsuarios(){
        listaUsuarios = new ArrayList<>();
    }
    
    public void registrarUsuario(Usuario usuario){
        listaUsuarios.add(usuario);
    }
    
    public boolean correoExiste(String correo){
        for (Usuario u : listaUsuarios){
            if(u.getCorreo().equalsIgnoreCase(correo)){
                return true;
            }
        }
        return false;
        
    }
    
    public Usuario iniciarSesion(String correo, String contrasenha){
        for(Usuario u : listaUsuarios){
            
            if(u.getCorreo().equalsIgnoreCase(correo) && u.getContrasenha().equals(contrasenha)){
                return u;
            }
        }
        return null;
    }
    
}
