# Tarea: Expresión Lambda que cuenta la cantidad de veces ...

Expresión Lambda que cuenta la cantidad de veces que se repiten las palabras de una frase y devuelva la mas repetida

Para la tarea se pide como requerimiento escribir una expresión lambda que cuenta la cantidad de veces que se repiten las palabras de una frase y devuelva la mas repetida, según lo siguiente:

La expresión lambda debe recibir por argumento una frase u oración y devolver un objeto Map que contenga la palabra mas repetida de la frase como llave y la cantidad de veces que se repite como valor.

Tiene que devolver un objeto Map de java, por ejemplo usando la forma clásica:

```java
Map<String, Integer> resultado = new HashMap();
resultado.put(palabra, max);
return resultado;
```

o bien usar el helpers abreviado y equivalente:

```java
return Collections.singletonMap(palabra, max)
```

Mostrar el resultado en consola iterando el map o bien obteniendo el primer elemento con get().