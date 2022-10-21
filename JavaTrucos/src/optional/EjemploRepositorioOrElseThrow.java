package optional;

import optional.models.Computador;
import optional.repositorio.ComputadorRepositorio;
import optional.repositorio.Repositorio;
import java.util.Optional;

public class EjemploRepositorioOrElseThrow {
    public static void main(String[] args) {

       Repositorio<Computador> repo = new ComputadorRepositorio();

        Computador pc1 = repo.filtrar("ROG").orElseThrow(IllegalAccessError::new);
        System.out.println(pc1);

        String archivo = "archivo.pdf";
        String extension = Optional.ofNullable(archivo)
                .filter(a -> a.contains("."))
                .map(a -> a.substring(archivo.lastIndexOf(".") +1)) //va imprimir 'pdf'
                .orElseThrow();

        System.out.println(extension);


    }
}
