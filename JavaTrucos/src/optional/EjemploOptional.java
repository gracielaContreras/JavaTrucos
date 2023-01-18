package optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EjemploOptional {
    public static void main(String[] args) {

        String nombre = "Dina";
        Optional<String> optional = Optional.of(nombre);

        System.out.println("¿Esta presente? :" + optional.isPresent());
        System.out.println("¿Esta vacío? :" + optional.isEmpty());
        System.out.println("Obtengo el dato: " + optional.get());

//        Forma tradicional
        if(optional.isPresent()){
            System.out.println("Hola " + optional.get());
        }else{
            System.out.println("No hay dato");
        }

//        utilizando Optional
        optional.ifPresent( nom -> System.out.println( "Hola " + nom ));

        nombre = null;
        optional = Optional.ofNullable(nombre);

        optional.ifPresentOrElse( nom -> System.out.println( "Hola" + nom )
                , () -> System.out.println( "No hay dato" ));

        //Otro Ejemplo
//        String nombre = "José";
        String n = null;
        Optional<String> verificarNombre = Optional.ofNullable(n); //este es un objeto Optional que da seguimiento a objetos de tipo String y en este caso da seguimiento a la variable "nombre"
        System.out.println(verificarNombre.isPresent());//se utiliza para saber si nombre == null

        System.out.println(verificarNombre.orElse("No contiene valores"));
        System.out.println(verificarNombre.orElseGet(() -> "No contiene valor"));

        //Otro Ejemplo
        List<String> paises = Arrays.asList("United States", "Argentina", "Spain", "Italy","Colombia", "Chile");
        Optional<String> pais = paises
                                .stream()
                                .filter(p -> p.startsWith("Chi")) //Busca en la lista los elementos que empiezan con "Chi"
                                .map(String::toUpperCase)//Cambia el cuerpo del objeto
                                .findFirst(); // devuelve el primer elemento que encuentra
        pais.ifPresent(System.out::println);

        //Otro Ejemplo
        paises
             .stream()
             .filter(p -> p.startsWith("C")) //Busca en la lista los elementos que empiezan con "z"
             .map(String::toUpperCase)
             .forEach(System.out::println);

        //Otro Ejemplo
        List<String> paises1 = paises
                .stream()
                .filter(p -> p.startsWith("C")) //Busca en la lista los elementos que empiezan con "C"
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Cuantos paises se encontró: " + paises1.size());

        //Otro Ejemplo
        Optional<String> paises2 = paises
                .stream()
                .filter(p -> p.startsWith("z")) //Busca en la lista los elementos que empiezan con "z"
                .map(String::toUpperCase)
                .findFirst();

        paises2.ifPresentOrElse( nom -> System.out.println(pais.get())
                , () -> System.out.println( "No se encontró los paises que empiezan con z"));

    }
}
