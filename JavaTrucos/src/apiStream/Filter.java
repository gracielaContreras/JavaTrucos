package apiStream;

import apiStream.models.Usuario;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/** Filter
 * Esta función es muy útil para filtrar acorde a una condición, la cual tiene que ser de tipo boolean.
 */

public class Filter {
    public static void main(String[] args) {

        Stream<Usuario> nombres =  Stream.of("Dina Ortiz", "Eduardo Escobar", "Angela Contreras",
                        "Alvaro Contreras", "Manuel Contreras")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .filter(u -> u.getNombre().equals("Angela"));

        List<Usuario> lista = nombres.collect(Collectors.toList());
        lista.forEach(System.out::println);
    }
}
