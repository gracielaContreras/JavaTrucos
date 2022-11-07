package patrones_de_diseno.factory.ejemplo;

import patrones_de_diseno.factory.PizzaProducto;
import patrones_de_diseno.factory.PizzeriaCaliforniaFactory;
import patrones_de_diseno.factory.PizzeriaNewYorkFactory;
import patrones_de_diseno.factory.PizzeriaZonaAbstractFactory;

public class EjemploFactory {
    public static void main(String[] args) {
        PizzeriaZonaAbstractFactory ny = new PizzeriaNewYorkFactory();
        PizzeriaZonaAbstractFactory california = new PizzeriaCaliforniaFactory();

        PizzaProducto pizza = california.ordenarPizza("queso");
        System.out.println("Bruce ordena la pizza " + pizza.getNombre());

        System.out.println("----------------------------------------");
        PizzaProducto pizzaNY = ny.ordenarPizza("pepperoni");
        System.out.println("Eduardo ordena la pizza " + pizzaNY.getNombre());
    }
}
