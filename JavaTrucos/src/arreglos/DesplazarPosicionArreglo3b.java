package arreglos;

import java.util.Scanner;

public class DesplazarPosicionArreglo3b {
    public static void main(String[] args) {
        int[] a = new int[7];
        int numero, posicion, ultimo;

        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < a.length -1; i++) {
            System.out.print("Ingrese un numero: ");
            a[i] = scan.nextInt();
        }

        System.out.println("Ingrese un nuevo nuevo");
        numero = scan.nextInt();

        ultimo = a[a.length-1];

        //encontrar posición del nuevo número
        posicion = 0;
        while (posicion <6 && numero > a[posicion]){
            posicion++;
        }

        for(int i = a.length -2; i >= posicion; i--){
            a[i+1] = a[i];
        }

        int[] b = new int[a.length+1];
        System.arraycopy(a, 0 , b, 0 , a.length);

        if(numero > ultimo){
            b[b.length-1] = ultimo;
        }else {
            b[b.length-1] = ultimo;
            b[posicion] = numero;
        }

        for(int i = 0; i < b.length; i++)
        {
            System.out.println(i + " : "+ b[i]);
        }


    }
}
