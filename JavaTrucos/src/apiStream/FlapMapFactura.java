package apiStream;

import apiStream.models.Factura;
import apiStream.models.Usuario;
import java.util.Arrays;
import java.util.List;

public class FlapMapFactura {
    public static void main(String[] args) {

        Usuario usuario1 = new Usuario("Eduardo", "Escobar");
        usuario1.addFactura(new Factura("Consola de video juegos"));

        Usuario usuario2 = new Usuario("Angela", "Contreras");
        usuario2.addFactura(new Factura("Set de maquillaje"));

        List<Usuario> lista = Arrays.asList(usuario1, usuario2);

        //Forma usando Stream
        lista.stream()
                .flatMap(f -> f.getFactura().stream())
                .forEach(f -> System.out.println(
                                    f.getDescription().concat(" del usuario: " + f.getUsuario())));

//        //Forma tradicional sin usar Stream
//        for (Usuario usuario : lista) {
//            for (Factura factura : usuario.getFactura()){
//                System.out.println(factura.getDescription().concat(" del usuario: " + factura.getUsuario()));
//            }
//        }

    }
}
