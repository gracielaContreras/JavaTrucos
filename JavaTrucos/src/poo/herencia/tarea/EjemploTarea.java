package poo.herencia.tarea;

import poo.herencia.tarea.herencia.*;

public class EjemploTarea {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("Dina", "Ortiz", "1",
                    "Almirante latorre", 100.000, 1, 100.000);
        gerente.aumentarRemuneracion(10);
        gerente.setPresupuesto(100.000);
        System.out.println(gerente);
    }
}
