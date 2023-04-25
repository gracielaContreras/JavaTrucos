package Java8Features.methodReference;

import apiStream.models.Person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Method reference = ::
 * Una funcionalidad importante que se agregó en Java 8 es method reference y es
 * utilizada para simplificar la ejecución de un método dentro de una lambda,
 * esto puede ser de los siguientes modos:
 * * Referencias a métodos static
 * * Referencias a métodos de instancias
 * * Referencias a métodos de una clase
 * * Referencias a un constructor
 */
class StringUtils{
    static boolean isUpperCase(String cad){
        return cad.toUpperCase().equals(cad);
    }
}
class Persona{
    private String nombre;
    private Integer edad;

    public Persona(String nombre) {
        this.nombre = nombre;
    }
    public Persona(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}

public class MetodoPorReferencia {
    public static void main(String[] args) {
        List<String> nombres = Arrays.asList("eduardo", "manuel", "DINA", "angela");
        //Referencias a métodos de instancias ::
        nombres.stream().forEach(System.out::println);
        System.out.println();

        // imprimir solo los nombres que están en mayúscula
        //programación imperativa
        nombres.stream()
                .filter(n -> StringUtils.isUpperCase(n))
                .forEach(System.out::println);
        //programación funcional + referencia a método static
        nombres.stream()
                .filter(StringUtils::isUpperCase)
                .forEach(System.out::println);
        System.out.println();

        // Referencias a un constructor
        nombres.stream()
                .filter(StringUtils::isUpperCase)
                .map(Persona::new)
                .forEach(Persona::getNombre);

        //Referencias a métodos de una clase
        List<Persona> personas = getPersona();
        personas.stream()
                .max(Comparator.comparing(Persona::getEdad))
                .ifPresent(System.out::println);
    }

    private static List<Persona> getPersona() {
        return List.of(
                new Persona("eduardo", 36),
                new Persona("dina", 57),
                new Persona("manuel", 72),
                new Persona("angela", 38)
        );
    }

}
