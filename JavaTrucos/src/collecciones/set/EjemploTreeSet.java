package collecciones.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * TreeSet ordena elementos en forma alfabéticamente y números
 * y elimina los elementos duplicados
 * se ve afectado la performance
 */

public class EjemploTreeSet {
    public static void main(String[] args) {

        Set<String> ts = new TreeSet<>();
        ts.add("uno");
        ts.add("dos");
        ts.add("tres");
        ts.add("cuatro");
        ts.add("cinco");
        ts.add("tres");

        System.out.println(ts);

        Set<Integer> numeros = new TreeSet<>();
        numeros.add(1);
        numeros.add(5);
        numeros.add(4);
        numeros.add(2);
        numeros.add(3);
        numeros.add(10);

        System.out.println(numeros);

        System.out.println("Ordenar de forma descendente");
        //se utiliza la interfaz Comparable
        // 1° forma de ordenar con expression lambda
        Set<String> tsDescendente = new TreeSet<>( (a, b) -> b.compareTo(a));
        tsDescendente.add("uno");
        tsDescendente.add("dos");
        tsDescendente.add("tres");
        tsDescendente.add("cuatro");
        tsDescendente.add("cinco");
        tsDescendente.add("tres");

        System.out.println(tsDescendente);
        //se utiliza la interfaz Comparable
        // 2° forma de ordenar con el método Comparator.reverseOrder()
        Set<Integer> numerosDescendente = new TreeSet<>(Comparator.reverseOrder());
        numerosDescendente.add(1);
        numerosDescendente.add(5);
        numerosDescendente.add(4);
        numerosDescendente.add(2);
        numerosDescendente.add(3);
        numerosDescendente.add(10);

        System.out.println(numerosDescendente);



    }
}
