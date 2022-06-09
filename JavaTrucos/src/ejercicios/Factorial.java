package ejercicios;

import java.util.Scanner;

public class Factorial {

    //Crea un programa utilizando ciclos que
    //imprima el factorial de un número, se calcula multiplicando todos los números a partir del
    //número indicado hasta 1 y se representa con el
    //simbolo !, a continuación un ejemplo:
    //4! = 4 x 3 x 2 x 1 = 24
    //7! = 7 × 6 × 5 × 4 × 3 × 2 × 1 = 5040
    //1! = 1
    //El factorial de 0 es 1

    public static void main(String[] args) {
        System.out.println("*** Imprima el factorial de un número **");
        System.out.println("Ingrese numero:");
        int numero = new Scanner(System.in).nextInt();
        int factorial = numero;

        for ( int i = (numero- 1); i >= 1; i-- ) {
            factorial = factorial*i;
        }
        if ((factorial == 0)) factorial++;
        System.out.println("El factorial de " +numero + " es: "+ factorial);
    }

}
