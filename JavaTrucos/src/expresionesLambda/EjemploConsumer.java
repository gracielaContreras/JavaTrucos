package expresionesLambda;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.*;

public class EjemploConsumer {
    public static void main(String[] args) {
        //Consumer = solo acepta un argumento en el método
        Consumer<Date> consumer = fecha -> {
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println(formato.format(fecha));
        };

        consumer.accept(new Date());
        //BiConsumer = Acepta 2 argumento en el método
        BiConsumer<String, Integer> bigConsumer = (nombre, edad) -> {
            System.out.println(nombre + " tienes " + edad);
        };

        bigConsumer.accept("dina", 63);
    }
}
