package apiStream;

import apiStream.models.Usuario;
import java.util.Optional;
import java.util.stream.Stream;

/** Filter
 * Esta función es muy útil para filtrar acorde a una condición, la cual tiene que ser de tipo boolean.
 */

public class FilterDistinct {
    public static void main(String[] args) {

        Stream.of("Dina Ortiz", "Eduardo Escobar", "Angela Contreras",
                        "Alvaro Contreras", "Manuel Contreras", "Eduardo Escobar", "Eduardo Escobar", "Eduardo Escobar")
                .distinct()
                .forEach(System.out::println);
    }
}
