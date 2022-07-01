package collecciones;

import java.util.TreeSet;

class Perro implements Comparable<Perro>{

    private String nombre;

    public Perro(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String toString() {
        return "Perro{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
    @Override
    public int compareTo(Perro perro) {
        return nombre.compareTo(perro.getNombre()); //Modo ascendente
        //  return perro.getNombre().compareTo(nombre); //Modo descendente
    }
}
public class EjemploComparables {
    public static void main(String[] args) {
        TreeSet<Perro> nombres = new TreeSet<>();
        nombres.add(new Perro("Zhabelita"));
        nombres.add(new Perro("Chabelita"));
        nombres.add(new Perro("Rocky"));
        System.out.println(nombres);
    }
}
