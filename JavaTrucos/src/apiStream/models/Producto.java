package apiStream.models;

public class Producto {
    private double precio;
    private int cantidad;

    public Producto(double precio, int cantidad) {
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "precio=" + precio +
                ", cantidad=" + cantidad +
                '}';
    }
}
