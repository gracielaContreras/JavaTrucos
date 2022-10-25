package date_time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/** Encuentras tu zona horaria
 * https://en.wikipedia.org/wiki/List_of_tz_database_time_zones
 */

public class EjemploZonedDateTime {
    public static void main(String[] args) {

        LocalDateTime fechaLocalMaquina = LocalDateTime.now();
        ZoneId newYork = ZoneId.of("America/New_York");
        ZonedDateTime zonaNY = ZonedDateTime.of(fechaLocalMaquina, newYork);
        System.out.println("hora de partida de New York = " +zonaNY);

        ZoneId madrid = ZoneId.of("Europe/Madrid");
        ZonedDateTime zonaMadrid = zonaNY.withZoneSameInstant(madrid).plusHours(8); //8 horas de diferencias entre NY y madrid
        System.out.println("Hora de llegada de Madrid = " + zonaMadrid);

        ZoneId zonaChile = ZoneId.of("America/Santiago");
        ZonedDateTime zonaCH = ZonedDateTime.of(fechaLocalMaquina, zonaChile);
        System.out.println("hora actual de Chile = " +zonaCH);
    }


}
