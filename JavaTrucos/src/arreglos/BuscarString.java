package arreglos;

import java.util.Scanner;

public class BuscarString {
    public static void main(String[] args) {

        String[] a = new String[5];

        Scanner scan = new Scanner(System.in);

        for (int i =0; i <a.length; i++) {
            System.out.print("Ingrese un nombre : ");
            a[i] = scan.next();
        }

        System.out.println("Ingrese un nombre a buscar");
        String num = scan.next();

        int i =0;
        for(; i< a.length && !a[i].equalsIgnoreCase(num); i++){}

        if(i== a.length){
            System.out.println("nombre no encontrado");
        }else if(a[i].equalsIgnoreCase(num)) {
            System.out.println("nombre encontrado en la posición: " + i);
        }

    }
}
