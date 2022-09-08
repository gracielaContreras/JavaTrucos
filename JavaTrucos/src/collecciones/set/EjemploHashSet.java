package collecciones.set;

import java.util.HashSet;

public class EjemploHashSet {
    public static void main(String[] args) {
        HashSet<String> nombres = new HashSet<>();
        nombres.add("raidentrance");
        nombres.add("raidentrance");
        nombres.add("devs4j");
        nombres.add(null);
        System.out.println(nombres);
    }
}
