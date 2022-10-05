package threads.ejemploExecutor;

import java.util.concurrent.*;

/**
 * Executor Framework - Future
 */

public class EjemploExecutorFuture {
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {

        ExecutorService ejecucion = Executors.newSingleThreadExecutor();

        Callable<String> tarea = () -> {
            System.out.println("Inicio de la tarea...");
            try {
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Nombre del thread " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
            System.out.println("Finaliza la tarea...");
            return "Algún resultado importante de la tarea...";
        };

        Future<?> resultado = ejecucion.submit(tarea);
        ejecucion.shutdown();

        while (!resultado.isDone()){
            System.out.println("Ejecutando tarea ...");
            TimeUnit.MILLISECONDS.sleep(1500);
        }
        System.out.println("Obtenemos resultado de la tarea: " + resultado.get(5, TimeUnit.SECONDS));

        System.out.println("Finaliza la tarea..." + resultado.isDone());
    }
}
