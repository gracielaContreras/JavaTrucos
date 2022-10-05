package threads.ejemplosync.runnable;

import threads.ejemplosync.Panaderia;

import java.util.concurrent.ThreadLocalRandom;

public class Panadero implements Runnable{

    private Panaderia  panaderia;

    public Panadero(Panaderia panaderia) {
        this.panaderia = panaderia;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(200, 500));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            panaderia.hornear("Pan n°: " + i);
        }

    }
}
