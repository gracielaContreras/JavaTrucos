package threads;

public class EjemploRunnable implements  Runnable{

    private int valor;

    public EjemploRunnable(int valor) {
        this.valor = valor;
    }

    @Override
    public void run() {
        for (int i = valor; i >= 0 ; i--) {
            System.out.printf("%s y Valor %d \n", Thread.currentThread().getName(), i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Thread hilo1 = new Thread(new EjemploRunnable(10), "Hilo1");
        hilo1.start();
        Thread hilo2 = new Thread(new EjemploRunnable(20), "Hilo2");
        hilo2.start();
    }
}
