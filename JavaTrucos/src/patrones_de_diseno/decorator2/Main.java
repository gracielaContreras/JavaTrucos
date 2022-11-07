package patrones_de_diseno.decorator2;

import patrones_de_diseno.decorator2.decorador.ConChocolateDecorador;
import patrones_de_diseno.decorator2.decorador.ConCremaDecorador;

public class Main {
    public static void main(String[] args) {
        Configurable cafe = new Cafe("Cafe capuchino", 8f);
        ConChocolateDecorador conChocolate = new ConChocolateDecorador(cafe);
        ConCremaDecorador conCremaDecorador = new ConCremaDecorador(conChocolate);
        System.out.println("El precio del cafe capuchino es: " + conCremaDecorador.getPrecio());
        System.out.println("Los ingredientes: " + conCremaDecorador.getIngredientes());
    }
}
