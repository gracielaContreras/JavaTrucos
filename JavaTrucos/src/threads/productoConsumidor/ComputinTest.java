package threads.productoConsumidor;

public class ComputinTest {
    public static void main(String[] args) {
        ComputinResource resource = new ComputinResource();

        ComputinConsumer consumer1 = new ComputinConsumer("Consumer 1", resource);
        ComputinConsumer consumer2 = new ComputinConsumer("Consumer 2", resource);

        ComputinProducer producer1 = new ComputinProducer("Producer1", resource);
        ComputinProducer producer2 = new ComputinProducer("Producer2", resource);

        producer1.start();
        producer2.start();

        consumer1.start();
        consumer2.start();
    }
}
