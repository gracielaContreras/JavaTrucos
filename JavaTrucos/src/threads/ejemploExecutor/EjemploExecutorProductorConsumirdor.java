package threads.ejemploExecutor;

import threads.ejemplosync.Panaderia;
import threads.ejemplosync.runnable.Consumidor;
import threads.ejemplosync.runnable.Panadero;
import java.util.concurrent.*;

/**
 * Executor Framework - Personalizando parámetros del pool con ThreadPoolExecutor
 */

public class EjemploExecutorProductorConsumirdor {
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {

//Las 3 tareas se ejecutan de a una. Termina una tarea y empieza la siguiente tarea. Se ejecutan de forma secuencial.
//        ExecutorService ejecucion = Executors.newSingleThreadExecutor();

        //Las 3 tareas se ejecutan al mismo tiempo. Aunque la prioridad nose considera.

        ThreadPoolExecutor  ejecucion = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
        Panaderia p = new Panaderia();

        System.out.println("Tamaño del pool: " + ejecucion.getPoolSize());
        System.out.println("Cantidad de tareas en cola: " + ejecucion.getQueue().size());

        Runnable productor = new Panadero(p);
        Runnable consumidor = new Consumidor(p);

        Future<?> resultado = ejecucion.submit(productor);
        Future<?> resultado2 = ejecucion.submit(consumidor);
        System.out.println("Tamaño del pool: " + ejecucion.getPoolSize());
        System.out.println("Cantidad de tareas en cola: " + ejecucion.getQueue().size());

        ejecucion.shutdown();


    }
}
