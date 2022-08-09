package poo.tareaProyectoCatalogo;

abstract public class Producto implements IProducto {

    private int Precio;

    public Producto(int precio) {
        Precio = precio;
    }

    @Override
    public int getPrecio() {
        return Precio;
    }
}
