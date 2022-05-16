package Practica_semanal_semana4;

public class Aviones extends Voladores implements Interface {

    private int matricula;

    public Aviones(String nombreVolador, String tipoMotor, boolean aterrizajeVertical, int matricula) {
        super(nombreVolador, tipoMotor, aterrizajeVertical);
        this.matricula = matricula;
    }

    public Aviones() {
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Avion [Matricula= " + matricula + "]";
    }

    public String getClase() {
        return "Avion";
    }
}
