package collecciones.set.models;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSetComparable {
    public static void main(String[] args) {
        Set<Alumno> s= new TreeSet<Alumno>((a, b) -> {
            return a.getNombre().compareTo(b.getNombre());
        });
        s.add(new Alumno("Edu", 7));
        s.add(new Alumno("Graci", 6));
        s.add(new Alumno("Fanny", 7));
        s.add(new Alumno("Ange", 5));

        System.out.println(s);
    }
}
