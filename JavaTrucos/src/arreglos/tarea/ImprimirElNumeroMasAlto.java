package arreglos.tarea;

import java.util.Scanner;

public class ImprimirElNumeroMasAlto {

    /**    Escriba un programa que imprima el número más alto de un arreglo de 7 elementos (de rango 11 a 99),
     por ejemplo {14, 33, 15, 36, 78, 21, 43}, si se repite un valor considerar uno solo.*/

    public static void main(String[] args) {

        int[] a = new int[7];
        Scanner scan =  new Scanner(System.in);
        int numeroMasAlto;

        for(int i = 0; i < a.length; i++){
            System.out.print("Ingrese un numero: (de rango 11 a 99)  ");
            a[i] = scan.nextInt();
        }
        numeroMasAlto = 0;
        for(int i = 0; i < a.length; i++){
            numeroMasAlto = (a[numeroMasAlto] > a[i]) ? numeroMasAlto : i;

        }
        System.out.println("El número más alto de un arreglo es: " + a[numeroMasAlto]);

    }
//    Ejemplo del instructor
/** public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arreglo = new int[10];

        // ingreamos los datos por ejemplo {14, 33, 15, 36, 78, 21, 43}
        for (int i = 0; i < 7; i++) {
            System.out.println("Ingrese un numero de 11 a 99: ");
            arreglo[i] = scanner.nextInt();
        }

        int max = 0;

        // luego obtenemos el valor mayor
        for (int i = 0; i < 7; i++) {
            max = (max > arreglo[i])? max: arreglo[i];
        }
        System.out.println("El valor mas alto es: " + max);
    }*/
}
