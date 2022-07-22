package threads.productoConsumidor;

import java.util.Random;

public class ComputinProducer extends Thread{

    private ComputinResource resource;

    public ComputinProducer(String name, ComputinResource resource) {
        super(name);
        this.resource = resource;
    }
    @Override
    public void run() {
        while (true){
            try {
                int valor = new Random().nextInt(1000);
                System.out.printf("%s produced %d \n", getName(), valor);
                resource.produce(valor);
                Thread.sleep(new Random().nextInt(300));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
