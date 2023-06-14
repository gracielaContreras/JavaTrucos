package apiStream;

import Java8Features.lambdas.comparator.Persona;
import apiStream.models.Producto;
import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EjerciciosParaPracticar {
    public static void main(String[] args) {

        //Filtrar elementos: Dada una lista de números enteros, filtra y muestra solo los números pares.
        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);

        lista.stream()
                .filter(x -> x % 2 == 0)
                .forEach(System.out::println);

        System.out.println("--------------------------------");

        //Mapeo: Dada una lista de nombres, convierte cada nombre a mayúsculas
        // y muestra los nombres resultantes.

        List<String> nombres = Arrays.asList("Juan", "Pedro", "Maria", "Ana", "Jose", "Eduardo", "Carlos");

        nombres.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        System.out.println("--------------------------------");

        //Ordenar elementos: Dada una lista de objetos de tipo Persona con atributos como nombre y
        //edad, ordena la lista por edad de forma ascendente y muestra los nombres de las personas más jóvenes.

        List<Persona> personas = getPersonas();

        personas.stream()
                .sorted(Comparator.comparing(Persona::getEdad))
                .map(Persona::getNombre)
                .forEach(System.out::println);

        //Operaciones numéricas: Dada una lista de números enteros, calcula la suma, el promedio y el máximo valor.
        System.out.println("--------------1° Forma de resolverlo--------------");
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);

        System.out.println("Suma: " + numeros.stream()
                .reduce(0, Integer::sum));
        System.out.println("Promedio: " + numeros.stream()
                .mapToDouble(Integer::doubleValue)
                .reduce(0, Double::sum) / numeros.size());
        System.out.println("Máximo: " + numeros.stream()
                .reduce(0, Integer::max));
        System.out.println("--------------2° Forma de resolverlo--------------");
        IntStream listaNumeros = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        IntSummaryStatistics stats2 = listaNumeros.summaryStatistics();
        getOperaciones(stats2);
        System.out.println("--------------------------------");

        //Eliminar duplicados: Dada una lista de cadenas, elimina los elementos duplicados y muestra la lista resultante.
        List<String> cadenas = Arrays.asList("Juan", "Pedro", "Maria", "Andres", "Jose", "Eduardo", "Pedro");
        cadenas.stream()
                .distinct()
                .forEach(System.out::println);
        System.out.println("--------------------------------");
        //Operaciones de cadenas: Dada una lista de cadenas,
        // concatena todos los elementos en una sola cadena y muestra el resultado.
        List<String> cadenas2 = Arrays.asList("Eduardo", "Pedro", "Maria", "Andres", "Jose", "Angela", "Pedro");
        String resultado = cadenas2.stream()
                .reduce("resultado: ", (a, b) -> a + ", " + b);
        System.out.println(resultado);
        System.out.println("--------------------------------");

        //Conteo de elementos: Dada una lista de objetos de tipo Producto con atributos como nombre
        //y categoría, cuenta cuántos productos pertenecen a cada categoría.

        List<Producto> productos = getProductos();

        productos.stream()
                .collect(Collectors.groupingBy(Producto::getCategoria))
                .forEach((categoria, listaProducto) -> {
                    System.out.println(categoria + ": " + listaProducto.size());
                });

        System.out.println("--------------------------------");

        //Operaciones en archivos: Lee un archivo de texto línea por línea,
        //filtra las líneas que contienen cierta palabra clave y muestra las líneas filtradas.
        List<String> archivos = Arrays.asList("insertando cualquier texto de fantasía o un texto famoso",
                ",ya sea un poema, un discurso", ",un pasaje literario, el texto de una canción, etc.,");

        archivos.stream()
                .filter(x -> x.contains("fantasía"))
                .forEach(System.out::println);

    }

    private static List<Persona> getPersonas(){
        return List.of(
                new Persona("Juan", 23),
                new Persona("Pedro", 21),
                new Persona("Maria", 22),
                new Persona("Ana", 23)
        );
    }
    private static void getOperaciones(IntSummaryStatistics stats) {
        System.out.println("Suma: " + stats.getSum());
        System.out.println("Promedio: " + stats.getAverage());
        System.out.println("Máximo: " + stats.getMax());
    }
    private static List<Producto> getProductos(){
        return List.of(
                new Producto("TV", "Tecnología"),
                new Producto("Audio", "Tecnología"),
                new Producto("Cocina", "Electrohogar"),
                new Producto("Calefactor", "Electrohogar"),
                new Producto("Video", "Tecnología"),
                new Producto("Computadora", "Tecnología")
        );
    }
}
