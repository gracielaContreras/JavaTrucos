package arreglos;

public class ArreglosIrregulares {

    /**
     * 10
     * 10   20
     * 30   40   50
     * 50   50
     */

    public static void main(String[] args) {

        int arreglo[][] = new int[4][]; //4 equivale a la filas
        arreglo[0] = new int[1]; //tamaño del primer arreglo que es 1
        arreglo[0][0] = 10;

        arreglo[1] = new int[2]; //tamaño del segundo arreglo que es 2
        arreglo[1][0] = 10;
        arreglo[1][1] = 20;

        arreglo[2] = new int[3]; //tamaño del tercer arreglo que es 3
        arreglo[2][0] = 30;
        arreglo[2][1] = 40;
        arreglo[2][2] = 50;

        arreglo[3] = new int[2]; //tamaño del cuarto arreglo que es 2
        arreglo[3][0] = 50;
        arreglo[3][1] = 50;

        for (int i = 0; i < arreglo.length ; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                System.out.print(arreglo[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("***************************");
        // Otra forma de recorrerlo
        for (int[] a: arreglo) {
            for (int b: a) {
                System.out.print(b + "\t");
            }
            System.out.println();
        }


    }
}
