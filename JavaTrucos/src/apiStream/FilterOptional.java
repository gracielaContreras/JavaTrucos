package apiStream;

import apiStream.models.Usuario;
import java.util.Optional;
import java.util.stream.Stream;

/** Filter
 * Esta función es muy útil para filtrar acorde a una condición, la cual tiene que ser de tipo boolean.
 * Optional permite controlar el manejo de errores. (NoSuchElementException, NullPointerException)
 */

public class FilterOptional {
    public static void main(String[] args) {

        Stream<Usuario> nombres =  Stream.of("Dina Ortiz", "Eduardo Escobar", "Angela Contreras",
                        "Alvaro Contreras", "Manuel Contreras")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .filter(u -> u.getNombre().equals("Angelass"));

        Optional<Usuario> existe = nombres.findFirst();
//        System.out.println(existe.get());
        //1° forma
        System.out.println(existe.orElseGet( () -> new Usuario("Graciela","Contreras")));
        //2° forma
        System.out.println(existe.orElse( new Usuario("Graciela", "Contreras ")));
        //3° forma
        if(existe.isPresent()){
            System.out.println(existe.get());
        }else{
            System.out.println("No existe usuario");
        }
    }
}
