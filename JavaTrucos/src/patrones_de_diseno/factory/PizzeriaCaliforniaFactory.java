package patrones_de_diseno.factory;

import patrones_de_diseno.factory.producto.PizzaCaliforniaPepperoni;
import patrones_de_diseno.factory.producto.PizzaCaliforniaQueso;
import patrones_de_diseno.factory.producto.PizzaCaliforniaVegetariana;

/**
 * Fabrica de producto concreto
 */
public class PizzeriaCaliforniaFactory extends PizzeriaZonaAbstractFactory{
    @Override
    public PizzaProducto crearPizza(String tipo) {
        return switch (tipo) {
            case "queso" -> new PizzaCaliforniaQueso();
            case "pepperoni" -> new PizzaCaliforniaPepperoni();
            case "vegetariana" -> new PizzaCaliforniaVegetariana();
            default -> null;
        };
    }
}
