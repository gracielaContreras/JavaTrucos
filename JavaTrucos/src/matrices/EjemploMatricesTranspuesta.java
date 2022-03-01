package matrices;

public class EjemploMatricesTranspuesta {
/**    matriz traspuesta es aquella que surge como resultado de realizar un cambio de columnas
    por filas y filas por columnas en la matriz original, generándose una nueva matriz (a la que llamamos traspuesta).*/
    public static void main(String[] args) {
        int[][] matriz = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12},
                { 13, 14, 15, 16}
        };
        System.out.println("Matriz original");
        for ( int[] lista: matriz ){
            for ( int columna : lista ){
                System.out.print(columna + "\t");
            }
            System.out.println();
        }
        int auxiliar;
        for ( int i = 1; i < matriz.length; i++){
            for ( int j = 0; j < i; j++){
                auxiliar = matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i] = auxiliar;
            }
        }
        System.out.println("Matriz transpuesta");
        for ( int[] lista: matriz ){
            for ( int columna : lista ){
                System.out.print(columna + "\t");
            }
            System.out.println();
        }
    }
}
