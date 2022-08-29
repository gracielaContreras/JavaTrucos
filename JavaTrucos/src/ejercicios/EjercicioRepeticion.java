package ejercicios;

import java.util.Scanner;

public class EjercicioRepeticion {
    public static void main(String[] args) {
        int[] a = new int[5];
        int[] c = {1, 2, 3, 4, 5, 6};

        Scanner sc = new Scanner(System.in);
        for(int i=0; i<a.length;i++){
            System.out.print("ingresa un numero del 1 al 6: ");
            a[i] = sc.nextInt();
        }
        for(int i=0; i<c.length; i++){
            int cantidad =0;
            for (int j=0; j<a.length; j++){
                if (c[i] == a[j]){
                    cantidad++;
                }
            }
            c[i] = cantidad;
        }
        for(int i=0; i<c.length; i++){
            String repetir = new String(new char[c[i]]).replace("\0","*");
            System.out.println((i+1) + " = " + repetir);
        }
    }
}
