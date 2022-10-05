package threads.ejemplosync;

import threads.ejemplosync.runnable.Consumidor;
import threads.ejemplosync.runnable.Panadero;

import java.util.concurrent.ThreadLocalRandom;

public class EjemploProductorConsumidorJava8 {
    public static void main(String[] args) {
        Panaderia p = new Panaderia();

        new Thread( () -> {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(ThreadLocalRandom.current().nextInt(200, 500));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                p.hornear("Pan n°: " + i);
            }
            }
        ).start();

        new Thread( () -> {
            for (int i = 0; i < 10; i++) {
                p.consumir();
            }
        }).start();
    }
}
