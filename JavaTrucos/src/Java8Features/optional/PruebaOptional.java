package Java8Features.optional;

import java.util.Optional;

public class PruebaOptional {

    public static String[] nombres = {"eduardo","angela", "dina"};
    public static Optional<String> buscarNombre(String n){
        for (String nombre:nombres) {
            if(nombre.equalsIgnoreCase(n)){
                return Optional.of(nombre);
            }
        }
        return Optional.empty();
    }

    public static void main(String[] args) {

        String resultado1 = buscarNombre("eduardo").orElse("no se encontró el nombre");
        System.out.println(resultado1.toUpperCase());
        System.out.println();

        String resultado2 = buscarNombre("uardo").orElse("no se encontró el nombre");
        System.out.println(resultado2);

        String resultado3 = buscarNombre("uardo").orElseThrow(() -> new IllegalStateException("no se encontró el nombre"));
        System.out.println(resultado3);

    }


}
