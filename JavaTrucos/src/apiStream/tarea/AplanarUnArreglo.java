package apiStream.tarea;

import java.util.Arrays;

/**
 * Tarea: Aplanar un arreglo bidimensional en un nivel y eliminar repetidos
 * Aplanar un arreglo significa quitar los elementos del arreglo anidado y dejarlos en el arreglo de primer nivel.
 */

public class AplanarUnArreglo {
    public static void main(String[] args) {
        String[][] lenguajes = {{"java", "groovy"}, {"php"}, {"c#", "python", "groovy"}, {"java", "javascript", "kotlin"}, {"javascript"}, {}};

        Arrays.stream(lenguajes)
                .flatMap(arr -> Arrays.stream(arr)) // Lo convierte en un arreglo de primer nivel
                .distinct()
                .forEach(System.out::println);

    }
}
