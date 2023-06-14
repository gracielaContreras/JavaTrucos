package apiStream;

import ejercicios.ComprobarVocales;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ejemplo1 {
    public static void main(String[] args) {

//        Stream<String> nombres = Stream.of("Dina", "Eduardo", "Angela", "Alvaro", "Manuel");
//        nombres.forEach(System.out::println);

/*        String[] array = new String[] { "Dina", "Eduardo", "Angela", "Alvaro", "Manuel" };
        Stream<String> nombres =Arrays.stream(array);
        nombres.forEach(System.out::println);*/

/*        Stream<String> nombres =Stream.<String>builder().add("Dina").add("Eduardo")
                                        .add("Alvaro").add("Angela").add("Manuel").build();
        nombres.forEach(System.out::println);*/


        List<String> lista = new ArrayList<>();
        lista.add("Dina");
        lista.add("Eduardo");
        lista.add("Alvaro");
        lista.add("Angela");
        lista.add("Manuel");
        //1° forma
//        Stream<String> nombres = lista.stream();
//        nombres.forEach(System.out::println);
        //2° forma
        lista.stream().forEach(System.out::println);

        ComprobarVocales a = new ComprobarVocales();

        System.out.println(a.getHola());

    }
}
