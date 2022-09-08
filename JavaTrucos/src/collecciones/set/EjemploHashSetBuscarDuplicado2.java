package collecciones.set;

import java.util.HashSet;

public class EjemploHashSetBuscarDuplicado2 {
    public static void main(String[] args) {
        String[] peces = {"Corvina", "Lenguado", "Pejerrey", "Atún", "Lenguado", "Corvina"};

//        HashSet<String> unicos = new HashSet<String>(List.of(peces));
        HashSet<String> unicos = new HashSet<>();
        HashSet<String> duplicados = new HashSet<>();
        for (String pez : peces){
            if(!unicos.add(pez)){ //detecta el elemento duplicado
                duplicados.add(pez);
            }
        }
        unicos.removeAll(duplicados); //elimina todos los elementos duplicados

        System.out.println("Unicos: " +unicos);
        System.out.println("Duplicados: " +duplicados);
    }
}
