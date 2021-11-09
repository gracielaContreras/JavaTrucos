package ejercicios;

import java.util.Scanner;

public class Tarea2 {
    public static void main(String[] args) {

        int capacidadMaxina = 70;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese capacidad actual del estanque");
        int capacidadActual = sc.nextInt();
        System.out.println("Capacidad actual es: "+ capacidadActual +" Litros");

        if( capacidadActual == capacidadMaxina ){
            System.out.println("Estanque lleno");
        }else if( capacidadActual >=60 && capacidadActual < 70 ){
            System.out.println("Estanque casi lleno");
        }else if( capacidadActual >=40 && capacidadActual < 60 ){
            System.out.println("Estanque  3/4");
        }else if( capacidadActual >=35 && capacidadActual < 40 ){
            System.out.println("Medio Estanque");
        }else if( capacidadActual >=20 && capacidadActual < 35 ){
            System.out.println("Medio Estanque");
        }else if( capacidadActual >=1 && capacidadActual < 20 ){
            System.out.println("Insuficiente");
        }

    }
}
