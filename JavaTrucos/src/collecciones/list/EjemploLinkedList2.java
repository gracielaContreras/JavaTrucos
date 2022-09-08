package collecciones.list;

import collecciones.set.models.Alumno;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class EjemploLinkedList2 {
    public static void main(String[] args) {
        LinkedList<Alumno> enlazada= new LinkedList<>();
        enlazada.add(new Alumno("Edu", 7));
        enlazada.add(new Alumno("Graci", 6));
        enlazada.add(new Alumno("Fanny", 7));
        enlazada.add(new Alumno("Ange", 6));
        System.out.println(enlazada);

        //El set reemplaza el valor que hay en la posición asignada
        enlazada.set(3, new Alumno("Emerita", 7));
        System.out.println(enlazada);

        enlazada.addFirst(new Alumno("Isaias", 5));
        enlazada.addLast(new Alumno("Estefani", 5));
        System.out.println(enlazada + " tamaño = " + enlazada.size());

        enlazada.removeFirst();
        enlazada.removeLast();
        System.out.println(enlazada + " tamaño = " + enlazada.size());

        Alumno a  = new Alumno("Dina", 7);
        enlazada.add(a);
        System.out.println(enlazada);
        System.out.println("Indice de Dina = " + enlazada.indexOf(a));

        // List Iterator
        ListIterator<Alumno> li = enlazada.listIterator();

        while (li.hasNext()){
            Alumno alumno = li.next();
            System.out.println(alumno);
        }
        System.out.println("=============Previous");
        while (li.hasPrevious()){
            Alumno alumno = li.previous();
            System.out.println(alumno);
        }

    }
}
