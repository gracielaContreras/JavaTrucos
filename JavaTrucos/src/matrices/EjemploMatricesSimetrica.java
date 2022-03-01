package matrices;

public class EjemploMatricesSimetrica {
//  Matriz Simétrica: La diagonal superior es una replica a la diagonal inferior

    public static void main(String[] args) {
        int[][] matriz = {
                { 1, 2, 3, 4 },
                { 2, 1, 0, 5 },
                { 3, 0, 1, 6 },
                { 4, 5, 6, 7 }
        };
        boolean simetrica = true;
        salir : for ( int i = 0; i < matriz.length; i++ ){
            for ( int j = 0; j < i /* o matriz[i].length*/ ; j++ ){
                if( matriz[i][j] != matriz[j][i] ){
                    simetrica = false;
                    break salir;
                }
            }
        }

        if( simetrica ){
            System.out.println("La matriz es simétrica");
        } else {
            System.out.println("La matriz no es simétrica");
        }
    }
}
