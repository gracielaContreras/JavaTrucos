package collecciones.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Mapas ordenados por defecto solo llaves
 * no puede guardar null en la llave
 */
public class EjemploTreeMap2 {
    public static void main(String[] args) {
        Map<String, Object> persona = new TreeMap<>(Comparator.comparing(String::length)); //orden por el tamaño de la llave
        //Map<String, Object> persona = new TreeMap<>(Comparator.reverseOrder());
        persona.put("nombre", "Graciela");
        persona.put("apellido", "Contreras");
        persona.put("edad", 28);

        //Map anidado
        Map<String, String> direccion = new HashMap<>();
        direccion.put("pais", "USA");
        direccion.put("ciudad", "Santa Barbara");
        direccion.put("calle", "One Street");
        direccion.put("numero", "20");
        direccion.put("estado", "California");

        persona.put("direccion", direccion);

        System.out.println(persona);
    }
}
