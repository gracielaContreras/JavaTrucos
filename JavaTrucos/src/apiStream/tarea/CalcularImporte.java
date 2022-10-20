package apiStream.tarea;

import apiStream.models.Producto;
import java.util.List;

public class CalcularImporte {
    public static void main(String[] args) {
        List<Producto>lista = getProductos();

        double grantotal = lista.stream()
                .mapToDouble(p -> p.getPrecio() * p.getCantidad())
                .reduce(0, Double::sum);

        System.out.println(grantotal);

    }

    private static List<Producto> getProductos(){
        return List.of(
                new Producto(1990,3),
                new Producto(2990,1),
                new Producto(3990,2),
                new Producto(4990,4),
                new Producto(5990,5),
                new Producto(6990,6)
        );
    }
}
