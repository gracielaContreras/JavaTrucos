package date_time.tarea;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 * Calcular edad ingresando la fecha de nacimiento de una persona con java 8 date time.
 * Para esta tarea se pide ingresar una fecha de nacimiento en formato string, 
 * convertirla a una fecha del tipo LocalDate y calcular la edad de la persona de acuerdo a la fecha actual.
 */

public class CalcularEdad {
    public static void main(String[] args) {
        String nacimiento = "08-09-1991";
        LocalDate fechaNacimiento = LocalDate.parse(nacimiento
                                    , DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        LocalDate fechaActual = LocalDate.now();

        Period edadActual = Period.between(fechaNacimiento, fechaActual);
        System.out.printf("Tienes %d años, %d meses y %d días"
                                , edadActual.getYears(), edadActual.getMonths(), edadActual.getDays());
    }
}
