package ejercicios;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Vowel Count is a system whereby character strings are placed in order based
 * on the position of the characters in the conventional ordering of an
 * alphabet. Wikipedia: https://en.wikipedia.org/wiki/Alphabetical_order
 */

public class ComprobarVocales {

    String hola ="hola mamá";
    public String getHola() {
        return hola;
    }
    public static void main(String[] args) {
        System.out.println(tieneVocales("dina"));
        System.out.println(tieneVocales("chhhch"));
        System.out.println(tieneVocales(null));

        int valor = 0;
        System.out.println(valor);

        int[] a = new int[3];
        a[0] = 3;
        a[1] = 4;
        a[2] = 1;
        System.out.println("valor "+ a[0]);
        Arrays.sort(a);
        for (int j : a) {
            System.out.println(j);
        }

        String[][] b = new String[1][2];
        b[0][0] = "Dina";
        b[0][1] = "Angela";
//        b[1][0] = "Eduardo";
//        b[1][1] = "Alvaro";

        for (String j[] : b) {
            for (String k : j) {
                System.out.println(k);
            }
        }
//        System.out.println(b[1][0]);
    }
    private static final Set<Character> vocales = new HashSet<>(
            Arrays.asList('a', 'e', 'i', 'o', 'u')
    );
    /**
     * Check if a string is has vowels or not
     *
     * @param input a string
     * @return {@code true} if given string has vowels, otherwise {@code false}
     */
    public static boolean tieneVocales(String input) {
        if (input == null) return false;

        //Declarative approach
        boolean contieneVocales = input.chars() //convertimos la cadena de entrada en un flujo de caracteres utilizando el método chars()
                .mapToObj(ch -> (char) ch)//se convierte cada valor entero en el flujo a un carácter mediante el método mapToObj()
                //se convierten todos los caracteres a minúsculas utilizando map(Character::toLowerCase)
                .map(Character::toLowerCase)
                //aplicamos un filtro para mantener solo los caracteres que están presentes en la lista de vocales utilizando el método filter()
                .filter(ch -> vocales.contains(ch))
                // Si se encuentra alguna vocal, el método findFirst() devolverá un valor presente
                // y establecemos la variable containsVowels como verdadera.
                .findFirst()
                //verificamos el valor de containsVowels para imprimir un mensaje adecuado.
                .isPresent();

        return contieneVocales;

/*  Imperative approach
        input = input.toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            if (VOWELS.contains(input.charAt(i))) {
                return true;
            }
        }
        return false;*/
    }
}
