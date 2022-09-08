package collecciones.list;

import collecciones.set.models.Alumno;

import java.util.ArrayList;
import java.util.List;

public class EjemploArrayList {
    public static void main(String[] args) {
        List<Alumno> al= new ArrayList<>();
        al.add(new Alumno("Edu", 7));
        al.add(new Alumno("Graci", 6));
        al.add(new Alumno("Fanny", 7));
        al.add(0, new Alumno("Ange", 7)); //Agregar a Ange en la posición 0
        al.add(new Alumno("Ange", 6));
        System.out.println(al);

        //Para utilizar esta forma de eliminar, en el Objeto Alumno hay que sobrescribir el método equals
        // al.remove(new Alumno("Fanny", 7));

        al.remove(3);
        System.out.println(al);

        boolean b = al.contains(new Alumno("Fanny", 7));
        System.out.println("La lista contiene a Fanny = " + b);

        System.out.println("Convertir la Lista en un Arreglo");
        Object arr[] = al.toArray();
        for(Object a : arr){
            System.out.print(a);
        }


    }
}
