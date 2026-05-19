package Logica;

public class Usuario {
    private String nombre;
    private String correo;
    private String contrasenha;

    public Usuario(String nombre, String correo, String contrasenha) {
        this.nombre = nombre;
        this.correo = correo;
        this.contrasenha = contrasenha;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getContrasenha() {
        return contrasenha;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setContrasenha(String contrasenha) {
        this.contrasenha = contrasenha;
    }
    
    
    
}
