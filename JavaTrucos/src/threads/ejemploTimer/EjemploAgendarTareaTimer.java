package threads.ejemploTimer;

import java.time.LocalDateTime;
import java.util.Timer;
import java.util.TimerTask;

/**
 *  Usando Timer y TimerTask para agendar tareas programadas
 */

public class EjemploAgendarTareaTimer {
    public static void main(String[] args) {

        Timer tarea = new Timer();
        tarea.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Tarea realizada en: " + LocalDateTime.now()
                        + " nombre del Thread: " + Thread.currentThread().getName());
                System.out.println("Finaliza el tiempo");
                tarea.cancel();
            }
        }, 5000);

        System.out.println("Agendamos una tarea para 5 segundos más... ");
    }
}
