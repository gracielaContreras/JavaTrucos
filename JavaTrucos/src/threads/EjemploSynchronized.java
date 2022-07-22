package threads;

class SyncCounter{
    static int counter = 10;
    //al método decrement : como lo dejamos como synchronized permite que vaya decrementando de forma correcta
    public synchronized static void decrement(){
        counter--;
        System.out.println(counter);
    }
}
class Decrementor extends Thread{
    @Override
    public void run() {
        System.out.println("Decrementando SyncCounter");
        SyncCounter.decrement();
    }
}

public class EjemploSynchronized {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Decrementor().start();
        }
    }
}
