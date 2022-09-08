package collecciones.map;

import java.util.HashMap;
import java.util.Map;

/**
 * Ejemplo de HashMap con valores de tipo Objeto y relaciones de objetos
 */

public class EjemploHasMap3Object {
    public static void main(String[] args) {
        Map<String, Object> persona = new HashMap<>();
        persona.put("nombre", "Graciela");
        persona.put("apellido", "Contreras");

        //Map anidado
        Map<String, String> direccion = new HashMap<>();
        direccion.put("pais", "USA");
        direccion.put("ciudad", "Santa Barbara");
        direccion.put("calle", "One Street");
        direccion.put("numero", "20");
        direccion.put("estado", "California");

        persona.put("direccion", direccion);

        System.out.println("El pais de "+ persona.get("nombre") + " es= " + direccion.get("pais"));
        System.out.println("La ciudad de "+ persona.get("nombre") + " es= " + direccion.get("ciudad"));
        System.out.println("La calle de "+ persona.get("nombre") + " es= " + direccion.get("calle"));
        System.out.println();
        System.out.println("====== Iterar con: entrySet=====");
        for( Map.Entry<String, Object> par : persona.entrySet() ) {
            Object valor = par.getValue();

            if( valor instanceof Map ){
                Map<String, String> direccionMap = ((Map<String, String>) persona.get("direccion"));
                //1° forma de iterar con :entrySet
                for( Map.Entry<String, String> parDir: direccionMap.entrySet() ){
                    System.out.println(parDir.getKey() + " => " + parDir.getValue());
                }
                //2° forma de iterar con :Java 8 forEach
/*                ((Map<String, String>) valor).forEach((llave2, valor2) ->{
                    System.out.println(llave2 + " =>> "+ valor2);
                });*/

            } else {
                System.out.println(par.getKey() + " : " + par.getValue());
            }
        }

        System.out.println("====== Iterar con: Java 8 forEach=====");
        persona.forEach((llave, valor) -> {
            System.out.println(llave + " => " +valor);
        });
        System.out.println();
        System.out.println("Total : " + persona.size());
        System.out.println("Contiene elementos: " + !persona.isEmpty());
    }
}
