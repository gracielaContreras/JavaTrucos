# Tarea: Modificar flujo y devolver la suma

Como desafió consiste en un arreglo de 100 elementos del 1 al 100, del tipo int, utilizando el api stream se pide eliminar los divisibles en 10, luego convertir los elementos restante del flujo en tipo double y dividirlos en 2, para finalmente devolver la suma total de todos ellos usando el operador terminal reduce. El resultado debería ser `2250.0`

Resuelto profesor:

```java
import java.util.Arrays;

public class ProyectoJava8Stream {

    public static void main(String[] args) {

        int[] arreglo = new int[100];

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = i+1;
        }

        double total = Arrays.stream(arreglo)
                .filter(e -> e % 10 != 0)
                .mapToDouble(e -> (double) e / 2)
                .reduce(0, (ac, e) -> ac + e);

        System.out.println(total); // 2250.0
    }
}
```
otra forma de realizar

```java
import java.util.stream.IntStream;

public class Pruebas {
    public static void main(String[] args) {
        Double ListaHasta100 = IntStream.rangeClosed(1, 100)
                .filter(a -> !(a % 10 == 0))
                .peek(System.out::println)
                .asDoubleStream()
                .map(d -> d / 2)
                .reduce(0d, Double::sum);
        System.out.println(ListaHasta100);
    }
}
```