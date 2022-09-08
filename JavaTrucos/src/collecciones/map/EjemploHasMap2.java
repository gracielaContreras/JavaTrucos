package collecciones.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class EjemploHasMap2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("nombre", "Graciela");
        map.put("apellido", "Contreras");
        map.put("ciudad", "Los Angeles");

        System.out.println("Nombre: "+ map.get("nombre"));
        System.out.println("Solo valores: "+ map.values());
        System.out.println(map);
        System.out.println();
        System.out.println("====== Imprimir solo Llave del Map con: keySet=====");
        for(String llave : map.keySet()){
            System.out.println(llave);
            if(llave.contains("nombre")){
                System.out.println("Se encontró la llave " + llave);
                map.replace("nombre", "fanny");
                System.out.println("Se reemplazo valor de " +llave +" por= "+map.get(llave));
            }
        }
        System.out.println();
        System.out.println("====== Imprimir solo valores del Map con: values=====");
        for(String valor : map.values()){
            System.out.println(valor);
        }
        System.out.println("====== Iterar con: values=====");
        Collection<String> valores = map.values();
        for(String v :valores){
            System.out.println("valor= " +v);
        }
        System.out.println("====== Iterar con: entrySet=====");
        for(Map.Entry<String, String> par : map.entrySet()) {
            System.out.println(par.getKey() +" => " + par.getValue());
        }
        System.out.println("====== Iterar con: keySet=====");
        for(String llave :map.keySet()){
            String valor = map.get(llave);
            System.out.println(llave + " => " +valor);
        }
        System.out.println("====== Iterar con: Java 8 forEach=====");
        map.forEach((llave, valor) -> {
            System.out.println(llave + " => " +valor);
        });
        System.out.println();
        System.out.println("Total : " + map.size());
        System.out.println("Contiene elementos: " + !map.isEmpty());
    }
}
