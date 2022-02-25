package arreglos;

import java.util.Scanner;

public class DesplazarPosicionArreglo2b {
    public static void main(String[] args) {
        int[] a = new int[10];
        int numero, posicion, ultimo;
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        for(int i = 0; i < a.length ; i++){
            a[i] = scan.nextInt();
        }

        System.out.println("ingrese un nuevo número");
        numero = scan.nextInt();

        System.out.println("En que posición desea agregarlo del 0 al 9");
        posicion =  scan.nextInt();

        System.out.println();

        ultimo = a[a.length -1];
        for(int i = a.length -2; i >= posicion; i--){
            a[i+1] = a[i];
        }

        int[] b = new int[a.length+1];

        System.arraycopy(a,0, b, 0, a.length);

        b[posicion] = numero;

        b[b.length-1] = ultimo;

        System.out.println("El arreglo : ");
        for (int i = 0; i < b.length;i ++) {
            System.out.println( b[i]);
        }

    }
}
