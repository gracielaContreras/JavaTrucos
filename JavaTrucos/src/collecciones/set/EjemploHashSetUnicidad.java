package collecciones.set;

import collecciones.set.models.Alumno;
import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetUnicidad {
    public static void main(String[] args) {
        Set<Alumno> s= new HashSet<>();
        s.add(new Alumno("Edu", 7));
        s.add(new Alumno("Graci", 6));
        s.add(new Alumno("Fanny", 7));
        s.add(new Alumno("Ange", 6));
        s.add(new Alumno("Ange", 6));
        Alumno a = new Alumno("Alvaro", 5);
        s.add(a);
        s.add(a);
        System.out.println(s);
    }
}
