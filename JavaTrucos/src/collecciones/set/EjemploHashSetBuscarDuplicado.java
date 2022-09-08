package collecciones.set;

import java.util.HashSet;

public class EjemploHashSetBuscarDuplicado {
    public static void main(String[] args) {
        String[] peces = {"Corvina", "Lenguado", "Pejerrey", "Atún", "Lenguado", "Corvina"};

//        HashSet<String> unicos = new HashSet<String>(List.of(peces));
        HashSet<String> unicos = new HashSet<>();
        for (String pez : peces){
            if(!unicos.add(pez)){
                System.out.println("Elemento duplicado: " + pez);
            }
        }
        System.out.println(unicos.size() + " elementos no duplicados :" +unicos);
    }
}
