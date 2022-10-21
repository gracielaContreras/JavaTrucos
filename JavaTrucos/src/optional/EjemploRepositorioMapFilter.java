package optional;

import optional.models.Computador;
import optional.models.Fabricante;
import optional.models.Procesador;
import optional.repositorio.ComputadorRepositorio;
import optional.repositorio.Repositorio;

public class EjemploRepositorioMapFilter {
    public static void main(String[] args) {

       Repositorio<Computador> repo = new ComputadorRepositorio();

        Fabricante f = repo.filtrar("ROG")
                //A partir de computador convertimos a un procesador y obtenemos el nombre del fabricante
                //1° forma
//                .map(c -> c.getProcesador())
//                .map(p -> p.getFabricante())
                //2° forma
                .flatMap(Computador::getProcesador)
                .flatMap(Procesador::getFabricante)
                .filter(fab -> "Intel".equalsIgnoreCase(fab.getNombre()))
                .orElseThrow();
        System.out.println(f.getNombre());

        //A partir de computador convertimos a un procesador y obtenemos el nombre del fabricante
        String n = repo.filtrar("msi")
                .flatMap(Computador::getProcesador)
                .flatMap(Procesador::getFabricante)
                .map(Fabricante::getNombre)
                .orElse("Desconocido");
        System.out.println(n);

    }
}
