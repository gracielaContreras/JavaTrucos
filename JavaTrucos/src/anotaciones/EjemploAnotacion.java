package anotaciones;

import anotaciones.models.Producto;
import anotaciones.util.JsonSerializador;
import java.time.LocalDate;

public class EjemploAnotacion {
    public static void main(String[] args) {

        Producto producto = new Producto();
        producto.setFecha(LocalDate.now());
        producto.setNombre("mesa centro RAULI");
        producto.setPrecio(1000L);

        System.out.println("json = " + JsonSerializador.convertirJson(producto));
    }
}
