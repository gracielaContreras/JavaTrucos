package apiStream;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/** Filter
 * Esta función es muy útil para filtrar acorde a una condición, la cual tiene que ser de tipo boolean.
 */

public class FilterReduceInteger {
    public static void main(String[] args) {
        //1° Ejemplo
        Stream<Integer> num = Stream.of(10,20,30);
        
        int resultadoNum = num.reduce( 0, (a,b) -> a + b); // con expression lambda
//        int resultadoNum = num.reduce( 0, Integer::sum); // con referencia de método
        System.out.println("resultadoNum = " + resultadoNum);

        //2° Ejemplo
        IntStream number = IntStream.range(5,20)
                .peek(System.out::println); //inspeccionar
        IntStream number2 = IntStream.rangeClosed(5,20) //diferencia con solo range(5,20) es que considera el número 20(el último)
                .peek(System.out::println); //inspeccionar

        IntSummaryStatistics stats = number.summaryStatistics();
        getOperaciones(stats);

        System.out.println("================================================");
        //3° Ejemplo
        IntStream numberos = IntStream.of(1,2,3,4,5,6)
                .peek(System.out::println); //inspeccionar

        IntSummaryStatistics stats2 = numberos.summaryStatistics();
        getOperaciones(stats2);
    }

    private static void getOperaciones(IntSummaryStatistics stats) {
        System.out.println("suma = " + stats.getSum());
        System.out.println("numero mayor = " + stats.getMax());
        System.out.println("numero menor = " + stats.getMin());
        System.out.println("total numeros = " + stats.getCount());
        System.out.println("obtener promedio = " + stats.getAverage());
    }
}
