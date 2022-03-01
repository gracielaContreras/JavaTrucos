package matrices;

public class EjemploMatricesBuscar {
    public static void main(String[] args) {
        int[][] matrizDeEnteros = {
                { 35, 90, 3, 1978},
                { 15, 2020, 10, 5},
                { 677, 127, 32767, 1999}
        };

        int elemntoBuscar = 15;
        boolean encontrado = false;
        int i;
        int j = 0;
        buscar : for (i = 0; i < matrizDeEnteros.length; i++ ){
            for (j = 0; j < matrizDeEnteros[i].length; j++){
                if(matrizDeEnteros[i][j] == elemntoBuscar){
                    encontrado = true;
                    break buscar;
                }
            }
        }

        if(encontrado){
            System.out.println("Encontrado " + elemntoBuscar + " en las coordenadas [" + i + "," +j + "] en la matriz");
        }else {
            System.out.println(elemntoBuscar + " no se encontró en la matriz ");
        }


    }
}
