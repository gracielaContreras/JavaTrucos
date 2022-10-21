package optional.repositorio;

import optional.models.Computador;
import java.util.Optional;

public interface Repositorio<T> {
    Optional<Computador> filtrar(String nombre);
}
