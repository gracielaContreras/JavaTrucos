package ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        List divisible = new ArrayList();
        int contador=0;
        System.out.println("Ingrese numero:");
        int numero = new Scanner(System.in).nextInt();
        if (numero % 2 == 0) {
            for(int i = 2 ; i <=numero ; i++)
            {
                if (numero % i != 0)
                {
                    contador=contador+1;
                    break;
                } else {
                    divisible.add(i);
                }
            }
            System.out.println(divisible);
            if(contador == 1)
                System.out.println("No es primo " + divisible.get(0));
            else
                System.out.println("si es primo");
        } else {
            System.out.println("si es primo");
        }
    }
}
