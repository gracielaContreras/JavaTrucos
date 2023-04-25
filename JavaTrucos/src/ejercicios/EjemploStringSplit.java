package ejercicios;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * split
 * divide una cadena en fragmentos con un caracter en común
 */

public class EjemploStringSplit {
    public static void main(String[] args) {

        String cadena = "2023-01-02";
        String[] fragmentos = cadena.split("-");
        System.out.println("Año :" +fragmentos[0] + " mes :" + fragmentos[1] + " día:" + fragmentos[2]);
        System.out.println(cadena.split("-")[2].charAt(1));


        String lista = getList().stream()
                   .sorted(Comparator.comparing( apellido -> apellido.split(" ")[1].charAt(0)))
                .collect(Collectors.joining(","));

        System.out.println(lista);

//        System.out.println(getList());

    }
    public static List<String> getList(){
        return List.of("David Goodman",
                        "Mark Rose",
                        "Jane Doe",
                        "Jane Dane");
    }
}
