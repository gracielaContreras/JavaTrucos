package ejercicios;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Tarea3 {

    public static void main(String[] args) {
        List nombreCompleto = new ArrayList();
        int cantidadCaracteres = 0;
        String mensajeJOptionPane1 = "Ingrese nombre y apellido de  ";
        String mensajeJOptionPane2 = "miembro de la familia";
        String mensaje = " tiene el nombre más largo.";

        String nombreCompleto1 = JOptionPane.showInputDialog(mensajeJOptionPane1 + "1° " +mensajeJOptionPane2 );
        String nombreCompleto2 = JOptionPane.showInputDialog(mensajeJOptionPane1 + "2° " +mensajeJOptionPane2 );
        String nombreCompleto3 = JOptionPane.showInputDialog(mensajeJOptionPane1 + "3° " +mensajeJOptionPane2 );

        nombreCompleto.add(nombreCompleto1);
        nombreCompleto.add(nombreCompleto2);
        nombreCompleto.add(nombreCompleto3);

        int valo1 = ((String) nombreCompleto.get(0)).indexOf(" ");
        String nombre1 = ((String) nombreCompleto.get(0)).substring(0, valo1);

        int valo2 = ((String) nombreCompleto.get(1)).indexOf(" ");
        String nombre2 = ((String) nombreCompleto.get(1)).substring(0, valo2);

        int valo3 = ((String) nombreCompleto.get(2)).indexOf(" ");
        String nombre3 = ((String) nombreCompleto.get(2)).substring(0, valo3);

        cantidadCaracteres = (cantidadCaracteres > nombre1.length()) ? cantidadCaracteres : nombre1.length();

        cantidadCaracteres = (cantidadCaracteres > nombre2.length()) ? cantidadCaracteres : nombre2.length();

        cantidadCaracteres = (cantidadCaracteres > nombre3.length()) ? cantidadCaracteres : nombre3.length();

        if (cantidadCaracteres == nombre1.length()) {
            System.out.println(nombreCompleto1 + mensaje);
        } else if (cantidadCaracteres == nombre2.length()) {
            System.out.println(nombreCompleto2 + mensaje);
        } else if (cantidadCaracteres == nombre3.length()) {
            System.out.println(nombreCompleto3 + mensaje);
        }
    }
}
