package arreglos;

import java.util.Scanner;

public class DesplazarPosicionArreglo3 {
    public static void main(String[] args) {
        int[] a = new int[7];
        int numero, posicion;

        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < a.length -1; i++) {
            System.out.print("Ingrese un numero: ");
            a[i] = scan.nextInt();
        }

        System.out.println("Ingrese un nuevo nuevo");
        numero = scan.nextInt();

        //encontrar posición del nuevo número
        posicion = 0;
        while (posicion <6 && numero > a[posicion]){
            posicion++;
        }

        for(int i = a.length -2; i >= posicion; i--){
            a[i+1] = a[i];
        }
        a[posicion] = numero;
        for(int i = 0; i < a.length; i++)
        {
            System.out.println(i + " : "+ a[i]);
        }


    }
}
