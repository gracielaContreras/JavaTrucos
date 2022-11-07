package patrones_de_diseno.observer;

public class Corporate extends  Observable{
    private String nombre;
    private int precio;

    public Corporate(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }
    public void modificarPrecio(int precio) {
        this.precio = precio;
        notifyObservers();
    }

    @Override
    public String toString() {
        return nombre + " nuevo precio $"+ precio;
    }
}
