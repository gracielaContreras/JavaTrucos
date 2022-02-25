package arreglos;

import java.util.Scanner;

public class DesplazarPosicionArreglo {
    public static void main(String[] args) {
        int[] a = new int[10];
        int ultimo;
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese 10 números");
        for(int i = 0; i < a.length; i++){
            a[i] = scan.nextInt();
        }
        ultimo = a[a.length -1];
        System.out.println();
        for(int i = a.length -2; i >= 0; i--){
            a[i+1] = a[i];
        }
        a[0] = ultimo;

        System.out.println("El arreglo : ");
        for (int i = 0; i < a.length;i ++) {
            System.out.println( a[i]);
        }

    }
}
