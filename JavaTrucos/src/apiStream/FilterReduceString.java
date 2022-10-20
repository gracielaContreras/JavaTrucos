package apiStream;

import java.util.stream.Stream;

/** Filter
 * Esta función es muy útil para filtrar acorde a una condición, la cual tiene que ser de tipo boolean.
 */

public class FilterReduceString {
    public static void main(String[] args) {
        Stream<String> nombres = Stream.of("Dina Ortiz", "Eduardo Escobar", "Angela Contreras",
                        "Alvaro Contreras", "Manuel Contreras", "Eduardo Escobar", "Eduardo Escobar", "Eduardo Escobar")
                .distinct();

        String resultado = nombres.reduce( "resultado: ", (a, b) -> a + ", " + b);
        System.out.println(resultado);
    }
}
