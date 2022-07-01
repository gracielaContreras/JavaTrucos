package collecciones;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
class Gato {

    private String nombre;
    private String apellido;

    public Gato(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    @Override
    public String toString() {
        return "Gato{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}
class OrdenamientoPorNombre implements Comparator<Gato> {
    @Override
    public int compare(Gato o1, Gato o2) {
        return o1.getNombre().compareTo(o2.getNombre());
    }
}
class OrdenamientoPorApellido implements Comparator<Gato>{
    @Override
    public int compare(Gato o1, Gato o2) {
        return o1.getApellido().compareTo(o2.getApellido());
    }
}

public class EjemploComparator {
    public static void main(String[] args) {

        Set<Gato> set = new TreeSet<>(new OrdenamientoPorNombre());
        set.add(new Gato("sofi", "aliz"));
        set.add(new Gato("anto", "guzman"));
        set.add(new Gato("zufi", "cat"));
        System.out.println(set);
        System.out.println("-------------------------------------");
        Set<Gato> set2 = new TreeSet<>(new OrdenamientoPorApellido());
        set2.add(new Gato("sofi", "aliz"));
        set2.add(new Gato("anto", "guzman"));
        set2.add(new Gato("zufi", "cat"));
        System.out.println(set2);
    }
}
