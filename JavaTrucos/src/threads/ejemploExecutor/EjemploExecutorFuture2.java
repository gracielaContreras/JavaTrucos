package threads.ejemploExecutor;

import java.util.concurrent.*;

/**
 * Executor Framework - Fixed Thread Pool
 */

public class EjemploExecutorFuture2 {
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {

//Las 3 tareas se ejecutan de a una. Termina una tarea y empieza la siguiente tarea. Se ejecutan de forma secuencial.
//        ExecutorService ejecucion = Executors.newSingleThreadExecutor();

        //Las 3 tareas se ejecutan al mismo tiempo. Aunque la prioridad nose considera.
        ExecutorService ejecucion = Executors.newFixedThreadPool(3);

        Callable<String> tarea = () -> {
            System.out.println("Inicio de la tarea...");
            try {
                TimeUnit.SECONDS.sleep(3);
                System.out.println("Nombre del thread " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
            System.out.println("Finaliza la tarea...");
            return "Algún resultado importante de la tarea...";
        };
        Callable<Integer> tarea3 = () ->{
            System.out.println("Iniciando tarea 3 ...");
            TimeUnit.SECONDS.sleep(3);
            return 10;
        };

        Future<?> resultado = ejecucion.submit(tarea);
        Future<?> resultado2 = ejecucion.submit(tarea);
        Future<?> resultado3 = ejecucion.submit(tarea3);


        ejecucion.shutdown();

        while (! (resultado.isDone() && resultado2.isDone() && resultado3.isDone())){
            System.out.println(String.format("resultado 1: %s - resultado 2: %s - resultado 3: %s",
                    resultado.isDone() ? "finalizó": "en proceso",
                    resultado2.isDone()? "finalizó": "en proceso",
                    resultado3.isDone()? "finalizó": "en proceso"));
            TimeUnit.MILLISECONDS.sleep(1000);
        }
        System.out.println("Obtenemos resultado de la tarea1 : " + resultado.get());
        System.out.println("Finaliza la tarea..." + resultado.isDone());

        System.out.println("Obtenemos resultado de la tarea2 : " + resultado2.get());
        System.out.println("Finaliza la tarea..." + resultado2.isDone());

        System.out.println("Obtenemos resultado de la tarea3 : " + resultado3.get());
        System.out.println("Finaliza la tarea..." + resultado3.isDone());
    }
}
