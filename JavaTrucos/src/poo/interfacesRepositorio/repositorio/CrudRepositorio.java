package poo.interfacesRepositorio.repositorio;

import java.util.List;

public interface CrudRepositorio<T> {
    List<T> listar();
    T porId(Integer id);
    void crear(T cliente);
    void modificar(T cliente);
    void eliminar(Integer id);
}
