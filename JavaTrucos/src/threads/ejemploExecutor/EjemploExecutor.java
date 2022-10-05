package threads.ejemploExecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Executor Framework - Single Threaded Executor
 */

public class EjemploExecutor {
    public static void main(String[] args) throws InterruptedException {

        ExecutorService ejecucion = Executors.newSingleThreadExecutor();

        Runnable tarea = () -> {
            System.out.println("Inicio de la tarea...");
            try {
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Nombre del thread " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
            System.out.println("Finaliza la tarea...");
        };

        ejecucion.submit(tarea);
        ejecucion.shutdown();
        System.out.println("Continuando con la ejecución del método main 1");
        ejecucion.awaitTermination(2, TimeUnit.SECONDS);
        System.out.println("Continuando con la ejecución del método main 2");
    }
}
