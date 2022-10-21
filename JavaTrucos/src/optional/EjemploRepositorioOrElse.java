package optional;

import optional.models.Computador;
import optional.repositorio.ComputadorRepositorio;
import optional.repositorio.Repositorio;

public class EjemploRepositorioOrElse {
    public static void main(String[] args) {

       Repositorio<Computador> repo = new ComputadorRepositorio();

//        Computador pc1 = repo.filtrar("ROG").orElse(valorPorDefecto());
//        System.out.println(pc1);

        Computador pc2 = repo.filtrar("Msi").orElseGet(() -> valorPorDefecto());
        System.out.println(pc2);

    }
    public static Computador valorPorDefecto(){
        System.out.println("Obteniendo valor por defecto");
        return new Computador("Hp One", "Hp001");
    }
}
