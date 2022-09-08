package collecciones.tarea;

import java.time.LocalDateTime;
import java.util.*;
import static collecciones.tarea.Vuelo.formateoFecha;

public class EjercicioEncuentraTuVuelo {
    public static void main(String[] args) {

        List<Vuelo> vuelo = new ArrayList<>();
        vuelo.add(new Vuelo("AAL 933", "New York", "Santiago", LocalDateTime.parse("2021-08-29T05:39"), 62));
        vuelo.add(new Vuelo("LAT 755", "Sao Paulo", "Santiago", LocalDateTime.parse("2021-08-31T04:45"), 47));
        vuelo.add(new Vuelo("SKU 621", "Rio De Janeiro", "Santiago", LocalDateTime.parse("2021-08-30T16:00"), 52));
        vuelo.add(new Vuelo("DAL 147", "Atlanta", "Santiago", LocalDateTime.parse("2021-08-29T13:22"), 59));
        vuelo.add(new Vuelo("AVA 241", "Bogota", "Santiago", LocalDateTime.parse("2021-08-31T14:05"), 25));
        vuelo.add(new Vuelo("AMX 10", "Mexico City", "Santiago", LocalDateTime.parse("2021-08-31T05:20"), 29));
        vuelo.add(new Vuelo("IBE 6833", "Londres", "Santiago", LocalDateTime.parse("2021-08-30T08:45"), 55));
        vuelo.add(new Vuelo("LAT 2479", "Frankfurt", "Santiago", LocalDateTime.parse("2021-08-29T07:41"), 51));
        vuelo.add(new Vuelo("SKU 803", "Lima", "Santiago", LocalDateTime.parse("2021-08-30T10:35"), 48));
        vuelo.add(new Vuelo("LAT 533", "Los Ángeles", "Santiago", LocalDateTime.parse("2021-08-29T09:14"), 59));
        vuelo.add(new Vuelo("LAT 1447", "Guayaquil", "Santiago", LocalDateTime.parse("2021-08-31T08:33"), 31));
        vuelo.add(new Vuelo("CMP 111", "Panama City", "Santiago", LocalDateTime.parse("2021-08-31T15:15"), 29));
        vuelo.add(new Vuelo("LAT 705", "Madrid", "Santiago", LocalDateTime.parse("2021-08-30T08:14"), 47));
        vuelo.add(new Vuelo("AAL 957", "Miami", "Santiago", LocalDateTime.parse("2021-08-29T22:53"), 60));
        vuelo.add(new Vuelo("ARG 5091", "Buenos Aires", "Santiago", LocalDateTime.parse("2021-08-31T09:57"), 32));
        vuelo.add(new Vuelo("LAT 1283", "Cancún", "Santiago", LocalDateTime.parse("2021-08-31T04:00"), 35));
        vuelo.add(new Vuelo("LAT 579", "Barcelona", "Santiago", LocalDateTime.parse("2021-08-29T07:45"), 61));
        vuelo.add(new Vuelo("AAL 945", "Dallas-Fort Worth", "Santiago", LocalDateTime.parse("2021-08-30T07:12"), 58));
        vuelo.add(new Vuelo("LAT 501", "París", "Santiago", LocalDateTime.parse("2021-08-29T18:29"), 49));
        vuelo.add(new Vuelo("LAT 405", "Montevideo", "Santiago", LocalDateTime.parse("2021-08-30T15:45"), 39));

        System.out.println("=========ascendente===========");
        System.out.println(vuelo);
        System.out.println("====================");
        vuelo.sort(Comparator.comparing(Vuelo::getFechaHora).reversed());
        System.out.println("El último vuelo en llegar es: " + vuelo.get(0).getNombre() + " : "
                + vuelo.get(0).getOrigen() + ", aterriza el = " + formateoFecha(vuelo.get(0).getFechaHora()) );

        vuelo.sort(Comparator.comparing(Vuelo::getNumDePasajero));
        System.out.println("El vuelo con menor número de pasajeros es= " + vuelo.get(0).getNombre() + " : "
                + vuelo.get(0).getOrigen() + ", con= " + vuelo.get(0).getNumDePasajero() +" pasajeros.");

    }
}
