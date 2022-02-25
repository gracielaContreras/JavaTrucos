package arreglos;

import java.util.Scanner;

public class DetectarOrdenArreglo {

    public static void main(String[] args) {

        int[] a = new int[7];

        Scanner scan = new Scanner(System.in);
        System.out.println("ingrese 7 números");

        for (int i = 0; i < a.length; i++){
            a[i] = scan.nextInt();
        }

        boolean ascendente = false;
        boolean descendente = false;
        for(int i = 0; i < a.length -1; i++){

            if(a[i] < a[i+1]){
                ascendente = true;
            }
            if(a[i] > a[i+1]){
                descendente = true;
            }
        }

        if(ascendente == true && descendente == true){
            System.out.println("arreglo = desordenado");
        }
        if(ascendente == false && descendente == false){
            System.out.println("arreglo = todos son iguales");
        }
        if(ascendente == true && descendente == false){
            System.out.println("arreglo ordenado de forma ascendente");
        }
        if(ascendente == false && descendente == true){
            System.out.println("arreglo ordenado de forma descendente");
        }

    }
}
