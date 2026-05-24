package Logica;

public class RegistroSuenho {

    private double horasSuenho;
    private String fecha;

    public RegistroSuenho(double horasSuenho, String fecha) {
        this.horasSuenho = horasSuenho;
        this.fecha = fecha;
    }

    public double getHorasSuenho() {
        return horasSuenho;
    }

    public void setHorasSuenho(double horasSuenho) {
        this.horasSuenho = horasSuenho;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {

        return horasSuenho
                + " horas - "
                + fecha;
    }
}
