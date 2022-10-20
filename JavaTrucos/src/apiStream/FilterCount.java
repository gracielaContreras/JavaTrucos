package apiStream;

import apiStream.models.Usuario;
import java.util.stream.Stream;

public class FilterCount {
    public static void main(String[] args) {

        long usuario =  Stream.of("Dina Ortiz", "Eduardo Escobar", "Angela Contreras",
                        "Alvaro Contreras", "Manuel Contreras")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .count();

        System.out.println(usuario); //retorna la cantidad de usuarios
    }
}
