package Java8Features.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoverDatosDuplicados {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(23, 34, 12, 456, 34, 1289, 34, 3, 35);

        // 1° forma para eliminar elementos duplicados
        System.out.println(numeros.stream().distinct().collect(Collectors.toList()));

        // 2° forma para eliminar elementos duplicados
        System.out.println(numeros.stream().collect(Collectors.toSet()));
        // 3° forma para eliminar elementos duplicados y los ordena de menor a mayor
        numeros.stream().sorted().distinct().forEach(System.out::println);
    }
}
