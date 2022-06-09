package ejercicios;

import java.util.Scanner;

public class ImprimirHistograma {

    public static void main(String[] args) {
        System.out.println("Ingrese un número");
        int numero = new Scanner(System.in).nextInt();

        for ( int i = 0; i < numero ; i++ ){
            for ( int k = 0; k <= i; k++ ) {
                System.out.print("*");
            }
            System.out.println("");
        }

        for ( int i = 0; i < numero ; i++ ){
//            int espacios = 0;
            for ( int k = 0; k <= i; k++ ) {
                int espacios = numero -i;
                System.out.print(String.format("%"+espacios+"s","*"));
            }
            System.out.println("");
        }

    }
}
