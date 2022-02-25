package arreglos;

import java.util.Arrays;

public class ReutilizandoAlgoritmoBurbuja {

    public static void sortBurbuja(Object[] arreglo){
        int total = arreglo.length;

        int contador = 0;

        // algoritmo burbuja(método optimizado)
        for(int i = 0; i <total -1; i++){

            for (int j = 0 ; j < total -1 -i; j++)
            {
                if(((Comparable)arreglo[j+1]).compareTo(arreglo[j]) < 0){
                    Object auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = auxiliar;
                }
                contador++;
            }
        }
    }


    public static void main(String[] args) {

        String[] productos = { "Kingston Pendrive 64GB", "Samsung Galaxy",
                "Disco duro SSD Samsung Externo", "Asus Notebook",
                "Macbook Air", "Chromcast 4ta generación", "Bicivleta Oxford"};

        int total = productos.length;


        //Arrays.sort(productos);   //opción 1 - ordenamiento

        //ordena los elementos en forma inversa
        //Collections.reverse(Arrays.asList(productos));  opción 2 - ordenamiento

        sortBurbuja(productos);   //opción 3 - ordenamiento

        System.out.println("=== Usando for ==");
        for (int i = 0; i < total; i ++){
            System.out.println("para indice " + i + " : " + productos[i]);
        }

        Integer[] numeros = new Integer[4];

        numeros[0] = 10;
        numeros[1] = Integer.valueOf("7");
        numeros[2] = 35;
        numeros[3] = -1;

        sortBurbuja(numeros);   //opción 3 - ordenamiento

        System.out.println("=== Usando for ==");
        for (int i = 0; i < numeros.length; i ++){
            System.out.println("i " + i + " : " + numeros[i]);
        }

    }
}
