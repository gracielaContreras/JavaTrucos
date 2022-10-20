package apiStream;

import apiStream.models.Usuario;
import java.util.stream.Stream;

/** Filter
 * Esta función es muy útil para filtrar acorde a una condición, la cual tiene que ser de tipo boolean.
 * Diferencian entre Map y FlapMap es que con map devuelve un objeto y con FlapMap devuelve un Stream de ese objeto
 * otro flujo, otra salida.
 */

public class FilterFlatMap {
    public static void main(String[] args) {

        Stream<Usuario> nombres =  Stream.of("Dina Ortiz", "Eduardo Escobar", "Angela Contreras",
                        "Alvaro Contreras", "Manuel Contreras","Dina Ortiz")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .flatMap(u -> {
                    if(u.getNombre().equalsIgnoreCase("Dina")){
                        return Stream.of(u); //devuelve un Stream
                    }
                    return Stream.empty(); //devuelve vacío
                })
                .peek(System.out::println);

        System.out.println("Cuantos se encontró con el nombre Dina: " + nombres.count());
//        nombres.forEach(System.out::println);
    }
}
