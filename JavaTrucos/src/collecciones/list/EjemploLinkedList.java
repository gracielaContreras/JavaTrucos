package collecciones.list;

import java.util.LinkedList;

public class EjemploLinkedList {
    public static void main(String[] args) {
        LinkedList<String> lista = new LinkedList<>();
        lista.add("raidentrance");
        lista.add("devs4j");
        lista.add("devs4j2");

        System.out.println(lista.poll()); //remueve el primer registro
        System.out.println(lista.getFirst()); //imprime el primer valor de la lista
        System.out.println(lista.getLast()); //imprime el último valor de la lista

        // Generate random number between 0 to 20
        int a = (int) (Math.random() * 2);
        int b = (int) (Math.random() * 2);
        // Output is different every time this code is executed
        System.out.println(a);
        System.out.println(b);
    }
}
