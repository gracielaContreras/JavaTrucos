package collecciones.set.models;

import java.util.Objects;

public class Alumno implements Comparable<Alumno>{

    private String nombre;
    private int nota;

    public Alumno(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return "Alumno {" +
                "nombre='" + nombre + '\'' +
                ", nota=" + nota +
                '}' +"\n";
    }

    @Override
    public int compareTo(Alumno a) {
        return this.nombre.compareTo(a.getNombre());
    }
}
