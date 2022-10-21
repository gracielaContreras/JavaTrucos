package optional.repositorio;

import optional.models.Computador;
import optional.models.Fabricante;
import optional.models.Procesador;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ComputadorRepositorio implements Repositorio<Computador> {

    private List<Computador> datasource;

    public ComputadorRepositorio() {
        this.datasource = new ArrayList<>();
        Procesador proc = new Procesador("i9-980H", new Fabricante("Intel"));
        Computador asus = new Computador("Asus ROG", "Strix G513");
        asus.setProcesador(proc);
        datasource.add(asus);
        datasource.add(new Computador("MSI", "GF65"));
    }

    @Override
    public Optional<Computador> filtrar(String nombre) {
        //Forma utilizando Optional
        return datasource.stream()
                .filter(n -> n.getNombre().toUpperCase()
                        .contains(nombre.toUpperCase()))
                .findFirst(); //al encontrarlo con el filtro retorna el primero

/*        //Forma tradicional sin Optional
        for (Computador com : datasource) {
            if(com.getNombre().toUpperCase().contains(nombre.toUpperCase())){
                return com;
            }
        }

        return null;*/
    }
}
