package apiStream.tarea;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 *****Tarea: Modificar flujo y devolver la suma****
 *
 * Como desafió consiste en un arreglo de 100 elementos del 1 al 100,
 * del tipo int, utilizando el api stream se pide eliminar los divisibles en 10,
 * luego convertir los elementos restante del flujo en tipo double y dividirlos en 2,
 * para finalmente devolver la suma total de todos ellos usando el operador terminal reduce.
 * El resultado debería ser '2250.0'
 */

public class ModificarFlujo {
    public static void main(String[] args) {
        IntStream num = IntStream.rangeClosed(1,100);
        List<Integer> lista = num.boxed().collect(Collectors.toList());

        double resultado = lista.stream()
                .filter(n -> !( n % 10 == 0 ))
                .mapToDouble(n -> (double) n / 2)
                .reduce(0, Double::sum);

        System.out.println("Resultado: " + resultado);
    }
/*    Otra forma de realizar la tarea
        Double ListaHasta100 = IntStream.rangeClosed(1, 100)
            .filter(a -> !(a % 10 == 0))
            .peek(System.out::println)
            .asDoubleStream()
            .map(d -> d / 2)
            .reduce(0d, Double::sum);
        System.out.println(ListaHasta100);*/
}
