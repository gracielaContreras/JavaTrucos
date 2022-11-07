package patrones_de_diseno.factory;

/**
 *  * Fabrica de Fabrica
 */
abstract public class PizzeriaZonaAbstractFactory {

    //Método concreto
    public PizzaProducto ordenarPizza(String tipo){
        PizzaProducto pizza = crearPizza(tipo);
        System.out.println("Fabricando la pizza " + pizza.getNombre() + "-----");
        pizza.preparar();
        pizza.cocinar();
        pizza.cortar();
        pizza.empaquetar();
        return  pizza;
    }
    //Método abstracto obligará a todos a implementar el método abstracto
    abstract PizzaProducto crearPizza(String tipo);
}
