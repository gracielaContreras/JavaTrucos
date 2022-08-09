package poo.interfacesRepositorio.repositorio;

import poo.interfacesRepositorio.modelo.Cliente;
import java.util.List;

public interface CrudRepositorio {
    List<Cliente> listar();
    Cliente porId(Integer id);
    void crear(Cliente cliente);
    void modificar(Cliente cliente);
    void eliminar(Integer id);
}
