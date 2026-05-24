package Logica;

public class RegistroAgua {

    private int cantidadAgua;
    private String fecha;

    public RegistroAgua(int cantidadAgua, String fecha) {
        this.cantidadAgua = cantidadAgua;
        this.fecha = fecha;
    }

    public int getCantidadAgua() {
        return cantidadAgua;
    }

    public void setCantidadAgua(int cantidadAgua) {
        this.cantidadAgua = cantidadAgua;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {

        return cantidadAgua
                + " vasos - "
                + fecha;
    }
}