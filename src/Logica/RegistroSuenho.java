package Logica;

public class RegistroSuenho {
    private int horasSuenho;
    private String fecha;

    public RegistroSuenho(int horasSuenho, String fecha) {
        this.horasSuenho = horasSuenho;
        this.fecha = fecha;
    }

    public int getHorasSuenho() {
        return horasSuenho;
    }

    public String getFecha() {
        return fecha;
    }

    public void setHorasSuenho(int horasSuenho) {
        this.horasSuenho = horasSuenho;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
}
