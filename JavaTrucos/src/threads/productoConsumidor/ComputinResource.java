package threads.productoConsumidor;

import java.util.LinkedList;

public class ComputinResource {
    private LinkedList<Integer> resources = new LinkedList<>();

    public synchronized int consume() throws InterruptedException {
        while (resources.size() <= 0){
            wait(); // Envía al hilo a esperar en estado waiting.
        }
        return resources.poll();
    }
    public synchronized void produce(int value){
        resources.offer(value);
        notifyAll(); // Notifica a todos los hilos en estado waiting para que vuelvan a estado runnable.
    }
}
