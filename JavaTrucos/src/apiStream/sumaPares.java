package apiStream;

import java.util.Arrays;
import java.util.List;

public class sumaPares {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int sumaPares = numeros.stream()
                .filter(numero -> numero % 2 == 0) //filtran los números pares
                .mapToInt(numero -> numero) //se mapean a enteros
                .sum(); // suma de los números

        System.out.println("La suma de los números pares es: " + sumaPares);

    }
}
