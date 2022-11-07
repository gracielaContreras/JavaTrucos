package patrones_de_diseno.decorator2.decorador;

import patrones_de_diseno.decorator2.Configurable;

abstract public class CafeDecorador implements Configurable {
    protected Configurable configurable;

    public CafeDecorador(Configurable configurable) {
        this.configurable = configurable;
    }
}
