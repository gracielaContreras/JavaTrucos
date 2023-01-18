package date_time;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.stream.Stream;

public class EjemploLocalDateTime1 {
    public static void main(String[] args) {
        LocalTime hora = LocalTime.of(20,45,39);
        LocalDate fecha = LocalDate.of(2023, Month.JANUARY, 17);

        LocalDateTime fechaHora = LocalDateTime.of(fecha,hora);
        System.out.println(fechaHora);

        // Cada vez que se debe hacer una modificación se debe crear un nuevo objeto,
        // ya que la LocalDateTime es inmutable

        fechaHora = fechaHora.minusHours(1); // resta una hora
        System.out.println(fechaHora);

        Period duracion = Period.ofDays(1);
        fechaHora = fechaHora.minus(duracion);
        System.out.println(fechaHora);

        // 1° forma de cambiar el formato de fecha /o hora
        DateTimeFormatter formato = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        System.out.println(formato.format(fechaHora));

        // 2° forma de cambiar el formato de fecha /o hora
        DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("dd-MM-YYYY");
        System.out.println(formato2.format(fechaHora));
        
    }
}
