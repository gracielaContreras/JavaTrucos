package apiStream.models;

public class Producto {
    private double precio;
    private int cantidad;

    private String nombre;
    private String categoria;

    public Producto(double precio, int cantidad) {
        this.precio = precio;
        this.cantidad = cantidad;
    }
    public Producto(String nombre, String categoria) {
        this.nombre = nombre;
        this.categoria = categoria;
    }
    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }
    public String getNombre() {
        return nombre;
    }
    public String getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "precio=" + precio +
                ", cantidad=" + cantidad +
                '}';
    }
}
