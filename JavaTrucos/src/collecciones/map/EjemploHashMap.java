package collecciones.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class EjemploHashMap {
    public static void main(String[] args) {
        Map<String,String> diccionario = new HashMap<>();
        //diccionario.put( LLAVE, VALOR );
        diccionario.put("raidentrance", "Es la cuenta de twitter del instructor");
        diccionario.put("Java", "Es el lenguaje que estamos aprendiendo");
        diccionario.put("Java", "Es el lenguaje que estamos aprendiendo2");
        //sobreescribe el anterior valor, ya que no permite llaves duplicadas

        diccionario.put(null, "Representa la ausencia de un objeto");
        System.out.println(diccionario);

        System.out.println("Recorriendo diccionario con For each ");
        //Primera forma de recorrer un mapa
        for (String llave: diccionario.keySet()) {
            System.out.println(llave + " = " + diccionario.get(llave));
        }
        //Segunda forma de recorrer un mapa
        for(Entry<String,String> entry : diccionario.entrySet()){
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
