package expresionesLambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class EjemploFunction {
    public static void main(String[] args) {

        //Function = solo acepta un argumento en el método y un parámetro de retorno
        Function<String, String> f1 = String::toUpperCase; // palabra -> palabra.toUpperCase();
        System.out.println(f1.apply("hola"));

        //BiFunction = acepta 2 argumentos en el método y un parámetro de retorno
        BiFunction<String,String, Integer> f2 = String::compareTo; //(a,b) -> a.compareTo(b);
        System.out.println(f2.apply("dina", "dina"));

        BiFunction<String,String,String> f3 = (a,b) -> a.toUpperCase().concat(b.toUpperCase());
        System.out.println(f3.apply("angela","contreras"));

        BiFunction<String,String,String> f4 = String::concat; // :: se llama Referencia de Método
        System.out.println(f4.apply("alvaro","contreras").toUpperCase());


    }
}
