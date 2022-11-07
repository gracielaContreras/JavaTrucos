package patrones_de_diseno.decorator2.decorador;

import patrones_de_diseno.decorator2.Configurable;

public class ConLecheDecorador extends CafeDecorador{
    public ConLecheDecorador(Configurable configurable) {
        super(configurable);
    }

    @Override
    public float getPrecio() {
        return configurable.getPrecio() + 7f;
    }

    @Override
    public String getIngredientes() {
        return configurable.getIngredientes() + ", Leche";
    }
}
