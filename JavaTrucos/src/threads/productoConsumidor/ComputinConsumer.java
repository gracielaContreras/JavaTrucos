package threads.productoConsumidor;

import java.util.Random;

public class ComputinConsumer extends Thread{
    private ComputinResource resource;

    public ComputinConsumer(String name, ComputinResource resource) {
        super(name);
        this.resource = resource;
    }

    @Override
    public void run() {
        while (true){
            try {
                int value = resource.consume();
                System.out.printf("%s consumed %d \n", getName(), value);
                Thread.sleep(new Random().nextInt(200));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
