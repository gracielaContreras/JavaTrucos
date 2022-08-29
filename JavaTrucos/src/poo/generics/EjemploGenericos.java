package poo.generics;

import poo.interfacesRepositorio.modelo.Cliente;
import java.util.*;

public class EjemploGenericos {
    public static void main(String[] args) {

        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Eduardo", "Escobar"));
        clientes.add(new Cliente("Graciela", "Contreras"));

        Cliente[] clienteArreglo = {new Cliente("Graciela", "Contreras"),new Cliente("Eduardo", "Escobar") };

        Integer[] enterosArreglo = { 1, 2, 3 };

        List<Cliente> clienteLista = fromArrayToList(clienteArreglo);
        List<Integer> enteroLista = fromArrayToList(enterosArreglo);

        clienteLista.forEach(System.out::println);
        enteroLista.forEach(System.out::println);

        System.out.println("====== sobrecarga de método ======");
        List<String> nombres = fromArrayToList(new String[]{"Edu", "Gracy", "Ange"}, enterosArreglo);
        nombres.forEach(System.out::println);

        System.out.println("Máximo de 1, 9 y 4 es: " + maximo(1, 9, 4));
        System.out.println("Máximo de 3.9, 11.6 y 7.78 es: " + maximo(3.9, 11.6, 7.78));
        System.out.println("Máximo según el orden del abecedario de zanahoria, arándanos, manzana es: "
                + maximo("zanahoria", "arándanos", "manzana"));

    }

    public static <T> List<T> fromArrayToList(T[] c){
        return Arrays.asList(c);
    }

    public static <T extends Number, G> List<T> fromArrayToList(T[] c, G[] g){
        //Método genérico con límites con herencia (extends)
        for (G elemento: g ) {
            System.out.println(elemento);
        }
        return Arrays.asList(c);
    }

    public static <T, G> List<T> fromArrayToList(T[] c, G[] g){
        for (G elemento: g ) {
            System.out.println(elemento);
        }
        return Arrays.asList(c);
    }

    public static <T extends Comparable<T>> T maximo(T a, T b, T c){
        T max = a;
        if(b.compareTo(max) > 0){
            max = b;
        }
        if(c.compareTo(max) > 0){
            max = c;
        }
        return max;
    }
}
