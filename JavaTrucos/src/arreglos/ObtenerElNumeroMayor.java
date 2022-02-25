package arreglos;

import java.util.Scanner;

public class ObtenerElNumeroMayor {

    public static void main(String[] args) {

        int[] a = new int[5];

        Scanner scan = new Scanner(System.in);

        System.out.println("ingrese 5 numeros");
        for(int i = 0; i < a.length; i++){
            a[i] = scan.nextInt();
        }

        int maximo = 0;
        for(int i = 0; i < a.length; i++){
            maximo = (a[maximo] > a[i]) ? maximo : i;
        }
        System.out.println("El numero mayor ingresado es: " + a[maximo]);
    }
}
