# Tarea: Aplanar un arreglo bidimensional en un nivel y eliminar repetidos

El siguiente ejercicio es aplanar un arreglo bidimensional en un nivel y eliminar repetidos usando el api stream.

Aplanar un arreglo significa quitar los elementos del arreglo anidado y dejarlos en el arreglo de primer nivel.

Por ejemplo, para el arreglo:

```java
String[][] lenguajes = {{"java", "groovy"}, {"php"}, {"c#", "python", "groovy"}, {"java", "javascript", "kotlin"}, {"javascript"}, {}};
```

debería quedar:

```java
{"java", "groovy", "php", "c#", "python", "javascript", "kotlin"};
```

### Resultado docente

1° Forma

```java
public class ProyectoJava8Stream {

    public static void main(String[] args) {

        String[][] lenguajes = {{"java", "groovy"}, {"php"}, {"c#", "python", "groovy"}, {"java", "javascript", "kotlin"}, {"javascript"}, {}};
        Arrays.stream(lenguajes)
                .flatMap(arr -> Arrays.stream(arr))
                .distinct()
                .forEach(e -> System.out.println(e));
    }
}
```

2° Forma

```java
  String[][] lenguajes = {{"java", "groovy"}, {"php"}, {"c#", "python", "groovy"}, {"java", "javascript", "kotlin"}, {"javascript"}, {}};

        Function<String[][], List<String>> flatten = arr ->  Arrays.stream(arr).flatMap(a -> Arrays.stream(a))
                .distinct()
                .collect(Collectors.toList());

        flatten.apply(lenguajes).forEach(e -> System.out.println(e));
```