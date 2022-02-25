package arreglos.tarea;

import java.util.Scanner;

public class ImprimirHistograma {

/** Escribir un programa que recorra un arreglo y genere un histograma en base a los valores de este.

    El arreglo debe contener 12 elementos que corresponden a números enteros de rango 1 al 6.

    Un histograma es una representación gráfica (de puntos o barra) de que tanto un elemento aparece
    en un conjunto de datos, es decir debe mostrar la frecuencia para todos los números del 1 al 6,
    incluso si no están presente en el arreglo.

    Por ejemplo para el arreglo {4, 3, 4, 6, 6, 4, 1, 4, 5, 4, 1, 1} el histograma debería ser:
            1: ***
            2:
            3: *
            4: *****
            5: *
            6: **
    Para la tarea usaremos el asterisco(*) como representación gráfica para el histograma.*/


    public static void main(String[] args) {

//        int[] a =  new int[] {4, 3, 4, 6, 6, 4, 1, 4, 5, 4, 1, 1};
        int[] a =  new int[12];
        Scanner scan =  new Scanner(System.in);

        for(int i = 0; i < a.length; i++){
            System.out.print("Ingrese un número del 1 al 6: ");
            a[i] = scan.nextInt();
        }

        for (int i = 1; i < 7; i++) {
            int cantidad = 0;
            for(int j = 0; j < a.length; j++) {
                if (i == a[j]) {
                    cantidad++;
                }
            }
            System.out.print(i + ": " );
            for (int k = 0; k < cantidad; k++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

// Ejercicio resuelto por el profesor
/*    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arreglo = new int[12];

        // ingreamos los datos por ejemplo {4, 3, 4, 6, 6, 4, 1, 4, 5, 4, 1, 1}
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese un numero de 1 a 6: ");
            arreglo[i] = scanner.nextInt();
        }
        // Creamos un segundo arreglo llamado arregloHistograma del tipo String y de largo 6.
        // Por cada numero del 1 al 6 contiene su Histograma con la representacion
        // grafica de las veces que se repite cada numero en el arreglo principal.
        String[] arregloHistograma = new String[6];

        // luego llenamos este segundo arreglo con el Histograma
        for (int i = 0; i < arregloHistograma.length; i++) {
            int aux = i + 1;
            String histograma = aux + ": ";
            for (int j = 0; j < arreglo.length; j++) {
                if (aux == arreglo[j]) {
                    histograma += "*";
                }
            }
            arregloHistograma[i] = histograma;
        }

        // finalmente mostramos el Histograma
        for (int i = 0; i < arregloHistograma.length; i++) {
            System.out.println(arregloHistograma[i]);
        }

    }*/
}
