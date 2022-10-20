package apiStream;

import apiStream.models.Usuario;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/** Filter
 * Esta función es muy útil para filtrar acorde a una condición, la cual tiene que ser de tipo boolean.
 */

public class FilterAnyMatch {
    public static void main(String[] args) {

        boolean usuario =  Stream.of("Dina Ortiz", "Eduardo Escobar", "Angela Contreras",
                        "Alvaro Contreras", "Manuel Contreras")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .anyMatch(u -> u.getId().equals(6)); //equivale al for desde la línea 30

        System.out.println(usuario);


        // Hacerlo sin Steam es más código
/*        List<Usuario> lista = Arrays.asList(new Usuario("Dina","Ortiz"),
                                    new Usuario("Eduardo","Escobar"),
                                    new Usuario("Manuel","Contreras"));

        boolean existe = false;
        for (Usuario u : lista){
            if (u.getId().equals(6)){
                existe = true;
                break;
            }
        }
        System.out.println(existe);*/
    }
}
