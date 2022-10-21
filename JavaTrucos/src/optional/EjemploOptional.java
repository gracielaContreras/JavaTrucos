package optional;

import java.util.Optional;

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



    }
}
