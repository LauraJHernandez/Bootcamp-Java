package Practica_semanal_semana4;

public class Ovnis extends Voladores implements Interface {

    private String procedencia;

    public Ovnis(String nombreVolador, String tipoMotor, boolean aterrizajeVertical, String procedencia) {
        super(nombreVolador, tipoMotor, aterrizajeVertical);
        this.procedencia = procedencia;
    }

    public Ovnis() {
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    @Override
    public String toString() {
        return "Ovni [Procedencia= " + procedencia + "]";
    }

    public String getClase() {
        return "Ovni";
    }
}
