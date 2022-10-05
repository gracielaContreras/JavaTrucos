package threads.ejemploTimer;

import java.awt.*;
import java.time.LocalDateTime;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *  Usando Timer y TimerTask para agendar tareas programadas
 */

public class EjemploAgendarTareaTimerPeriodo {
    public static void main(String[] args) {

        Toolkit t = Toolkit.getDefaultToolkit();

        AtomicInteger n = new AtomicInteger(3);
        Timer tarea = new Timer();
        tarea.schedule(new TimerTask() {
            @Override
            public void run() {
                int i = n.getAndDecrement();
                if(i > 0) {
                    t.beep();
                    System.out.println("Tarea "+ i + " periódica en: " + LocalDateTime.now()
                            + " nombre del Thread: " + Thread.currentThread().getName());

                } else {
                    System.out.println("Finaliza el tiempo");
                    tarea.cancel();
                }
            }
        }, 5000, 10000);

        System.out.println("Agendamos una tarea inmediata que se repite cada 10 segundos... ");
    }
}
