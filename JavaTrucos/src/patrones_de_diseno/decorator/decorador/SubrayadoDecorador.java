package patrones_de_diseno.decorator.decorador;

import patrones_de_diseno.decorator.Formateable;

public class SubrayadoDecorador extends TextoDecorador{
    public SubrayadoDecorador(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        int largo = texto.darFormato().length();
        StringBuilder sb = new StringBuilder(texto.darFormato());
        sb.append("\n"); //Salto de linea
        for (int i = 0; i < largo; i++){
            sb.append("_");
        }
        return sb.toString();
    }
}
