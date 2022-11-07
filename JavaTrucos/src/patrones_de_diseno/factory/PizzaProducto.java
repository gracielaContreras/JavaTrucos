package patrones_de_diseno.factory;

import java.util.ArrayList;
import java.util.List;

abstract public class PizzaProducto {
    protected String nombre;
    protected String masa;
    protected String salsa;
    protected List<String> ingredientes;

    public PizzaProducto(){
        this.ingredientes = new ArrayList<String>();
    }

    public String getNombre() {
        return nombre;
    }

    public void preparar(){
        System.out.println("Preparando " + this.nombre);
        System.out.println("Selecionando la masa " + this.masa);
        System.out.println("Agregando salsa " + this.salsa);
        System.out.println("Agregando ingredientes ");
        this.ingredientes.forEach(System.out::println);
    }

    abstract  public  void cocinar();
    abstract public void cortar();

    public void empaquetar(){
        System.out.println("Poniendo la pizza en una caja de empaque...");
    }

}
