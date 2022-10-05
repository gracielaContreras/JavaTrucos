package threads.ejemploExecutor;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Executor Framework - Tareas programadas con ScheduledExecutorService
 */

public class EjemploScheduledExecutorService {
    public static void main(String[] args) {

        ScheduledExecutorService ejecutor = Executors.newScheduledThreadPool(2);

        System.out.println("Alguna tarea en el main");

        ejecutor.schedule( () -> {
            System.out.println("Hola mundo");
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }, 2000, TimeUnit.MILLISECONDS);

        System.out.println("Alguna otra tarea en el main");
        ejecutor.shutdown();
    }
}
