package threads;

import static threads.EjemploSincronizacionThread.imprimirFrace;

class ImprimirFrases implements Runnable{

    private String frace1, frace2;

    public ImprimirFrases(String frace1, String frace2){
        this.frace1=frace1;
        this.frace2=frace2;
    }

    @Override
    public void run() {
        imprimirFrace(this.frace1,this.frace2);
    }
}

public class EjemploSincronizacionThread {
    public static void main(String[] args) throws InterruptedException {

        new Thread(new ImprimirFrases("Hola ", "que tal!")).start();
        new Thread(new ImprimirFrases("¿Quién eres ", "tú?")).start();
        Thread.sleep(100);
        new Thread(new ImprimirFrases("Muchas  ", "gracias amigo!")).start();


    }
    //Al synchronized las fraces se imprimen en orden
    public static synchronized void imprimirFrace(String frace1, String frace2) {
        System.out.print(frace1);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(frace2);

    }
}
