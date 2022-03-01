package matrices.tarea;

import java.util.Scanner;

public class ImprimirUnSilla {
/**    Escribir un programa para una matriz de n x n e imprima en ella una silla (o letra h minúscula)
    construida a base del numero 1 y utilizar el numero 0 como espacio.
    El tamaño de la silla se basa en una variable n que indicará el tamaño de la figura a imprimir en
    una matriz de n x n.

    Por ejemplo para n=5 se obtiene:

    1| 10000
    2| 10000
    3| 11111
    4| 10001
    5| 10001
    Por ejemplo para n=6 se obtiene:

    1| 100000
    2| 100000
    3| 100000
    4| 111111
    5| 100001
    6| 100001
    Por ejemplo para n=10 se obtiene:

    1| 1000000000
    2| 1000000000
    3| 1000000000
    4| 1000000000
    5| 1000000000
    6| 1111111111
    7| 1000000001
    8| 1000000001
    9| 1000000001
    10| 1000000001
    Si n es igual a cero imprimir "ERROR" y finalizar la ejecución del programa.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la matriz (n x n): ");
        int n = scanner.nextInt();
        int[][] matriz = new int[n][n];
        int aux = matriz.length /2;
        int aux2 = 0;
        if (n == 0) {
            System.out.println("ERROR");
            System.exit(1);
        }

        for( int i = 0; i < matriz.length; i++ ){
            for ( int j = 0; j < matriz[i].length; j ++ ){

                if( j == 0 ){ // Primera columna
                    matriz[i][j] = 1;
                }
                if( i == aux && (j == aux2)){ // mitad columna y fila
                    matriz[i][j] = 1;
                    aux2++;
                }
                if( i == aux && j == ( matriz[i].length -1) ){  // mitad de última fila
                    matriz[i][j] = 1;
                    aux = i+1;
                }
                System.out.print( matriz[i][j] + "\t" );
            }
            System.out.println();
        }
    }
//Ejercicio resuelto por profesor
/*    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la matriz (n x n): ");
        int n = scanner.nextInt();
        int[][] matriz = new int[n][n];

        if (n == 0) {
            System.out.println("ERROR");
            System.exit(1);
        }

        // llenamos la matriz de n x n con la figura de una silla en base al
        // numero 1
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if ((j == 0) || (i == n / 2 && j != 0 && j != n - 1) || (j == n - 1 && i >= n / 2)) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }

        }

        // recorremos e mostramos los elementos de la matriz para imprimir la
        // figura de una silla
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }*/

}
/* mitad diagonal( (aux == i && i ==j))*/

