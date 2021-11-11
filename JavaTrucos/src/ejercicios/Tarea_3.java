package ejercicios;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tarea_3 {

    public static void main(String[] args) {

        /*pendiente*/

        List nombreCompleto = new ArrayList();
        for( int i = 1 ; i < 4; i++ ) {

            String m = JOptionPane.showInputDialog("Ingrese " + i+ "° nombre y apellido del miebro de la familia" );
            nombreCompleto.add(m);
            System.out.println(m);

        }
        int cantidad = nombreCompleto.size();
        for (int i = 1 ; i < cantidad; i++ ) {

            nombreCompleto.get(i);

            /*List nuevo = List.of(((String) nombreCompleto.get(i)).split(" "));
            nuevo.get(0)*/
            Arrays.stream(((String) nombreCompleto.get(i)).split(" ")).findFirst();

        }

      System.out.println(nombreCompleto);
    }
}
