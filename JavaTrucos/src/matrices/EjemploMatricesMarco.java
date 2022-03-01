package matrices;

public class EjemploMatricesMarco {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];

        for ( int i = 0; i < matriz.length; i ++ ){
            for ( int j = 0; j < matriz[i].length; j++ ){
                if( i == 0 // Primera fila
                        || i == ( matriz[i].length -1 )  // última fila
                        || j == 0 // Primera columna
                        || j == ( matriz.length -1 )  // última columna
                        || i == j  //diagonal
                ){
                    matriz[i][j] = 1;
                }
            }
        }
        for( int[] lista : matriz ){
            for ( int columna : lista ){
                System.out.print( columna + "\t" );
            }
            System.out.println();
        }

    }
}
