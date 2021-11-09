package ejercicios;

import java.util.Scanner;

public class Tarea1 {
    public static void main(String[] args) {

        int max = 0;
        int min = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese primer numero");
        int valor1 = sc.nextInt();
        System.out.println("Ingrese segundo numero");
        int valor2 = sc.nextInt();

        max = (valor1>valor2) ? valor1 : valor2;

        min = (valor2<valor1) ? valor2 : valor1;

        System.out.println("orden de mayor a menor: "+ max +" , "+ min);
    }
}
