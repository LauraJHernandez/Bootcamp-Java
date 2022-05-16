package Practica_semanal_semana4;

public class Helicopteros extends Voladores implements Interface {

    private int numeroHelices;

    public Helicopteros(String nombreVolador, String tipoMotor, boolean aterrizajeVertical, int numeroHelices) {
        super(nombreVolador, tipoMotor, aterrizajeVertical);
        this.numeroHelices = numeroHelices;
    }

    public Helicopteros() {
    }

    public int getNumeroHelices() {
        return numeroHelices;
    }

    public void setNumeroHelices(int numeroHelices) {
        this.numeroHelices = numeroHelices;
    }

    @Override
    public String toString() {
        return "Helicopteco [Numero de Helices = " + numeroHelices + "]";
    }

    public String getClase() {
        return "Helicoptero";
    }
}
