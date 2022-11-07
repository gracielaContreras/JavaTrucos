package patrones_de_diseno.decorator2.decorador;

import patrones_de_diseno.decorator2.Configurable;

public class ConCremaDecorador extends CafeDecorador{
    public ConCremaDecorador(Configurable configurable) {
        super(configurable);
    }

    @Override
    public float getPrecio() {
        return configurable.getPrecio() + 6f;
    }

    @Override
    public String getIngredientes() {
        return configurable.getIngredientes() + ", Crema";
    }
}
