package poo.tareaCarroDeSupermercadoGenerico;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BolsaSupermercado<T> implements Iterable<T>  {

    protected List<T> productos;
    private int max;

    public BolsaSupermercado(int max){
        this.max = max;
        this.productos = new ArrayList<>();
    }

    public void addProducto(T t){
        if( this.productos.size() <=max ) {
            this.productos.add(t);
        } else {
            throw new RuntimeException("no hay más espacio");
        }
    }

    public List<T> getProductos() {
        return productos;
    }

    @Override
    public Iterator<T> iterator() {
        return this.productos.iterator();
    }

    public String mostrarDetalle() {
        return "BolsaSupermercado{" +
                "productos=" + productos +
                '}';
    }
}
