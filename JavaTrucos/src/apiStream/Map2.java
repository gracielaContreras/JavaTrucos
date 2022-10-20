package apiStream;

import apiStream.models.Usuario;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/** Map
 * Este método es útil para cuando se quiere cambiar el tipo de respuesta,
 * como convertir algún tipo instancia de una clase a otra.
 */

public class Map2 {
    public static void main(String[] args) {

        Stream<Usuario> nombres =  Stream.of("Dina Ortiz", "Eduardo Escobar", "Angela Contreras",
                                                            "Alvaro Contreras", "Manuel Contreras")
                .map(usuario -> new Usuario(usuario.split(" ")[0], usuario.split(" ")[1]))
                .peek(System.out::println) //inspeccionar
                .map(usuario -> {
                 String nombre = usuario.getNombre().toUpperCase();
                 usuario.setNombre(nombre);
                 return usuario;
                });

        List<Usuario> lista = nombres.collect(Collectors.toList());
        lista.forEach(System.out::println);
    }
}
