package apiStream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Map {
    public static void main(String[] args) {

/*        Stream.of("Dina", "Eduardo", "Angela", "Alvaro", "Manuel")
                .map(String::toUpperCase)
                .forEach(System.out::println);*/

/*        Stream.of("Dina", "Eduardo", "Angela", "Alvaro", "Manuel")
                .map(String::toLowerCase)
                .collect(Collectors.toList())
                .forEach(System.out::println);*/

        Stream<String> nombres =  Stream.of("Dina", "Eduardo", "Angela", "Alvaro", "Manuel")
                .map(String::toUpperCase)
                .peek(System.out::println) //inspeccionar
                .map(String::toLowerCase);

        List<String> lista = nombres.collect(Collectors.toList());
        lista.forEach(System.out::println);





    }
}
