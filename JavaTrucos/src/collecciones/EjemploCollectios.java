package collecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EjemploCollectios {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
        nombres.add("Chabelita");
        nombres.add("Rocky");
        nombres.add("Alex");
        Collections.sort(nombres); //ordena la lista de forma ascendente
        int index = Collections.binarySearch(nombres, "Rocky");
        System.out.println(nombres);
        System.out.println(nombres.get(index));
    }
}
