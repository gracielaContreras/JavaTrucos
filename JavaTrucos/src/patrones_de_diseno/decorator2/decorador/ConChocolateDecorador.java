package patrones_de_diseno.decorator2.decorador;

import patrones_de_diseno.decorator2.Configurable;

public class ConChocolateDecorador extends CafeDecorador{

    public ConChocolateDecorador(Configurable configurable) {
        super(configurable);
    }

    @Override
    public float getPrecio() {
        return configurable.getPrecio() + 5f;
    }

    @Override
    public String getIngredientes() {
        return configurable.getIngredientes() + ", chocolate";
    }
}
