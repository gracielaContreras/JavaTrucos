package apiStream.tarea;

import java.util.Arrays;
import java.util.function.Function;

/**
 * Obtener el número mayor en un arreglo con programación funcional lambda y api stream
 *
 * El siguiente ejercicio es obtener el número mayor de un arreglo pero utilizando
 * programación funcional, implementando la expresión lambda Function<T,R>
 * (que viene predefinida) con el api stream y operador reduce.
 */

public class ObtenerNumeroMayor {
    public static void main(String[] args) {

        int[] arreglo = new int[]{1,2,3,10,5,6,7,8,9};

        Function<int[], Integer> resultado = arr -> Arrays.stream(arr).reduce(0, Integer::max);
        System.out.println("Número mayor: " + resultado.apply(arreglo));
    }
}
