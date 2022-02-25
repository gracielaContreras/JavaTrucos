package arreglos;

import java.util.Scanner;

public class DesplazarPosicionArreglo2 {
    public static void main(String[] args) {
        int[] a = new int[10];
        int numero, posicion;
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        for(int i = 0; i < a.length -1; i++){
            a[i] = scan.nextInt();
        }

        System.out.println("ingrese un nuevo número");
        numero = scan.nextInt();

        System.out.println("En que posición desea agregarlo del 0 al 9");
        posicion =  scan.nextInt();

        System.out.println();
        for(int i = a.length -2; i >= posicion; i--){
            a[i+1] = a[i];
        }
        a[posicion] = numero;

        System.out.println("El arreglo : ");
        for (int i = 0; i < a.length;i ++) {
            System.out.println( a[i]);
        }

    }
}
