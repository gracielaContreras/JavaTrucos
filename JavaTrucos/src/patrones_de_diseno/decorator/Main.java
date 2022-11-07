package patrones_de_diseno.decorator;

import patrones_de_diseno.decorator.decorador.MayusculaDecorador;
import patrones_de_diseno.decorator.decorador.ReemplazarEspacioDecorador;
import patrones_de_diseno.decorator.decorador.ReversaDecorador;
import patrones_de_diseno.decorator.decorador.SubrayadoDecorador;

public class Main {
    public static void main(String[] args) {
        Formateable texto = new Texto("Hola que tal Graciela!");
        MayusculaDecorador mayuscula = new MayusculaDecorador(texto);
        ReversaDecorador reversa = new ReversaDecorador(mayuscula);
        ReemplazarEspacioDecorador reemplaza = new ReemplazarEspacioDecorador(reversa);
        SubrayadoDecorador subrayado = new SubrayadoDecorador(reemplaza);

        System.out.println(subrayado.darFormato());
    }
}
