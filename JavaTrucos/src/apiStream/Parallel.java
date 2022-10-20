package apiStream;

import apiStream.models.Usuario;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

/** Parallel
 * Maneja un pool de Thread.
 */

public class Parallel {
    public static void main(String[] args) {

        List<Usuario> lista = new ArrayList<>();
        agregarElementos(lista);

        long inicial = System.currentTimeMillis();
        String resultado = lista.stream()
                .parallel()
                .map(usuario ->usuario.toString().toUpperCase())
                .peek(nombre -> {
                    System.out.println("Nombre Thread: " + Thread.currentThread().getName() + " - " + nombre);
                }) //inspeccionar
                .flatMap(nombre -> {
                    try {
                        TimeUnit.SECONDS.sleep(1); //simulando una sobrecarga
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if(nombre.contains("Estefani".toUpperCase())){
                        return Stream.of(nombre); //devuelve un Stream
                    }
                    return Stream.empty(); //devuelve vacío
                })
                .findAny().orElse("");

        long fin = System.currentTimeMillis();
        System.out.println("Tiempo: " + (fin - inicial) + " milisegundos");
        System.out.println(resultado);
    }

    private static void agregarElementos(List<Usuario> lista) {
        lista.add(new Usuario("Dina","Ortiz"));
        lista.add(new Usuario("Angela", "Contreras"));
        lista.add(new Usuario("Eduardo", "Escobar"));
        lista.add(new Usuario("Alvaro", "Contreras"));
        lista.add(new Usuario("Manuel", "Contreras"));
        lista.add(new Usuario("Emerita", "Contreras"));
        lista.add(new Usuario("Isaias", "Escobar"));
        lista.add(new Usuario("Estefani", "Contreras"));
    }
}
