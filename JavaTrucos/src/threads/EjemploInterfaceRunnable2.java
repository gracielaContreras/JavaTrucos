package threads;

class ViajeTarea implements Runnable{

    private String viaje;

    public ViajeTarea(String viaje) {
        this.viaje=viaje;
    }

    public String getViaje(){
        return viaje;
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println(i + " - " + this.viaje);
            try {
               Thread.sleep((long)(Math.random() *  1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Me voy de viaje a: " + getViaje());
    }
}

public class EjemploInterfaceRunnable2 {
    public static void main(String[] args) {

        new Thread(new ViajeTarea("Isla de Juan Fernandez")).start();
        new Thread(new ViajeTarea("Isla de Chiloe")).start();
        new Thread(new ViajeTarea("Isla de Pascua")).start();

    }
}
