package threads;
class TThread extends Thread{

    public TThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.printf("Hilo %s indice %d \n", getName(), i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class ContruccionDeHilos  {
    public static void main(String[] args) {
        TThread hilo1 = new TThread("Hilo 1");
        TThread hilo2 = new TThread("Hilo 2");

        hilo1.start();
        hilo2.start();
    }
}
