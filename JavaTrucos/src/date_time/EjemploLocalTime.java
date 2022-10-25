package date_time;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class EjemploLocalTime {
    public static void main(String[] args) {
        LocalTime ahora = LocalTime.now();
        System.out.println(ahora);
        System.out.println("ahora = " + ahora.getHour());
        System.out.println("Minutos = " + ahora.getMinute());
        System.out.println("Segundos = " + ahora.getSecond());
        
        LocalTime seisConTreinta = LocalTime.of(6,30);
        System.out.println("seisConTreinta = " + seisConTreinta);
        LocalTime seisConTreinta2 = LocalTime.of(6,30,59);
        System.out.println("seisConTreinta2 = " + seisConTreinta2);

        seisConTreinta = LocalTime.parse("18:30");
        System.out.println("seisConTreinta = " + seisConTreinta);

        LocalTime sieteConTreinta = LocalTime.of(6,30).plus(1, ChronoUnit.HOURS);
        System.out.println("sieteConTreinta = " + sieteConTreinta);
        
        boolean esAnterior = LocalTime.of(6,30).isBefore(LocalTime.parse("07:30"));
        System.out.println("esAnterior = " + esAnterior);
        
        //Formato 12 horas
        DateTimeFormatter df = DateTimeFormatter.ofPattern("hh:mm:ss a");
        String ahoraFormateado = ahora.format(df);
        System.out.println("ahoraFormateado = " + ahoraFormateado);
        //Formato 24 horas
        DateTimeFormatter df2 = DateTimeFormatter.ofPattern("HH:mm:ss a");
        String ahoraFormateado2 = seisConTreinta.format(df2);
        System.out.println("ahoraFormateado = " + ahoraFormateado2);
        
        ahoraFormateado = df.format(ahora);
        System.out.println("ahoraFormateado = " + ahoraFormateado);

        LocalTime max = LocalTime.MAX;
        LocalTime min = LocalTime.MIN;

        System.out.println("Hora maxima de un día = " + max);
        System.out.println("Hora minima de un día = " + min);


    }
}
