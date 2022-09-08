package collecciones.list;

import collecciones.set.models.Alumno;
import java.util.ArrayList;
import static java.util.Comparator.comparing;
import java.util.List;

public class EjemploListComparableComparator {
    public static void main(String[] args) {
        List<Alumno> s= new ArrayList<>();
        s.add(new Alumno("Edu", 7));
        s.add(new Alumno("Graci", 6));
        s.add(new Alumno("Fanny", 7));
        s.add(new Alumno("Ange", 6));
        s.add(new Alumno("Ange", 6));
        Alumno al = new Alumno("Alvaro", 5);
        s.add(al);
        s.add(al);
        // 1° opción de ordenamiento Ascendente
        s.sort(comparing(Alumno::getNombre));
        System.out.println(s);
        // 2° opción de ordenamiento Ascendente
        s.sort((a, b) -> a.getNombre().compareTo(b.getNombre())); //Con expresiones lambda
        System.out.println(s);
        // 3° opción de ordenamiento Descendente
        System.out.println("====Descendente Nota=====");
        s.sort(comparing(Alumno::getNota).reversed()); //static interfaz Comparator + método de referencia
        System.out.println(s);
        // 4° opción de ordenamiento Descendente
        System.out.println("====Descendente Nota=====");
        //static interfaz Comparator + expresiones lambda(programación funcional)
        s.sort(comparing((Alumno a ) -> a.getNota()).reversed());
        System.out.println(s);
    }
}
