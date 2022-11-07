package patrones_de_diseno.factory;

import patrones_de_diseno.factory.producto.PizzaNewYorkItaliana;
import patrones_de_diseno.factory.producto.PizzaNewYorkPepperoni;
import patrones_de_diseno.factory.producto.PizzaNewYorkVegetariana;

/**
 * Fabrica de producto concreto
 */

public class PizzeriaNewYorkFactory  extends PizzeriaZonaAbstractFactory {
    @Override
    public PizzaProducto crearPizza(String tipo) {
        //1° forma
        return switch (tipo) {
            case "vegetariana" -> new PizzaNewYorkVegetariana();
            case "pepperoni" -> new PizzaNewYorkPepperoni();
            case "italiana" -> new PizzaNewYorkItaliana();
            default -> null;
        };
// 2° forma
/*        switch (tipo) {
            case "vegetariana":
                producto = new PizzaNewYorkVegetariana();
                break;
            case "pepperoni":
                producto = new PizzaNewYorkPepperoni();
                break;
            case "italiana":
                producto = new PizzaNewYorkItaliana();
                break;
        }
        return producto;*/
    }
}
