package arreglos;

import java.util.Scanner;

public class EjemploArregloParesImpares {

    public static void main(String[] args) {

        int[] a, pares, impares;
        a = new int[10];
        int par, impar;

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese 10 números");

        //guardar los 10 numeros
        for(int i = 0; i < a.length; i++){
            a[i] = scan.nextInt();
        }

        //guardar cantidad de números pares e impares
        par = 0;
        impar = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] %2 == 0){
                par++;
            }else {
                impar++;
            }
        }

        //asigna tamaño del array de pares e impares
        pares = new int[par];
        impares = new int[impar];

        //guarda los números pares e impares en sus respectivos arreglos
        int j = 0;
        int k = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i]%2 ==0){
                pares[j++] = a[i];
            }else {
                impares[k++] = a[i];
            }
        }


        System.out.println("Pares");
        for (int i = 0; i < pares.length; i++){
            System.out.print(pares[i] + " ");
        }
        System.out.println("\nImpares");
        for (int i = 0; i < impares.length; i++){
            System.out.print(impares[i] + " ");
        }


    }
}
