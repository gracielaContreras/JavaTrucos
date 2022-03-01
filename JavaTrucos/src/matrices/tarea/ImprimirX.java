package matrices.tarea;

public class ImprimirX {
/**    Escribir un programa que imprima una X construida a base de la letra X en las diagonales de la matriz y
    utilizar el carácter guion bajo como relleno. El tamaño de la x se basa en una variable n que indicará el
    tamaño de la letra para imprimir en una matriz de n x n.

    El carácter "X" en mayúscula y el guion bajo "_" para los espacios.
    Por ejemplo para n=5 se obtiene:
    1| X___X
    2| _X_X_
    3| __X__
    4| _X_X_
    5| X___X
    Por ejemplo para n=6 se obtiene:
    1| X____X
    2| _X__X_
    3| __XX__
    4| __XX__
    5| _X__X_
    6| X____X
    Si n es igual a cero imprimir "ERROR" y finalizar la ejecución del programa.*/
    public static void main(String[] args) {
        int n = 5;
        String[][] matriz = new String[n][n];

        if(n != 0){
            for( int i = 0; i < matriz.length; i++ ){
                int aux = matriz.length;
                for ( int j = 0; j < matriz[i].length; j ++ ){
                    aux--;

                    if( i == j || i == aux ){
                        matriz[i][j] = "X";
                    }else {
                        matriz[i][j] = "_";
                    }
                    System.out.print( matriz[i][j] + "\t" );
                }
                System.out.println();
            }
        }else {
            System.out.println( "ERROR" );
        }
    }
//Ejercicio resuelto por profesor
/*    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la matriz (n x n): ");
        int n = scanner.nextInt();

        if (n == 0) {
            System.out.println("ERROR");
            System.exit(1);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i == j || (j == n - i - 1)) {
                    System.out.print("X");
                } else {
                    System.out.print("_");
                }
            }
            System.out.println();
        }
    }*/
}
