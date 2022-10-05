package threads.ejemplosync;

public class Panaderia {

    private String pan;
    private boolean disponible;

    public synchronized void hornear(String masa){
        while ( disponible ) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.pan = masa;
        System.out.println("Panadero hornea: " + this.pan);
        this.disponible = true; //se fabrica el pan y lo deja disponible en, true
        notify(); // y lo notifica a los demás
    }

    public synchronized String consumir(){
        while ( !disponible ) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Cliente consume: " + this.pan);
        this.disponible = false; //al consumir el pan ya no se encuentra disponible es por eso lo deja en, false
        notify(); // y lo notifica a los demás
        return this.pan;
    }
}
