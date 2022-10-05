package threads.ejemploExecutor;

import java.util.concurrent.*;

/**
 * Executor Framework - Tareas programadas con ExecutorService
 * son procesos o códigos que podemos repetir en el tiempo,
 * por ejemplo que se ejecuten de forma reiterativa n cantidad de veces
 * en cierta unidad de tiempo, cada  20 segundo ejecutar algo,
 * y podemos agregar un delay o demora de tantas unidades de tiempo cuando arranca la primera vez
 */

public class EjemploScheduledExecutorServicePeriodo {
    public static void main(String[] args) throws InterruptedException {

        ScheduledExecutorService ejecutor = Executors.newScheduledThreadPool(2);

        System.out.println("Alguna tarea en el main");

        CountDownLatch lock = new CountDownLatch(5);

        Future<?> future = ejecutor.scheduleAtFixedRate( () -> {
            System.out.println("Hola mundo");
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
                lock.countDown();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        },1000, 2000, TimeUnit.MILLISECONDS);

        lock.await();
        future.cancel(true);
        System.out.println("Alguna otra tarea en el main");
        ejecutor.shutdown();
    }
}
