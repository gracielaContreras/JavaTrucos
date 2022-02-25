package arreglos;

import java.util.Arrays;
import java.util.Collections;

public class EjemploArreglosForInversoMutable {

    public static void main(String[] args) {

        String[] productos = { "Kingston Pendrive 64GB", "Samsung Galaxy",
                "Disco duro SSD Samsung Externo", "Asus Notebook",
                "Macbook Air", "Chromcast 4ta generación", "Bicivleta Oxford"};

        int total = productos.length;

        Arrays.sort(productos);

        //ordena los elementos en forma inversa
        Collections.reverse(Arrays.asList(productos));

        System.out.println("=== Usando for ==");
        for (int i = 0; i < total; i ++){
            System.out.println("para indice " + i + " : " + productos[i]);
        }
    }
}
