package patrones_de_diseno.decorator.decorador;

import patrones_de_diseno.decorator.Formateable;

public class ReemplazarEspacioDecorador extends TextoDecorador{
    public ReemplazarEspacioDecorador(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        return texto.darFormato().replace(" ", "_");
    }
}
