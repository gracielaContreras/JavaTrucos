package poo.interfacesRepositorio.repositorio;

import poo.interfacesRepositorio.modelo.Cliente;
import java.util.List;

public interface PaginableRepositorio {
    List<Cliente> listar(int desde, int hasta);
}
