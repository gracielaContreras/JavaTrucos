package arreglos.tarea;

import java.util.Scanner;

public class OrdenarElementos {

/**  Leer 10 números enteros desde el teclado para llenar un arreglo de 10 elementos.
     Luego debemos mostrarlos en el siguiente orden:
     el último, el primero, el penúltimo, el segundo, el antepenúltimo, el tercero, y así sucesivamente.*/

    public static void main(String[] args) {

        int[] a = new int[10];
        Scanner scan =  new Scanner(System.in);

        for(int i = 0; i < a.length; i++){
            System.out.print("Ingrese un numero: ");
            a[i] = scan.nextInt();
        }

        for(int i = 0; i < a.length /2; i++){

            System.out.println(a[(a.length - 1) - i]);
            System.out.println(a[i]);
        }

    }
//    Ejemplo del instructor
/** Scanner scanner = new Scanner(System.in);
    int i, arreglo[];
    arreglo = new int[10];
        for (i = 0; i < 10; i++) {
        System.out.println("Ingrese un numero: ");
        arreglo[i] = scanner.nextInt();
    }

    // como en cada iteración del for se muestran dos números
    // solo necesitaremos recorrer la mitad de iteraciones, con eso es suficiente.
        System.out.println("El resultado es:");
        for (i = 0; i <= 4; i++) {
        System.out.println(arreglo[9 - i]); // y el i-ésimo por el final
        System.out.println(arreglo[i]); // mostramos el i-ésimo número por el principio
    }*/
}
