package date_time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class EjemploLocalDate {
    public static void main(String[] args) {

        LocalDate fechaActual = LocalDate.now();
        System.out.println("fechaActual = " + fechaActual);
        System.out.println("Día = " + fechaActual.getDayOfMonth());

        Month mes = fechaActual.getMonth();
        System.out.println("Mes = " + mes);
        System.out.println("Día del mes = " + mes.getValue());
        System.out.println("mes en español = " + mes.getDisplayName(TextStyle.FULL,new Locale("es","ES")));

        DayOfWeek diaSemana= fechaActual.getDayOfWeek();
        System.out.println("diaSemana = " + diaSemana);
        System.out.println("diaSemana en español = " + diaSemana.getDisplayName(TextStyle.FULL,new Locale("es","ES")));

        System.out.println("Año = " + fechaActual.getYear());        
        fechaActual = LocalDate.of(2022,10,25);
        System.out.println("fechaActual = " + fechaActual);
        
        fechaActual= LocalDate.of(2022, Month.OCTOBER,25);
        System.out.println("fechaActual = " + fechaActual);
        
        fechaActual = LocalDate.parse("2022-10-25");
        System.out.println("fechaActual = " + fechaActual);
        
        LocalDate diaDeManiana = LocalDate.now().plusDays(1);
        System.out.println("diaDeManiana = " + diaDeManiana);

        LocalDate mesAnteriorMismoDia = LocalDate.now().minus(1, ChronoUnit.MONTHS);
        System.out.println("mesAnteriorMismoDia = " + mesAnteriorMismoDia);

        DayOfWeek miercoles = LocalDate.parse("2022-10-26").getDayOfWeek();
        System.out.println("miercoles = " + miercoles);
        
        int once = LocalDate.of(2022,10,11).getDayOfMonth();
        System.out.println("once = " + once);

        boolean esBisiesto = LocalDate.now().isLeapYear();
        System.out.println("esBisiesto = " + esBisiesto);
        
        boolean esAntes = LocalDate.of(2022,10,11).isBefore(LocalDate.parse("2022-10-10"));
        System.out.println("esAntes = " + esAntes);

        boolean esDespues = LocalDate.parse("2022-10-11").isAfter(LocalDate.parse("2022-10-10"));
        System.out.println("esDespues = " + esDespues);

        esDespues = LocalDate.now().isAfter(LocalDate.now().minusDays(1));
        System.out.println("esDespues = " + esDespues);
    }
}
