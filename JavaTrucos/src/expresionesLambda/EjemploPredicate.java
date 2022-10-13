package expresionesLambda;

import expresionesLambda.models.Usuario;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

/**
 * Predicate, es para evaluar una expresión booleana
 */

public class EjemploPredicate {
    public static void main(String[] args) {

        Predicate<String> test = rol -> rol.equals("ROLE_ADMIN");
        System.out.println("rol ROLE_USER = " + test.test("ROLE_USER"));
        System.out.println("rol ROLE_ADMIN = " + test.test("ROLE_ADMIN"));

        Predicate<Integer> t1 = num -> num > 10;
        System.out.println("7 es mayor que 10 :" + t1.test(7));
        System.out.println("11 es mayor que 10 :" + t1.test(11));

        BiPredicate<String,String> t2 = String::equals;
        System.out.println("eduardo = escobar : " + t2.test("eduardo","escobar"));
        System.out.println("eduardo = eduardo : " + t2.test("eduardo","eduardo"));

        BiPredicate<Integer,Integer> t3 = (i,j) -> i > j;
        System.out.println("11 es mayor que 10 :" + t3.test(11, 10));
        System.out.println("7 es mayor que 10 :" + t3.test(7, 10));

        Usuario usuarioA = new Usuario();
        usuarioA.setNombre("Angela");

        Usuario usuarioB = new Usuario();
        usuarioB.setNombre("Angela");

        BiPredicate<Usuario,Usuario> t4 = (ua,ub) -> ua.getNombre().equals(ub.getNombre());
        System.out.println( usuarioA.getNombre() + " = " + usuarioB.getNombre() + " es : " + t4.test(usuarioA,usuarioB));

    }
}
