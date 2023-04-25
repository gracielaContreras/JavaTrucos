package Java8Features.lambdas.comparator;

import java.util.*;

public class PruebaComparator {
    public static void main(String[] args) {
        // 1° forma
        Comparator<Persona> comparator = ( p1, p2) -> {
            return p1.getNombre().compareTo(p2.getNombre());
        };
        //        Comparator<Persona> comparator2 = Comparator.comparing(Persona::getNombre);
        Set<Persona> lista = new TreeSet<>(comparator);

        lista.add(new Persona("Dina", "Ortiz", 54));
        lista.add(new Persona("Angela", "Contreras", 37));
        lista.add(new Persona("Eduardo", "Escobar", 35));

        System.out.print(lista);
        System.out.println();

        // 2° forma
        List<Persona> personas= new ArrayList<>();

        personas.add(new Persona("Dina", "Ortiz", 54));
        personas.add(new Persona("Eduardo", "Escobar", 35));
        personas.add(new Persona("Angela", "Contreras", 37));

        personas.sort(Comparator.comparing(Persona::getNombre));
        System.out.println(personas);
        System.out.println();

        personas.sort(Comparator.comparing(Persona::getEdad));
        System.out.println(personas);
    }
}
