package expresionesLambda.tarea.numero2;

import expresionesLambda.tarea.numero1.Conversion;
import expresionesLambda.tarea.numero1.ConversionFrase;
import java.util.*;

public class MainQueCuentaLaCantidadDeVeces {
    public static void main(String[] args) {
        Map<String, Integer> resultado = new HashMap();
        List<String> frases = Arrays.asList("Aprender un poco cada día marca la diferencia",
                "Aprender un poco cada día marca la diferencia", "Reserva tiempo para aprender",
                "Alcanza tus objetivos", "Curso Java", "Curso Java", "Curso Java");
        Conversion conversion = a -> a.replace(" ", "").replace(",", "")
                .replace(".", "").toUpperCase();

        ConversionFrase conv = new ConversionFrase();

        for ( String frase : frases) {
            int contador = 1;
            for ( String fraseBusqueda : frases) {
                if ( frase.equalsIgnoreCase(fraseBusqueda) ) {
                    resultado.put(fraseBusqueda, contador++);
                }
            }
        }
        System.out.println("Frases: "+resultado);
        int valorMayor = ( Collections.max( resultado.values() ) ); //obtiene el valor mayor del map

        resultado.forEach(( llave, valor ) -> {
            if ( valor == valorMayor ) System.out.println("La frase '" +
                    conv.conversionFrase(llave, conversion) + "' se repite : " + valor + " veces");
        });
    }
}
