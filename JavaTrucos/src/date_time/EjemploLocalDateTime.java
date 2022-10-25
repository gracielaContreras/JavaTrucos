package date_time;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class EjemploLocalDateTime {
    public static void main(String[] args) {
        
        LocalDateTime fechaTiempo = LocalDateTime.now();
        System.out.println("fechaTiempo = " + fechaTiempo);
        
        fechaTiempo = LocalDateTime.of(2022, Month.OCTOBER, 24, 20,45,59);
        System.out.println("fechaTiempo = " + fechaTiempo);

        fechaTiempo = LocalDateTime.parse("2022-10-24T20:45:59.133827100");
        System.out.println("fechaTiempo = " + fechaTiempo);

        fechaTiempo = fechaTiempo.plusDays(1).plusHours(2);
        System.out.println("fechaTiempo se aumento un 1 día y 2 horas = " + fechaTiempo);
        System.out.println("fechaTiempo se restaron 5 horas = " + fechaTiempo.minusHours(5));

        Month mes = fechaTiempo.getMonth();
        System.out.println("mes = " + mes);
        System.out.println("mes en español = " + mes.getDisplayName(TextStyle.FULL,new Locale("es","ES")));

        int dia = fechaTiempo.getDayOfMonth();
        System.out.println("dia = " + dia);

        int anio = fechaTiempo.getYear();
        System.out.println("año = " + anio);

        String formato1 = fechaTiempo.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);

        System.out.println("formato1 = " + formato1);
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss a");        
        String formato2 = fechaTiempo.format(df);
        System.out.println("formato2 de 12 horas = " + formato2);
        
        String formato3 = df.format(fechaTiempo);
        System.out.println("formato3 = " + formato3);
        


    }
}
