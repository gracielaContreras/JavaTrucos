package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

class Metodo{

     public static boolean ordenarPalabraAZ(String palabra1, String palabra2){

         String ordenandoPalabra1 = ordenarStringAZ(palabra1);
         String ordenandoPalabra2 = ordenarStringAZ(palabra2);

         return (ordenandoPalabra1.equalsIgnoreCase(ordenandoPalabra2));
     }

    private static String ordenarStringAZ(String palabra) {
        char[] stringtoChar = palabra.toCharArray();
        Arrays.sort(stringtoChar);
        return new String(stringtoChar);
    }

}

public class EjercicioAnagrama {

    /*
     * Escribe una función que reciba dos palabras (String) y retorne
     * verdadero o falso (Bool) según sean o no anagramas.
     * - Un Anagrama consiste en formar una palabra reordenando TODAS
     *   las letras de otra palabra inicial.
     * - NO hace falta comprobar que ambas palabras existan.
     * - Dos palabras exactamente iguales no son anagrama.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa 1° palabra a comparar");
        String palabra1 = sc.nextLine();
        System.out.println("Ingresa 2° palabra a comparar");
        String palabra2 = sc.nextLine();

        System.out.println(Metodo.ordenarPalabraAZ(palabra1, palabra2));

    }

}
