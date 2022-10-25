package date_time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/** Encuentras tu zona horaria
 * https://en.wikipedia.org/wiki/List_of_tz_database_time_zones
 */

public class EjemploZonedDateTime2 {
    public static void main(String[] args) {
        //1° forma
        LocalDateTime fechaLocalMaquina1 = LocalDateTime.parse("2022/10/25 17:57"
                , DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm"));
        //2° forma
        LocalDateTime fechaLocalMaquina = LocalDateTime.parse("2022-10-25T17:57"); //Formato estándar

        ZoneId newYork = ZoneId.of("America/New_York");
        //1° forma
//        ZonedDateTime zonaNY = ZonedDateTime.of(fechaLocalMaquina1, ZoneOffset.of("-04:00"));
        //2° forma
        ZonedDateTime zonaNY = fechaLocalMaquina1.atZone(newYork);
        ZonedDateTime zonaMadrid = zonaNY.withZoneSameInstant(ZoneOffset.of("+02:00")).plusHours(8); //8 horas de diferencias entre NY y madrid

        DateTimeFormatter df = DateTimeFormatter.ofPattern("HH:mm, dd MMM yyyy");
        System.out.println("Detalles del viaje a españa");
        System.out.println("Partida NY = " + df.format(zonaNY));
        System.out.println("Llegada a Madrid= " + df.format(zonaMadrid));

        System.out.println("Zonas disponibles");
        ZoneId.getAvailableZoneIds().forEach(System.out::println);


    }


}
