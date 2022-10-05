package threads;

class NombreThread extends Thread{

    public NombreThread(String name) {
        super(name); //para personalizar el nombre del hilo
    }

    @Override
    public void run() {
        System.out.println("se inicia el método run del hilo " + getName());
        for (int i = 0; i < 3; i++) {
            System.out.println(this.getName());
            try {
                TThread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("finaliza el hilo " + getName());
    }
}

public class EjemploExtenderThread {
    public static void main(String[] args) {
        Thread hilo1 = new NombreThread("Jhon Doe");
        hilo1.start(); //internamente invoca y llama al método run()
        System.out.println("Estado del hilo: " + hilo1.getState());

        Thread hilo2 = new NombreThread("Dina Ortiz");
        hilo2.start();

        Thread hilo3 = new NombreThread("Manuel Contreras");
        hilo3.start();
    }
}
