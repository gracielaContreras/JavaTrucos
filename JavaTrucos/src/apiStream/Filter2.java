package apiStream;

import apiStream.models.Usuario;
import java.util.stream.Stream;

/** Filter
 * Esta función es muy útil para filtrar acorde a una condición, la cual tiene que ser de tipo boolean.
 */

public class Filter2 {
    public static void main(String[] args) {

        Usuario usuario =  Stream.of("Dina Ortiz", "Eduardo Escobar", "Angela Contreras",
                        "Alvaro Contreras", "Manuel Contreras")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .filter(u -> u.getId().equals(1))
                .findFirst().get();

        System.out.println(usuario);
    }
}
