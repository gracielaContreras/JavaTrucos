package apiStream;

import apiStream.models.Usuario;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ListToStream {
    public static void main(String[] args) {

        List<Usuario> lista = new ArrayList<>();
        lista.add(new Usuario("Dina","Ortiz"));
        lista.add(new Usuario("Angela", "Contreras"));
        lista.add(new Usuario("Eduardo", "Escobar"));
        lista.add(new Usuario("Alvaro", "Contreras"));
        lista.add(new Usuario("Manuel", "Contreras"));

        Stream<String> nombres = lista.stream()
                    .map(usuario ->
                        usuario.getNombre().toUpperCase().concat(" ")
                        .concat(usuario.getApellido().toUpperCase()))
                    .flatMap(nombre -> {
                        if(nombre.contains("dina".toUpperCase())){
                            return Stream.of(nombre); //devuelve un Stream
                        }
                        return Stream.empty(); //devuelve vacío
                    })
                    .map(String::toLowerCase)
                    .peek(System.out::println);

        System.out.println("se encontró: " +nombres.count()); //count es un operador terminal
    }
}
