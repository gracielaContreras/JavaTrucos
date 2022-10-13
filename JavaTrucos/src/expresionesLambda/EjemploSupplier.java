package expresionesLambda;

import expresionesLambda.models.Usuario;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class EjemploSupplier {
    public static void main(String[] args) {
        //Consumer = solo acepta un argumento en el método
        Consumer<String> imprimir = System.out::println; // :: esta expresión se llama "referencia de método".

        imprimir.accept("Hola mundo");

        Supplier<Usuario> crearUsuarios = Usuario::new;

        Usuario usuario = crearUsuarios.get();

        //BiConsumer = Acepta 2 argumento en el método
        BiConsumer<Usuario, String> asignarUsuario = Usuario::setNombre;

        asignarUsuario.accept(usuario, "Andrés");

        System.out.println("Nombre de usuario: " + usuario.getNombre());


        Supplier<String> proveedor = () -> "Hola mundo lambda Supplier";
        System.out.println(proveedor.get());


        List<String> lista = Arrays.asList(usuario.getNombre());
        lista.forEach(imprimir);

        List<String> listaNombres = Arrays.asList("Dina", "Angela", "Alvaro", "Eduardo", "Manuel");
        listaNombres.forEach(imprimir);
    }
}
