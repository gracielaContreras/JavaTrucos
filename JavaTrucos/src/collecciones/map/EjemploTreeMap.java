package collecciones.map;

import java.util.TreeMap;

public class EjemploTreeMap {
    public static void main(String[] args) {
        TreeMap<String,String> map =  new TreeMap<>();

        map.put("Zi zu", "Futbolista");
        map.put("Alex", "Programador");
        map.put("Alex", "Programador22");
        //sobreescribe el anterior valor, ya que no permite llaves duplicadas
        map.put("Juan", "Persona Feliz");

        System.out.println(map);
        System.out.println("Imprime primer llave y valor : " + map.firstEntry());
        System.out.println("Imprime primer llave : " + map.firstEntry().getKey());
        System.out.println("Imprime True si encontro el valor 'Juan' : " + map.containsKey("Juan"));
        System.out.println("Imprime solo llaves :" + map.keySet());

    }
}
