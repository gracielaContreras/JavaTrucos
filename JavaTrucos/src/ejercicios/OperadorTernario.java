package ejercicios;

import java.util.Scanner;

public class OperadorTernario {

    public static void main(String[] args) {

        int max = 0;

        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese primer numero");
        int num1 = s.nextInt();
        System.out.println("Ingrese segundo numero");
        int num2 = s.nextInt();
        System.out.println("Ingrese tercero numero");
        int num3 = s.nextInt();
        System.out.println("Ingrese cuarto numero");
        int num4 = s.nextInt();

        max = (max > num1) ? max : num1;
        max = (max > num2) ? max : num2;
        max = (max > num3) ? max : num3;
        max = (max > num4) ? max : num4;

        System.out.println("Numero ingresados son: "+ "\n"+ num1 +"\n"+ num2 + "\n" + num3 + "\n" + num4 );
        System.out.println("El numero mayor ingresado es: " +max);

    }
}
