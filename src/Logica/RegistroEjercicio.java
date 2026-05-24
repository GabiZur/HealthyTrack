package Logica;

public class RegistroEjercicio {

    private String tipoEjercicio;
    private int minutos;
    private int calorias;
    private String fecha;

    public RegistroEjercicio(
            String tipoEjercicio,
            int minutos,
            int calorias,
            String fecha) {

        this.tipoEjercicio = tipoEjercicio;
        this.minutos = minutos;
        this.calorias = calorias;
        this.fecha = fecha;
    }

    public String getTipoEjercicio() {
        return tipoEjercicio;
    }

    public void setTipoEjercicio(String tipoEjercicio) {
        this.tipoEjercicio = tipoEjercicio;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {

        return tipoEjercicio
                + " - "
                + minutos
                + " min - "
                + calorias
                + " calorías - "
                + fecha;
    }
}
