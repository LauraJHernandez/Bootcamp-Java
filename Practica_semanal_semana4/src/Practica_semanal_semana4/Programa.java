package Practica_semanal_semana4;

import java.util.ArrayList;

public class Programa {

    public static void main(String[] args) {
        Aviones avion = new Aviones("Laura", "Turbofan", false, 12345);
        Helicopteros helicoptero = new Helicopteros("Wilson", "Turboeje", false, 4);
        Superman superman = new Superman("Clark Kent", "Cuerpo", true, true);
        Ovnis ovni = new Ovnis("ET", "Cohete", true,"Marte");

        ArrayList<Voladores> voladores = new ArrayList<Voladores>();
        voladores.add(avion);
        voladores.add(helicoptero);
        voladores.add(superman);
        voladores.add(ovni);

        for(int i = 0; i < voladores.size(); i ++) {
            if (voladores.get(i) instanceof Interface) {
                System.out.println(voladores.get(i).getClase() + " " + voladores.get(i).getNombreVolador() + " Si puede aterrizar, adelante");
            }
            else {
                System.out.println(voladores.get(i).getClase() + " " + voladores.get(i).getNombreVolador() + " No puede aterrizar, retroceda");
            }
        }
    }
}
