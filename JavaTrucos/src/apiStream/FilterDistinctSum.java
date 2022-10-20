package apiStream;

import apiStream.models.Usuario;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/** Filter
 * Esta función es muy útil para filtrar acorde a una condición, la cual tiene que ser de tipo boolean.
 */

public class FilterDistinctSum {
    public static void main(String[] args) {

        IntStream largoNombres = Stream.of("Dina Ortiz", "Eduardo Escobar", "Angela Contreras",
                        "Alvaro Contreras", "Manuel Contreras", "Eduardo Escobar", "Eduardo Escobar", "Eduardo Escobar")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .distinct()
                .mapToInt( usuario -> usuario.toString().length())
                .peek(System.out::println);

        IntSummaryStatistics stats = largoNombres.summaryStatistics();
        System.out.println("Max: " + stats.getMax());
        System.out.println("Min: " + stats.getMin());
        System.out.println("Promedio: " + stats.getAverage());
        System.out.println("Total: " + stats.getCount());

    }
}
