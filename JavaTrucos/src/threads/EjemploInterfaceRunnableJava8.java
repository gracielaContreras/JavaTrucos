package threads;

public class EjemploInterfaceRunnableJava8 {
    public static void main(String[] args) throws InterruptedException {

        Thread hiloprincipal = new Thread();

        Runnable viaje = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " - " + Thread.currentThread().getName());
                try {
                    Thread.sleep((long)(Math.random() *  1000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Me voy de viaje a: " + Thread.currentThread().getName());
        };

       Thread viaje1 =  new Thread(viaje, "Isla de Juan Fernandez");
       Thread viaje2 =  new Thread(viaje, "Isla de Chiloe");
       Thread viaje3 =  new Thread(viaje, "Isla de Pascua");

       viaje1.start();
       viaje2.start();
       viaje3.start();

       viaje1.join();
       viaje2.join();
       viaje3.join();

        System.out.println("continuando con el viaje");

    }
}
