package Logica;

public class RegistroEjercicio {
    private String tipoEjercicio;
    private int minutos;
    private int Calorias;
    private String fecha;

    public RegistroEjercicio(String tipoEjercicio, int minutos, int Calorias, String fecha) {
        this.tipoEjercicio = tipoEjercicio;
        this.minutos = minutos;
        this.Calorias = Calorias;
        this.fecha = fecha;
    }

    public String getTipoEjercicio() {
        return tipoEjercicio;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getCalorias() {
        return Calorias;
    }

    public String getFecha() {
        return fecha;
    }

    public void setTipoEjercicio(String tipoEjercicio) {
        this.tipoEjercicio = tipoEjercicio;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public void setCalorias(int Calorias) {
        this.Calorias = Calorias;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
}
