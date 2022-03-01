package matrices;

public class EjemploMatricesColumnaVariable {
    public static void main(String[] args) {

        int[][] matriz = new int[3][];

        matriz[0] = new int[2];
        matriz[1] = new int[3];
        matriz[2] = new int[4];

        //asigna valor a la matriz
        for ( int i = 0; i < matriz.length; i++ ){
            for ( int j = 0; j < matriz[i].length; j++ ){
                matriz[i][j] = i*j;
            }
        }
        //recorre y muestra por consola el resultado
        for( int[] lista: matriz ){
            for ( int columna : lista ){
                System.out.print(columna + "\t");
            }
            System.out.println();
        }
    }
}
