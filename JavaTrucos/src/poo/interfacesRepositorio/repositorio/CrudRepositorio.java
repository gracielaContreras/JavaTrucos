package poo.interfacesRepositorio.repositorio;

import poo.interfacesRepositorio.repositorio.excepciones.AccesoDatoExeption;

import java.util.List;

public interface CrudRepositorio<T> {
    List<T> listar();
    T porId(Integer id) throws AccesoDatoExeption;
    void crear(T cliente) throws AccesoDatoExeption;
    void modificar(T cliente) throws AccesoDatoExeption;
    void eliminar(Integer id) throws AccesoDatoExeption;
}
