package arreglos;

import java.util.Arrays;
import java.util.Collections;

public class OrdenamientoAlgoritmoBurbuja {

    public static void main(String[] args) {

        String[] productos = { "Kingston Pendrive 64GB", "Samsung Galaxy",
                "Disco duro SSD Samsung Externo", "Asus Notebook",
                "Macbook Air", "Chromcast 4ta generación", "Bicivleta Oxford"};

        int total = productos.length;

        //metodo burbuja

        int contador = 0;

/*        Opcion 1 - algoritmo burbuja
        for(int i = 0; i <total; i++){
            for (int j = 0 ; j < total; j++)
            {
                if(productos[i].compareTo(productos[j]) < 0){
                    String auxiliar = productos[i];
                    productos[i] = productos[j];
                    productos[j] = auxiliar;
                }
                contador++;
            }
        }*/
      //  Opcion 2 - algoritmo burbuja(método optimizado)
        for(int i = 0; i <total -1; i++){

            for (int j = 0 ; j < total -1 -i; j++)
            {
                if(productos[j+1].compareTo(productos[j]) < 0){
                    String auxiliar = productos[j];
                    productos[j] = productos[j+1];
                    productos[j+1] = auxiliar;
                }
                contador++;
            }
        }

        System.out.println("contador = " + contador);

        //Arrays.sort(productos);

        //ordena los elementos en forma inversa
        //Collections.reverse(Arrays.asList(productos));

        System.out.println("=== Usando for ==");
        for (int i = 0; i < total; i ++){
            System.out.println("para indice " + i + " : " + productos[i]);
        }
    }
}
