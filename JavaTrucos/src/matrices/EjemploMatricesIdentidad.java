package matrices;

public class EjemploMatricesIdentidad {
// Matrices Identidad: es una Matriz diagonal
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];

        for ( int i = 0; i < matriz.length; i ++){
            for ( int j = 0; j < matriz[i].length; j++){
                if(i == j){
                    matriz[i][j] = 1;
                }
            }
        }
        for( int[] lista : matriz){
            for ( int columna : lista){
                System.out.print(columna + "\t");
            }
            System.out.println();
        }

    }
}
