package Practica_semanal_semana4;

public class Superman extends Voladores implements Interface {

    private boolean capa;

    public Superman(String nombreVolador, String tipoMotor, boolean aterrizajeVertical, boolean capa) {
        super(nombreVolador, tipoMotor, aterrizajeVertical);
        this.capa = capa;
    }

    public Superman() {
    }

    public boolean isCapa() {
        return capa;
    }

    public void setCapa(boolean capa) {
        this.capa = capa;
    }

    @Override
    public String toString() {
        return "Superman [Capa: " + capa + "]";
    }

    public String getClase() {
        return "Superman";
    }
}
