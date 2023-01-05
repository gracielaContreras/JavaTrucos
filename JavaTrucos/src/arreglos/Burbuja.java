package arreglos;

public class Burbuja {
    public static void main(String[] args) {
        // Declaración del arreglo
        int a[] = new int[10];

        // Poblado del arreglo con números aleatorios
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 99); // aplicando casting
            // Math.random genera un número float entre 0.0 y 0.9999999999
        }
        // Mostrar el arreglo desordenado por consola
        for (int v : a) {
            System.out.print(v + " ");
        }
        System.out.println();

    // Ordenar por el método burbuja
    // 1. Recorrer el arreglo tantas
    // veces como elementos contenga menos 1.
    // Si el arreglo tiene 10 elementos, voy a recorrerlo 9 veces.
    //2. En cada recorrido comparo el elemento actual con el elemento siguiente
    // para saber si están ordenados, si no lo están, entonces los ordeno.

    // 5, 6, 9, 1, 14, 12
    // 1.       5, 6, 1, 9, 12, 14
    // 2.       5, 1, 6, 9, 12, 14
    // 3.       1, 5, 6, 9, 12, 14  // la lógica dice seguir
    // 4.       1, 5, 6, 9, 12, 14  // la lógica dice seguir
    // 5.       1, 5, 6, 9, 12, 14  // la lógica dice seguir
    // La lógica del algoritmo dice realizar 5 veces para ese caso,
    // a pesar de que en la tercera, ya los haya ordenado.

    // Código método burbuja
        for (int recorrido = 0; recorrido < a.length -1; recorrido++) {
            for (int elemento = 0; elemento < a.length -1; elemento++) {
                if(a[elemento] > a[elemento + 1]) {
                    int t = a[elemento];
                    a[elemento] = a[elemento + 1];
                    a[elemento + 1] = t;

   // Explicando el código para algoritmo:
   // Línea 36: Recorrer el arreglo tantas veces como elementos contenga - 1, es decir, los 5 recorridos que se debe ejecutar.
   // Línea 37: En cada recorrido compara el elemento actual con el elemento siguiente. Es decir, elementos a comparar en cada recorrido.
   // Línea 38: Si el arreglo en el elemento actual es mayor que el siguiente elemento (Ejemplo: tienes [9, 6]).
   // Línea 39: Variable temporal que tiene el valor del elemento actual (t = 9).
   // Línea 40: Al elemento actual se le asigna el valor del siguiente elemento (6).
   // Línea 41: Al siguiente elemento se le asigna lo que tenía el elemento actual (9).
   // Secuencia del algoritmo.
   // 9, 6
   // t = 9
   // 6 (elemento actual)
   // 9 (siguiente el elemento)
   // 6,9
                }
            }
        }
        //Mostrar el arreglo ya ordenado
        for (int v : a) {
            System.out.print(v + " ");
        }
        System.out.println();
    }
}
