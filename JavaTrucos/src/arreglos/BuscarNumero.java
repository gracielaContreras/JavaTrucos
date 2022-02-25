package arreglos;

import java.util.Scanner;

public class BuscarNumero {
    public static void main(String[] args) {

        int[] a = new int[5];

        Scanner scan = new Scanner(System.in);

        for (int i =0; i <a.length; i++) {
            System.out.print("Ingrese número : ");
            a[i] = scan.nextInt();
        }

        System.out.println("Ingrese un número a buscar");
        int num = scan.nextInt();

        int i =0;
        for(; i< a.length && a[i] != num; i++){}

        if(i== a.length){
            System.out.println("Número no encontrado");
        }else if(a[i] == num) {
            System.out.println("Numero encontrado en la posición: " + i);
        }

    }
}
