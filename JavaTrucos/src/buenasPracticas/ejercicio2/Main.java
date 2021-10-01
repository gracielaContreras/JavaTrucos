package buenasPracticas.ejercicio2;

import java.util.ArrayList;

public class Main {

    /**
     * Como evitar las NullPointerException
     * @param args
     */

    public static void main(String[] args) {

        String miString = null;

        System.out.println("lunes".equals(miString));


        /**
         * Es buena práctica que trabajemos con colecciones vaciás en lugar de
         * colecciones null cuando queremos representar que no allá elementos en ella;
         */
/*        ArrayList<String> miLista = null;
        for(String palabra: miLista){

        }*/


    }
}
